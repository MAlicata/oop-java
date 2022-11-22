package ejemplo;

public class Main {
    public static void main(String[] args) {
        Fecha f = new Fecha(22, 11, 2022);
        System.out.println(f);
        Fecha f2 = new Fecha();
        System.out.println(f2);

        Venta v = new Venta();
        v.setMonto(200);
        v.imprimir();

        Caja caja = new Caja(1);
        caja.agregarVenta(new Venta(100));
        caja.agregarVenta(new VentaConCheque(200, "Bank", "4554-1111-1111-7777"));
        caja.agregarVenta(new VentaConTarjeta(300, "444-000-0000-1111"));
        caja.mostrarVentas();
    }
}
