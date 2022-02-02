package U4.U4_T1;

public class manodeObra {
    private String nombreEmpresa;
    private String descripcionTrabajo;
    private int horasTrabajadas;
    private int cantidadObreros;

    public manodeObra(String nombreEmpresa, String descripcionTrabajo, int horasTrabajadas, int cantidadObreros){
        this.nombreEmpresa = nombreEmpresa;
        this.descripcionTrabajo = descripcionTrabajo;
        this.horasTrabajadas = horasTrabajadas;
        this.cantidadObreros = cantidadObreros;
    }

    public void mostrar_informacion(){
        System.out.println("El nombre de la empresa: "+this.nombreEmpresa);
        System.out.println("El trabajo que se ha realiza ha sido: "+this.descripcionTrabajo);
        System.out.println("Las horas trabajadas han sido de: "+this.horasTrabajadas+" horas");
        System.out.println("La cantidad de obreros utilizados han sido de: "+cantidadObreros+" obreros");
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDescripcionTrabajo() {
        return descripcionTrabajo;
    }

    public void setDescripcionTrabajo(String descripcionTrabajo) {
        this.descripcionTrabajo = descripcionTrabajo;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getCantidadObreros() {
        return cantidadObreros;
    }

    public void setCantidadObreros(int cantidadObreros) {
        this.cantidadObreros = cantidadObreros;
    }
}
