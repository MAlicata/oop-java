package encapsulamiento;

public class Main {
    public static void main(String[] args) {

        Fecha f = new Fecha(); //instanciacion de un objeto
        f.setDia(21);
        f.setMes(11);
        f.setMes(31);
        f.setAño(2022);
        System.out.println(f.toString());
        System.out.println(f.getAño());
        /*Persona p = new Persona();
        p.setEdad(18);
        System.out.println(p.getEdad());
        p.setNombre("Matias");
        System.out.println(p.getNombre());*/

       /* java.awt.Frame ventana = new java.awt.Frame();
        ventana.setTitle("Hola Mundo!!!");
        ventana.setSize(400, 400);
        ventana.setVisible(true);*/

        Persona p3 = new Persona();
        p3.setNombre("Matias");
        p3.setApellido("Alicata");
        System.out.println(p3.getFullName());




    }
}
