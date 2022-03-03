package U5.EjerciciosRepaso.HerenciasInterfaces2021;

public class main {
    public static void main(String[] args) {
        juego juego1 = new juego(1996,"Sevilla");
        pais pais1 = new pais("España",150);
        pais pais2 = new pais("España",180);
        Atleta atlet1 = new Atleta("Jose",25,"500 lisos");
        Baloncesista balon1 = new Baloncesista("Pedro",35,1.80);
        atletismo atletismo1 = new atletismo("Atletismo","San Pablo",5);


        balon1.hacerjuramento();
        atlet1.hacerjuramento();
        balon1.encestar();
        atlet1.correr();
        atletismo1.insertarParticipante(atlet1);
        atletismo1.mostrarArrayAtleta();
        juego1.insertarPais(pais1);
        juego1.insertarPais(pais2);
        atletismo1.eliminarParticipante(atlet1);
        atletismo1.mostrarArrayAtleta();

        juego1.mostrarPaisesParaCeremonia();




    }
}
