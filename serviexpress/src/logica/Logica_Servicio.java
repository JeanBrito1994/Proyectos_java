/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.ConnectDB;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import oracle.jdbc.OracleTypes;
import presentacion.VistaAtenciones;
/**
 *
 * @author jpbri
 */
public class Logica_Servicio {
    public ArrayList<Servicio> listarServicios(){
        ArrayList<Servicio> listaServicios = new ArrayList<>();
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            
            
            CallableStatement cs = conn.prepareCall("{call sp_listar_servicios(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet rs = (ResultSet)cs.getObject(1);
            
            while(rs.next()){
                
            
                Servicio servicio = new Servicio();
                servicio.setNombre(rs.getString(1));
                servicio.setDescripcion(rs.getString(2));
                servicio.setPrecio(rs.getInt(3));
                listaServicios.add(servicio);
                
            }
            
            return listaServicios;
        }catch(Exception err){
            System.out.println("Error: " + err.getMessage());
            return new ArrayList<Servicio>();
        } 
    }
    
    public void almacenarServicio(Servicio servicio){
     ConnectDB conexion = new ConnectDB();
     
     try{
        Connection conn = conexion.getConnection();
        CallableStatement cs = conn.prepareCall("{call sp_crear_servicio(?,?,?,?)}");
       
        cs.setString(1, servicio.getNombre());
        cs.setString(2, servicio.getDescripcion());
        cs.setInt(3, servicio.getPrecio());
        cs.setInt(4, 1); //se debe cambiar cuando tengamos definido las empresas
        
        
        cs.executeUpdate();
                    
     System.out.println("Servicio Guardado Correctamente");
    }
     catch(Exception err){
         System.out.println("Error: " + err.getMessage());
         
    }
}
    
    public void eliminarServicio(String nombre){
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            CallableStatement cs = conn.prepareCall("{call sp_deshabilitar_servicio(?)}");
            cs.setString(1, nombre);
            cs.executeUpdate();
            
            System.out.println("SERVICIO DESHABILITADO CORRECTAMENTE");
                    
        }
        catch(Exception err){
            System.out.println("Error: " + err.getMessage());
        }
    }
    
    public void almacenarServicioABolFac(String nombre_servicio){
     ConnectDB conexion = new ConnectDB();
     
     try{
        Connection conn = conexion.getConnection();
        CallableStatement cs = conn.prepareCall("{call sp_insertar_ser_reservacion(?,?)}");
       
        cs.setInt(1, VistaAtenciones.cod);
        cs.setString(2, nombre_servicio);
        
        cs.executeUpdate();
                    
     System.out.println("Servicio Agregado Correctamente");
     
    }
     catch(Exception err){
         System.out.println("Error: " + err.getMessage());
         
    }
}
    
    public void eliminarServicioABOLFac(String nombre_servicio){
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            CallableStatement cs = conn.prepareCall("{call sp_eliminar_ser_reservacion(?,?)}");
            cs.setInt(1, VistaAtenciones.cod);
            cs.setString(2, nombre_servicio);
            
            cs.executeUpdate();
            
            System.out.println("SERVICIO ELIMINADO CORRECTAMENTE");
                    
        }
        catch(Exception err){
            System.out.println("Error: " + err.getMessage());
        }
    }
    
    
            
}
