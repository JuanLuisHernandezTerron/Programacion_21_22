package U4.T1.Actividad1_2_3;

import U4.T1.Actividad4_6.banco;

public class cuentaCorriente {

    //Atributos de la clase, se intentan que todos sean privados pero algunos pueden ser publicos
    private static banco nombre_banco;
    private long saldo = 0;
    private int limite_descubrimiento = -50;
    public String nombre;
    private String DNI;
    //CREA EL CONSTRUCTOR , PARA SOBRECARGAR UN CONSTRUCTOR SIMPLEMENTE CREAREMOS OTRA CUENTA CORRIENTE CON DIFERENTE ATRIBUTOS.

    public cuentaCorriente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
    //ESTE CONSTRUCTOR TENDRÁ COMO DEFAULT EL LIMITE 0 Y EL SALDO QUE SE INTRODUZCA EN EL MAIN.
    public cuentaCorriente(int saldo ) {
        this.saldo = saldo;
        this.limite_descubrimiento = 0;
    }

    public cuentaCorriente(int saldo , int limite_descubrimiento , String DNI) {
        this.saldo = saldo;
        this.limite_descubrimiento = limite_descubrimiento;
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

    public static void setBanco(banco banco1) {
        cuentaCorriente.nombre_banco = banco1;
    }

    public static banco getNombre_banco() {
        return nombre_banco;
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
