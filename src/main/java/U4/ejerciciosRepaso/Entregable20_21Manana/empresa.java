package U4.ejerciciosRepaso.Entregable20_21Manana;

import java.util.Arrays;

public class empresa {
    private String nombreEmpresa;
    private departamento [] arrayDepart ;

    public empresa(String nombreEmpresa, departamento [] arrayDepart){
        this.nombreEmpresa = nombreEmpresa;
        this.arrayDepart = arrayDepart;
    }

    public void anadirDepartamento(departamento depart){
        int contadorArray = arrayDepart.length;
        arrayDepart = Arrays.copyOf(arrayDepart,arrayDepart.length+1);
        arrayDepart[contadorArray] = depart;
    }

    public void getInformacionDepart(){
        System.out.println("Los departamentos de la empresa "+this.nombreEmpresa+" son:");
        for (int i = 0; i < arrayDepart.length; i++) {
            System.out.println(arrayDepart[i].getNombreDepart());
        }
    }

    public void setArrayDepart(departamento[] arrayDepart) {
        this.arrayDepart = arrayDepart;
    }

    public departamento[] getArrayDepart() {
        return arrayDepart;
    }
}
