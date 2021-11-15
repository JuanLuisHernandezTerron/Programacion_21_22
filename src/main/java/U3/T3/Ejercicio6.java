package U3.T3;

import java.util.Arrays;

// Implementar una función sinRepetidos() con el prototipo:
//
//int[] sinRepetidos(int t[])
//
//que construye y devuelve una tabla del tamaño apropiado, con los elementos de t,
// donde se han eliminado los datos repetidos.
public class Ejercicio6 {
    public static void main(String[] args) {

        int [] t = {1,2,3,3,5,6,7,8,8,9};

        sinRepetidos(t);
        System.out.println(Arrays.toString(sinRepetidos(t)));
    }
    static int[] sinRepetidos (int[] t){
        int[] arrayNuevo = new int [0];
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            int contadorNumero = 0;
            for (int j = 0; j < t.length; j++) {
                if (( i == t[j]) && ( contadorNumero == 0)) {
                    contadorNumero++;
                    contador++;
                    arrayNuevo = Arrays.copyOf(arrayNuevo, contador);
                    arrayNuevo[contador - 1] = t[j];
                }
            }
        }
     return arrayNuevo;
    }
}
