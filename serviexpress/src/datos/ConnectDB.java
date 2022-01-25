package datos;

import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;

public class ConnectDB {
    private final static String url = "jdbc:oracle:thin:@174.138.38.251:1539/XE";
    private final static String driver = "oracle.jdbc.driver.OracleDriver";
    private final static String user = "serviexpress";
    private final static String pass = "serviexpress";

    
    //Metodo que obtiene y contiene la conexion
    public Connection getConnection(){
        
        try{
            Class.forName(driver);
            
            Connection conn = DriverManager.getConnection(url,user,pass);
            System.out.println("CONEXION ESTABLECIDA CORRECTAMENTE");
            return conn;
        }
        catch(Exception err){
            System.out.println("ERRoR: " + err.getMessage());
            return null;
        }
    }
}