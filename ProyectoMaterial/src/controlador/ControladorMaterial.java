package controlador;

import db.Conexion;
import java.sql.Statement;
import modelo.Material;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.ResultSet;


public class ControladorMaterial {
    //metodo que va a almacenar el material audiovidual
    public void almacenarMaterial(Material material) throws Exception{
        Conexion conexion = new Conexion();
        
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "Insert into material values ("
                    + "'" + material.getCodigo() + "',"
                    + "'" + material.getNombre() + "',"
                    + "'" + material.getFormato() + "',"
                    + "" + material.getDuracion() + ","
                    + "'" + material.getCategoria() + "',"
                    + "'" + material.getAutor() + "',"
                    + "" + material.isNuevo()+");";
            
            System.out.println("Consulta efectuada: " + consulta);
            stmt.executeUpdate(consulta);
            System.out.println("MATERIAL ALMACENADO CORRECTAMENTE");
            
        }
        catch(Exception err){
            System.out.println("Error: " + err.getMessage());
            throw err;
        }
    }
    
    
    //metodo que lista la información
    public ArrayList<Material> listarMaterial(String codigo) {
        ArrayList<Material> listaMaterial = new ArrayList<>();
        Conexion conexion = new Conexion();
        
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
          
            String consulta = "SELECT CODIGO, NOMBRE, FORMATO, DURACION, CATEGORIA, AUTOR, NUEVO"
                    + " FROM MATERIAL WHERE CODIGO LIKE '%" + codigo + "%';";
            
            System.out.println("Consulta: " + consulta);
            ResultSet rs = stmt.executeQuery(consulta);
            
            
            while(rs.next()){
                Material material = new Material();
                material.setCodigo(rs.getString(1));
                material.setNombre(rs.getString(2));
                
                material.setFormato(rs.getString(3));
                material.setDuracion(rs.getInt(4));
                material.setCategoria(rs.getString(5));
                material.setAutor(rs.getString(6));
                material.setNuevo(rs.getBoolean(7));
                
                listaMaterial.add(material);
            }
            return listaMaterial;

        }
        catch(Exception err){
            System.out.println("Error: " + err.getMessage());
            return new ArrayList<Material>();
        }
        
        
    }
    //metodo que elimina el material
    public void eliminaMaterial(String codigo){
        Conexion conexion = new Conexion();
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "delete from material where codigo = '" + codigo + "';";
            System.out.println("Consulta:" + consulta);
            stmt.executeUpdate(consulta);
            System.out.println("REGISTRO ELIMINADO CORRECTAMENTE");
                    
        }
        catch(Exception err){
            System.out.println("Error: " + err.getMessage());
        }
    }
    
    
    
    //metodo que modifica el material audiovisual
    public void materialModificar(Material material) throws Exception{
        Conexion conexion = new Conexion();
        
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "Update material "
                    //+ "set codigo = '" + material.getCodigo() + "',"
                    + "set nombre = '" + material.getNombre() + "',"
                    + "formato = '" + material.getFormato() + "',"
                    + "duracion = " + material.getDuracion() + ","
                    + "categoria = '" + material.getCategoria() + "',"
                    + "autor = '" + material.getAutor() + "',"
                    + "nuevo = " + material.isNuevo() + " "
                    + "where codigo = '" + material.getCodigo() + "';";
            
            
            System.out.println("Consulta Update: " + consulta);
            stmt.executeUpdate(consulta);
                   
            
        }
        catch(Exception err){
            System.out.println("Error: " + err.getMessage());
            throw err;
        }
    }
    
    public Material obtenerPorCodigo(String codigo){
        Material material = new Material();
        Conexion conexion = new Conexion();
        
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
          
            String consulta = "SELECT CODIGO, NOMBRE, FORMATO, DURACION, CATEGORIA, AUTOR, NUEVO"
                    + " FROM MATERIAL WHERE CODIGO = '" + codigo + "';";
            
            System.out.println("Consulta: " + consulta);
            ResultSet rs = stmt.executeQuery(consulta);
            
            
            while(rs.next()){
                material.setCodigo(rs.getString(1));
                material.setNombre(rs.getString(2));
                
                material.setFormato(rs.getString(3));
                material.setDuracion(rs.getInt(4));
                material.setCategoria(rs.getString(5));
                material.setAutor(rs.getString(6));
                material.setNuevo(rs.getBoolean(7));

            }
            return material;

        }
        catch(Exception err){
            System.out.println("Error: " + err.getMessage());
            return new Material();
        }
    }
    
}
