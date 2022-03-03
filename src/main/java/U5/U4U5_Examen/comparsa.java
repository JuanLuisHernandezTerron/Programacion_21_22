package U5.U4U5_Examen;

public class comparsa extends agrupacionOficial{
    private String empresaAtrezzo;

    public comparsa(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int puntosObtenidos, String empresaAtrezzo) {
        super(nombre, autor, autorMusica, autorLetras, tipo, puntosObtenidos);
        this.empresaAtrezzo = empresaAtrezzo;
        setContadorAgrupaciones();
    }


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la comparsa con nombre "+super.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La comparsa "+super.getNombre()+" va de"+ super.getTipo());
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El/la coro/comparsa/chirigota/cuarteto "+ super.getNombre() +" va caminito del falla");
    }

    public String getEmpresaAtrezzo() {
        return empresaAtrezzo;
    }

    public void setEmpresaAtrezzo(String empresaAtrezzo) {
        this.empresaAtrezzo = empresaAtrezzo;
    }
}
