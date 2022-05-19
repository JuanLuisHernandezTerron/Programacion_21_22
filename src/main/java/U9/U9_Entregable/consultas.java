package U9.U9_Entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class consultas {
    private static Scanner teclado = new Scanner(System.in);

    public static void informeCategorias() {
        try {
            System.out.println("Dime el nombre de una categoria");
            String categoria = teclado.nextLine();
            Connection c = conexionDB.getConection();
            PreparedStatement preparedStatement = c.prepareStatement("SELECT pr.productName,o.quantityOrdered,o.priceEach " +
                    "FROM products pr " +
                    "INNER JOIN orderdetails o " +
                    "ON pr.productCode=o.productCode " +
                    "WHERE pr.productLine = ?;");
            preparedStatement.setString(1, categoria);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();
            while (rs.next()) {
                System.out.println("El nombre del producto es: " + rs.getString("productName") + ", su cantidad es:" + rs.getInt("quantityOrdered") + ", y su precio es:" + rs.getDouble("priceEach"));
            }
            conexionDB.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void InfoPagos() {
        try {
            System.out.println("Dime el numero del cliente:");
            int categoria = teclado.nextInt();
            Connection c = conexionDB.getConection();
            PreparedStatement preparedStatement = c.prepareStatement("SELECT c.customerNumber, p.checkNumber,p.paymentDate,p.amount " +
                    "FROM customers c " +
                    "INNER JOIN payments p " +
                    "ON c.customerNumber = p.customerNumber " +
                    "WHERE p.customerNumber = ?;");
            preparedStatement.setInt(1, categoria);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();
            while (rs.next()) {
                System.out.println("El id del cliente es :" + rs.getInt("customerNumber") + ", su checkNumber es " + rs.getString("checkNumber") + ", la fecha en que hizo el pago fue " + rs.getDate("paymentDate") + " y su cantidad es: " + rs.getDouble("amount"));
            }
            conexionDB.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void FiltroPrecio() {
        try {
            System.out.println("Dime el precio de donde quiere que parta los precios");
            double precio = teclado.nextDouble();
            Connection c = conexionDB.getConection();
            PreparedStatement preparedStatement = c.prepareStatement("SELECT productName,buyPrice FROM products WHERE buyPrice > ?;");
            preparedStatement.setDouble(1, precio);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();

            while (rs.next()) {
                System.out.println("El nombre de producto es: " + rs.getString("productName") + " y su precio es " + rs.getDouble("buyPrice"));
            }
            conexionDB.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
