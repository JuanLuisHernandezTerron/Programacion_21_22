package U4.U4_T1;

import java.time.LocalDate;
import java.util.Arrays;

public class obra {
    private vivienda viviendaAUX;
    private manodeObra manodeObraAUX;
    private vivienda.estanciasVivienda estancia;
    private LocalDate fechaObra = LocalDate.now();
    private material [] arrayMateriales = new material[0];
    private int contadorArray = 0;

    public obra(vivienda viviendaAUX,manodeObra manodeObraAUX,vivienda.estanciasVivienda estancia){
        this.viviendaAUX = viviendaAUX;
        this.manodeObraAUX = manodeObraAUX;
        this.estancia = estancia;
    }

    public void anadirMateriales (material materialAUX){
        arrayMateriales = Arrays.copyOf(arrayMateriales,arrayMateriales.length+1);
        arrayMateriales[contadorArray++] = materialAUX;
    }

    public void eliminarMateriales(int posicionMaterial){
        for (int i = 0; i < arrayMateriales.length-1; i++) {
            if (i >= posicionMaterial){
                arrayMateriales[i] = arrayMateriales[i+1];
            }
        }
        arrayMateriales = Arrays.copyOf(arrayMateriales,arrayMateriales.length-1);
    }

    public void mostrar_informacion(){
        viviendaAUX.mostrar_informacion();
        System.out.println();
        manodeObraAUX.mostrar_informacion();
        System.out.println();
        System.out.println("La estancia donde se ha realizado la obra es: "+this.estancia);
        System.out.println("La fecha en la que se ha realiza la obra es: "+this.fechaObra);
        System.out.println("Los materiales utilizados han sido: ");
        for (int i = 0; i < arrayMateriales.length; i++) {
            System.out.println();
            arrayMateriales[i].mostrar_informacion(arrayMateriales[i]);
        }
    }

    public vivienda getViviendaAUX() {
        return viviendaAUX;
    }

    public void setViviendaAUX(vivienda viviendaAUX) {
        this.viviendaAUX = viviendaAUX;
    }

    public manodeObra getManodeObraAUX() {
        return manodeObraAUX;
    }

    public void setManodeObraAUX(manodeObra manodeObraAUX) {
        this.manodeObraAUX = manodeObraAUX;
    }

    public vivienda.estanciasVivienda getEstancia() {
        return estancia;
    }

    public void setEstancia(vivienda.estanciasVivienda estancia) {
        this.estancia = estancia;
    }

    public LocalDate getFechaObra() {
        return fechaObra;
    }

    public void setFechaObra(LocalDate fechaObra) {
        this.fechaObra = fechaObra;
    }

    public material[] getArrayMateriales() {
        return arrayMateriales;
    }

    public void setArrayMateriales(material[] arrayMateriales) {
        this.arrayMateriales = arrayMateriales;
    }
}
