package U5.EjerciciosRepaso.Examen19_20;

public class Cristal extends material implements Mezclar{
    private tipoCristal cristal;


    public Cristal(String nombre, int masa, int quemarse, int diluirse, boolean movibles, tipoCristal cristal) {
        super(nombre, masa, quemarse, diluirse, movibles);
        this.cristal=cristal;
    }

    @Override
    public void MezclarConMaterial(material materialAUX) {
        System.out.println("La mezcla quedaría, cristal con "+materialAUX.getNombre());
    }


    public enum tipoCristal{
        TRANSPARENTE,
        TRANSLUCIDO
    }

    public tipoCristal getCristal() {
        return cristal;
    }


}
