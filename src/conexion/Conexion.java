package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author scben
 */
public class Conexion {
        
    public Conexion(){
    }

    public Connection conectar(){

        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelystic", "root", "Yomeroll23.");
            System.out.println("Se conecto");
        } catch (ClassNotFoundException |SQLException ex) {
            System.out.println("No se conectó");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    

}

