package U5.U4U5_Examen;

public class coro extends agrupacionOficial{
    private int numeroBandurrias=0;
    private int numeroGuitarras =0;

    public coro(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int puntosObtenidos, int numeroBandurrias, int numeroGuitarras) {
        super(nombre, autor, autorMusica, autorLetras, tipo, puntosObtenidos);
        this.numeroBandurrias = numeroBandurrias;
        this.numeroGuitarras = numeroGuitarras;
        setContadorAgrupaciones();
    }

    public int getNumeroBandurrias() {
        return numeroBandurrias;
    }

    public void setNumeroBandurrias(int numeroBandurrias) {
        this.numeroBandurrias = numeroBandurrias;
    }

    public int getNumeroGuitarras() {
        return numeroGuitarras;
    }

    public void setNumeroGuitarras(int numeroGuitarras) {
        this.numeroGuitarras = numeroGuitarras;
    }


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del coro con nombre "+super.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El coro "+super.getNombre()+" va de"+ super.getTipo());
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El/la coro/comparsa/chirigota/cuarteto "+ super.getNombre() +" va caminito del falla");
    }

    @Override
    public String toString() {
        return "coro{" +
                "numeroBandurrias=" + numeroBandurrias +
                ", numeroGuitarras=" + numeroGuitarras +
                '}';
    }
}
