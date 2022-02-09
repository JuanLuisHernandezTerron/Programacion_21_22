package U5.T1.Actividad3;

public class main {
    public static void main(String[] args) {
        caja caj1 = new caja(21.2,12.2,40.0, caja.unidad.CENTIMETROS);
        System.out.println(caj1);

        caja_carton cajCarton = new caja_carton(15.6,20.0,35);
        cajCarton.setEtiqueta(1);
        System.out.println(cajCarton);
        System.out.println(cajCarton.getPesoCaja());
        cajCarton.superficiTotalCarton();
        System.out.println(cajCarton.getSuperficieTotal());
    }
}
