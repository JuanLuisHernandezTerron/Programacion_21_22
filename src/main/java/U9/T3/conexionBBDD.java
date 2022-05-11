package U9.T3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionBBDD {
    private static Connection con = null;
    public static Connection getConexion(){
        try{
            if (con == null){
                con = DriverManager.getConnection("jdbc:mysql://localhost:8093/classicmodels?user=programacion&password=programacion");
                System.out.println("Inicio sastifactorio de la base de datos");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }
}
