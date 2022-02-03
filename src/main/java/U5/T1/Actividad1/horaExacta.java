package U5.T1.Actividad1;

import java.util.Objects;

public class horaExacta extends hora{
    private int segundos;

    public horaExacta(int hora, int minuto,int segundos) {
        super(hora, minuto);
        this.segundos = segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <=60) {
            this.segundos = segundos;
                if (segundos == 60){
                    setMinuto(getMinuto()+1);
                    this.segundos = 0;
                }else if (getMinuto() == 60){
                    setHora(getHora() + 1);
                    setMinuto(0);
                }
        }else{
            this.segundos = 1;
        }
    }

    public void inc(){
        this.segundos +=1;
    }

    public int getSegundos() {
        return segundos;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        horaExacta horaEj = (horaExacta) o;
        return this.getHora() == horaEj.getHora() && this.getMinuto() == horaEj.getMinuto() && this.getSegundos() == horaEj.getSegundos();
    }
}


