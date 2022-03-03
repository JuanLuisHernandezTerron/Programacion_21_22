package U5.U4U5_Examen;

public class cuarteto extends agrupacionOficial implements callejera{
    private int numeroMiembros=0;

    public cuarteto(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int puntosObtenidos, int numeroMiembros) {
        super(nombre, autor, autorMusica, autorLetras, tipo, puntosObtenidos);
        this.numeroMiembros = numeroMiembros;
        setContadorAgrupaciones();
    }


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del cuarteto con nombre "+super.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El cuarteto "+super.getNombre()+" va de"+ super.getTipo());
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El/la coro/comparsa/chirigota/cuarteto "+ super.getNombre() +" va caminito del falla");
    }


    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota/Cuarteto/Romanero "+ super.getNombre());
    }

    public int getNumeroMiembros() {
        return numeroMiembros;
    }

    public void setNumeroMiembros(int numeroMiembros) {
        this.numeroMiembros = numeroMiembros;
    }
}
