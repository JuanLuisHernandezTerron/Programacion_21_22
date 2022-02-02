package U4.U4_T1;

public class main {
    public static void main(String[] args) {
        vivienda vivienda1 = new vivienda("C/Pablo Coso Calero",150);
        vivienda vivienda2 = new vivienda("C/Manuel Esquivias",200);
        vivienda vivienda3 = new vivienda("C/Camas",300);
        manodeObra mano1 = new manodeObra("Pepes S.L","Alicatar pared", 5,5);
        manodeObra mano2 = new manodeObra("Polsando S.L","Poner suelos",10,2);
        manodeObra mano3 = new manodeObra("Maderas Relucientes S.L","Poner puertas y tambien el parqué del suelo",48,2);
        material material1 = new material("Mezcla Pared","Polsando S.L",5,6);
        material material2 = new material("Suelo","Polsando S.L",30,15);
        material material3 = new material("Cristales","Cristalerias S.L",10,20);
        material material4 = new material("Madera","Mariano S.L",50,25);
        material material5 = new material("Bidé","Roca S.L",1,30);
        vivienda1.anadirEstancias(vivienda.estanciasVivienda.BANO);
        vivienda1.anadirEstancias(vivienda.estanciasVivienda.BANO);
        vivienda1.anadirEstancias(vivienda.estanciasVivienda.DORMITORIO);
        vivienda1.anadirEstancias(vivienda.estanciasVivienda.COMEDOR);

        vivienda2.anadirEstancias(vivienda.estanciasVivienda.BALCON);
        vivienda2.anadirEstancias(vivienda.estanciasVivienda.COMEDOR);
        vivienda2.anadirEstancias(vivienda.estanciasVivienda.VESTIBULO);
        vivienda2.anadirEstancias(vivienda.estanciasVivienda.TERRAZA);

        vivienda3.anadirEstancias(vivienda.estanciasVivienda.DORMITORIO);
        vivienda3.anadirEstancias(vivienda.estanciasVivienda.VESTIBULO);
        vivienda3.anadirEstancias(vivienda.estanciasVivienda.COCINA);
        vivienda3.anadirEstancias(vivienda.estanciasVivienda.COMEDOR);

        obra obra1 = new obra(vivienda1,mano1, vivienda.estanciasVivienda.BANO);
        obra obra2 = new obra(vivienda2,mano2, vivienda.estanciasVivienda.BALCON);
        obra obra3 = new obra(vivienda3,mano3, vivienda.estanciasVivienda.DORMITORIO);

        obra1.anadirMateriales(material5);
        obra1.anadirMateriales(material3);
        obra1.anadirMateriales(material1);

        obra2.anadirMateriales(material2);
        obra2.anadirMateriales(material1);

        obra3.anadirMateriales(material4);
        obra3.anadirMateriales(material3);

        obra1.mostrar_informacion();
        obra1.eliminarMateriales(1);
        vivienda1.eliminarEstancias(2);
        obra1.mostrar_informacion();

        System.out.println();
        System.out.println(material.getIVA());
        material.setIVA(26);
        System.out.println();
        System.out.println("Cambiado queda asi:");
        obra1.mostrar_informacion();
        System.out.println(material.getIVA());

    }
}
