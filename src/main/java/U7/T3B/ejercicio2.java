package U7.T3B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Añada al programa anterior la siguiente funcionalidad. El programa pedirá al usuario un dni,
calculará la clave que ha de consultar, comprobará que dicha clave existe, y, en tal caso, mostrará el
valor asociado a esa clave en el HashMap.*/
public class ejercicio2 {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            Map<Integer,String> mapDNI = new HashMap<>();
            System.out.println("Dime tu nombre");
            String nombre = teclado.nextLine();
            System.out.println("Dime tu DNI");
            String dni = teclado.nextLine();
            int contadorAUX= 0;
            System.out.println("Quieres insertar el numero o mirar si esta en el mapa (1 o 2)");
            int numeroRespuesta = teclado.nextInt();
           do {
               System.out.println("Quieres insertar el numero o mirar si esta en el mapa (1 o 2)");
               numeroRespuesta = teclado.nextInt();
               if (numeroRespuesta == 1){
                   if (contadorAUX  < 1){
                       meterDNI(dni,nombre,mapDNI, numeroRespuesta);
                       contadorAUX ++;
                   }
                   System.out.println(mapDNI);
                   System.out.println("Dime tu nombre");
                   nombre = teclado.next();
                   System.out.println("Dime tu DNI");
                   dni = teclado.next();
                   meterDNI(dni,nombre,mapDNI, numeroRespuesta);
               }else if (numeroRespuesta == 2){
                   System.out.println("Dime tu DNI");
                   dni = teclado.next();
                   System.out.println(mapDNI.get(meterDNI(dni,nombre,mapDNI, numeroRespuesta)));
               }
           }while (numeroRespuesta !=0);
        }

        private static int meterDNI(String dni, String nombre, Map mapAUX,int respuesta) {
            int numeroAUX = 0;
            int resto = 0;
            String dniReal = dni.substring(0,dni.length()-1);
            int numeroDNI = Integer.parseInt(dniReal);
            while (numeroDNI > 0){
                resto = numeroDNI % 10;
                numeroDNI = numeroDNI/10;
                numeroAUX += resto;
            }
            if (respuesta ==1){
                mapAUX.put(numeroAUX,nombre);
            }
            return numeroAUX;
        }
    }
