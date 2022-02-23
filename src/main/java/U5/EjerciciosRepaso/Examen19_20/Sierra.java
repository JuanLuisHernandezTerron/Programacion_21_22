package U5.EjerciciosRepaso.Examen19_20;

public class Sierra extends Herramientas{
    private double diametro;

    public Sierra(String nombre, int masa, int quemarse, int diluirse, boolean movibles,double diametro) {
        super(nombre, masa, quemarse, diluirse, movibles);
        this.diametro = diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
