package U7.T3B.ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Traductor {

    Map <String,String> diccionario = new HashMap<>();
    private String nombre_archivo;
    public Traductor(String nombre_archivo){
        this.nombre_archivo = nombre_archivo;
        rellenarDiccionario(nombre_archivo);
    }

    private void rellenarDiccionario(String nombre_archivo) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(nombre_archivo));
            String linea = file.readLine();
            while (linea != null){
                int posicionComa = linea.indexOf(",");
                String espanol = linea.substring(0,posicionComa);
                String ingles = linea.substring(posicionComa+2,linea.length());
                diccionario.put(espanol,ingles);
                linea = file.readLine();
            }
            file.close();
        }catch (IOException Ex){
            Ex.printStackTrace();
        }
    }

    public void traducirFrasePalabra(String palabra){
        System.out.println(diccionario.get(palabra));
    }

    @Override
    public String toString() {
        return "Traductor{" +
                "diccionario=" + diccionario +
                '}';
    }

}
