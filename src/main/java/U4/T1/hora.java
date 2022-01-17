package U4.T1;

public class hora {
    private int hora;
    private int minuto;
    private int segundo;

    public hora(int hora, int segundo){
        this.hora = hora;
        this.segundo = segundo;
    }

    public void anadirSegundos(){
        int contadorMinutos = 0;
        if (segundo > 0 && segundo < 60){

        }else {
            while (segundo > 0) {
                segundo = segundo - 60;
                contadorMinutos++;
            }
        }
        System.out.println(hora+":"+minuto+":"+segundo);
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }


    public int getHora() {
        return hora;
    }

    public int getSegundo() {
        return segundo;
    }

}
