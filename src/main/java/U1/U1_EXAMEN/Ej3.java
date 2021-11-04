package U1.U1_EXAMEN;

import java.util.Scanner;

//Desarrolla un programa que genere una clave criptográfica mediante números aleatorios para
// cifrar otro número introducido por el usuario. Se generará una clave distinta para cada una de
// las cifras del número introducido por el usuario. Las diferentes claves criptográficas generadas
// se comprenderán entre 1000 y 10000 (siendo este último no incluido). Por cada cifra del número,
// se sumará al total de cifras sumadas de su clave criptográfica. El número final se obtendrá de
// sumar todos los resultados parciales. Abajo se detalla un ejemplo para su mejor comprensión.
//
//Ejemplo 1:
//
//Introduzca un número: 628
//La clave criptográfica generada para 6 es: 7452
//La clave criptográfica generada para 2 es: 8084
//La clave criptográfica generada para 8 es: 3480
public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int numeroIntroducido = teclado.nextInt();

        int cociente = numeroIntroducido;
        int resto = 0;
        int numeroAUX = 0;
        int clave1 = (int) (1000+Math.random()*10000-1);
        int claveAUX1 = 0;
        int claveAsegurar1 = clave1;
        int clave2 = (int) (1000+Math.random()*10000-1);
        int claveAUX2 = 0;
        int claveAsegurar2 = clave2;
        int clave3 = (int) (1000+Math.random()*10000-1);
        int claveAUX3 = 0;
        int claveAsegurar3 = clave3;


        while (cociente > 0){
            resto = cociente % 10;
            cociente = cociente /10;
            numeroAUX = numeroAUX + resto;
            numeroAUX = numeroAUX * 10;
        }
        numeroAUX = numeroAUX / 10;

        while (clave1 > 0){
            resto = clave1 % 10;
            clave1 = clave1 /10;
            claveAUX1 = claveAUX1 + resto;
        }
        while (clave2 > 0){
            resto = clave2 % 10;
            clave2 = clave2 /10;
            claveAUX2 = claveAUX2 + resto;
        }
        while (clave3 > 0){
            resto = clave3 % 10;
            clave3 = clave3 /10;
            claveAUX3 = claveAUX3 + resto;
        }
        System.out.println("La clave del primer numero es: "+ claveAsegurar1 + " y la suma es "+ claveAUX1);
        System.out.println("La clave del segundo numero es: "+ claveAsegurar2 + " y la suma es "+ claveAUX2);
        System.out.println("La clave del tercer numero es: "+ claveAsegurar3 + " y la suma es "+ claveAUX3);
        System.out.println("La suma total de los numeros son: "+ (claveAUX1 + claveAUX2 + claveAUX3));
    }
}
