package U9.RepasosExamen.ExamenRepaso.SQL;

import U9.T2.ConexionBBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertarPedido {

    public static void insertOrderDetails(orderDetails orderDetails){
        try{
            Connection c = ConexionBBDD.getConexion();
            PreparedStatement preparedStatement = c.prepareStatement("INSERT INTO orderdetails VALUES (?,?,?,?,?)");
            preparedStatement.setInt(1,orderDetails.getOrderNumber());
            preparedStatement.setString(2,orderDetails.getProductCode());
            preparedStatement.setInt(3,orderDetails.getQuantityOrder());
            preparedStatement.setDouble(4,orderDetails.getPriceEach());
            preparedStatement.setInt(5,orderDetails.getOrderLineNumber());

            preparedStatement.executeUpdate();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
