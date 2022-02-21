package U6.T1.Actividad4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el nombre de la carta: ");
        String nombreCarta = teclado.nextLine();
        int contadorCaracteres = 0;
        int contadorFilas = 0;
        int contadorPalabras = 0;


         try{
             FileReader f1 = new FileReader("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T1/Actividad4/"+nombreCarta);
             BufferedReader in = new BufferedReader(new FileReader("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T1/Actividad4/"+nombreCarta));
             int c = f1.read();
             String texto = "";
             String linea = in.readLine();
             while (c != -1){
                 texto = String.valueOf((char) c);
                 c = f1.read();
                     if (texto.equals(" ")){
                         contadorPalabras++;
                         contadorCaracteres++;
                     }else {
                         contadorCaracteres++;
                     }
             }
             while (linea != null){
                 contadorFilas++;
                 contadorPalabras++;
                 contadorCaracteres--;
                 linea=in.readLine();
             }
             System.out.println("Tiene "+contadorPalabras+" palabras"+ " y "+ contadorCaracteres + " caracteres"+", tiene también"+contadorFilas+" filas");
             f1.close();
         }catch (IOException ex){
             System.out.println("ERROR DE FICHEROS");
         }
    }
}
