package U5.U4U5_Examen;

public class romancero extends agrupacion implements callejera{
    private String tematicaCartelon;
    public romancero(String nombre, String autor, String autorMusica, String autorLetras, String tipo,String tematicaCartelon) {
        super(nombre, autor, autorMusica, autorLetras, tipo);
        this.tematicaCartelon = tematicaCartelon;
        setContadorAgrupaciones();
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del romancero con nombre "+super.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El romancero "+super.getNombre()+" va de"+ super.getTipo());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota/Cuarteto/Romanero"+ super.getNombre());
    }

    public String getTematicaCartelon() {
        return tematicaCartelon;
    }

    public void setTematicaCartelon(String tematicaCartelon) {
        this.tematicaCartelon = tematicaCartelon;
    }
}
