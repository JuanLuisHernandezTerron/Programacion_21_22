package U3.Varios;

import java.util.Scanner;

public class ejercicioExamenNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numeroIntroducido = teclado.nextInt();

        String numeroCadena = String.valueOf(numeroIntroducido);
        int anchuraNumero = numeroCadena.length();

        String numerosConcatenados = "";

        String numeroConvertir = convertidor(numeroCadena, anchuraNumero, numerosConcatenados);
        int anchuraNumero2 = numeroConvertir.length();
        System.out.println(numeroConvertir.substring(0,anchuraNumero2-2));
    }
    static String convertidor(String numeroCadena, int anchuraNumero, String numerosConcatenados){
        for (int i = 0; i < anchuraNumero; i++) {
            String recorrerNumero = String.valueOf(numeroCadena.charAt(i));

            switch (recorrerNumero){
                case "0":
                    numerosConcatenados = numerosConcatenados + "cero, ";
                    break;
                case "1":
                    numerosConcatenados = numerosConcatenados + "uno, ";
                    break;
                case "2":
                    numerosConcatenados = numerosConcatenados + "dos, ";
                    break;
                case "3":
                    numerosConcatenados = numerosConcatenados + "tres, ";
                    break;
                case "4":
                    numerosConcatenados = numerosConcatenados + "cuatro, ";
                    break;
                case "5":
                    numerosConcatenados = numerosConcatenados + "cinco, ";
                    break;
                case "6":
                    numerosConcatenados = numerosConcatenados + "seis, ";
                    break;
                case "7":
                    numerosConcatenados = numerosConcatenados + "siete, ";
                    break;
                case "8":
                    numerosConcatenados = numerosConcatenados + "ocho, ";
                    break;
                case "9":
                    numerosConcatenados = numerosConcatenados + "nueve, ";
                    break;
            }
        }
        return numerosConcatenados;
    }
}
