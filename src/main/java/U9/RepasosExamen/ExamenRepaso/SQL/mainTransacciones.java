package U9.RepasosExamen.ExamenRepaso.SQL;

import U9.T2.ConexionBBDD;

import java.sql.Connection;
import java.sql.SQLException;

public class mainTransacciones {
    private static Connection c = ConexionBBDD.getConexion();
    public static void main(String[] args) {
        insertarProducto();
    }

    public static void insertarProducto() {
        try {
            c.setAutoCommit(false);
            insertarPedido.insertOrderDetails(
                    new orderDetails(10103,
                            "S10_4757",
                            20,
                            27.24,
                            5)
            );

            System.out.println("Insertador Correctamente");
            insertarPedido.insertOrderDetails(
                    new orderDetails(
                            10103,
                            "S18_1367",
                            25,
                            28.30,
                            10
                    )
            );

            c.commit();
            System.out.println("Insertado Correctamente el pedido con su segundo producto");
        } catch (SQLException ex) {
            System.out.println(ex.getStackTrace());
            try {
                if (c != null) {
                    System.out.println("Volvemos la base de datos a un estado anterior");
                    c.rollback();
                }
            }catch (SQLException ex1){
                System.out.println(ex1.getStackTrace());
            }
        }
    }
}
