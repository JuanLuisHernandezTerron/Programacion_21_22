package U9.T3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class gestorActualizar {

    public static void asignarEmple(int id_empleado, int id_cliente) {
        boolean esta_empleado = false;
        boolean esta_cliente = false;

        //empleado
        try {
            Connection c = conexionBBDD.getConexion();
            PreparedStatement statement = c.prepareStatement("SELECT * FROM employees WHERE employeeNumber = ?");
            statement.setInt(1, id_empleado);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                esta_empleado = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //cliente
        try {
            Connection c = conexionBBDD.getConexion();
            PreparedStatement statement = c.prepareStatement("SELECT * FROM customers WHERE customerNumber = ?");
            statement.setInt(1, id_cliente);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                esta_cliente = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (!esta_cliente || !esta_empleado) {
            System.out.println("No está en la Base de Datos");
        } else {
            try {
                Connection c = conexionBBDD.getConexion();
                PreparedStatement statement = c.prepareStatement("UPDATE customers SET salesRepEmployeeNumber = ? WHERE customerNumber = ?");
                statement.setInt(2, id_cliente);
                statement.setInt(1, id_empleado);
                statement.executeUpdate();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void asignarProductoPedido(int id_pedido, String id_producto, int cantidadProducto) {
        boolean esta_producto = false;
        boolean esta_pedido = false;
        int cantidadProductoAUX = 0;

        //Producto
        try {
            Connection c = conexionBBDD.getConexion();
            PreparedStatement statement = c.prepareStatement("SELECT * FROM products WHERE productCode = ?");
            statement.setString(1, id_producto);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                esta_producto = true;
            } else {
                System.out.println("No hay producto en la tabla con ese id");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //Pedido

        try {
            Connection c = conexionBBDD.getConexion();
            PreparedStatement statement = c.prepareStatement("SELECT * FROM orders WHERE orderNumber = ?");
            statement.setInt(1, id_pedido);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                esta_pedido = true;
            } else {
                System.out.println("No hay pedido en la tabla con ese id");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //AmbasTablas
        if (esta_producto && esta_pedido) {
            try {
                Connection c = conexionBBDD.getConexion();
                PreparedStatement statement = c.prepareStatement("SELECT orderNumber, productCode FROM orderdetails WHERE productCode = ? AND orderNumber = ?");
                statement.setString(1, id_producto);
                statement.setInt(2, id_pedido);
                ResultSet rs = statement.executeQuery();
                if (rs.next()) {
                    PreparedStatement statement1 = c.prepareStatement("SELECT quantityOrdered FROM orderdetails WHERE productCode = ? AND orderNumber = ?");
                    statement1.setString(1, id_producto);
                    statement1.setInt(2, id_pedido);
                    ResultSet rsAUX = statement1.executeQuery();
                    if (rsAUX.next()) {
                        cantidadProductoAUX += rsAUX.getInt("quantityOrdered");
                        PreparedStatement statement2 = c.prepareStatement("UPDATE orderdetails SET quantityOrdered = ? WHERE productCode = ? AND orderNumber = ?");
                        statement2.setInt(1, cantidadProductoAUX + cantidadProducto);
                        statement2.setString(2,id_producto);
                        statement2.setInt(3,id_pedido);
                        statement2.executeUpdate();
                    }
                } else {
                  PreparedStatement statementInsert = c.prepareStatement("INSERT INTO orderdetails VALUES (?,?,?,?,?)");
                  statementInsert.setInt(1,id_pedido);
                  statementInsert.setString(2,id_producto);
                  statementInsert.setInt(3,cantidadProducto);
                  statementInsert.setInt(4, (int) (1+(Math.random()*100)));
                  statementInsert.setInt(5, (int) (1+(Math.random()*12)));
                  statementInsert.executeUpdate();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("NO ESTAN");
        }
    }
}
