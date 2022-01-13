package U4.T1;

public class bombilla {

    private boolean estado;
    private static boolean interruptor_general = true;
    public bombilla(boolean estado){
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }
}
