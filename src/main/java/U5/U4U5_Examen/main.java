package U5.U4U5_Examen;

public class main {
    public static void main(String[] args) {
        coac coac1 = new coac();
        chirigota chiri1 = new chirigota("PedroChirigotas","Pedro","Manolo","Pedro","Pintoresco",150,5);
        cuarteto cuarteto1 = new cuarteto("JoseCuarteto","Jose","Pepito","Manuela","Negruzco",200,6);
        System.out.println("***********************");
        chiri1.hacer_tipo();
        chiri1.cantar_la_presentacion();
        chiri1.amo_a_escucha();
        chiri1.caminito_del_falla();
        System.out.println("***********************");
        coac1.insertarAgrupacion(chiri1);
        coac1.insertarAgrupacion(cuarteto1);
        coac1.mostrarArray();
        System.out.println(coac1.eliminarAgrupacion(cuarteto1));
        coac1.mostrarArray();
        System.out.println("***********************");
        integrante integrante1 = new integrante("Juanlu",26,"Bormujos");
        integrante integrante2 = new integrante("Manuel",35,"MairenaAljarafe");

        chiri1.insertarIntegrante(integrante1);
        chiri1.insertarIntegrante(integrante2);
        chiri1.mostrarArrayIntegrante();
        System.out.println(chiri1.eliminarIntegrantes(integrante1));
        chiri1.mostrarArrayIntegrante();
        System.out.println("*******************");
        coac1.insertarAgrupacion(cuarteto1);
        coac1.ordenar_por_nombre();
        System.out.println("------");
        coac1.ordenar_por_autor();
        System.out.println("-----");
        coac1.ordenar_por_puntos();
        System.out.println("************************");
        coac1.mostrarAgrupaciones();
    }
}
