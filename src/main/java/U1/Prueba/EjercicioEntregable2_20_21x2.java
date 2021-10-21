package U1.Prueba;
import java.util.Scanner;
////Realizar un programa que dado un número que se solicita la usuario por consola eliminará de ese
//// número de ese número
////todos los 0 y todos los 8 indicando adicionalmente cuántos números ha eliminado.Deberá solicitar el
////número mientras que
////el número introducido no sea positivo.
////
////Ejemplo 1:
////Introduzca un número entero positivo: 34084091
////Número resultado: 34491
////Dígitos eliminados: 3
public class EjercicioEntregable2_20_21x2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int numeroIntroducido = teclado.nextInt();

        int cociente = numeroIntroducido;
        int resto = 0;
        int numeroAux = 0;
        int contador = 0;
        int numeroResto = 0;

        while (cociente > 0){       // // nº721
            resto = cociente %10;  // resto= 72,1, luego sería 7,2
            cociente = cociente / 10;  // cociente = 72, luego sería 7
            numeroAux = numeroAux + resto; // Suma el resto (en ese caso sería 1)
            numeroAux = numeroAux * 10; //multiplicamos * 10, para poder introducir los demas numero, (en ese caso sería 10, y luego 170)
        }

        while ( numeroAux > 0){ // vamos a darle de nuevo la vuelta al numero, para ahora sí recorrerlo y introducir las restricciones.  nº127
            resto = numeroAux % 10; // 12,7
            numeroAux = numeroAux /10; // 12
            if (contador == 3){
                numeroResto = numeroResto + resto;  // guarda los numero que no queremos o hemos eliminado.
            }else{
                cociente = cociente + resto; // guarda los numero que si queremos guardar.  cociente = 7 ahora mismo
                cociente = cociente * 10; // 70
            }
            contador ++; // Se hace el contador para que cuando de una vuelta el while, sabremo que posicion es y si queremos eliminar algun numero.
        }
        System.out.print(cociente/10); // se divide entre 10 para borrar el 0 que se nos queda al final.
    }
}
