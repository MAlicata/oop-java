package polimorfismo;

public abstract class Figura {
    private String color;

    /*public void dibujar(){
        System.out.println("No se dibujarme");
    }*/
    public abstract void dibujar();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Figura(String color) {
        this.color = color;
    }
    public Figura(){

    }
}
