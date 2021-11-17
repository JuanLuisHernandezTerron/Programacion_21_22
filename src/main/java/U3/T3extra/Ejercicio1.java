package U3.T3extra;

import java.util.Arrays;
import java.util.Scanner;

//Escribe un programa que rellene un array de 100 elementos con números en-teros aleatorios comprendidos entre 0 y 500
//459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21251 6 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402 225426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368 466262 422 275 384 399 397 87 218 84 312 480 207 68 108
//
//¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1
//
//459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21251 **6** 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402225 426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368466 262 422 275 384 399 397 87 218 84 312 480 207 68 10
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int [] arrayNumeros = new int[100];
        System.out.println(Arrays.toString(arrayRellenar(arrayNumeros)));
        System.out.println("Que numero quieres destacar? (1 – mínimo, 2 – máximo):");
        int numeroDestacar = teclado.nextInt();
        int numeroAux = sacarMinimoMaximo(arrayNumeros,numeroDestacar);
        String arrayString = "[";

        for (int i = 0; i < arrayNumeros.length; i++) {
            if (arrayNumeros[i] == numeroAux){
                arrayString = arrayString + "**"+arrayNumeros[i]+"**"+",";
            }else{
                arrayString = arrayString+arrayNumeros[i] + ", ";
            }
        }

        System.out.println(arrayString+"]");


    }


    private static int[] arrayRellenar(int[]array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*501);
        }
        return array;
    }

    private static int sacarMinimoMaximo(int [] array,int numeroDestacar) {
        int [] arrayVacio = new int[100];
        arrayVacio = Arrays.copyOf(array,100);
        Arrays.sort(arrayVacio);

        if (numeroDestacar == 1){
            return arrayVacio[0];
        }else{
            return arrayVacio[arrayVacio.length-1];
        }
    }

}
