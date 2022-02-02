package U4.U4_T1;

public class material {
    private String descripcionMaterial;
    private String proovedor;
    private int unidadesNecesarias;
    private int precioUnidad;
    private static int IVA = 21;

    public material (String descripcionMaterial, String proovedor, int unidadesNecesarias, int precioUnidad){
        this.descripcionMaterial = descripcionMaterial;
        this.proovedor = proovedor;
        if (unidadesNecesarias > 1 && unidadesNecesarias < 1000){
            this.unidadesNecesarias = unidadesNecesarias;
        }else{
            this.unidadesNecesarias = 1;
        }

        if (precioUnidad >= 0 && precioUnidad <= 1000){
            this.precioUnidad = precioUnidad;
        }else{
            this.precioUnidad = 0;
        }
    }

    public material (String descripcionMaterial, int unidadesNecesarias, int precioUnidad){
        this.descripcionMaterial = descripcionMaterial;
        if (unidadesNecesarias > 1 && unidadesNecesarias < 1000){
            this.unidadesNecesarias = unidadesNecesarias;
        }else{
            this.unidadesNecesarias = 1;
        }

        if (precioUnidad >= 0 && precioUnidad <= 1000){
            this.precioUnidad = precioUnidad;
        }else{
            this.precioUnidad = 0;
        }
    }

    public void mostrar_informacion(material materialEj){
        System.out.println("El material: "+ materialEj.getDescripcionMaterial());
        System.out.println("Su descripción es: " + this.descripcionMaterial);
        System.out.println("Su proovedor es: " + this.descripcionMaterial);
        System.out.println("Las unidades utilizadas son: "+this.unidadesNecesarias);
        System.out.println("El precio por unidad es: "+this.precioUnidad);
        System.out.println("El IVA es de: "+getIVA()+"%");
    }

    public static void setIVA(int IVA) {
        material.IVA = IVA;
    }

    public static double getIVA() {
        return IVA;
    }
    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    public String getProovedor() {
        return proovedor;
    }

    public void setProovedor(String proovedor) {
        this.proovedor = proovedor;
    }

    public int getUnidadesNecesarias() {
        return unidadesNecesarias;
    }

    public void setUnidadesNecesarias(int unidadesNecesarias) {
        this.unidadesNecesarias = unidadesNecesarias;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
}
