package U5.EjerciciosRepaso.Examen19_20;

public class Rocas extends material implements Mezclar{
    private int dureza;

    public Rocas(String nombre, int masa, int quemarse, int diluirse, boolean movibles, int dureza){
        super(nombre, masa, quemarse, diluirse, movibles);
        setDureza(dureza);
    }

    public void setDureza(int dureza) {
        if (dureza >0 && dureza <=10){
            this.dureza = dureza;
        }else{
            this.dureza = 0;
        }
    }

    @Override
    public void MezclarConMaterial(material materialAUX) {
        System.out.println("La mezcla quedaría, roca con "+materialAUX.getNombre());
    }
}
