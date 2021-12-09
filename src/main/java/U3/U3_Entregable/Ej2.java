package U3.U3_Entregable;
//Desarrollar una función que se denomine insertarEnVector con el siguiente prototipo:
//
//public static int[] insertarEnVector(int[] v1, int [] v2, int pos)
//Recibirá como parámetros dos vectores de enteros y una posición. Devolverá un vector de enteros que contenga el primer array con el segundo array insertado de manera completa a partir de la posición dada. Si la posición es menor que 0, el vector devuelto deberá contener el primer array. Si la posición es mayor que la longitud del primer array, el vector devuelto deberá contener el segundo array. Si la posición es igual a la longitud del primer array, el vector devuelto deberá contener el primer array con el segundo array insertado al final. Probar dicha función en el método Main.
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
//Desarrollar una función que se denomine insertarEnVector con el siguiente prototipo:

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//public static int[] insertarEnVector(int[] v1, int [] v2, int pos)
//Recibirá como parámetros dos vectores de enteros y una posición. Devolverá un vector de enteros
// que contenga el primer array con el segundo array insertado de manera completa a partir de la
// posición dada. Si la posición es menor que 0, el vector devuelto deberá contener el primer array.
// Si la posición es mayor que la longitud del primer array, el vector devuelto deberá contener el
// segundo array. Si la posición es igual a la longitud del primer array, el vector devuelto deberá
// contener el primer array con el segundo array insertado al final. Probar dicha función en el método Main.
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
public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] v1 = {1,2,4,5,5,6};
        int [] v2 = {4,6,8,4,6,6};
        System.out.println("Dime la posicion: ");
        int pos = teclado.nextInt();
        System.out.println(Arrays.toString(insertarEnVector(v1,v2,pos)));
    }
    public static int[] insertarEnVector(int[] v1, int [] v2, int pos){
        int [] arrayAUX = new int[0];
        int contadorIntroducido = 0;
        int contadorArray = 0;
        int contadorV2 = 0;
        int contadorPosV1 = v1.length - pos;

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (pos < 0){
                    arrayAUX= Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                    arrayAUX[contadorIntroducido] = v1[i];
                    contadorIntroducido ++;
                    break;
                }else if (pos > v1.length){
                    arrayAUX= Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                    arrayAUX[contadorIntroducido] = v2[i];
                    contadorIntroducido ++;
                    break;
                }else{
                        if (contadorArray < pos){
                            arrayAUX = Arrays.copyOf(arrayAUX, arrayAUX.length+1);
                            arrayAUX[contadorIntroducido] = v1[i];
                            contadorIntroducido ++;
                            contadorArray ++;
                            break;
                        }
                        while ((contadorArray >=pos) && (contadorArray < pos+v2.length)){
                            if (!(contadorV2 == v2.length)) {
                                arrayAUX = Arrays.copyOf(arrayAUX, arrayAUX.length + 1);
                                arrayAUX[contadorIntroducido] = v2[contadorV2];
                                contadorIntroducido++;
                                contadorArray++;
                                contadorV2++;
                                break;
                            }
                        }
                        if (contadorArray >= v2.length + pos){
                            arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                            arrayAUX[contadorIntroducido] = v1[contadorPosV1];
                            contadorIntroducido ++;
                            contadorArray ++;
                            contadorPosV1 ++;
                            break;
                        }
                    }
                }
            }
        return arrayAUX;
    }
}
