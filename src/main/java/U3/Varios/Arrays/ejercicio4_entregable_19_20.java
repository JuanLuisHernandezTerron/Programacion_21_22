package U3.Varios.Arrays;

import java.util.Arrays;

//Define la función convierteArrayEnString con la siguiente cabecera:
//public static String convierteArrayEnString(int[] a)
//Esta función toma como parámetro un array que contiene números y devuelve
//una cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
//vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
//devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
//“62501”.
public class ejercicio4_entregable_19_20 {
    public static void main(String[] args) {
        int [] a = {5,2,9};
        System.out.println(convierteArrayEnString(a));
    }
    public static String convierteArrayEnString(int[] a){
        String cadenaVacia = " ";
        cadenaVacia = Arrays.toString(a);
        String cadenaFinal = "";
        String Basura = "";
        for (int i = 0; i < cadenaVacia.length(); i++) {
            String recorrerCadena = String.valueOf(cadenaVacia.charAt(i));
            if (recorrerCadena.equals(",") || recorrerCadena.equals("[") || recorrerCadena.equals("]") || recorrerCadena.equals(" ")){
                Basura = recorrerCadena + Basura;
            }else{
                cadenaFinal = cadenaFinal + recorrerCadena;
            }
        }
        cadenaFinal = "\"\"" + cadenaFinal + "\"\"";
        cadenaFinal = cadenaFinal.substring(1,cadenaFinal.length()-1);
        return cadenaFinal;
    }
}
