package U9.RepasosExamen.ExamenRepaso2;

import U9.RepasosExamen.ExamenRepaso2.SQL.consultas;

public class main {
    public static void main(String[] args) {
//        ModificacionDOM.anadirLibroNuevo();
        System.out.println("-------------------------");
//        ModificacionDOM.insertarNodo();
        System.out.println("-------------------------");
//        RecorridoSTAX.librosMAXPag();
        System.out.println();
//        RecorridoSTAX.numeroLibrosEditorial("Edelvives");
        System.out.println();
        consultas.pasarJSON(consultas.MostrarOficinas());


    }
}
