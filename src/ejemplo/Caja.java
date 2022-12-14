package ejemplo;

import java.util.ArrayList;

public class Caja {
    private int numero;
    private ArrayList<Venta> ventas = new ArrayList<Venta>();

    public Caja(int numero){
        this.numero = numero;
    }
    public void agregarVenta(Venta v){
        ventas.add(v);
    }
    public void mostrarVentas(){
        double total = 0;
        for (int i=0; i< ventas.size(); i++) {
            total += ventas.get(i).getMonto();
            // en la linea de abajo definimos polimorfismo
            ventas.get(i).imprimir();
            System.out.println();
        }
        System.out.println("Total de Ventas del dia: " +total);
    }
}
