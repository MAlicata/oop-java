package ejemplo;

public class VentaConTarjeta extends Venta{
    private String numeroTarjeta;

    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de tarjeta de crédito: " + numeroTarjeta);
    }

    public VentaConTarjeta(double monto, String numeroTarjeta){
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
}
