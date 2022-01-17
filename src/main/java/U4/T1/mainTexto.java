package U4.T1;

public class mainTexto {
    public static void main(String[] args) {
        texto texto1 = new texto("Hola a todos que pasa nena",30);
        texto1.introducirCaracter('a',"final"); //POSICION SE PODRÁ PONER EN PRINCIPIO O FINAL DEPENDIENDO DONDE QUIERAS MOSTRAR LA A.
        System.out.println(texto1.sacarVocales());
        texto1.insertarCadena("final","hi");
    }
}
