package U9.U9_Entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    private static Connection con = conexionDB.getConection();

    public static void insertOfiActuEmple() {
        try {
            con.setAutoCommit(false);
            insertOffice(new Oficina(
                    "8",
                    "Tokyo",
                    "603568923",
                    "Taketashi , 8",
                    "Takemura,12",
                    "Kanto",
                    "Japon",
                    "412365",
                    "Honshu"
            ));

            PreparedStatement preparedStatement = con.prepareStatement("UPDATE employees SET officeCode = 8 WHERE officeCode = 5");
            preparedStatement.executeUpdate();
            con.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
            try {
                if (con != null) {
                    System.out.println("Volvemos la base de datos a un estado anterior");
                    con.rollback();
                }
            } catch (SQLException ex1) {
                System.out.println(ex1.getStackTrace());
            }
        }
    }

    public static void insertarEmpleClient() {
        try {
            con.setAutoCommit(false);

            insertEmployeed(new Employee(
                    1001,
                    "Hernandez",
                    "JuanLuis",
                    "x4569",
                    "juanluterron@gmail.com",
                    "2",
                    1001,
                    "President"
            ));

            System.out.println("Empleado metido correctamente");

            insertClientes(new customer(
                    102,
                    "PedroS.L",
                    "Garcia",
                    "Pedro",
                    "603256189",
                    "66,Rue Fan",
                    "88,PedroBenito",
                    "Sevilla",
                    "Andalucia",
                    "41930",
                    "Espana",
                    1001,
                    500.65
            ));

            insertClientes(new customer(
                    100,
                    "JoseS.L",
                    "Manolillo",
                    "Manolo",
                    "603256356",
                    "66,Rue Gan",
                    "70,PedroJose",
                    "Malaga",
                    "Andalucia",
                    "42368",
                    "Espana",
                    1001,
                    450.80
            ));

            con.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
            try {
                if (con != null) {
                    System.out.println("Volvemos la base de datos a un estado anterior");
                    con.rollback();
                }
            } catch (SQLException ex1) {
                System.out.println(ex1.getStackTrace());
            }
        }
    }

    public static void insertOffice(Oficina oficinaAUX) {
        try {
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO offices VALUES (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, oficinaAUX.getOfficeCode());
            preparedStatement.setString(2, oficinaAUX.getCity());
            preparedStatement.setString(3, oficinaAUX.getPhone());
            preparedStatement.setString(4, oficinaAUX.getAddressLine1());
            preparedStatement.setString(5, oficinaAUX.getAddressLine2());
            preparedStatement.setString(6, oficinaAUX.getState());
            preparedStatement.setString(7, oficinaAUX.getCountry());
            preparedStatement.setString(8, oficinaAUX.getPostalCode());
            preparedStatement.setString(9, oficinaAUX.getTerritory());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertEmployeed(Employee employeeAUX) {
        try {
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO employees VALUES (?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, employeeAUX.getEmployeeNumber());
            preparedStatement.setString(2, employeeAUX.getLastName());
            preparedStatement.setString(3, employeeAUX.getFirstName());
            preparedStatement.setString(4, employeeAUX.getExtension());
            preparedStatement.setString(5, employeeAUX.getEmail());
            preparedStatement.setString(6, employeeAUX.getOfficeCode());
            preparedStatement.setInt(7, employeeAUX.getReportsTo());
            preparedStatement.setString(8, employeeAUX.getJobTitle());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void insertClientes(customer customerAUX) {
        try {
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, customerAUX.getCustomerNumber());
            preparedStatement.setString(2, customerAUX.getCustomerName());
            preparedStatement.setString(3, customerAUX.getContactLastName());
            preparedStatement.setString(4, customerAUX.getContactFirstName());
            preparedStatement.setString(5, customerAUX.getPhone());
            preparedStatement.setString(6, customerAUX.getAddressLine1());
            preparedStatement.setString(7, customerAUX.getAddressLine2());
            preparedStatement.setString(8, customerAUX.getCity());
            preparedStatement.setString(9, customerAUX.getState());
            preparedStatement.setString(10, customerAUX.getPostalCode());
            preparedStatement.setString(11, customerAUX.getCountry());
            preparedStatement.setInt(12, customerAUX.getSalesRepEmployeeNumber());
            preparedStatement.setDouble(13, customerAUX.getCreditLimit());

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
