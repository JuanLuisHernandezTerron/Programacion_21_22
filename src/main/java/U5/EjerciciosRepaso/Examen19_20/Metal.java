package U5.EjerciciosRepaso.Examen19_20;

public class Metal extends material implements Mezclar{
    private boolean imantable;

    public Metal(String nombre, int masa, int quemarse, int diluirse, boolean movibles,boolean imantable) {
        super(nombre, masa, quemarse, diluirse, movibles);
        this.imantable = imantable;
    }

    @Override
    public void MezclarConMaterial(material materialAUX) {
        System.out.println("La mezcla quedaría, metal con "+materialAUX.getNombre());
    }
}
