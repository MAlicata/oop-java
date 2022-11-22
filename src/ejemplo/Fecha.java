package ejemplo;

import java.util.Calendar;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public String toString(){
        return dia + " / " + mes + " / " + año ;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Fecha(){
        dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        mes = Calendar.getInstance().get(Calendar.MONTH);
        año = Calendar.getInstance().get(Calendar.YEAR);
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
}
