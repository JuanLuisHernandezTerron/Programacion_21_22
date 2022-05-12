package U3.T2;
//Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier vocal del nombre.
// Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz". Sólo se eliminarán las vocales (mayúsculas, minúsculas y
// acentuadas). El resto de caracteres no se modifican.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime una frase por favor: ");
        String fraseIntroducida = teclado.nextLine();

        int longitudFrase = fraseIntroducida.length();
        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";
        String fraseSinvocal= "";
        int longitudVocales = vocales.length();

        for (int i = 0; i < longitudFrase; i++) {
            String recorrerFrase = String.valueOf(fraseIntroducida.charAt(i));
            boolean igual = false;
            for (int j = 0; j < longitudVocales; j++) {
                String recorrerVocales = String.valueOf(vocales.charAt(j));
                if (recorrerFrase.equalsIgnoreCase(recorrerVocales)){
                    igual = true;
                    break;
                }
            }
            if (!igual){
                fraseSinvocal = fraseSinvocal + recorrerFrase;
            }
        }
        System.out.print(fraseSinvocal);
    }
}
