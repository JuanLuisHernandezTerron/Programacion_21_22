package U4.ejerciciosRepaso.Entregable20_21Manana;

public class main {
    public static void main(String[] args) {
        departamento depart1 = new departamento("Departamento1","Bormujos","603452698");
        departamento depart2 = new departamento("Departamento2","603455472");
        departamento []array  = new departamento[] {depart1,depart2};
        empresa empresa1 = new empresa("Endesa",array);
        departamento depart3 = new departamento("Departamento3","603455472");
        departamento depart4 = new departamento("Departamento4","603457472");
        empleado emple1 = new empleado("Juan Luis Hernandez Terron","215698742365","603215487", empleado.tipoEmpleado.ADMINISTRATIVO);
        empleado emple2 = new empleado("Pedro José Arroyo Carvajal","215698743265","603645487");
        empleado emple3 = new empleado("Antonio Manuel Perejón","215788742365","610215487", empleado.tipoEmpleado.DIRECTIVO);
        empresa1.anadirDepartamento(depart3);
        empresa1.getInformacionDepart();
        System.out.println();
        depart1.introducirEmpleado(emple1);
        depart1.introducirEmpleado(emple2);
        depart1.introducirEmpleado(emple3);
        depart1.getInfoTrabajadores();
        depart1.eliminarEmpleado(emple2);
        depart1.getArrayEmpleados();
    }
}
