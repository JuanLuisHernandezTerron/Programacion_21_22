package U5.T1.Actividad2;

public class main {
    public static void main(String[] args) {
        piano pia1 = new piano();
        campana campa1 = new campana();

        pia1.add(instrumento.notas.FA);
        pia1.add(instrumento.notas.LA);
        pia1.add(instrumento.notas.RE);
        pia1.interpretar();
        System.out.println();
        campa1.add(instrumento.notas.SI);
        campa1.add(instrumento.notas.LA);
        campa1.add(instrumento.notas.RE);
        campa1.interpretar();
    }
}
