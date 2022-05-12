package U9.T3;

import java.sql.*;

public class gestorPedido {
    public static void getDetalles(int id_pedido){
        try{
            Connection c = conexionBBDD.getConexion();
            PreparedStatement statement = c.prepareStatement("SELECT o.*, p.productName, od.quantityOrdered, p.buyPrice, (od.quantityOrdered*p.buyPrice) AS sumaTotal " +
                    "FROM orders o " +
                    "INNER JOIN orderdetails od " +
                    "ON o.orderNumber = od.orderNumber " +
                    "INNER JOIN products p " +
                    "ON od.productCode = p.productCode " +
                    "WHERE o.orderNumber = ?;");
            statement.setInt(1,id_pedido);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int orderNumber = rs.getInt("orderNumber");
                Date orderDate = rs.getDate("orderDate");
                Date requiredDate = rs.getDate("requiredDate");
                Date shippedDate = rs.getDate("shippedDate");
                String status = rs.getString("status");
                String comments = rs.getString("comments");
                int customerNumber = rs.getInt("customerNumber");
                String productName = rs.getString("productName");
                int quantityOrdered = rs.getInt("quantityOrdered");
                double sumaTotal = rs.getDouble("sumaTotal");

                System.out.println();
                System.out.println("---------------");
                System.out.println("orderNumber: "+orderNumber);
                System.out.println("orderDate: "+orderDate);
                System.out.println("requiredDate: "+requiredDate);
                System.out.println("shippedDate: "+shippedDate);
                System.out.println("status: "+status);
                System.out.println("comments: "+comments);
                System.out.println("customerNumber: "+customerNumber);
                System.out.println("productName: "+productName);
                System.out.println("quantityOrdered: "+quantityOrdered);
                System.out.println("sumaTotal: "+sumaTotal);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
