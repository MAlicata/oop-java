public class MiPrimeraClase {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Rectangulo r1 = new Rectangulo();
        r1.altura = 10;
        r1.base = 20;
        double area = r1.altura * r1.base;
        r1.mostrar();
        System.out.println(r1.calcularArea());

        //objeto circulo
        Circulo c1 = new Circulo();
        c1.radio = 10;
        c1.mostrarCirculo();
        System.out.println("El area del circulo es: "+c1.getArea());


        // Concepto de referencia a un objeto
        System.out.println("Concepto de referenmcia a un objeto");
        Circulo c5 = new Circulo();
        c5.radio = 100;
        Circulo c6 = c5;
        c6.radio = 200;
        // c5 y c6 comparten la misma referencia de memoria, es decir que c5 tendra un radio de 200
        System.out.println("El circulo c5 tiene: ");
        c5.mostrarCirculo();
        System.out.println("El circulo c6 tiene");
        c6.mostrarCirculo();

    }
}
