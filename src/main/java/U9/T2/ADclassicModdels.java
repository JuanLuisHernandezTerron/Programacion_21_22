package U9.T2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADclassicModdels {
    public List<Empleado> getEmpleados() {
        List<Empleado> listaEmpleado = new ArrayList<>();
        try {
            Connection c = ConexionBBDD.getConexion();
            Statement statement = c.createStatement();
            statement.setQueryTimeout(30);
            ResultSet resultadorBaseDatos = statement.executeQuery("select * from employees");
            while (resultadorBaseDatos.next()) {
                Empleado empleAUX = new Empleado(resultadorBaseDatos.getInt(1),resultadorBaseDatos.getString("lastName"),resultadorBaseDatos.getString("firstName"),resultadorBaseDatos.getString("extension"),resultadorBaseDatos.getString("email"),resultadorBaseDatos.getString("officeCode"),resultadorBaseDatos.getInt("reportsTo"),resultadorBaseDatos.getString("jobTitle"));
                listaEmpleado.add(empleAUX);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listaEmpleado;
    }

    public List<Oficina> getOficinas(){
        List<Oficina> listaOficina = new ArrayList<>();
        try{
            Connection c = ConexionBBDD.getConexion();
            Statement statement = c.createStatement();
            statement.setQueryTimeout(30);
            ResultSet rs = statement.executeQuery("select * from offices");
            while (rs.next()){
                Oficina ofi = new Oficina(rs.getString("officeCode"),rs.getString("city"),rs.getString("phone"),rs.getString("addressLine1"),rs.getString("addressLine2"),rs.getString("state"),rs.getString("country"),rs.getString("postalCode"),rs.getString("territory"));
                listaOficina.add(ofi);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listaOficina;
    }
}
