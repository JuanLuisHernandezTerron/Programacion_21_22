package U4.T1.Actividad7;

public class emisoraFM {

    private double frecuencia; //POR DEFECTO ES 80.
    public emisoraFM(){
        this.frecuencia = 80;
    }
    public void bajarMHz(){
        double restar = 0.5;
        this.frecuencia = getFrecuencia() - restar;

        if (getFrecuencia() < 80){
            this.frecuencia = 108;
        }
        System.out.println(getFrecuencia());
    }

    public void subirMHz(){
        double sumar = 0.5;
        this.frecuencia = getFrecuencia() + sumar;

        if (getFrecuencia() > 108){
            this.frecuencia = 80;
        }
        System.out.println(getFrecuencia());
    }

    public double getFrecuencia() {
        return frecuencia;
    }
}
