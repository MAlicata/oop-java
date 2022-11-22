package ejemplo;

public class Venta {
    private Fecha f; //composicion cuando creo la venta se crea la fecha
    private double monto;

    public void imprimir(){
        System.out.println("Fecha:  " + f);
        System.out.println("Monto: " +monto);
    }

    //getter amd setter


    public Fecha getF() {
        return f;
    }

    public void setF(Fecha f) {
        this.f = f;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    //Constructor
     public Venta(Fecha f, double monto) {
        this.f = f;
        this.monto = monto;
    }
    public Venta(double monto) {
        f = new Fecha();
        this.monto = monto;
    }
    public Venta(){
         f = new Fecha();
         monto = 0;
    }
}
