package U6.T1.Actividad8;

import java.io.*;
import java.util.Arrays;

public class ejercicio8 {
    public static void main(String[] args) {
        String [] arrayNombres = new String[0];
        int contadorArray = 0;
        try {
            BufferedReader out = new BufferedReader(new FileReader("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T1\\Actividad8\\perso1.txt"));
            BufferedReader out1 = new BufferedReader(new FileReader("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T1\\Actividad8\\perso2.txt"));
            BufferedWriter in =new BufferedWriter(new FileWriter("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T1\\Actividad8\\personasOrdenadas.txt"));

            String linea = out.readLine();
            String linea1 = out1.readLine();
            String texto = "";
            while (linea != null){
                arrayNombres=Arrays.copyOf(arrayNombres,arrayNombres.length+1);
                arrayNombres[contadorArray++] = linea;
                linea = out.readLine();

            }

            while (linea1 != null){
                arrayNombres=Arrays.copyOf(arrayNombres,arrayNombres.length+1);
                arrayNombres[contadorArray++] = linea1;
                linea1 = out1.readLine();
            }

            Arrays.sort(arrayNombres,new compararNombres());
            int largoArray = arrayNombres.length-1;
            while (largoArray != 0) {
                in.write(arrayNombres[largoArray--]);
                in.newLine();
            }
            out.close();
            out1.close();
            in.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

}