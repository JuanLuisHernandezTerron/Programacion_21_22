package U7.T3B;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<Integer,String> mapDNI = new HashMap<>();
        System.out.println("Dime tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Dime tu DNI");
        String dni = teclado.nextLine();
        System.out.println(meterDNI(dni,nombre,mapDNI));
        meterDNI("1234D","pedro",mapDNI);
        meterDNI("214T","Oscar",mapDNI);
        meterDNI("675S","Mario",mapDNI);
        meterDNI("23456G","Irene",mapDNI);
        System.out.println(mapDNI);

        Iterator <Integer> itAUX = mapDNI.keySet().iterator();
        while (itAUX.hasNext()){
            int numeroClave = itAUX.next();
            String nommbreAUX = mapDNI.get(numeroClave);
            System.out.println("La clave "+numeroClave+" está asociada al nombre de "+nommbreAUX);
        }
    }

    private static int meterDNI(String dni, String nombre, Map mapAUX) {
        int numeroAUX = 0;
        int resto = 0;
        String dniReal = dni.substring(0,dni.length()-1);
        int numeroDNI = Integer.parseInt(dniReal);
        while (numeroDNI > 0){
            resto = numeroDNI % 10;
            numeroDNI = numeroDNI/10;
            numeroAUX += resto;
        }
        mapAUX.put(numeroAUX,nombre);
        return numeroAUX;
    }
}
