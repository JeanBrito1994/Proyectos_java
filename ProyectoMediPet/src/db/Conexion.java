package db;

import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;

public class Conexion {
    private final static String SERVER = "localhost:3306";
    private final static String USER = "root";
    private final static String PASS = "";
    private final static String DB = "p_mascotas";

    
    //Metodo que obtiene y contiene la conexion
    public Connection getConnection(){
        Properties propiedadesConexion = new Properties();
        try{
            propiedadesConexion.put("user",USER);
            propiedadesConexion.put("password",PASS);
            Connection conn = DriverManager.getConnection(
                    
                    "jdbc:mysql://"+SERVER +"/" + DB + "?zeroDateTimeBehavior=CONVERT_TO_NULL",
                    propiedadesConexion
            );
            System.out.println("CONEXION ESTABLECIDA CORRECTAMENTE");
            return conn;
        }
        catch(Exception err){
            System.out.println("ERRoR: " + err.getMessage());
            return null;
        }
    }
}