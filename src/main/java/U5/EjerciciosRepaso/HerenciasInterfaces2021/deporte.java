package U5.EjerciciosRepaso.HerenciasInterfaces2021;

import java.util.Arrays;

public abstract class deporte{
    private String nombreDeporte;
    private String nombrePabellon;
    private participante [] arrayParticipantes = new participante[0];
    private int contadorParticipantes = 0;

    public deporte(String nombreDeporte, String nombrePabellon) {
        this.nombreDeporte = nombreDeporte;
        this.nombrePabellon = nombrePabellon;
    }

    public void mostrarArrayAtleta(){
        for (int i = 0; i < arrayParticipantes.length; i++) {
            System.out.println(arrayParticipantes[i]);
        }
    }

    public void insertarParticipante(participante participanteAUX){
        arrayParticipantes = Arrays.copyOf(arrayParticipantes,arrayParticipantes.length+1);
        arrayParticipantes[contadorParticipantes++] = participanteAUX;
    }

    public void eliminarParticipante(participante participanteAUX){
        participante [] arrayAUX = new participante[0];
        int contadorAUX=0;
        for (int i = 0; i < arrayParticipantes.length; i++) {
            if (arrayParticipantes[i] != participanteAUX){
                arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                arrayAUX[contadorAUX++] = participanteAUX;
            }
        }
        arrayParticipantes = Arrays.copyOf(arrayAUX,arrayAUX.length);
        for (int i = 0; i < arrayAUX.length; i++) {
            arrayAUX[i] = arrayParticipantes[i];
        }
    }

    public void mostrarParticipantes(){
        Arrays.sort(arrayParticipantes,new ordenarParticipantes());
        for (int i = 0; i < arrayParticipantes.length; i++) {
            System.out.println(arrayParticipantes[i]);
        }
    }

    public void mostrarJugadoresBaloncestoPorAltura(){
        Arrays.sort(arrayParticipantes,new ordenarJugadoresBaloncestoAltura());
        for (int i = 0; i < arrayParticipantes.length; i++) {
            System.out.println(arrayParticipantes[i]);
        }
    }
}
