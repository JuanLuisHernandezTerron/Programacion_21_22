package U5.EjerciciosRepaso.Examen2021Manana;

public class prendaColgadas extends prenda implements comportamientoEmpresa{
    private int altura;
    public prendaColgadas(double precio, String nombrePrenda, int codigoBarras, int peso, int altura) {
        super(precio, nombrePrenda, codigoBarras, peso);
        this.altura = altura;
        setContadorPrenda(getContadorPrenda()+1);
    }

    @Override
    public void devolver(prenda prendaAUX) {
        System.out.println("Devolviendo la prenda "+prendaAUX.getNombrePrenda()+" y el precio "+prendaAUX.getPrecio());

    }

    @Override
    public void doblar(prenda prendaAUX) {
        System.out.println("Se está doblando");
    }

    @Override
    public void colgar() {
        System.out.println("Se esta colgando");
    }
}
