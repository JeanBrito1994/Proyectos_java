package controlador;

import db.Conexion;
import java.sql.Statement;
import modelo.Mascota;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ControladorMascota {
    public void almacenarMascota(Mascota mascota){
     Conexion conexion = new Conexion();
     try{
        Connection conn = conexion.getConnection();
        Statement stmt = conn.createStatement();
        
        String consulta = "INSERT INTO MASCOTA VALUES("
                + "" + mascota.getId()+","
                + "'" + mascota.getNombre()+"',"
                + "" + mascota.getEdad() + ","
                +"'" + mascota.getTipo() + "',"
                +"" + mascota.isPosee_atencion()+","
                +"" + mascota.getCantidad()+","
                +"" + mascota.isPosee_dueno() +","
                +"'" + mascota.getNombre_dueno()+"',"
                +"'" + mascota.getDescripcion()+"');";
        
                    System.out.println("Consulta: " + consulta);
                    stmt.executeUpdate(consulta);
                    System.out.println("MASCOTA GUARDADA CORRECTAMENTE");
    }
     catch(Exception err){
         System.out.println("Error: " + err.getMessage());
    }
}
    
    
    public ArrayList<Mascota> listarMascota(String nombre){
        ArrayList<Mascota> listaMascotas = new ArrayList<>();
        Conexion conexion = new Conexion();
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            
            String consulta = "SELECT id,nombre, edad, tipo, posee_dueño"
                    + " FROM mascota WHERE nombre LIKE '" + nombre + "%';";
            System.out.println("Consulta: " + consulta);
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(rs.next()){
                Mascota mascota = new Mascota();
                mascota.setId(rs.getInt(1));
                mascota.setNombre(rs.getString(2));
                mascota.setEdad(rs.getInt(3));
                mascota.setTipo(rs.getString(4));
                mascota.setPosee_dueno(rs.getBoolean(5));
                listaMascotas.add(mascota);
            }
            
            return listaMascotas;
        }catch(Exception err){
            System.out.println("Error: " + err.getMessage());
            return new ArrayList<Mascota>();
        } 
    }    
    
    
    public ArrayList<Mascota> listarMascotaTipo(String tipo){
        ArrayList<Mascota> listaMascotasTipo = new ArrayList<>();
        Conexion conexion = new Conexion();
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            
            String consulta = "SELECT id,nombre, edad, tipo, posee_dueño"
                    + " FROM mascota WHERE tipo LIKE '" + tipo + "%';";
            System.out.println("Consulta: " + consulta);
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(rs.next()){
                Mascota mascota = new Mascota();
                mascota.setId(rs.getInt(1));
                mascota.setNombre(rs.getString(2));
                mascota.setEdad(rs.getInt(3));
                mascota.setTipo(rs.getString(4));
                mascota.setPosee_dueno(rs.getBoolean(5));
                listaMascotasTipo.add(mascota);
            }
            
            return listaMascotasTipo;
        }catch(Exception err){
            System.out.println("Error: " + err.getMessage());
            return new ArrayList<Mascota>();
        } 
    }
    
    public void eliminaMascota(String codigo){
        Conexion conexion = new Conexion();
        try{
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            
            String consulta = "delete from mascota where id = '" + codigo + "';";
            System.out.println("Consulta:" + consulta);
            stmt.executeUpdate(consulta);
            System.out.println("REGISTRO ELIMINADO CORRECTAMENTE");
                    
        }
        catch(Exception err){
            System.out.println("Error: " + err.getMessage());
        }
    }
}
