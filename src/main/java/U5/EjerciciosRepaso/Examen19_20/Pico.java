package U5.EjerciciosRepaso.Examen19_20;

public class Pico extends Herramientas{
    private double grosorPico;

    public Pico(String nombre, int masa, int quemarse, int diluirse, boolean movibles, double grosorPico) {
        super(nombre, masa, quemarse, diluirse, movibles);
        this.grosorPico = grosorPico;
    }
}
