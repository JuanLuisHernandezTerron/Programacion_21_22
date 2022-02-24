package U5.EjerciciosRepaso.Examen2021Manana;

public class main {
    public static void main(String[] args) {
        conductor c1 = new conductor("Pedro","Hernandez",1236457892);
        camionCaja camion1 = new camionCaja("15236DFC",80,c1);
        caja caja1= new caja();
        caja caja2= new caja();
        caja caja3= new caja();
        prenda prenda1 = new prenda(122.5,"Abrigo",12356985,80);
        prenda prenda2 = new prenda(122.5,"Pantalon",12356985,80);
        prenda prenda3 = new prenda(122.5,"camiseta",12356985,80);

        camion1.introducirCaja(caja1);
        camion1.introducirCaja(caja2);
        camion1.introducirCaja(caja3);

        caja1.introducirPrendaCaja(prenda1);
        caja1.introducirPrendaCaja(prenda2);
        caja1.introducirPrendaCaja(prenda3);

        camion1.eliminarCaja(caja2);
        System.out.println(camion1);

    }
}
