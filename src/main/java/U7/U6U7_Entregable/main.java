package U7.U6U7_Entregable;

public class main {
    public static void main(String[] args) {
        exchange ex1 = new exchange();
        criptomonedas cripto1 = new criptomonedas("Bitcoin","BTC",2365.2,1520.1,"20-07-2005",1);
        criptomonedas cripto2 = new criptomonedas("Ethereum","ETH",320.1,460,"23-07-2019",2);
        criptomonedas cripto3 = new criptomonedas("Dogecoin","DGC",0,20.0,"30-09-2021",3);
        fiat fiat1 = new fiat("Euro","EUR","Belgica");
        fiat fiat2 = new fiat("Dolar","USD","EstadosUnidos");

        ParCotizacion par1 = new ParCotizacion(500.0,-5,cripto1,cripto2);
        ParCotizacion par2 = new ParCotizacion(700,15.2,cripto2,cripto3);
        ParCotizacion par3 = new ParCotizacion(555.87,25,fiat1,fiat2);
        ParCotizacion par4 = new ParCotizacion(300.60,17,fiat2,fiat1);
        ParCotizacion par5 = new ParCotizacion(300.60,20,cripto1,cripto3);
        ParCotizacion par6 = new ParCotizacion(300.60,-5.2,cripto2,cripto1);

        ex1.addCotizacion(par1);
        ex1.addCotizacion(par2);
        ex1.addCotizacion(par3);
        ex1.addCotizacion(par4);
        ex1.addCotizacion(par5);
        ex1.addCotizacion(par6);

        ex1.mostrarDivisasOrdenadas();
        System.out.println(ex1.obtenerCotizaciones("USD"));
        System.out.println(ex1.obtenerCotizaciones("BTC"));
        System.out.println();
        ex1.mostrarCotizacionesAlAlzaUnaHora();
        System.out.println();
        ex1.guardarCotizaciones();
        ex1.recuperarCotizaciones();

    }
}
