/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Reporte {
    ArrayList<Hospedaje> ListaH;

    public Reporte(ArrayList<Hospedaje> ListaHospedaje) {
        this.ListaH = ListaHospedaje;
    }
    public Reporte() {
        this.ListaH=new ArrayList<>();
        
    }

    public ArrayList<Hospedaje> getListaH() {
        return ListaH;
    }

    public void setListaH(ArrayList<Hospedaje> ListaH) {
        this.ListaH = ListaH;
    }
    public String datosHospedaje() {
        String datos="";
        for (int i = 0; i < ListaH.size(); i++) {
            datos+= ListaH.get(i).toString()+"\n";
            
        }
        return  datos ;
    }
    public double Recaudo ()
    {
        double Total =0;
         for (int i = 0; i < this.ListaH.size(); i++) {
            Total=Total+ListaH.get(i).valorHospedaje();
        }
         return Total;
    }
    public void add(HEstandar he) {
        
    }
    
    public void add(HTodol ht) {
        
    }
     
    
}
