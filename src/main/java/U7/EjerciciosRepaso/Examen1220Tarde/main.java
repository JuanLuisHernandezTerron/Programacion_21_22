package U7.EjerciciosRepaso.Examen1220Tarde;

public class main {
    public static void main(String[] args) {
        coronavirus c1 = new coronavirus();
        coronavirus c2 = new coronavirus();
        coronavirus c3 = new coronavirus();

        medico m1 = new medico("Jose","Ruiz","SanJuan");
        medico m2 = new medico("Oscar","Alcala","VirgenRocio");
        medico m3 = new medico("Juanlu","Hernandez","Hospital Vithas");

        paciente p1 = new paciente("Pedro",18,58.2,true,m1,0);
        paciente p2 = new paciente("LandoNorris",25,65.2,true,m1,0);
        paciente p3 = new paciente("FernandoAlonso",40,62.2,true,m2,1);
        paciente p4 = new paciente("Pedro De la Rosa",45,68.1,true,m2,1);
        paciente p5 = new paciente("Hulkenberg",34,61.2,true,m3,2);
        paciente p6 = new paciente("Verstappen",22,58.2,true,m3,2);

        c1.addPaciente(0,p1);
        c1.addPaciente(0,p2);
        c2.addPaciente(1,p3);
        c2.addPaciente(1,p4);
        c3.addPaciente(2,p5);
        c3.addPaciente(2,p6);
        c1.mostrarMapa();
        System.out.println();
        System.out.println("Se procede a borrar el paciente");
        c1.darDeAltaPaciente(p1);
        c1.mostrarMapa();
        System.out.println();
        c1.pacientesDeUnDoctor(1);
        System.out.println();
        c1.pacientePorEdad(1);
        c1.pacientePorPeso(1);
        c1.guardarDatos();
        c1.cargarDatos();






    }
}
