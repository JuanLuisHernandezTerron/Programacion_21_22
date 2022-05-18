package U9.ExamenRepaso;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionBBDD {
    private static Connection con = null;
    public static Connection getConexion(){
        try {
            if (con == null) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:8093/classicmodels?user=programacion&password=programacion");
            }
        }catch (SQLException ex){
            System.out.println(ex.getStackTrace());
        }
        return con;
    }
}
