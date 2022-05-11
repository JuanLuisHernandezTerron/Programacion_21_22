package U9.T2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBDD {
    private static Connection con = null;
    public static Connection getConexion(){
        try{
            if (con == null){
                con = DriverManager.getConnection("jdbc:mysql://localhost:8093/classicmodels?user=programacion&password=programacion");
               System.out.println("Proceso Finalizado correctamente");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }
}
