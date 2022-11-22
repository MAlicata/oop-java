package encapsulamiento;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAño(){
        return año;
    }

    public void setDia(int d){
        dia = d;
    }
    public void setMes(int m){
        if(m >= 1 && m<=12){
            mes = m;
        }else{
            System.out.println("mes incorrecto");
        }
    }
    public void setAño(int a){
        año = a;
    }
    public String toString(){
        return dia + "/" + mes + "/" + año ;
    }
}
