package U4.ejerciciosRepaso.Entregable20_21Manana;

public class departamento {
    private String nombreDepart;
    private String sede;
    private String numeroTelf;

    public departamento (String nombreDepart, String sede, String numeroTelf){
        this.nombreDepart = nombreDepart;
        this.sede = sede;
        this.numeroTelf = numeroTelf;
    }

    public departamento (String nombreDepart, String numeroTelf){
        this.nombreDepart = nombreDepart;
        this.sede = "Castilleja";
        this.numeroTelf = numeroTelf;
    }
}
