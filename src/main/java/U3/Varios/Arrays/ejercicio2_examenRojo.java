package U3.Varios.Arrays;

import java.util.Arrays;

//Define la función convierteArrayEnString con la siguiente cabecera:
//public static String convierteArrayEnString(int[] a)
//Esta función toma como parámetro un array que contiene números y devuelve
//una cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
//vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
//devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
//“62501”.
public class ejercicio2_examenRojo {
    public static void main(String[] args) {
        int [] array = {6,2,5,0,1};
        System.out.println(convierteArrayEnString(array));
    }
    public static String convierteArrayEnString(int[] a){
//        String cadenaArray = "";
        String cadenaVacia = "";
//        cadenaArray = Arrays.toString(a);
        for (int i = 0; i < a.length; i++) {
            cadenaVacia = cadenaVacia + a[i];
        }
//        for (int i = 0; i < cadenaArray.length(); i++) {
//            String recorrerArray = String.valueOf(cadenaArray.charAt(i));
//            if ((recorrerArray.equalsIgnoreCase("[" )) || (recorrerArray.equalsIgnoreCase(","))
//                    || (recorrerArray.equalsIgnoreCase(" "))
//                    || (recorrerArray.equalsIgnoreCase("]"))){

//            }else{
//                cadenaVacia = cadenaVacia + recorrerArray;
//            }
//        }
        return cadenaVacia;
    }
}
