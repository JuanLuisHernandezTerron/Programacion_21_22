package U5.T1.Actividad1;

public class hora {
    private int hora;

    private int minuto;

    public hora (int hora, int minuto){
        if (hora <=24 && hora >= 0){
            this.hora = hora;
        }else{
            this.hora = 0;
        }
        this.minuto = minuto;
    }

    public void inc(){
        this.minuto += 1;
    }

    public void setMinuto(int minuto) {
        if (minuto <= 60 && minuto >=0) {
            this.minuto = minuto;
            if (this.minuto == 60){
                this.hora +=1;
                this.minuto =0;
            }
        }else{
            this.minuto = 0;
        }
    }

    public void setHora(int hora) {
        if (hora <=24 && hora >= 0){
            this.hora = hora;
        }
    }

    @Override
    public String toString(){
        return "La hora es: "+ getHora()+ " y los minutos son: "+ getMinuto();
    }


    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
}
