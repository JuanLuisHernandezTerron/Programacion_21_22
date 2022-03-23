package U7.EjerciciosRepaso.Entregable21Tarde;

public class main {
    public static void main(String[] args) {
        Instituto instituto1 = new Instituto("Los Alamos");
        Unidad u1 = new Unidad("4A");
        Unidad u2 = new Unidad("6B");
        Unidad u3 = new Unidad("2C");
        alumno a1 = new alumno("Pedro","Jimene","2536485S",u1);
        alumno a2 = new alumno("Oscar","Alcala","2535675J",u1);
        alumno a3 = new alumno("Juanlu","Hernandez","7566485P",u3);
        alumno a4 = new alumno("Juanjo","Reina","2324485Z",u3);
        alumno a5 = new alumno("Ale","Molina","2535605S",u2);
        alumno a6 = new alumno("Sergio","Jimene","2158485H",u2);
        alumno a7 = new alumno("Abraham","Jimene","21216485L",u3);
        alumno a8 = new alumno("Ivan","Ortiz","2536365F",u2);

        instituto1.addAlumnoUnidad(a1,u1);
        instituto1.addAlumnoUnidad(a2,u1);
        instituto1.addAlumnoUnidad(a3,u3);
        instituto1.addAlumnoUnidad(a4,u3);
        instituto1.addAlumnoUnidad(a5,u2);
        instituto1.addAlumnoUnidad(a6,u2);
        instituto1.addAlumnoUnidad(a7,u3);
        instituto1.addAlumnoUnidad(a8,u2);

        instituto1.mostrarTodosLosAlumnosOrdenados();
    }
}

