package ejemplo;

public class VentaConCheque extends Venta{
    private String banco;
    private String numeroCheque;

    public void imprimir(){
        super.imprimir();
        System.out.println("Banco: " +banco);
        System.out.println("Número de cheque: " +numeroCheque);
    }

    //Construct
    public VentaConCheque(double monto, String banco, String numero){
        super(monto);
        this.banco = banco;
        this.numeroCheque = numero;
    }
    //getter and setter

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }
}
