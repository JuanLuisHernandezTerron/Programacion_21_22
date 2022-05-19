package U9.EntregableRepaso;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class consultas {
    public static void pagosClientes(int numeroCliente){
        try{
            Connection c = conexionBBDD.getConexion();
            Statement statement = c.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("SELECT c.contactFirstName, c.contactLastName, c.country,SUM(p.amount) AS SumaTotalCliente " +
                    "FROM customers c " +
                    "INNER JOIN payments p " +
                    "ON c.customerNumber = p.customerNumber " +
                    "WHERE p.customerNumber="+numeroCliente+";");
            while (rs.next()){
                System.out.println("Su nombre es "+rs.getString("contactFirstName")+", su segundo nombre es "+rs.getString("contactLastName")+", su ciudad es "+rs.getString("country")+", y la suma total de los pagos es "+rs.getInt("SumaTotalCliente"));
            }
        }catch (SQLException ex){
            ex.getStackTrace();
        }
    }
}
