package herencia;

public class Empleado extends Persona{
    private double sueldo;

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Mi sueldo es: " +getSueldo());
    }
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }
}
