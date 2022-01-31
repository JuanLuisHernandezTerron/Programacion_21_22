package U4.ejerciciosRepaso.Entregable20_21Manana;

import java.time.LocalDate;

public class empleado {
    private String nombreCompleto;
    private String numeroSS;
    private String numerotelef;
    private LocalDate fecha;
    private tipoEmpleado tipoEmple;

    public empleado (String nombreCompleto, String numeroSS, String numerotelef,LocalDate fecha,tipoEmpleado tipoEmple){
        this.nombreCompleto = nombreCompleto;
        this.numeroSS = numeroSS;
        this.numerotelef = numerotelef;
        this.fecha = fecha;
        this.tipoEmple = tipoEmple;
    }

    public empleado (String nombreCompleto, String numeroSS, String numerotelef,LocalDate fecha){
        this.nombreCompleto = nombreCompleto;
        this.numeroSS = numeroSS;
        this.numerotelef = numerotelef;
        this.fecha = fecha;
        this.tipoEmple = tipoEmpleado.TECNICO;
    }

    public enum tipoEmpleado{
        ADMINISTRATIVO,
        TECNICO,
        DIRECTIVO
    }
}
