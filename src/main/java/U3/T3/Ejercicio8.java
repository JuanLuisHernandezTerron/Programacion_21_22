package U3.T3;

import java.util.Scanner;

//Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus
// frases con "Javalín, javalón", para después hacer una pausa más o menos larga
// (la pausa se representa mediante espacios en blanco) y a continuación expresan el mensaje.
// Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las
// terminan con un silencio, más o menos prolongado y la coletilla "javalén, len, len".
// Se pide diseñar un traductor que, en primer lugar, nos diga si la frase está escrita en el
// idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre el
// mensaje sin muletillas.
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el mensaje: ");
        String mensaje = teclado.nextLine();

        String saludoJavalin = "Javalin,javalón";
        String saludoJavalen = "Javalén,len,len";

        int longitudMensaje = mensaje.length();
        int longitudSaludo1 = saludoJavalin.length();
        int longitudSaludo2 = saludoJavalen.length();
        boolean es_cierto = true;

        for (int i = 0; i < 15; i++) {
            String recorrerMensaje = String.valueOf(mensaje.charAt(i));
            for (int j = 0; j < longitudSaludo1; j++) {
                String recorrerSaludo1 = String.valueOf(saludoJavalin.charAt(i));
                for (int k = 0; k < longitudSaludo2 ; k++) {
                    String recorrerSaludo2 = String.valueOf(saludoJavalen.charAt(i));

                    if ((recorrerMensaje == recorrerSaludo1) || (recorrerMensaje==recorrerSaludo2)){
                            break;
                    }else{
                        es_cierto = false;
                    }
                }
            }
            if (es_cierto){
                System.out.print(mensaje);
            }
        }
    }
}
