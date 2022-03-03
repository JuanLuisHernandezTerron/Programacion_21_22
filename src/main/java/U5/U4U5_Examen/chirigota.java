package U5.U4U5_Examen;

public class chirigota extends agrupacionOficial implements callejera{
    private int numeroCuples=0;

    public chirigota(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int puntosObtenidos,int numeroCuples) {
        super(nombre, autor, autorMusica, autorLetras, tipo, puntosObtenidos);
        this.numeroCuples = numeroCuples;
        setContadorAgrupaciones();
    }


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la chirigota con nombre "+super.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La chirigota "+super.getNombre()+" va de "+ super.getTipo());
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El/la coro/comparsa/chirigota/cuarteto "+ super.getNombre() +" va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota/Cuarteto/Romanero "+ super.getNombre());
    }

    public int getNumeroCuples() {
        return numeroCuples;
    }

    public void setNumeroCuples(int numeroCuples) {
        this.numeroCuples = numeroCuples;
    }

}
