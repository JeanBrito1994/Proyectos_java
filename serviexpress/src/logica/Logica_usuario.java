package logica;



import datos.ConnectDB;
import java.sql.Statement;
import java.sql.Connection;
import java.util.*;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import oracle.jdbc.OracleTypes;
import logica.PasswordManager;


public class Logica_usuario {
    private PasswordManager passwordManager = new PasswordManager();
    
    public ArrayList<Usuario> listarUsuario(String nombre){
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            
            
            CallableStatement cs = conn.prepareCall("{call sp_listar(?,?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setString(2, nombre);
            cs.executeQuery();
            ResultSet rs = (ResultSet)cs.getObject(1);
            
            while(rs.next()){
                System.out.println(rs.getString(1));
            
                Usuario usuario = new Usuario();
                usuario.setId(rs.getString(1));
                usuario.setNombre(rs.getString(2));
                usuario.setPhone(rs.getString(3));
                usuario.setEmail(rs.getString(4));
                usuario.setRut(rs.getString(5));
                usuario.setUsername(rs.getString(6));
                listaUsuarios.add(usuario);
                
            }
            
            return listaUsuarios;
        }catch(Exception err){
            System.out.println("Error: " + err.getMessage());
            return new ArrayList<Usuario>();
        } 
    }
    
    
    public void almacenarUsuario(Usuario usuario){
     ConnectDB conexion = new ConnectDB();
     
     String hashed = this.passwordManager.encode(usuario.getPassword());
     try{
        Connection conn = conexion.getConnection();
        Statement stmt = conn.createStatement();
        CallableStatement cs = conn.prepareCall("{call sp_crear_usuario(?,?,?,?,?,?,?)}");
       
        cs.setString(1, hashed);
        cs.setString(2, usuario.getRut());
        cs.setString(3, usuario.getEmail());
        cs.setString(4, usuario.getPhone());
        cs.setString(5, usuario.getNombre());
        cs.setString(6, usuario.getApellido());
        cs.setInt(7, usuario.getIs_admin());
        
        cs.executeUpdate();
                    
     System.out.println("Usuario Guardado Correctamente");
    }
     catch(Exception err){
         System.out.println("Error: " + err.getMessage());
         
         System.out.println("No se puede ejecutar");
    }
}
    
    
    public void eliminarUsuario(String username){
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            CallableStatement cs = conn.prepareCall("{call sp_deshabilitar_usuario(?)}");
            cs.setString(1, username);
            cs.executeUpdate();
            
            System.out.println("REGISTRO ELIMINADO CORRECTAMENTE");
                    
        }
        catch(Exception err){
            System.out.println("Error: " + err.getMessage());
        }
    }
    
    public Boolean loginUsuario(String username, String password, int is_admin){
        ConnectDB conexion = new ConnectDB();
        try{
            Connection conn = conexion.getConnection();
            
            
            CallableStatement cs = conn.prepareCall("{call info_usuario_login(?,?,?)}");
            cs.setString(1, username);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.setInt(3, is_admin);
            cs.executeQuery();
            ResultSet rs = (ResultSet)cs.getObject(2);
            
            rs.next();
            
            String pass = rs.getString(1);
            
            
            System.out.println(rs.getString(1));
            return this.passwordManager.checkPassword(password, pass);
        }
        catch(Exception err ){
            System.out.println("Error: " + err.getMessage());
            return null;
        }
        
    }
    
    
    
}
