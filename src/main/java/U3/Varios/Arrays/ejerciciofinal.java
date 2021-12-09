package U3.Varios.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejerciciofinal {
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
                }
            }
        }
        return arrayAUX;
    }
}

