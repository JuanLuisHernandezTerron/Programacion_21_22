package U5.EjerciciosRepaso.HerenciasInterfaces2021;

public class Baloncesista extends participante implements comportamientoEncestar{
    private double altura;
    public Baloncesista(String nombre, int edad, double altura) {
        super(nombre, edad);
        this.altura = altura;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo "+super.getNombre()+" , como atleta, juro los valores deportivos mundiales");
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
