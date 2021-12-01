package U3.Varios.Arrays;
//Implementa la función aleatorioDeArray con la cabecera que se muestra a
//continuación:
//public static int aleatorioDeArray(int[] a)
//Esta función debe devolver un número del array escogido al azar entre todos
//los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
//podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorio-
//DeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de
//prueba.
public class ejercicio5_entregable_19_20 {
    public static void main(String[] args) {
        int [] array = {22,35,68,58,12};
        sacarNumeroRandom(array);
    }

    private static void sacarNumeroRandom(int[] array) {
        int numeroRandom = 0;
        numeroRandom = (int) (Math.random()*array.length-1);

        System.out.println(array[numeroRandom]);
    }
}
