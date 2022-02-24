package U5.U4U5_Entregable;

import java.util.Arrays;

public class catalogo {
    private multimedia [] arrayMultimedia = new multimedia[0];
    private int contadorMultimedia = 0;

    public void add_multimedia(multimedia multimediaAUX){
        arrayMultimedia = Arrays.copyOf(arrayMultimedia,arrayMultimedia.length+1);
        arrayMultimedia[contadorMultimedia++] = multimediaAUX;
    }

    public boolean eliminar_multimedia(multimedia multimediaAUX){
        multimedia [] arrayAUX = new multimedia[0];
        int contadorAUX = 0;
        contadorMultimedia--;
        boolean noMultimedia = false;

        for (int i = 0; i < arrayMultimedia.length; i++) {
            if (!arrayMultimedia[i].equals(multimediaAUX)){
                arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                arrayAUX[contadorAUX++] = arrayMultimedia[i];
            }
        }
        contadorAUX=0;
        arrayMultimedia = Arrays.copyOf(arrayAUX,arrayAUX.length);
        for (int i = 0; i < arrayAUX.length; i++) {
            arrayMultimedia[i] = arrayAUX[i];
            if (arrayAUX[i].equals(multimediaAUX)){
                contadorAUX++;
            }
        }
        if (contadorAUX  == 0){
            noMultimedia = true;
        }

        return noMultimedia;
    }

    public void ordenar_por_id(){
        Arrays.sort(arrayMultimedia);
    }

    public void ordenar_por_titulo(){
        Arrays.sort(arrayMultimedia,new OrdenarTituloObra());
    }

    public void ordenar_por_ano(){
        Arrays.sort(arrayMultimedia,new OrdenarAno());
    }

    public void numero_de_elementos(){
        System.out.println("El numero de elementos que hay son: "+ multimedia.getContadorMultimedia());
    }


    public int getContadorMultimedia() {
        return contadorMultimedia;
    }

    public void setContadorMultimedia(int contadorMultimedia) {
        this.contadorMultimedia = contadorMultimedia;
    }

    @Override
    public String toString() {
        return "catalogo{" +
                "arrayMultimedia=" + Arrays.toString(arrayMultimedia);
    }

    public multimedia[] getArrayMultimedia() {
        return arrayMultimedia;
    }
}
