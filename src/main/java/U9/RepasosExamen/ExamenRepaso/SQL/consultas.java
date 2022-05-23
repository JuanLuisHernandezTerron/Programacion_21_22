package U9.RepasosExamen.ExamenRepaso.SQL;

import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class consultas {

    public static List<Office> MostrarOficinas(){
        ArrayList<Office> listaOficinas = new ArrayList<>();

        try{
            Connection c = conexionBBDD.getConexion();
            PreparedStatement preparedStatement = c.prepareStatement("select * from offices");
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();
            while (rs.next()){
                Office ofiAUX = new Office();
                ofiAUX.setOfficeCode(rs.getInt("officeCode"));
                ofiAUX.setCity(rs.getString("city"));
                ofiAUX.setPhone(rs.getString("phone"));
                ofiAUX.setAddressLine1(rs.getString("addressLine1"));
                ofiAUX.setAddressLine2(rs.getString("addressLine2"));
                ofiAUX.setState(rs.getString("state"));
                ofiAUX.setCountry(rs.getString("country"));
                ofiAUX.setPostalCode(rs.getString("postalCode"));
                ofiAUX.setTerritory(rs.getString("territory"));
                listaOficinas.add(ofiAUX);
            }
        }catch (SQLException ex){
            System.out.println(ex.getStackTrace());
        }
        return listaOficinas;
    }

    public static String convertirJSON(ArrayList<Office> listaOficinas){
        Gson gson= new Gson();
        String json_completo = null;
        json_completo=gson.toJson(listaOficinas);
        return json_completo;
    }
}
