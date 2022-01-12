package U4.T1;

public class cuentaCorriente {

    //Atributos de la clase, se intentan que todos sean privados pero algunos pueden ser publicos

    private long saldo = 0;
    private static int limite_descubrimiento = -50;
    private String nombre;
    private String DNI;
    //CREA EL CONSTRUCTOR

    public cuentaCorriente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
    public boolean sacarDinero(long retirarDinero){
        boolean retirada = false;
        if (saldo - retirarDinero > this.limite_descubrimiento){
            this.saldo = this.saldo - retirarDinero;
            retirada = true;
        }

        if (retirada){
            System.out.println("El dinero ha sido retirado correctamente");
        }else{
            System.out.println("El dinero no ha sido retirado correctamente");
        }
        return retirada;
    }

    public void ingresarDinero(long cantidadIngresada){
        System.out.println("Se ha realizado con exito el ingreso del dinero.");
        setSaldo(this.saldo+cantidadIngresada);
    }

    public void mostrarInformacion(){
        System.out.println("Don/Doña " + getNombre() + " con DNI "+ getDNI() + " tiene en su cuenta un total de: " + getSaldo() + " € ");
    }

    private void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }
}
