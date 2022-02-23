package U5.EjerciciosRepaso.Examen19_20;

public class Pico extends Herramientas implements Minar{
    private double grosorPico;

    public Pico(String nombre, int masa, int quemarse, int diluirse, boolean movibles, double grosorPico) {
        super(nombre, masa, quemarse, diluirse, movibles);
        this.grosorPico = grosorPico;
    }

    @Override
    public void Hacer(material materialAUX) {
    }

    @Override
    public void desHacer(material materialAUX) {
    }
}
