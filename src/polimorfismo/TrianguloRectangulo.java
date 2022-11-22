package polimorfismo;

public class TrianguloRectangulo extends Figura{
    private int base;
    private int altura;

    @Override
    public void dibujar() {
        for(int i=0; i<= base; i++){
            for(int j=0; j<= altura; j++){
               if (j <= i) System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public TrianguloRectangulo(){}

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public TrianguloRectangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
