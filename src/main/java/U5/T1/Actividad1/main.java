package U5.T1.Actividad1;

public class main {
    public static void main(String[] args) {
        hora12 horaEj = new hora12(11,50,"am");
        horaExacta hora1 = new horaExacta(12,25,35);
        horaExacta hora2 = new horaExacta(12,25,35);
        System.out.println(horaEj);

        if (hora1.equals(hora2)){
            System.out.println("Las horas son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
}
