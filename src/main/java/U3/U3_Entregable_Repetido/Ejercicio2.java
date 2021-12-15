package U3.U3_Entregable_Repetido;
import java.util.Scanner;
import java.util.Arrays;
//Desarrollar una función que se denomine insertarEnVector con el siguiente prototipo:
//
//public static int[] insertarEnVector(int[] v1, int [] v2, int pos)
//Recibirá como parámetros dos vectores de enteros y una posición. Devolverá un vector de enteros que contenga el primer
// array con el segundo array insertado de manera completa a partir de la posición dada. Si la posición es menor que 0,
// el vector devuelto deberá contener el primer array. Si la posición es mayor que la longitud del primer array, el vector
// devuelto deberá contener el segundo array. Si la posición es igual a la longitud del primer array, el vector devuelto
// deberá contener el primer array con el segundo array insertado al final. Probar dicha función en el método Main.
//
//Ejemplo 1:
//
//v1 = {1,2,3,4,5,6}
//v2 = {4,9,12,5,7}
//pos = 2
//El resultado de insertarEnVector será:
//
//{1,2,4,9,12,5,7,3,4,5,6}
//Ejemplo 2:
//
//v1 = {6,12,8,9,3,13}
//v2 = {13,11,4,8,6,1}
//pos = -1
//El resultado de insertarEnVector será:
//
//{6,12,8,9,3,13}
//Ejemplo 3:
//
//v1 = {6,12,8,9,3,13}
//v2 = {13,11,4,8,6,1}
//pos = 7
//El resultado de insertarEnVector será:
//
//{13,11,4,8,6,1}
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] v1 = {1,2,3,4,5,6};
        int [] v2 = {4,9,12,5,7};

        System.out.println("En que posicion quieres insertar el vector: ");
        int pos = teclado.nextInt();

        System.out.println(Arrays.toString(insertarEnVector(v1,v2,pos)));
    }
    public static int[] insertarEnVector(int[] v1, int [] v2, int pos){
        int [] arrayAux = new int[0];
        int contadorIntroducido = 0;
        int contadorIntroducidoV2 = 0;
        int contadorIntroducidoV1 = 0;

        if (pos < 0){
            for (int i = 0; i < v1.length; i++) {
                arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+1);
                arrayAux[contadorIntroducido] = v1[i];
                contadorIntroducido ++;
            }
        }else if (pos > v2.length){
            for (int i = 0; i < v2.length; i++) {
                arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+1);
                arrayAux[contadorIntroducido] = v2[i];
                contadorIntroducido ++;
            }
        }else{
            for (int i = 0; i <= v1.length+v2.length; i++) {
                if (contadorIntroducido != pos){
                    arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+1);
                    arrayAux[contadorIntroducido] = v1[contadorIntroducidoV1];
                    contadorIntroducido ++;
                    contadorIntroducidoV1 ++;
                    if (contadorIntroducido == v1.length+v2.length){
                        break;
                    }
                }else{
                    while (contadorIntroducidoV2 != v2.length) {
                        arrayAux = Arrays.copyOf(arrayAux, arrayAux.length + 1);
                        arrayAux[contadorIntroducido] = v2[contadorIntroducidoV2];
                        contadorIntroducido++;
                        contadorIntroducidoV2++;
                    }
                }
            }
        }
        return arrayAux;
    }
}
