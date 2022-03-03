package U5.EjerciciosRepaso.HerenciasInterfaces2021;

public class Atleta extends participante implements comportamientoCorrer{
    private String nombrePrueba;
    public Atleta(String nombre, int edad, String nombrePrueba) {
        super(nombre, edad);
        this.nombrePrueba=nombrePrueba;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo "+super.getNombre()+" , como atleta, juro los valores deportivos mundiales");
    }
}
