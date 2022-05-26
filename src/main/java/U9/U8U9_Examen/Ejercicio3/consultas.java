package U9.U8U9_Examen.Ejercicio3;

import U9.RepasosExamen.ExamenRepaso.SQL.Office;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class consultas {
    private static Scanner teclado = new Scanner(System.in);

    public static List<Employee> MostrarEmpleados() {
        ArrayList<Employee> listaEmpleadosOficina = new ArrayList<>();
        try {
            System.out.println("Dime el codigo de la oficina");
            String codigoOficina = teclado.next();
            Connection con = ConexionDB.getCon();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT e.* FROM offices o " +
                    "INNER JOIN employees e " +
                    "ON o.officeCode = e.officeCode " +
                    "WHERE o.officeCode = ?;");
            preparedStatement.setString(1,codigoOficina);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();

            while (rs.next()){
                Employee emple = new Employee();
                emple.setNumeroEmpleado(rs.getInt("employeeNumber"));
                emple.setLastName(rs.getString("lastName"));
                emple.setFirstName(rs.getString("firstName"));
                emple.setExtension(rs.getString("extension"));
                emple.setEmail(rs.getString("email"));
                emple.setOfficeCode(rs.getString("officeCode"));
                emple.setReportsTo(rs.getInt("reportsTo"));
                emple.setJobTitle(rs.getString("jobTitle"));
                listaEmpleadosOficina.add(emple);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listaEmpleadosOficina;
    }

    public static void formatoJSON (List<Employee> listaEmpleados){
        Gson gson = new Gson();
        String jsonCompleto = gson.toJson(listaEmpleados);
        System.out.println(jsonCompleto);
    }
}
