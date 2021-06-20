/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author dsistec5
 */
public class Fecha {

    private int dd, mm, aa;

    public Fecha(int dd, int mm, int aa) {
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }

    public Fecha() {
        Calendar fecha = Calendar.getInstance();
        this.dd = fecha.get(Calendar.DAY_OF_MONTH);
        this.mm = fecha.get(Calendar.MONTH);
        this.aa = fecha.get(Calendar.YEAR);
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }
    
    @Override
    public String toString() {
        return dd + "/" + mm + "/" + aa;
    }

}
