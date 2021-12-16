package U3.Varios.Cadena;
import java.util.Arrays;

public class PasarNumeroString {
    public static void main(String[] args) {
        int [] array = {1,5,6,8,9};
        System.out.println(pasarNumero(array));
    }
    private static String pasarNumero(int[] array) {
        String numero = "";
        String numero2 = Arrays.toString(array);
        for (int i = 0; i < numero2.length(); i++) {
            String recorrerNumero = String.valueOf(numero2.charAt(i));
            if (recorrerNumero.equals(",") || recorrerNumero.equals("[") || recorrerNumero.equals("]") || recorrerNumero.equals(" ")){
                
            }else{
                numero = numero + recorrerNumero;
            }
        }
        return numero;
    }

}
