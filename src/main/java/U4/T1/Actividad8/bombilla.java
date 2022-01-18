package U4.T1.Actividad8;

public class bombilla {

    private boolean estado;

    private static boolean interruptor_general = true;
    private boolean estadoCopia;

    public bombilla(boolean estado){
        this.estado = estado;
        estadoCopia = estado;
    }

    public static void apagon(){
        interruptor_general = false;
    }

    public static void arreglado(){
        interruptor_general = true;
    }

    public boolean isEstado() {
        if (!interruptor_general) {
            estado = false;
        }else{
            estado = estadoCopia;
        }
        return estado;
    }

}
