package U9.T2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ADclassicModdels {
    public List<Empleado> getEmpleados() throws SQLException {
        List<Empleado> listaEmpleado = new ArrayList<>();
        Connection c = ConexionBBDD.getConexion();
        Statement statement = c.createStatement();
        statement.setQueryTimeout(30);
        ResultSet resultadorBaseDatos = statement.executeQuery("Select * from employees");
        while (resultadorBaseDatos.next()){

        }

        return listaEmpleado;
    }

    public List<Oficina> getOficinas(){
        List<Oficina> listaOficina = new ArrayList<>();
        return listaOficina;
    }
}
