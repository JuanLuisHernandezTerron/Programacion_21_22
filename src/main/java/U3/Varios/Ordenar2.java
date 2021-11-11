package U3.Varios;

import java.util.Arrays;

public class Ordenar2 {
    public static void main(String[] args) {
        int [] array = {2,3,6,8,9,10};  //i
        int [] array2 = {5,7,1,12,11,4}; //j
        int [] arrayvacio = new int [array.length + array2.length];
        int i = 0;
        int j = 0;

        Arrays.sort(array);
        Arrays.sort(array2);
        for (int k = 0; k < arrayvacio.length; k++) {
           if (i < array.length && j == array.length){
               arrayvacio[k] = array[i];
               i++;
           }else if (j < array.length && i == array.length){
               arrayvacio[k] = array2[j];
               j++;
           }else if ( array[i] < array2[j]){
               arrayvacio[k] = array[i];
               i++;
           }else{
               arrayvacio[k] = array2[j];
               j++;
           }
        }
        System.out.println(Arrays.toString(arrayvacio));
    }
}


