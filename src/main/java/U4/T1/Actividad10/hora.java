package U4.T1.Actividad10;

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
        int contadorMinutosHoras = 0;

        while (segundo + this.segundo >=60 || minuto >=60){
            segundo -=60;
            contadorMinutos ++;
            minuto = contadorMinutos;
                if (minuto > 60){
                    contadorMinutosHoras++;
                    minuto -=60;
                    hora +=contadorMinutosHoras;
                }else if(minuto == 60){
                    hora +=1;
                    minuto -=60;
                }
        }
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setSegundo(int segundo) {
        this.segundo = this.segundo+segundo;
    }

    public void getInformacion(){
        System.out.println("La hora nueva es"+hora+":"+minuto+":"+segundo);
    }

    public int getHora() {
        return hora;
    }

    public int getSegundo() {
        return segundo;
    }

}
