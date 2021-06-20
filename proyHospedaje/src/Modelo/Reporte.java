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
        
    }
    public double Recaudo_ ()
    {
        double Total =0;
         for (int i = 0; i < this.ListaH.size(); i++) {
            Total=Total+ListaH.get(i).valorHospedaje();
        }
         return Total;
    }
     
    
}
