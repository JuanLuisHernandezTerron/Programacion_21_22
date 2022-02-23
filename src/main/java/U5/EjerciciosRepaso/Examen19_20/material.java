package U5.EjerciciosRepaso.Examen19_20;

public abstract class material {
    private String nombre;
    private int masa;
    private int quemarse;
    private int diluirse;
    private boolean movibles;

    public material(String nombre, int masa, int quemarse, int diluirse, boolean movibles) {
        this.nombre = nombre;
        setMasa(masa);
        setQuemarse(quemarse);
        setDiluirse(diluirse);
        this.movibles = movibles;
    }

    public void setMasa(int masa) {
        if (masa >=0 && masa<=1000){
            this.masa=masa;
        }else{
            this.masa=0;
        }
    }

    public void setQuemarse(int quemarse) {
        if (quemarse >=0 && quemarse<=100){
            this.quemarse=masa;
        }else{
            this.quemarse=0;
        }
    }

    public void setDiluirse(int diluirse) {
        if (diluirse >=0 && diluirse<=100){
            this.diluirse=diluirse;
        }else{
            this.diluirse=0;
        }
    }

    public int getMasa() {
        return masa;
    }

    public String getNombre() {
        return nombre;
    }

}
