package U5.T1.Actividad1;

public class hora12 extends hora{
    private String tardeOmanna;

    public hora12(int hora, int minuto,String tardeOmanna) {
        super(hora, minuto);
        if (this.getHora() <= 12 && this.getHora() >= 1){
            this.setHora(hora);
        }else{
            this.setHora(1);
        }
        this.tardeOmanna = tardeOmanna;
    }

    @Override
    public String toString(){
        return getHora()+":"+ getMinuto() +" "+getTardeOmanna();
    }

    public String getTardeOmanna() {
        return tardeOmanna;
    }

    public void setTardeOmanna(String tardeOmanna) {
        this.tardeOmanna = tardeOmanna;
    }
}
