package herencia;

public class Alumno extends Persona{
    private int legajo;
    private String carrera;

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Alumno(String nombre, int edad, int legajo, String carrera) {
        super(nombre, edad);
        this.legajo = legajo;
        this.carrera = carrera;
    }
}
