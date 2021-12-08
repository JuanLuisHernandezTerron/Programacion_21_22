package U3.Varios.Arrays;

import java.util.Arrays;

//Define la función convierteStringEnArray con la siguiente cabecera:
//public static int[] convierteArrayEnString(String a)
//Esta función toma como parámetro un String que solamente contiene números
//y devuelve una array con las cifras que contiene el número. Por ejemplo, si a = "",
//convierteStringEnArray(a) devuelve un array sin elementos; si a = "8",
//convierteStringEnArray(a) devuelve un array con el número 8; si a = "62501",
//convierteStringEnArray(a) devuelve un array tal como { 6, 2, 5, 0, 1 }.
public class ejercicio4_entregableDavid {
    public static void main(String[] args) {
        String numerosArray = "156987";
        System.out.println(Arrays.toString(convierteArrayEnString(numerosArray)));
    }

    public static int[] convierteArrayEnString(String a){
        int [] arrayVacio = new int[a.length()];
        int numeros = Integer.parseInt(a);
        int cociente = numeros;
        int contadorIntroducido = 0;
        int resto = 0;
        int numeroAux = 0;
        for (int i = 0; i < a.length(); i++) {
            while (cociente > 0){
                resto = cociente % 10;
                cociente = cociente /10;
                numeroAux = numeroAux + resto;
                numeroAux = numeroAux *10;
            }
            numeroAux = numeroAux/10;
            while (numeroAux > 0){
                resto = numeroAux % 10;
                numeroAux = numeroAux /10;
                arrayVacio[contadorIntroducido] = resto;
                contadorIntroducido ++;
            }
        }
        return arrayVacio;
    }
}
