package U9.RepasosExamen.ExamenRepaso2.SQL;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionBBDD {
    private static Connection con = null;

    public static Connection getCon() {
        try {
            if (con == null) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:8093/classicmodels?user=programacion&password=programacion");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }

    public static void close() {
        try{
            if (con != null){
                con.close();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
