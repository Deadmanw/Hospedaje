/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author Estudiante
 */
public class Hora {

    private int hh, mm, ss;

    public Hora(int hh, int mm, int ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }

    public Hora() {
        Calendar hora = Calendar.getInstance();
        this.hh = hora.get(Calendar.HOUR);
        this.mm = hora.get(Calendar.MINUTE);
        this.ss = hora.get(Calendar.SECOND);
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getSs() {
        return ss;
    }

    public void setSs(int ss) {
        this.ss = ss;
    }

    public void incSS() {
        if (ss < 59) {
            ss++;
        } else {
            ss = 0;
            if (mm < 59) {
                mm++;
            } else {
                mm = 0;
                if (hh < 12) {
                    hh++;
                } else {
                    hh = 1;
                }

            }
        }
    }

    @Override
    public String toString() {
        return hh + ":" + mm + ":" + ss;
    }

}
