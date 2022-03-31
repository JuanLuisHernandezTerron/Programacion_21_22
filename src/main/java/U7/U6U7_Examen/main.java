package U7.U6U7_Examen;

public class main {
    public static void main(String[] args) {
        Filmaffinity f1 = new Filmaffinity();
        pelicula p1 = new pelicula("Cars","EEUU","Dibujos","Pedro");
        pelicula p2 = new pelicula("HarryPotter","EEUU","Ciencia Ficcion","Jose");
        pelicula p3 = new pelicula("Futbolisticos","España","Dibujos","Juanlu");
        pelicula p4 = new pelicula("Amor a primera vista","China","Thriller","Oscar");
        pelicula p5 = new pelicula("TennisCareer","EEUU","Documental","John");

        actor a1 = new actor("Jose Manuel","Roldan","Española");
        actor a2 = new actor("Chema","Perez","Española");
        actor a3 = new actor("Isabel","Terron","Francesa");
        actor a4 = new actor("Maria","Stones","Inglesa");
        actor a5 = new actor("John","Maguire","Inglesa");

        f1.addPeliculaActor(p1,a1);
        f1.addPeliculaActor(p1,a2);
        f1.addPeliculaActor(p1,a3);
        f1.addPeliculaActor(p2,a2);
        f1.addPeliculaActor(p2,a4);
        f1.addPeliculaActor(p3,a3);
        f1.addPeliculaActor(p3,a4);
        f1.addPeliculaActor(p4,a4);
        f1.addPeliculaActor(p4,a5);
        f1.addPeliculaActor(p5,a5);
        f1.addPeliculaActor(p5,a1);
        System.out.println("Muestra de actores en la pelicula");
        System.out.println(f1.getActores(p1));
        System.out.println();
        System.out.println("Muestra del actor donde ha rodado en las siguientes peliculas");
        System.out.println(f1.getPeliculas(a4));

        System.out.println();
        System.out.println("Peliculas que hay");
        System.out.println(f1.getPelicula("Cars"));
        System.out.println(f1.getPelicula("HarryPotter"));
        System.out.println(f1.getPelicula("TennisCareer"));

        System.out.println();
        System.out.println("Remover una pelicula");
        System.out.println(f1.getPelicula("Cars"));
        System.out.println(f1.getPeliculas(a1));
        System.out.println("Se procede a borrar la pelicula");
        f1.removerPelicula("Cars");
        System.out.println(f1.getPelicula("Cars"));
        System.out.println(f1.getPeliculas(a1));

        System.out.println();
        System.out.println("Datos sobre el actor");
        System.out.println(f1.getActor("Chema","Perez"));

        f1.guardatDatos();
        f1.cargarDatos();

        System.out.println();
        System.out.println("Muestra para ver que se ha cargado bien las estructuras de datos");
        System.out.println(f1.getPelicula("futbolisticos"));
        System.out.println(f1.getActor("Maria","Stones"));
    }
}
