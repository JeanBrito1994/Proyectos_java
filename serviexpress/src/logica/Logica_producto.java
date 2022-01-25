/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.ConnectDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author jpbri
 */
public class Logica_producto {
    public void almacenarProducto(Producto producto, String proveedor){
    ConnectDB conexion = new ConnectDB();
     
     try{
        Connection conn = conexion.getConnection();
       
        CallableStatement cs = conn.prepareCall("{call sp_crear_producto(?,?,?,?)}");
       
        cs.setString(1, producto.getNombre_producto());
        cs.setString(2,proveedor);
        cs.setString(3, producto.getDescripcion());
        cs.setInt(4, producto.getPrecio());
        
        cs.executeUpdate();
                    
     System.out.println("Producto Guardado Correctamente");
    }
     catch(Exception err){
         System.out.println("Error: " + err.getMessage());
         
         System.out.println("No se puede ejecutar");
    }
}
    
    
    public void eliminarProducto(String nombre){
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            CallableStatement cs = conn.prepareCall("{call sp_deshabilitar_producto(?)}");
            cs.setString(1, nombre);
            cs.executeUpdate();
            
            System.out.println("PRODUCTO DESHABILITADO CORRECTAMENTE");
                    
        }
        catch(Exception err){
            System.out.println("Error: " + err.getMessage());
        }
    }
}
