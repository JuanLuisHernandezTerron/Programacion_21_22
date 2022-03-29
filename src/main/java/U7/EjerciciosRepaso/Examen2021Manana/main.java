package U7.EjerciciosRepaso.Examen2021Manana;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion=0;
        maraton m1 = new maraton();

        do {
            System.out.println("Elige una de las opciones del menu");
            System.out.println("1-Inscribir Atletas");
            System.out.println("2-Borrar Atletas");
            System.out.println("3-Guardar Tiempo");
            System.out.println("4-MostrarListasFinishers");
            System.out.println("5-MostrarListaCategorias");
            System.out.println("6-ParticipacionPorPaís");
            System.out.println("7-Guardar Atletas");
            System.out.println("8-Cargar Atletas");
            System.out.println("9-Salir");
            eleccion= teclado.nextInt();
            switch (eleccion){
                case 1:
                    System.out.println("Introduce el nombre del atleta:");
                    String nombre = teclado.next();
                    System.out.println("Introduce el pais del atleta:");
                    String pais = teclado.next();
                    System.out.println("Dime el tiempo que has hecho o llevas:");
                    double tiempoRealizado = teclado.nextDouble();
                    System.out.println("Introduce la categoria del atleta:");
                    System.out.println("1.Senior");
                    System.out.println("2.Junior");
                    System.out.println("3.Veterano");
                    int respuesta = teclado.nextInt();
                    atleta.categorias categoria;
                    switch (respuesta){
                        case 1: categoria = atleta.categorias.SENIOR; break;
                        case 2: categoria = atleta.categorias.JUNIOR; break;
                        case 3: categoria = atleta.categorias.VETERANO; break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + respuesta);
                    }
                    atleta at1 = new atleta(nombre,pais,tiempoRealizado,categoria,false);
                    m1.inscribirAtleta(categoria,at1);
                    break;
                case 2:
                    System.out.println("Dime el dorsal del atleta que quieres borrar");
                    int dorsalAUX = teclado.nextInt();
                    m1.BorrarAtletas(dorsalAUX);
                    break;
                case 3:
                    System.out.println("Dime el dorsal del atleta");
                     dorsalAUX = teclado.nextInt();
                    System.out.println("Dime el tiempo que ha realizado");
                    double tiempo = teclado.nextDouble();
                    m1.guardarTiempo(dorsalAUX,tiempo);
                    break;
                case 4:
                    m1.mostrarListaFinishers();
                    break;
                case 5:
                    System.out.println("Que categoria quieres");
                    System.out.println("1.Senior");
                    System.out.println("2.Junior");
                    System.out.println("3.Veterano");
                    respuesta = teclado.nextInt();
                    switch (respuesta){
                        case 1: categoria = atleta.categorias.SENIOR; break;
                        case 2: categoria = atleta.categorias.JUNIOR; break;
                        case 3: categoria = atleta.categorias.VETERANO; break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + respuesta);
                    }
                    m1.mostrarListaCategorias(categoria);
                    break;
                case 6:
                    System.out.println("Dime el pais que quieres ver cuanto atletas tiene");
                    String paisAUX = teclado.next();
                    System.out.println(m1.participacionPorPais(paisAUX));
                    break;
                case 7:
                    m1.guardarArchivos();
                    break;
                case 8:
                    m1.cargarArchivos();
                    break;
            }

        }while (eleccion != 9);
    }
}
