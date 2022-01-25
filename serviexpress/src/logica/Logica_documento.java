/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.ConnectDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;
import presentacion.VistaAtenciones;
import presentacion.VistaPrincipal;

/**
 *
 * @author jpbri
 */
public class Logica_documento {
    public ArrayList<Atencion> listarAtenciones(String estado){
        ArrayList<Atencion> listarAtenciones = new ArrayList<>();
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            
            
            CallableStatement cs = conn.prepareCall("{call sp_listar_atenciones(?,?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setString(2, estado);
            cs.executeQuery();
            ResultSet rs = (ResultSet)cs.getObject(1);
            
            while(rs.next()){
                
            
                Atencion atencion = new Atencion();
                atencion.setId(rs.getInt(1));
                atencion.setFecha_reserva(rs.getString(2));
                atencion.setStatus(rs.getString(3));
                listarAtenciones.add(atencion);
                
            }
            
            return listarAtenciones;
        }catch(Exception err){
            System.out.println("Error: " + err.getMessage());
            return new ArrayList<Atencion>();
        } 
    }
    
    
    public ArrayList<Atencion> listarAtencionesDetalle(int codigo){
        ArrayList<Atencion> listarAtenciones = new ArrayList<>();
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            
            
            CallableStatement cs = conn.prepareCall("{call sp_listar_detalle_atenciones(?,?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setInt(2, codigo);
            cs.executeQuery();
            ResultSet rs = (ResultSet)cs.getObject(1);
            
            while(rs.next()){
                
            
                Atencion atencion = new Atencion();
                atencion.setId(rs.getInt(1));
                atencion.setFecha_reserva(rs.getString(2));
                atencion.setNombre_servicio(rs.getString(3));
                atencion.setPrecio(rs.getInt(4));
                listarAtenciones.add(atencion);
                
            }
            
            return listarAtenciones;
        }catch(Exception err){
            System.out.println("Error: " + err.getMessage());
            return new ArrayList<Atencion>();
        } 
    }
    
    public void almacenarBoleta(){
     ConnectDB conexion = new ConnectDB();
     
     try{
        Connection conn = conexion.getConnection();
        CallableStatement cs = conn.prepareCall("{call sp_registrar_boleta(?,?)}");
       
        cs.setString(1, VistaPrincipal.usuario);
        cs.setInt(2, VistaAtenciones.cod);
        
        cs.executeUpdate();
                    
     System.out.println("Registro Boleta OK");
     
    }
     catch(Exception err){
         System.out.println("Error: " + err.getMessage());
         
    }
}
    
    public void almacenarFactura(int codigo){
     ConnectDB conexion = new ConnectDB();
     
     try{
        Connection conn = conexion.getConnection();
        CallableStatement cs = conn.prepareCall("{call sp_registrar_factura(?,?)}");
       
        cs.setString(1, VistaPrincipal.usuario);
        cs.setInt(2, VistaAtenciones.cod);
        
        cs.executeUpdate();
                    
     System.out.println("Registro Factura OK");
     
    }
     catch(Exception err){
         System.out.println("Error: " + err.getMessage());
         
    }
}
    
    public ArrayList<Documento_pago> listarPagos(int codigo){
        ArrayList<Documento_pago> listarPagos = new ArrayList<>();
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            
            
            CallableStatement cs = conn.prepareCall("{call SP_LISTAR_PAGOS(?,?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setInt(2, codigo);
            cs.executeQuery();
            ResultSet rs = (ResultSet)cs.getObject(1);
            
            while(rs.next()){
                
            
                Documento_pago documento = new Documento_pago();
                documento.setId(rs.getInt(1));
                documento.setFecha_pago(rs.getString(2));
                documento.setTotal(rs.getInt(3));
                documento.setTipo_documento(rs.getString(4));
                documento.setEstado(rs.getString(5));
                listarPagos.add(documento);
                
            }
            
            return listarPagos;
        }catch(Exception err){
            System.out.println("Error: " + err.getMessage());
            return new ArrayList<Documento_pago>();
        } 
    }
    
    
    
    public void anularDocumento(int codigo){
     ConnectDB conexion = new ConnectDB();
     try{
        Connection conn = conexion.getConnection();
        CallableStatement cs = conn.prepareCall("{call sp_anular(?)}");
        cs.setInt(1, codigo);
        cs.executeUpdate();
        System.out.println("Anulada ok");
         }
     catch(Exception err){
         System.out.println("Error: " + err.getMessage());
         
    }
}
    
    public void anularReserva(int codigo){
     ConnectDB conexion = new ConnectDB();
     try{
        Connection conn = conexion.getConnection();
        CallableStatement cs = conn.prepareCall("{call sp_cancelar_reserva(?)}");
        cs.setInt(1, codigo);
        cs.executeUpdate();
        System.out.println("Cancelada ok");
         }
     catch(Exception err){
         System.out.println("Error: " + err.getMessage());
         
    }
}
}
