package U3.Varios.Arrays;
//Crear una función unirMatrices que reciba dos matrices bidimensionales de cadenas y devuelva la unión de las dos matrices.
//
//Si la matrices no tiene la misma dimensión deberá devolver un vector bidimensional vacio.
//
//Ejemplo1:
//
//HOLA	PERRO	C++
//ADIOS	GATO	PYTHON
//HASTA LUEGO	VACA	JAVA
//BD	SOBRESALIENTE	PEPE
//LM	NOTABLE	MANUEL
//PROG	APROBADO	ROSA
//El resultado de unir estas dos matrices será:
//
//HOLA	PERRO	C++	BD	SOBRESALIENTE	PEPE
//ADIOS	GATO	PYTHON	LM	NOTABLE	MANUEL
//HASTA LUEGO	VACA	JAVA	PROG	APROBADO	ROSA
//Ejemplo2:
//
//HOLA	PERRO	C++
//ADIOS	GATO	PYTHON
//HASTA LUEGO	VACA	JAVA

import java.util.Arrays;

//BD	SOBRESALIENTE
//LM	NOTABLE
//PROG	APROBADO
//El resultado de unir estas dos matrices será:
//
//{}
public class ejercicio4_examenRojo {
    public static void main(String[] args) {
        String[][] vector1 = {{"Hola", "Perro", "C++"},
                {"Adios", "Gato", "Python"},
                {"Hasta Luego", " Vaca", "Java"}};

        String[][] vector2 = {{"BD", "Sobresaliente", "Pepe"},
                {"LM", "Notable", "Manuel"},
                {"Prog", "Aprobado", "Rosa"}};


        if (comprobarLongitud(vector1, vector2)) {
            mostrarArray(mezclasArrays(vector1, vector2));
        } else {
            System.out.println("{}");
        }
    }

    private static void mostrarArray(String[][] mezclasArrays) {
        for (int i = 0; i < mezclasArrays.length; i++) {
            for (int j = 0; j < mezclasArrays[i].length; j++) {
                System.out.print(" | " + mezclasArrays[i][j] + " | ");
            }
            System.out.println();
        }
    }

    private static String[][] mezclasArrays(String[][] vector1, String[][] vector2) {
        int contadorIntroducido1 = 0;
        int contadorIntroducido2 = vector2.length;
        boolean esta_completo = false;
        String[][] arrayAux = new String[vector1.length][vector1.length + vector2.length];

        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2[i].length; j++) {
                if (contadorIntroducido1 < 3) {
                    if (vector1.length < (vector1.length + vector2.length)) {
                        arrayAux[i][contadorIntroducido1] = vector1[i][j];
                    }
                    contadorIntroducido1++;
                }
                if (contadorIntroducido2 >= 3 && contadorIntroducido2 < vector1.length+ vector2.length) {
                    if (vector2.length+1 > ((vector1.length + vector2.length)/2)) {
                        arrayAux[i][contadorIntroducido2] = vector2[i][j];
                    }
                    contadorIntroducido2++;
                }
            }
            contadorIntroducido1 = 0;
            contadorIntroducido2 = vector2.length;
        }
        return arrayAux;
    }


    private static boolean comprobarLongitud(String[][] vector1, String[][] vector2) {
        boolean es_longitud = false;
        int contadorIv1 = 0;
        int contadorIv2 = 0;

        for (int i = 0; i < vector1.length; i++) {
            contadorIv1 ++;
            for (int j = 0; j < vector1[i].length; j++) {

            }
        }

        for (int i = 0; i < vector2.length; i++) {
            contadorIv2 ++;
            for (int j = 0; j < vector2[i].length; j++) {

            }
        }
            if ((vector1.length == vector2.length) || (contadorIv1 == contadorIv2)){
                es_longitud = true;
            }
        return es_longitud;
    }
}
