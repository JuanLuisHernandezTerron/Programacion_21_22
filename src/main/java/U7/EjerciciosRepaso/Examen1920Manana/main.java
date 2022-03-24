package U7.EjerciciosRepaso.Examen1920Manana;

public class main {
    public static void main(String[] args) {
        concurso c1 = new concurso("Concurso1","Sevilla");
        propietario p1 = new propietario("Pedro","Terron","España");
        propietario p2 = new propietario("Oscar","Alcala","España");
        propietario p3 = new propietario("Juanjo","Ruiz","España");
        perro perro1 = new perro("Curro",2,5.15,true,p1, perro.raza.HUSKI);
        perro perro2 = new perro("Laika",5,7.15,true,p1, perro.raza.PASTORALEMAN);
        perro perro3 = new perro("Asuca",8,5.55,false,p2, perro.raza.PASTORALEMAN);
        perro perro4 = new perro("Johny Walker",1,12.15,true,p2, perro.raza.HUSKI);
        perro perro5 = new perro("Turka",2,13.15,true,p3, perro.raza.HUSKI);
        perro perro6 = new perro("Barcelo",3,10.15,true,p3, perro.raza.PASTORALEMAN);

        c1.addDog(perro1,perro1.getRazaPerro());
        c1.addDog(perro2,perro2.getRazaPerro());
        c1.addDog(perro3,perro3.getRazaPerro());
        c1.addDog(perro4,perro4.getRazaPerro());
        c1.addDog(perro5,perro5.getRazaPerro());
        c1.addDog(perro6,perro6.getRazaPerro());
        System.out.println();
        c1.ownerDogs(0);
        System.out.println();
        c1.disqualifyDog(perro1);
        System.out.println();
        c1.perrosPorPeso(perro.raza.HUSKI);
        System.out.println();
        c1.perrosPorEdad(perro.raza.PASTORALEMAN);
        System.out.println();
        c1.guardarFichero();

    }
}
