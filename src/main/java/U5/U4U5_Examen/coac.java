package U5.U4U5_Examen;

import java.util.Arrays;

public class coac {
    agrupacionOficial [] arrayAgrupa = new agrupacionOficial[0];
    private int contadorAgrupaciones =0;

    public void insertarAgrupacion(agrupacionOficial agrupacionOficialAUX){
        arrayAgrupa = Arrays.copyOf(arrayAgrupa,arrayAgrupa.length+1);
        arrayAgrupa[contadorAgrupaciones++] = agrupacionOficialAUX;
    }

    public boolean eliminarAgrupacion(agrupacionOficial agrupacionOficialAUX){
        int contadorArray=0;
        boolean es_borrado = false;
        contadorAgrupaciones--;
        agrupacionOficial [] arrayAUX = new agrupacionOficial[0];
        for (int i = 0; i < arrayAgrupa.length; i++) {
            if (arrayAgrupa[i] != agrupacionOficialAUX){
                arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                arrayAUX[contadorArray++] = arrayAgrupa[i];
            }
        }
        arrayAgrupa = Arrays.copyOf(arrayAUX,arrayAUX.length);
        contadorArray =0;
        for (int i = 0; i < arrayAUX.length; i++) {
            arrayAgrupa[i] = arrayAUX[i];
            if (arrayAUX[i] == agrupacionOficialAUX){
                contadorArray++;
            }
        }

        if (contadorArray ==0){
            es_borrado = true;
        }
        return es_borrado;
    }

    public void mostrarArray(){
        for (int i = 0; i < arrayAgrupa.length; i++) {
            System.out.println(arrayAgrupa[i]);
        }
    }

    public void ordenar_por_puntos(){
        Arrays.sort(arrayAgrupa,new ordenarArrayPuntos());
        for (int i = 0; i < arrayAgrupa.length; i++) {
            System.out.println(arrayAgrupa[i]);
        }
    }

    public void ordenar_por_nombre(){
        Arrays.sort(arrayAgrupa,new ordenar_por_nombre());
        for (int i = 0; i < arrayAgrupa.length; i++) {
            System.out.println(arrayAgrupa[i].getNombre());
        }
    }

    public void ordenar_por_autor(){
        Arrays.sort(arrayAgrupa,new ordenar_autor());
        for (int i = 0; i < arrayAgrupa.length; i++) {
            System.out.println(arrayAgrupa[i].getAutor());
        }
    }

    public void mostrarAgrupaciones(){
        System.out.println("Se han creado "+agrupacion.getContadorAgrupaciones()+ " agrupaciones");
    }
}
