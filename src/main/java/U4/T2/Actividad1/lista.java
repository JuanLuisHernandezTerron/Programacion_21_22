package U4.T2.Actividad1;

import java.util.Arrays;

public class lista {
    private int tamano_array;
    private Integer[] array;
    private int contadorElementosInsert;

    private Integer[] arrayAux;

    public lista(int tamano_array) {
        this.tamano_array = tamano_array;
        this.array = new Integer[tamano_array];
    }

    public lista() {
        this.tamano_array = 10;
        this.array = new Integer[this.tamano_array];
    }

    public void insertarPrincipio(Integer numero){
        contadorElementosInsert ++;
        arrayAux = new Integer[0];
        int contadorAux =0;
       boolean esNulo = false;
       if (array[0] == null){
           array[0] = numero;
       }else{
           for (int i = 0; i < array.length-1; i++) {
               arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+1);
               arrayAux[contadorAux++]= array[i];
           }
           array[0] = numero;
       }
    }

    public void insertarFinal(Integer numero){
        contadorElementosInsert++;
        this.array[array.length-1] = numero;
    }

    public void insertarPosicionRandom(Integer numero,int posicion){
        contadorElementosInsert++;
        this.array[posicion] = numero;
    }

    public void insertarListaFinal(int [] lista){
        int contador = 0;
        for (int i = 0; i < array.length+lista.length; i++) {
            if (i > array.length){
                contadorElementosInsert++;
                array = Arrays.copyOf(array,array.length+1);
                array[i] = lista[contador];
            }
            contador++;
        }
    }

    public void eliminarElemento(int posicion){
        contadorElementosInsert--;
        int contador = 0;
        for (int i = 0; i < this.array.length; i++) {

        }
    }

    public int getTamano_array() {
        return tamano_array;
    }

    public void setTamano_array(int tamano_array) {
        this.tamano_array = tamano_array;
    }

    public Integer[] getArray() {
        return array;
    }

    public int getContadorElementosInsert() {
        return contadorElementosInsert;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }

    public Integer[] getArrayAux() {
        return arrayAux;
    }
}
