package U3.T3;

import java.util.Scanner;

//En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor",
// según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime una contraseña: ");
        String contrasena = teclado.nextLine();


        int longitudContrasena = contrasena.length();
        char primeraLetra = contrasena.charAt(0);
        char ultimaLetra = contrasena.charAt(longitudContrasena-1);
        boolean mayor = false;
        System.out.println("La contraseña tiene " + longitudContrasena + " caracteres" + " ,su primera letra es "+ primeraLetra + " y su ultima letra es " + ultimaLetra);
        System.out.println("Acierta la contraseña: ");
        String acertarOno = teclado.nextLine();

        if (acertarOno.equalsIgnoreCase(contrasena)){
            System.out.println("Has acertado");
        }else{
            for (int i = 0; i < longitudContrasena; i++) {
                int recorrer = contrasena.charAt(i);
                int recorrerIntroducido = acertarOno.charAt(i);

                if (recorrer == recorrerIntroducido){
                    break;
                }else if (recorrer > recorrerIntroducido){
                    mayor = true;
                }
            }
            if (mayor){
                System.out.print("Es mayor");
            }else{
                System.out.print("Es menor");
            }
        }
    }
}
