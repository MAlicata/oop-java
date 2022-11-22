package herencia;

public class Main {
    public static void main(String[] args) {


    //Persona p = new Persona("Matias", 27);
    //System.out.println(p.getNombre());

    Alumno a = new Alumno("Matias", 27, 11111, "sistemas");

    Empleado e = new Empleado("Jesus", 28, 100);
    //System.out.println("Nombres de empleados: " +e.getNombre());

        a.mostrar();
        e.mostrar();
    }
}
