package U9.T3;

import U9.T2.ConexionBBDD;

import java.sql.*;
import java.util.Scanner;

public class gestorInserccion {
    public static void insertarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime customerNumber");
        int customerNumber = sc.nextInt();
        System.out.println("Dime customerName");
        String customerName = sc.nextLine();
        System.out.println("Dime contactLastName");
        String contactLastName = sc.nextLine();
        System.out.println("Dime contactFirstName");
        String contactFirstName = sc.nextLine();
        System.out.println("Dime phone");
        String phone = sc.nextLine();
        System.out.println("Dime addressLine1");
        String addressLine1 = sc.nextLine();
        System.out.println("Dime addressLine2");
        String addressLine2 = sc.nextLine();
        System.out.println("Dime city");
        String city = sc.nextLine();
        System.out.println("Dime state");
        String state = sc.nextLine();
        System.out.println("Dime postalCode");
        String postalCode = sc.nextLine();
        System.out.println("Dime country");
        String country = sc.nextLine();
        System.out.println("Dime creditLimit");
        double creditLimit = sc.nextDouble();
        try {
            Connection c = conexionBBDD.getConexion();
            PreparedStatement statement = c.prepareStatement("INSERT INTO 'customers' ('customerNumber','customerName','contactLastName','contactFirstName','phone','addressLine1','addressLine2','city','state','postalCode','country','creditLimit') VALUES" +
                    "(?,?,?,?,?,?,?,?,?,?,?,?)");
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
            statement.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
