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

//BD	SOBRESALIENTE
//LM	NOTABLE
//PROG	APROBADO
//El resultado de unir estas dos matrices será:
//
//{}
public class ejercicio4_examenRojo {
    public static void main(String[] args) {
        String [][]vector1 = {{"Hola","Perro","C++"},
                            {"Adios","Gato","Python"},
                            {"Hasta Luego"," Vaca","Java"}};

        String [][]vector2 = {{"BD","Sobresaliente","Pepe"},
                            {"LM","Notable","Manuel"},
                            {"Prog","Aprobado","Rosa"}};

        if (comprobarLongitud(vector1,vector2)){
            mezclasArrays(vector1,vector2);
        }
    }

    private static void mezclasArrays(String[][] vector1, String[][] vector2) {
        int contadorIntroducido = 0;
        String [][]arrayAux = new String[vector1.length][vector1.length+ vector2.length];

        for (int i = 0; i < vector1.length ; i++) {
            for (int j = 0; j < vector2[i].length; j++) {

            }
        }
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
