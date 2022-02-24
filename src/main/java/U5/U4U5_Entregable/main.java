package U5.U4U5_Entregable;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        catalogo catalogo1 = new catalogo();
        Pelicula peli1 = new Pelicula("Noche de cine",1992,"Pedro",60,"Warner","España");
        Pelicula peli2 = new Pelicula("Noche de futbol",2015,"JoseAntonio",120,"Warner","España");

        Serie seri1 = new Serie("La que se avecina",2008,"Jose Luis",8);
        Serie seri2 = new Serie("Aqui no hay quien viva",2006,"Antonio",12);

        Libro libro1 = new Libro("El señor de los anillos",2005,"Jose Juan","bubok","236-54789231",150);
        Libro libro2 = new Libro("El señor de los anillos2",2007,"Jose Juan","bubok","236-54725871",128);

        seri1.add_capitulo("S01E01");
        seri1.add_capitulo("S01E02");
        seri1.add_capitulo("S01E03");

        seri1.mostrarArrayCapitulos();

        System.out.println(seri1.eliminar_capitulo("S01E01"));
        seri1.mostrarArrayCapitulos();

        seri1.play();
        seri1.stop();
        seri1.pause();
        seri1.dar_por_finalizado();
        System.out.println("*****************");

        peli1.pause();
        peli1.stop();
        peli1.play();
        System.out.println("*****************");
        catalogo1.add_multimedia(peli1);
        catalogo1.add_multimedia(peli2);
        catalogo1.add_multimedia(seri1);
        catalogo1.add_multimedia(seri2);
        catalogo1.add_multimedia(libro1);
        catalogo1.add_multimedia(libro2);
        System.out.println(catalogo1.eliminar_multimedia(peli2));

        System.out.println(catalogo1);
        System.out.println();
        System.out.println();
        Arrays.sort(catalogo1.getArrayMultimedia(),new OrdenarTituloObra());
        System.out.println(catalogo1);
        System.out.println();
        System.out.println();
        Arrays.sort(catalogo1.getArrayMultimedia(),new OrdenarAno());
        System.out.println(catalogo1);
        System.out.println(catalogo1.getContadorMultimedia()+" elementos de multimedia en total");

    }
}
