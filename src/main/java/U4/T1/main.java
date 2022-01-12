package U4.T1;
//Simplemente llamaremos a los metodos desde esta clase.
public class main {
    public static void main(String[] args) {
        cuentaCorriente persona1 = new cuentaCorriente("Pedro", "12365478E");

        System.out.println(persona1.getSaldo());
        persona1.ingresarDinero(200);
        persona1.mostrarInformacion();
        persona1.sacarDinero(260);
        persona1.mostrarInformacion();
        persona1.sacarDinero(240);
        persona1.mostrarInformacion();
    }
}
