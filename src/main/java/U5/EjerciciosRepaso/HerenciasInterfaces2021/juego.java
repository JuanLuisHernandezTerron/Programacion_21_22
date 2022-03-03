package U5.EjerciciosRepaso.HerenciasInterfaces2021;

import java.util.Arrays;

public class juego {
    private int anoCelebracion;
    private String sede;
    private pais [] arrayPais = new pais[0];
    private deporte [] arrayDeporte = new deporte[0];
    private int contadorPaises = 0;
    private int contadorDeporte = 0;

    public juego(int anoCelebracion, String sede) {
        setAnoCelebracion(anoCelebracion);
        this.sede = sede;
    }

    public void mostrarPaises(){
        Arrays.sort(arrayPais,new ordenarPaisParticipantes());
        System.out.println(Arrays.toString(arrayPais));
    }

    public void insertarPais(pais paisAUX){
        arrayPais=Arrays.copyOf(arrayPais,arrayPais.length+1);
        arrayPais[contadorPaises++] = paisAUX;
    }

    public void eliminarPais(pais paisAUX){
        int contadorArrayAUX =0;
        pais [] arrayAUX = new pais[0];
        for (int i = 0; i < arrayPais.length; i++) {
            if (arrayPais[i] != paisAUX){
                arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                arrayAUX[contadorArrayAUX++] = arrayPais[i];
            }
        }

        arrayPais = Arrays.copyOf(arrayAUX,arrayAUX.length);

        for (int i = 0; i < arrayAUX.length; i++) {
            arrayPais[i] = arrayAUX[i];
        }
    }

    public void insertarDeporte(deporte deporteAUX){
        arrayDeporte=Arrays.copyOf(arrayDeporte,arrayDeporte.length+1);
        arrayDeporte[contadorDeporte++] = deporteAUX;
    }

    public void eliminarDeporte(deporte deporteAUX){
        int contadorArrayAUX =0;
        deporte [] arrayAUX = new deporte[0];
        for (int i = 0; i < arrayDeporte.length; i++) {
            if (arrayDeporte[i] != deporteAUX){
                arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                arrayAUX[contadorArrayAUX++] = arrayDeporte[i];
            }
        }

        arrayDeporte = Arrays.copyOf(arrayAUX,arrayAUX.length);

        for (int i = 0; i < arrayAUX.length; i++) {
            arrayDeporte[i] = arrayAUX[i];
        }
    }

    public int getAnoCelebracion() {
        return anoCelebracion;
    }

    public void setAnoCelebracion(int anoCelebracion) {
        if (anoCelebracion % 4 ==0){
            this.anoCelebracion = anoCelebracion;
        }else{
            this.anoCelebracion = 0;
        }
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void mostrarPaisesParaCeremonia(){
        Arrays.sort(arrayPais);
        for (int i = 0; i < arrayPais.length; i++) {
            System.out.println(arrayPais[i]);
        }
    }

}
