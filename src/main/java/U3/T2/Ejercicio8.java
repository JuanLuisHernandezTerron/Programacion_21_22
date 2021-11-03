package U3.T2;

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
        int longitudJavalin = saludoJavalin.length();
        int longitudJavalen = saludoJavalen.length();
        int longitudMensaje = mensaje.length();
        String javalen_len = mensaje.substring(longitudMensaje-longitudJavalen,longitudMensaje);
        int longitud_javalen = javalen_len.length();



        for (int i = 0; i < longitudMensaje; i++) {
           if (i < longitudJavalin){
               String recorreMensaje = String.valueOf(mensaje.charAt(i));
               mensajeGuardado = mensajeGuardado + recorreMensaje;
           }else{
               String recorreMensaje = String.valueOf(mensaje.charAt(i));
               mensajeGuardadoJavalin = mensajeGuardadoJavalin + recorreMensaje;
           }
        }

        int longitud_mensajeGuardado = mensajeGuardadoJavalin.length();

        if (mensajeGuardado.equalsIgnoreCase(saludoJavalin) && (javalen_len.equalsIgnoreCase(saludoJavalen))){
            String mensajeFinal = mensajeGuardadoJavalin.substring(0,longitud_mensajeGuardado-longitud_javalen);
            System.out.print(mensajeFinal.trim());
        }else{
            System.out.print("No es un idioma de javalandía");
        }

    }
}

//for (int j = 0; j < longitudJavalen; j--) {
//        String recorrerMensaje2 = String.valueOf(mensaje.charAt(j));
//        }

//        for (int j = 0; j > longitudMensaje-longitudJavalen; j++) {
//            String recorrerMensaje2 = String.valueOf(mensaje.charAt(j));
//            System.out.print(recorrerMensaje2);
//        }
