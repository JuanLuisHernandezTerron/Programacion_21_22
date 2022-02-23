package U5.EjerciciosRepaso.Examen2021Manana;

public class prenda {
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

    public prenda(double precio, String nombrePrenda, int codigoBarras, int peso, int altura) {
        this.precio = precio;
        this.nombrePrenda = nombrePrenda;
        this.codigoBarras = codigoBarras;
        this.peso = peso;
        this.altura = altura;
        contadorPrenda++;
    }

}
