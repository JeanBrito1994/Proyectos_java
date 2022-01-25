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
import java.sql.CallableStatement;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;
/**
 *
 * @author jpbri
 */
public class Logica_Proveedor {
    public ArrayList<Proveedor> listarProveedores(String tipo){
        ArrayList<Proveedor> listaProveedor = new ArrayList<>();
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
         
            
            CallableStatement cs = conn.prepareCall("{call sp_listar_proveedor(?,?)}");
            
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setString(2, tipo);
            cs.executeQuery();
            ResultSet rs = (ResultSet)cs.getObject(1);
            
            while(rs.next()){
                System.out.println(rs.getInt(1));
            
                Proveedor proveedor = new Proveedor();
                proveedor.setId(rs.getString(1));
                proveedor.setNombre(rs.getString(2));
                proveedor.setNombre_contacto(rs.getString(3));
                proveedor.setTelefono(rs.getString(4));
                proveedor.setEmail(rs.getString(5));
                proveedor.setRubro(rs.getString(6));
                listaProveedor.add(proveedor);
                
            }
            
            return listaProveedor;
        }catch(Exception err){
            System.out.println("Error: " + err.getMessage());
            return new ArrayList<Proveedor>();
        } 
    }
    
    public void almacenarProveedor(Proveedor proveedor){
        ConnectDB conexion = new ConnectDB();
     
     try{
        Connection conn = conexion.getConnection();
        Statement stmt = conn.createStatement();
        CallableStatement cs = conn.prepareCall("{call sp_crear_proveedor(?,?,?,?,?)}");
       
        cs.setString(1, proveedor.getNombre());
        cs.setString(2, proveedor.getNombre_contacto());
        cs.setString(3, proveedor.getTelefono());
        cs.setString(4, proveedor.getEmail());
        cs.setString(5, proveedor.getRubro());
        
        cs.executeUpdate();
                    
     System.out.println("Proveedor Guardado Correctamente");
    }
     catch(Exception err){
         System.out.println("Error: " + err.getMessage());
         
         System.out.println("No se puede ejecutar");
    }
    }
    
    public ArrayList<Producto> listarProductos(String nombre){
        ArrayList<Producto> listaProductos = new ArrayList<>();
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            CallableStatement cs = conn.prepareCall("{call sp_listar_productos_GeOrden(?,?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setString(2, nombre);
            cs.executeQuery();
            ResultSet rs = (ResultSet)cs.getObject(1);
            
            while(rs.next()){
                System.out.println(rs.getInt(1));
            
                Producto producto = new Producto();
                
                producto.setId(rs.getLong(1));
                producto.setNombre_producto(rs.getString(2));
                producto.setPrecio(rs.getInt(3));
                
                listaProductos.add(producto);
                
            }
            
            return listaProductos;
        }catch(Exception err){
            System.out.println("Errorsql: " + err.getMessage());
            return new ArrayList<Producto>();
        } 
    }
    
    
    public String sumatoria(int precio, int cuenta){
        String total = String.valueOf(cuenta + precio);
        
        return total;
    }
    
    public void eliminarProveedor(String nombre){
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            CallableStatement cs = conn.prepareCall("{call sp_deshabilitar_proveedor(?)}");
            cs.setString(1, nombre);
            cs.executeUpdate();
            
            System.out.println("PROVEEDOR DESHABILITADO CORRECTAMENTE");
                    
        }
        catch(Exception err){
            System.out.println("Error: " + err.getMessage());
        }
    }
   
    
    
}
