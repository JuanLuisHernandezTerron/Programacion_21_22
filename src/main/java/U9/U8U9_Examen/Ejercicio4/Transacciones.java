package U9.U8U9_Examen.Ejercicio4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    private static Connection con = null;


    public static void inserccionLineConProducts() {
        try {
            Connection con = ConexionDB.getCon();
            con.setAutoCommit(false);

            inserccionLineProduct(new productLine(
                    "Vespinos",
                    "Si quieres ver Sevilla tranquila, una buena vespino te tendrias que pillar",
                    "",
                    ""
            ));

            System.out.println("ProductLine insertador Correctamente");

            inserccionProduct(new product(
                    "S09_2728",
                    "Vespino 1968 50cv",
                    "Vespinos",
                    "1:10",
                    "Vespinos Seville",
                    "Vespinos a tope!",
                    15,
                    60.50,
                    60.85
            ));

            System.out.println("Primer productorInsertado");

            inserccionProduct(new product(
                    "S09_2729",
                    "Vespino 2000 150cv",
                    "Vespinos",
                    "1:10",
                    "Vespinos Seville",
                    "Vespinos a tope!",
                    50,
                    100.50,
                    61.85
            ));

            System.out.println("Segundo productorInsertado");

            con.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void inserccionLineProduct(productLine productLineAUX) {
        try {
            Connection con = ConexionDB.getCon();
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO productlines VALUES (?,?,?,?)");
            preparedStatement.setString(1, productLineAUX.getProductLine());
            preparedStatement.setString(2, productLineAUX.getTextDescription());
            preparedStatement.setString(3, productLineAUX.getHtmlDescription());
            preparedStatement.setString(4, productLineAUX.getImage());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void inserccionProduct(product productAUX) {
        try {
            Connection con = ConexionDB.getCon();
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO products VALUES (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, productAUX.getProductCode());
            preparedStatement.setString(2, productAUX.getProductName());
            preparedStatement.setString(3, productAUX.getProductLine());
            preparedStatement.setString(4, productAUX.getProductScale());
            preparedStatement.setString(5, productAUX.getProductVendor());
            preparedStatement.setString(6, productAUX.getProductDescription());
            preparedStatement.setInt(7, productAUX.getQuantityInStock());
            preparedStatement.setDouble(8, productAUX.getBuyPrice());
            preparedStatement.setDouble(9, productAUX.getMSRP());

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
