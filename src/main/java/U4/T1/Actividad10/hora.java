package U4.T1.Actividad10;

public class hora {
    private int hora;
    private int minuto;
    private int segundo;

    public hora(int hora, int minuto, int segundo){
        this.hora = hora;
        this.segundo = segundo;
        this.minuto = minuto;
    }
    public void anadirSegundos(int segundo){
        setSegundo(this.segundo+segundo);
        int contadorMinutosHoras = 0;

        while (this.segundo >=60){
            this.segundo -=60;
            setMinuto(this.minuto+1);
        }

        while (minuto >=60){
            if (minuto ==60){
                setHora(this.hora+1);
                setMinuto(0);
                setSegundo(0);
            }else{
                minuto -=60;
                contadorMinutosHoras++;
                if (contadorMinutosHoras ==60){
                    hora+=1;
                    minuto=0;
                    segundo=0;
                }
            }
        }
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setSegundo(int segundo) {
        this.segundo =segundo;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void getInformacion(){
        System.out.println("La hora nueva es"+hora+":"+minuto+":"+segundo);
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

}
