package U7.T3B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Crea un HashMap cuya clave sea un Integer, y cuyos valores sean los nombres de algunos
de tus compañeros. La clave ha de calcularse mediante un método que reciba un String que represente el dni,
y devuelva la suma de sus dígitos.
46221877D -> 4+6+2+2+1+8+7+7=37
Una vez guardados los elementos, deben mostrarse todos los elementos (clave-valor) del HasMap.*/
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map <Integer,String> mapDNI = new HashMap<>();
        System.out.println("Dime tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Dime tu DNI");
        String dni = teclado.nextLine();
        System.out.println(meterDNI(dni,nombre,mapDNI));
        System.out.println(mapDNI);
    }

    private static int meterDNI(String dni, String nombre, Map mapAUX) {
        int numeroAUX = 0;
        int resto = 0;
        String dniReal = dni.substring(0,dni.length()-1);
        int numeroDNI = Integer.parseInt(dniReal);
        mapAUX.put(numeroDNI,nombre);
        while (numeroDNI > 0){
            resto = numeroDNI % 10;
            numeroDNI = numeroDNI/10;
            numeroAUX += resto;
        }
        return numeroAUX;
    }
}
