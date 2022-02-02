package U4.U4_T1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class vivienda {
    private String direccionVivienda;
    private int metrosCuadrados;
    estanciasVivienda [] arrayEstancias = new estanciasVivienda[0];
    private int contadorEstancia = 0;
    private estanciasVivienda estancia;

    public vivienda(String direccionVivienda, int metrosCuadrados){
        this.direccionVivienda = direccionVivienda;
        this.metrosCuadrados = metrosCuadrados;
    }

    public enum estanciasVivienda{
        SALON,
        COCINA,
        BANO,
        DORMITORIO,
        TERRAZA,
        VESTIBULO,
        COMEDOR,
        BALCON;
    }

    public void anadirEstancias(estanciasVivienda estancia){
        arrayEstancias = Arrays.copyOf(arrayEstancias,arrayEstancias.length+1);
        arrayEstancias[contadorEstancia++] = estancia;
    }

    public void eliminarEstancias(int posicionEstancia){
        for (int i = 0; i < arrayEstancias.length-1; i++) {
            if (i >= posicionEstancia){
                arrayEstancias[i] = arrayEstancias[i+1];
            }
        }
        arrayEstancias = Arrays.copyOf(arrayEstancias,arrayEstancias.length-1);
        contadorEstancia --;
    }

    public void mostrar_informacion(){
        System.out.println("La direccion de la vivivenda es: "+this.direccionVivienda);
        System.out.println("Los metros cuadrados de la viviendaes: "+this.metrosCuadrados);
        System.out.println("La vivienda tiene "+ this.contadorEstancia +" estancias");
        System.out.println("Sus estancias son: ");
            getInformacionEstancias();
    }

    public void getInformacionEstancias(){
        for (int i = 0; i < arrayEstancias.length; i++) {
            System.out.println(arrayEstancias[i]);
        }
    }
    public String getDireccionVivienda() {
        return direccionVivienda;
    }

    public void setDireccionVivienda(String direccionVivienda) {
        this.direccionVivienda = direccionVivienda;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public estanciasVivienda[] getArrayEstancias() {
        return arrayEstancias;
    }

    public void setArrayEstancias(estanciasVivienda[] arrayEstancias) {
        this.arrayEstancias = arrayEstancias;
    }

    public int getContadorEstancia() {
        return contadorEstancia;
    }

    public void setContadorEstancia(int contadorEstancia) {
        this.contadorEstancia = contadorEstancia;
    }

    public estanciasVivienda getEstancia() {
        return estancia;
    }

    public void setEstancia(estanciasVivienda estancia) {
        this.estancia = estancia;
    }
}
