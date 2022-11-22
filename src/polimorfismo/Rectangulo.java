package polimorfismo;

public class Rectangulo extends Figura{
    private int altura;
    private int base;

    public int getAltura() {
        return altura;
    }

    public Rectangulo(){}

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo(String color, int altura, int base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public void dibujar() {
        for(int i=0; i<= base; i++){
            for(int j=0; j<= altura; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
