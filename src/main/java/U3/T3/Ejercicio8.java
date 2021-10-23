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

        String saludoJavalin = "Javalin, javalón";
        String saludoJavalen = "Javalén, len, len";
        String mensajeGuardado = "";
        String mensajeGuardadoJavalin = "";
        String mensajeGuardado2 = "";
        int longitudJavalin = saludoJavalin.length();
        int longitudJavalen = saludoJavalen.length();
        int longitudMensaje = mensaje.length();

        for (int i = 0; i < longitudMensaje; i++) {
           if (i < longitudJavalin){
               String recorreMensaje = String.valueOf(mensaje.charAt(i));
               mensajeGuardado = mensajeGuardado + recorreMensaje;
           }else{
               String recorreMensaje = String.valueOf(mensaje.charAt(i));
               mensajeGuardadoJavalin = mensajeGuardadoJavalin + recorreMensaje;
           }
        }

//        for (int j = 0; j > longitudMensaje-17; j++) {
//            String recorrerMensaje2 = String.valueOf(mensaje.charAt(j));
//            System.out.print(recorrerMensaje2);
//        }

        if (mensajeGuardado.equalsIgnoreCase(saludoJavalin)){
            System.out.print(mensajeGuardadoJavalin);
        }else{
            System.out.print("No es un idioma de javalandía");
        }

    }
}

//for (int j = 0; j < longitudJavalen; j--) {
//        String recorrerMensaje2 = String.valueOf(mensaje.charAt(j));
//        }

