package U7.U6U7_Entregable;

import java.io.*;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class exchange implements Serializable {
    private Map<divisa, List<ParCotizacion>> mapaExchange = new HashMap<>();
    private static List<ParCotizacion> listaParCotizacion = new ArrayList<>();
    private List<divisa> listaDivisa = new ArrayList<>();

    public void addCotizacion(ParCotizacion cotizacionAUX){
        divisa divisaAUX = cotizacionAUX.getDivisaBase();
        if (!mapaExchange.containsKey(divisaAUX)){
            List<ParCotizacion> listaParCotizacion = new ArrayList<>();
            listaParCotizacion.add(cotizacionAUX);
            mapaExchange.put(divisaAUX, listaParCotizacion);
        }else{
            mapaExchange.get(divisaAUX).add(cotizacionAUX);
        }
    }

    public void mostrarMapa(){
        Iterator<divisa> it0 = mapaExchange.keySet().iterator();
        while (it0.hasNext()){
            divisa divisaAUX = it0.next();
            List<ParCotizacion> listaPar = mapaExchange.get(divisaAUX);
            Iterator<ParCotizacion> it1 = listaPar.iterator();
            while (it1.hasNext()){
                ParCotizacion parAUX = it1.next();
                System.out.println(parAUX);
            }
        }
    }

    public List<ParCotizacion> obtenerCotizaciones(String simbolo){
        Iterator<divisa> it0 = mapaExchange.keySet().iterator();
        List<ParCotizacion> listaParFinal = new ArrayList<>();
        while (it0.hasNext()){
            divisa divisaAUX = it0.next();
            List<ParCotizacion> listaPar = mapaExchange.get(divisaAUX);
            Iterator<ParCotizacion> it1 = listaPar.iterator();
            while (it1.hasNext()){
                ParCotizacion parAUX = it1.next();
                if (divisaAUX.getSimmboloDivisa().equalsIgnoreCase(simbolo)){
                    listaParFinal.add(parAUX);
                }
            }
        }
        return listaParFinal;
    }

    public void mostrarDivisasOrdenadas(){
        listaDivisa.addAll(mapaExchange.keySet());
        Collections.sort(listaDivisa,new ordenarSimbolo());
        Iterator<divisa> it0 = listaDivisa.iterator();
        while (it0.hasNext()){
            divisa divisaAUX = it0.next();
            System.out.println(divisaAUX);
        }
    }


    public void mostrarCotizacionesAlAlzaUnaHora(){
        Iterator<divisa> it0 = mapaExchange.keySet().iterator();
        while (it0.hasNext()){
            divisa divisaAUX = it0.next();
            List<ParCotizacion> listaPar = mapaExchange.get(divisaAUX);
            Iterator<ParCotizacion> it1 = listaPar.iterator();
            while (it1.hasNext()){
                ParCotizacion parCoti = it1.next();
                if (parCoti.getVariacionPorcentual() > 0){
                    System.out.println(parCoti);
                }
            }
        }
    }

    public void guardarCotizaciones(){
        try(ObjectOutputStream EscribirFichero = new ObjectOutputStream(new FileOutputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U7/U6U7_Entregable/cotizaciones.dat",true))){
            EscribirFichero.writeObject(mapaExchange);
            System.out.println("Guardado Correctamente");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void recuperarCotizaciones(){
        try(ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U7/U6U7_Entregable/cotizaciones.dat"))){
            mapaExchange.clear();
            mapaExchange= (Map<divisa, List<ParCotizacion>>) leerFichero.readObject();
            System.out.println("RecuperadoCorrectamente");
            System.out.println();
            mostrarMapa();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public Map<divisa, List<ParCotizacion>> getMapaExchange() {
        return mapaExchange;
    }

    public void setMapaExchange(Map<divisa, List<ParCotizacion>> mapaExchange) {
        this.mapaExchange = mapaExchange;
    }

    public static List<ParCotizacion> getListaParCotizacion() {
        return listaParCotizacion;
    }

    public static void setListaParCotizacion(List<ParCotizacion> listaParCotizacion) {
        exchange.listaParCotizacion = listaParCotizacion;
    }
}
