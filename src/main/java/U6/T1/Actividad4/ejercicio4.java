package U6.T1.Actividad4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el nombre de la carta: ");
        String nombreCarta = teclado.nextLine();
        String abecedario="abcdefghijkmlnñopqrstyvz";
        int contadorPalabras = 0;
        int contadorCaracteres = 0;
        int contadorFilas = 0;

         try{
             FileReader f1 = new FileReader("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T1/Actividad4/"+nombreCarta);
             int c = f1.read();
             String texto = "";
             while (c != -1){
                 texto += (char) c;
                 c = f1.read();
             }

             for (int i = 0; i < texto.length(); i++) {
                 String recorrerTexto = String.valueOf(texto.charAt(i));
                 for (int j = 0; j < abecedario.length(); j++) {
                     String recorrerabe = String.valueOf(abecedario.charAt(j));
                     if (recorrerTexto.equalsIgnoreCase(recorrerabe)){
                         contadorPalabras ++;
                     }else if(recorrerTexto.equals(" ")||recorrerTexto.equalsIgnoreCase(recorrerabe)){
                         contadorCaracteres ++;
                     }
                 }
             }

             System.out.println("Tiene "+contadorPalabras+" palabras"+ " y "+ contadorCaracteres + " caracteres");
         }catch (IOException ex){
             System.out.println("ERROR DE FICHEROS");
         }
    }
}
