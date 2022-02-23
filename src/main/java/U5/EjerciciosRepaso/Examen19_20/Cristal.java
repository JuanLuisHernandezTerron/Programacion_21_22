package U5.EjerciciosRepaso.Examen19_20;

public class Cristal extends material{
    private tipoCristal cristal;

    public Cristal(String nombre, int masa, int quemarse, int diluirse, boolean movibles,tipoCristal cristal) {
        super(nombre, masa, quemarse, diluirse, movibles);
        this.cristal=cristal;
    }


    public enum tipoCristal{
        TRANSPARENTE,
        TRANSLUCIDO
    }
}
