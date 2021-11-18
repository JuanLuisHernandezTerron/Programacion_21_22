package U3.T3extra;
// Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
// positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la
// posición tanto del máximo como del mínimo.
//
//NOTA IMPORTANTE: Los números no pueden repetirse.
public class Ejercicio6 {
    public static void main(String[] args) {
        int [][] arrayBidi = new int [6][10];
        funcionRellenar(arrayBidi);

        int numero = 0;
        int auxGrande = arrayBidi[0][0];
        int auxPequeno = arrayBidi[0][0];
        int filaPequeno = 0;
        int filaGrande = 0;
        int columnasPequeno = 0;
        int columnasGrande = 0;

        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi[i].length; j++) {
               numero = arrayBidi[i][j];
               if (numero < auxPequeno){
                   auxPequeno = numero;
                   filaPequeno = i+1;
                   columnasPequeno = j+1;
               }

               if (numero > auxGrande){
                   auxGrande = numero;
                   filaGrande = i+1;
                   columnasGrande = j+1;
               }
            }
        }
        System.out.println("La fila del numero " + auxPequeno + " es: " +filaPequeno +" y "+" su columa es " +columnasPequeno);
        System.out.println("La fila del numero " + auxGrande + " es: " +filaGrande +" y "+" su columa es " +columnasGrande);

    }
    static boolean comprobarRepetido(int [][] array, int array2){
        int contador = 0;
        boolean es_repetido = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                 if (array2 == array[i][j]){
                    contador ++;
                }
            }
        }

        if (contador == 1){
            es_repetido = false;
        }else{
            es_repetido = true;
        }

        return es_repetido;
    }

    private static void funcionRellenar(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random()*1001);

                while (comprobarRepetido(array,array[i][j])){
                    array[i][j] = (int) (Math.random()*1001);
                    System.out.println(" | " + array[i][j] + " | ");
                }
                System.out.println();
            }
        }
    }
}
