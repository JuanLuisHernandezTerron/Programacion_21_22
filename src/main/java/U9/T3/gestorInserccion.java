package U9.T3;

import java.sql.*;
import java.util.Scanner;

public class gestorInserccion {
    public static void insertarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime customerNumber");
        int customerNumber = sc.nextInt();
        System.out.println("Dime customerName");
        String customerName = sc.next();
        System.out.println("Dime contactLastName");
        String contactLastName = sc.next();
        System.out.println("Dime contactFirstName");
        String contactFirstName = sc.next();
        System.out.println("Dime phone");
        String phone = sc.next();
        System.out.println("Dime addressLine1");
        String addressLine1 = sc.next();
        System.out.println("Dime addressLine2");
        String addressLine2 = sc.next();
        System.out.println("Dime city");
        String city = sc.next();
        System.out.println("Dime state");
        String state = sc.next();
        System.out.println("Dime postalCode");
        String postalCode = sc.next();
        System.out.println("Dime country");
        String country = sc.next();
        System.out.println("Dime creditLimit");
        double creditLimit = sc.nextDouble();
        try {
            Connection c = conexionBBDD.getConexion();
            PreparedStatement statement = c.prepareStatement("INSERT INTO customers (customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,creditLimit) VALUES" +
                    "(?,?,?,?,?,?,?,?,?,?,?,?)"); //No poner comillas simples a la hora de insertar datos
            statement.setInt(1, customerNumber);
            statement.setString(2, customerName);
            statement.setString(3, contactLastName);
            statement.setString(4, contactFirstName);
            statement.setString(5, phone);
            statement.setString(6, addressLine1);
            statement.setString(7, addressLine2);
            statement.setString(8, city);
            statement.setString(9, state);
            statement.setString(10, postalCode);
            statement.setString(11, country);
            statement.setDouble(12, creditLimit);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
