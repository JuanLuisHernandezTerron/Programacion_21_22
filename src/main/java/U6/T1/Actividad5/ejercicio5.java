package U6.T1.Actividad5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroMayor = 0;
        int numeroMenor = 0;
        int numeroAUX = 0;
        int contadorAUX = 0;
        System.out.println("Dime el nombre del fichero: ");
        String nombreFichero = teclado.nextLine();

        try{
            BufferedReader b1 = new BufferedReader(new FileReader("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T1/Actividad5/"+nombreFichero));
            int c = Integer.parseInt(b1.readLine());
            while (c != -1){
                c= Integer.parseInt(b1.readLine());
                numeroAUX = (Integer) c;
                if (contadorAUX != 1){
                    numeroMayor = c;
                    numeroMenor = c;
                    contadorAUX++;
                }else if(c > numeroMayor){
                    numeroMayor =c;
                }else if(c < numeroMenor){
                    numeroMenor = c;
                }
            }
            b1.close();
            System.out.println("El numero más grande es: "+numeroMayor+ " y el numero menor es: "+numeroMenor);
        }catch (IOException ex){
            System.out.println("ERROR DE FICHERO");
        }
    }
}
