/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author dan5-
 */
public class habitacion {
    private int num;
    private String descr;

    public habitacion(int num, String descr) {
        this.num = num;
        this.descr = descr;
    }
    public habitacion() {
        this.num = 0;
        this.descr = "";
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return  "num=" + num + ", descr=" + descr ;
    }
    
    
    
}
