package U5.T2.Actividad3;

public class cuadrado extends poligonoRegular{

    public cuadrado(int lado, colores color) {
        super(lado, color);
        setContadorPoligonos(getContadorPoligonos()+1);
    }

    public cuadrado() {
        super(10, colores.AZUL); //ASÍ SE CREA LOS CONSTRUCTORES POR DEFECTO CON SUPER
        setContadorPoligonos(getContadorPoligonos()+1);
    }

    @Override
    public void getArea() {
        int area = this.lado*2;
        System.out.println("El lado del cuadrado es:"+area);
    }

    @Override
    public String toString() {
        return "cuadrado{" +
                "lado=" + lado +
                ", color=" + color +
                '}';
    }
}
