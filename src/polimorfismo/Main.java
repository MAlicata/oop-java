package polimorfismo;

public class Main {
    public static void main(String[] args) {

        Cuadrado c = new Cuadrado("rojo", 10);
        //c.dibujar();
        //System.out.println();
        Rectangulo r = new Rectangulo(6, 3);
        //r.dibujar();

        //System.out.println();
        TrianguloRectangulo tr = new TrianguloRectangulo(3, 6);
        //tr.dibujar();

        Figura[] figuras = new Figura[3];
        figuras[0] = c;
        figuras[1] = r;
        figuras[2] = tr;

        //polimorfismo
        for(int i = 0; i< figuras.length; i++){
            Figura f = figuras[i];
            f.dibujar();
            System.out.println();
        }
    }
}
