package U5.EjerciciosRepaso.Examen19_20;

public class Metal extends material{
    private boolean imantable;

    public Metal(String nombre, int masa, int quemarse, int diluirse, boolean movibles,boolean imantable) {
        super(nombre, masa, quemarse, diluirse, movibles);
        this.imantable = imantable;
    }
}
