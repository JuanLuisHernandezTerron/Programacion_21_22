package U4.T1.Actividad1_2_3;

public class mainCuentaCorriente {
    public static void main(String[] args) {
        cuentaCorriente persona1 = new cuentaCorriente("Pedro", "12365478E");
        cuentaCorriente persona2 = new cuentaCorriente(125);
        cuentaCorriente persona3 = new cuentaCorriente(220,22 ,"123454678A");
        System.out.println(persona1.getSaldo());
        persona1.ingresarDinero(200);
        persona1.mostrarInformacion();
        persona1.sacarDinero(260);
        persona1.mostrarInformacion();
        persona1.sacarDinero(240);
        persona1.mostrarInformacion();
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getSaldo());
    }
}
