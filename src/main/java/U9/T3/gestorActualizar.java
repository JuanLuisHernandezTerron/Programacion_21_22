package U9.T3;

import U9.T2.ConexionBBDD;

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
            Connection c = ConexionBBDD.getConexion();
            PreparedStatement statement = c.prepareStatement("select * from employees where employeeNumber = ?");
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
            PreparedStatement statement = c.prepareStatement("select * from customers where customerNumber = ?");
            statement.setInt(1,id_cliente);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                esta_cliente = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (!esta_cliente || !esta_empleado){
            System.out.println("No está en la Base de Datos");
        }else{
            try{
                Connection c = conexionBBDD.getConexion();
                PreparedStatement statement = c.prepareStatement("UPDATE customers SET salesRepEmployeeNumber = ? WHERE customerNumber = ?");
                statement.setInt(1,id_cliente);
                statement.setInt(2,id_empleado);
                statement.executeUpdate();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}
