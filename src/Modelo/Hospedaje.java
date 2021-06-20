/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JLabel;

/**
 *
 * @author Daniel camilo Rodriguez Vargas
 */
public abstract class Hospedaje {
    
    /**
     * se define la variable refencia como protegida y String
     */
    protected String ref;

    /**
     * se define la variable cantidad de dias como int
     */
    protected int cDias,

    /**
     * se define la varible cantidad de personas como int 
     */
    cPersonas;

    /**
     * se define el objeto huesped probeniente de la clase Huesped
     */
    protected Persona huesped;

    /**
     * se define el objeto fecha probeniente de la clase Fecha
     */
    protected Fecha fl;

    /**
     * Constructor parametrico
     * @param ref String
     * @param cDias int
     * @param cPersonas int 
     * @param huesped Persona();
     * @param fl Fecha();
     */
    public Hospedaje(String ref, int cDias, int cPersonas, Persona huesped, Fecha fl) {
        this.ref = ref;
        this.cDias = cDias;
        this.cPersonas = cPersonas;
        this.huesped = huesped;
        this.fl = fl;
    }
  
    /**
     *Constructor basico donde se define el valor de cada una de las variables
     */
    public Hospedaje() {
        this.ref = "";
        this.cDias = 0;
        this.cPersonas = 0;
        this.huesped = new Persona();
        this.fl = new Fecha();
    }

    /**
     *metodo que retorna el la referencia
     * @return String
     */
    public String getRef() {
        return ref;
    }

    /**
     *metodo que asigan el valor a la referencia
     * @param ref
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     *metodo que retorna el valor de cantidad de dias
     * @return int
     */
    public int getcDias() {
        return cDias;
    }

    /**
     * metodo que asigna el valor a la cantidad de dias
     * @param cDias
     */
    public void setcDias(int cDias) {
        this.cDias = cDias;
    }

    /**
     * metodo que retorna el valor de cantidad de personas
     * @return int
     */
    public int getcPersonas() {
        return cPersonas;
    }

    /**
     * metodo que asigna el valor a cantidad de personas
     * @param cPersonas
     */
    public void setcPersonas(int cPersonas) {
        this.cPersonas = cPersonas;
    }

    /**
     * metodo que retorna los datos del huesped desde la clase persona
     * @return ToString
     */
    public Persona getHuesped() {
        return huesped;
    }

    /**
     * metodo que asigna los datos al huesped en la clase persona
     * @param huesped
     */
    public void setHuesped(Persona huesped) {
        this.huesped = huesped;
    }

    /**
     * metodo que retorna la fecha desde la clase Fecha
     * @return ToString
     */
    public Fecha getFl() {
        return fl;
    }

    /**
     *metodo que asigna la fecha a la clase Fecha
     * @param fl
     */
    public void setFl(Fecha fl) {
        this.fl = fl;
    }

    
    @Override
    public String toString() {
        return  "Referencia: " + ref + 
                "\n Cantidad Dias: " + cDias +
                "\n Cantidad Personas: " + cPersonas + 
                "\n Huesped: " + huesped + 
                "\n Fecha: =" + fl;
    }

    
    
    /**
     * metodo abstracto para calcular el valor del hospedaje
     * @return double
     */
    public abstract double valorHospedaje();
    public abstract String datosH();

    
    
    
    
}
