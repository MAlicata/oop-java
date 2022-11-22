package herencia;

public abstract class Persona {
    private String nombre;
    private int edad;

    public void mostrar(){
        System.out.println("Mi nombres es: " +getNombre());
        System.out.println("Mi edad es: " +getEdad());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(){
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
