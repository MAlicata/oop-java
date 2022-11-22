public class Rectangulo {
    // tipos primitivos de datos en java
    // byte, short, int, long, float, double, char, boolean
    double base;
    double altura;

    public void mostrar(){
        System.out.println("base " +base+ ", " + "altura " + altura);
    }
    public double calcularArea(){
        return base*altura;
    }
}
