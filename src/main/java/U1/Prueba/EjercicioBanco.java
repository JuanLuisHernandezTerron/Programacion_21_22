package U1.Prueba;

import java.util.Scanner;

//Escribir un programa que solicite al usuario un número de tarjeta de crédito del BANCO - ERESUNPRIMO y que valide lo siguiente:
//
//El formato del número que debe ser (incluyendo los guiones) así: 2222-3333-44-0123456789
//En este formato los 4 primeros dígitos (2222) corresponde a la entidad, el BANCO - ERESUNPRIMO.
//
//Los 4 siguientes corresponden a la sucursal (3333).
//
//Los 2 siguiente al número de control  (44)
//
//Los 10 últimos corresponden el número de cuenta.
//
//Esos 10 últimos números en todas las cuentas del BANCO - ERESUNPRIMO deben ser un número primo.
//Ejemplo:
//
//Introduce el número de cuenta:
//
//1233342341234124123
//
//No es un de cuenta válido
public class EjercicioBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el numero del banco");
        long numeroBanco = teclado.nextLong();

        long cociente = numeroBanco;
        long resto = 0;
        long numeroAUX = 0;
        int contador1 = 0;
        long numero_restante = 0;
        long numeroPrimeros = 0;


        while ( cociente > 0){
            resto = cociente % 10;
            cociente = cociente/10;
            numeroAUX = numeroAUX +resto;
            numeroAUX = numeroAUX *10;
        }

        numeroAUX = numeroAUX /10;

        while (numeroAUX > 0){
            resto = numeroAUX % 10;
            numeroAUX = numeroAUX /10;

            if (contador1 > 5){
                numero_restante = numero_restante + resto;
                numero_restante = numero_restante *10;
            }else{
                numeroPrimeros = numeroPrimeros + resto;
                numeroPrimeros = numeroPrimeros * 10;
            }
            contador1 ++;
        }
        numero_restante=numero_restante/10;
        numeroPrimeros=numeroPrimeros/10;
        System.out.println(numero_restante);
        System.out.println(numeroPrimeros);

        boolean es_primo = true;
        for (int i = 2; i < numero_restante; i++) {
                if ( numero_restante % i == 0){
                    es_primo = false;
                    break;
            }
        }

        if ((es_primo) && (numeroPrimeros == 223344)){
            System.out.print("Es un numero de cuenta valido");
        }else{
            System.out.print("No es numero de cuenta valido");
        }
    }
}
