package U5.EjerciciosRepaso.HerenciasInterfaces2021;

public class Judokas extends participante implements comportamientoLuchar{
    private int pesoCategoria;
    public Judokas(String nombre, int edad, int pesoCategoria) {
        super(nombre, edad);
        this.pesoCategoria=pesoCategoria;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo "+super.getNombre()+" , como atleta, juro los valores deportivos mundiales");
    }
}
