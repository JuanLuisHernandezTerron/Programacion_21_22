package U4.T1.Actividad9.maquinaria;
import U4.T1.Actividad9.maquinaria.locomotoras;
import U4.T1.Actividad9.personal.maquinista;
public class trenes {
    private locomotoras locomotora;
    private maquinista pilotoLocomotora;

    public trenes(locomotoras locomotora,maquinista piloto){
        this.locomotora = locomotora;
        this.pilotoLocomotora = piloto;
    }

    /*getters*/
    public locomotoras getLocomotora() {
        return locomotora;
    }

    public maquinista getPilotoLocomotora() {
        return pilotoLocomotora;
    }
    /*setters*/
    public void setPilotoLocomotora(maquinista pilotoLocomotora) {
        this.pilotoLocomotora = pilotoLocomotora;
    }
    public void setLocomotora(locomotoras locomotora) {
        this.locomotora = locomotora;
    }

    public void informacionTren(){

    }
}
