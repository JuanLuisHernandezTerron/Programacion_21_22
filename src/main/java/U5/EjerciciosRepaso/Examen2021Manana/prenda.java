package U5.EjerciciosRepaso.Examen2021Manana;

public class prenda implements comportamientoEmpresa{
    private double precio;
    private String nombrePrenda;
    private int codigoBarras;
    private int peso;
    private int altura;
    private static int contadorPrenda=0;

    public prenda(double precio, String nombrePrenda, int codigoBarras, int peso) {
        this.precio = precio;
        this.nombrePrenda = nombrePrenda;
        this.codigoBarras = codigoBarras;
        this.peso = peso;
        contadorPrenda++;

    }

    public static void setContadorPrenda(int contadorPrenda) {
        prenda.contadorPrenda = contadorPrenda;
    }

    public static int getContadorPrenda() {
        return contadorPrenda;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public void devolver(prenda prendaAUX) {
        System.out.println("Devolviendo la prenda "+prendaAUX.nombrePrenda+" y el precio "+prendaAUX.getPrecio());
    }

    @Override
    public void doblar(prenda prendaAUX) {
        System.out.println("Se está doblando");
    }

    @Override
    public void colgar() {
        System.out.println("Se esta colgando");
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

}
