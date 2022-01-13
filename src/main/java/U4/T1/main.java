package U4.T1;
//Simplemente llamaremos a los metodos desde esta clase.
public class main {
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
        /*-------------------------------------------------------------------------------------------------*/

        texto texto1 = new texto("Hola a todos que pasa nena",30);
        texto1.introducirCaracter('a',"final"); //POSICION SE PODRÁ PONER EN PRINCIPIO O FINAL DEPENDIENDO DONDE QUIERAS MOSTRAR LA A.
        System.out.println(texto1.sacarVocales());
        texto1.insertarCadena("final","hi");

        /*-------------------------------------------------------------------------------------------------*/

        banco banco1 = new banco("Cajasol",120000,"C/Jose Perez");
        cuentaCorriente.setBanco(banco1);
        /*-------------------------------------------------------------------------------------------------*/
        emisoraFM fr1 = new emisoraFM();
        fr1.subirMHz();
        fr1.bajarMHz();
        fr1.bajarMHz();
        /*------------------------------------------------------------------------------------------------*/

        bombilla bomb1 = new bombilla(true);
        System.out.println(bomb1.isEstado());
    }
}
