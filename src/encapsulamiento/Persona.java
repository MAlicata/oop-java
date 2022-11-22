package encapsulamiento;

public class Persona {
    private int edad;
    private String nombre;
    private String apellido;

    public String getFullName(){
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido;
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int e){
        edad = e;
    }
    public int getEdad(){
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
