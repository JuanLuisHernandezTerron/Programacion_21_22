package U7.EjerciciosRepaso.EjercicioPreEntre2;

public class main {
    public static void main(String[] args) {
        productora produc1 = new productora("WarnerBros");
        pelicula p1 = new pelicula("Cars", pelicula.Categorias.AVENTURAS,1.25,"EEUU");
        pelicula p2 = new pelicula("CasaBlanca", pelicula.Categorias.COMEDIA,1.40,"Polonia");
        pelicula p3 = new pelicula("Invenzibles", pelicula.Categorias.THRILLER,1.90,"España");
        actor ac1 = new actor("Juanlu",25,"España","1995-11-30");
        actor ac2 = new actor("Oscar",28,"España","1997-01-10");
        actor ac3 = new actor("Juanjo",50,"EEUU","1995-08-11");

        produc1.addPelicula(p1,ac1);
        produc1.addPelicula(p1,ac3);
        produc1.addPelicula(p2,ac2);
        produc1.addPelicula(p2,ac1);
        produc1.addPelicula(p3,ac3);
        produc1.addPelicula(p3,ac2);
        produc1.addPelicula(p3,ac3);

        produc1.ordenarDuracion();
        produc1.guardarFicheros();
        produc1.cargarFicheros();
    }
}
