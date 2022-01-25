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
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;


/**
 *
 * @author Usuario
 */
public class Logica_Orden {
    
    /**
     *
     * @param orden
     * @return 
     */
    
    public ArrayList<Orden> listarOrdenes(){
        
        ArrayList<Orden> listaOrdenes = new ArrayList<>();
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            
            
            CallableStatement cs = conn.prepareCall("{call sp_listar_orden(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet rs = (ResultSet)cs.getObject(1);
            
            while(rs.next()){
            
                Orden orden = new Orden();
                orden.setId(rs.getString(1));
                orden.setEmpleado(rs.getString(2));
                orden.setProveedorn(rs.getString(3));
                orden.setTotal(rs.getInt(4));
                listaOrdenes.add(orden);
                
            }
            
            return listaOrdenes;
        }catch(SQLException err){
            System.out.println("Error: " + err.getMessage());
            return new ArrayList<>();
        } 
    }
    
    public void almacenarOrden(Orden orden){
    ConnectDB conexion = new ConnectDB();
     
     try{
        Connection conn = conexion.getConnection();
       
        CallableStatement cs = conn.prepareCall("{call sp_crear_orden(?,?,?,?)}");
       
        cs.setString(1, orden.getDescripcion());
        cs.setString(2,orden.getEmpleado());
        cs.setString(3, orden.getProveedorn());
        cs.setInt(4, orden.getTotal());
        
        cs.executeUpdate();
                    
     System.out.println("Producto Guardado Correctamente");
    }
     catch(Exception err){
         System.out.println("Error: " + err.getMessage());
         
         System.out.println("No se puede ejecutar");
    }
    
     
    } 
}
