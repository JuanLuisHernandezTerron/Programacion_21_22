package U4.T1.Actividad9.maquinaria;
import U4.T1.Actividad9.personal.maquinista;

import java.io.Serializable;
import java.util.Arrays;

public class trenes implements Serializable {
    private locomotoras locomotora;
    private  maquinista pilotoLocomotora;

    vagones [] arrayVagon = new vagones[0];

    public trenes(locomotoras locomotora,maquinista piloto){
        this.locomotora = locomotora;
        this.pilotoLocomotora = piloto;
    }
    public void crearVagon(int capacidadMax, int capacidadActu, String tipoCarga){
        vagones vagon = new vagones(capacidadMax,capacidadActu, vagones.carga.valueOf(tipoCarga));
        ingresarVagon(vagon);
    }

    public void ingresarVagon(vagones vagon){
        if (arrayVagon.length < 5){
            arrayVagon=Arrays.copyOf(arrayVagon,arrayVagon.length+1);
            arrayVagon[arrayVagon.length-1] = vagon;
        }else{
            System.out.println("No ha sido posible, por favor empiece de nuevo");
        }
    }

    public void getArrayVagon() {
        for (int i = 0; i < arrayVagon.length; i++) {
            arrayVagon[i].informacionVagoness();
        }
    }

    @Override
    public String toString() {
        return "trenes{" +
                "locomotora=" + locomotora.toString() +
                ", pilotoLocomotora=" + pilotoLocomotora.toString() +
                '}';
    }

    public locomotoras getLocomotora() {
        return locomotora;
    }

    public maquinista getPilotoLocomotora() {
        return pilotoLocomotora;
    }


    public void setPilotoLocomotora(maquinista pilotoLocomotora) {
        this.pilotoLocomotora = pilotoLocomotora;
    }
    public void setLocomotora(locomotoras locomotora) {
        this.locomotora = locomotora;
    }

}
