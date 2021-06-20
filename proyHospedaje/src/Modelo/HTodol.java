/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Estudiante
 */
public class HTodol extends Hospedaje{

    public HTodol(String ref, int cDias, int cPersonas, Persona huesped, Fecha fl) {
        super(ref, cDias, cPersonas, huesped, fl);
    }

    public HTodol() {
        super();
    }

    @Override
    public double valorHospedaje() {
        double valor=170000,total;
        total=cPersonas*cDias*valor;
        
        return total;
    }
    
    
}
