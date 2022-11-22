public class Circulo {
    double radio = 1;

    public void mostrarCirculo(){
        System.out.println("El radio del circulo es: " + radio+ "CON UN AREA DE:" + getArea());
    }
    public double getArea(){
        return 2*Math.PI*radio;
    }
}
