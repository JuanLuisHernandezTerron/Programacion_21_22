package U9.RepasosExamen.ExamenRepaso2.SQL;

import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class consultas {
    public static List<Office> MostrarOficinas (){
        ArrayList<Office> listaOficinas = new ArrayList<>();
        try {
            Connection con = conexionBBDD.getCon();
            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM offices");
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();
            while (rs.next()){
                Office oficina = new Office();
                oficina.setOfficeCode(rs.getInt("officeCode"));
                oficina.setCity(rs.getString("city"));
                oficina.setPhone(rs.getString("phone"));
                oficina.setAddressLine1(rs.getString("addressLine1"));
                oficina.setAddressLine2(rs.getString("addressLine2"));
                oficina.setState(rs.getString("state"));
                oficina.setCountry(rs.getString("country"));
                oficina.setPostalCode(rs.getString("postalCode"));
                oficina.setTerritory(rs.getString("territory"));
                listaOficinas.add(oficina);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return listaOficinas;
    }

    public static void pasarJSON(List<Office> listaOficinas){
        String jsonCompleto = "";
        Gson gson = new Gson();
        jsonCompleto = gson.toJson(listaOficinas);
        System.out.println(jsonCompleto);
    }
}
