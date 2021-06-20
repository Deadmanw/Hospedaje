/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class EnterFormatExeption extends Exception{
    private int NroE;
    private String msj;

    public EnterFormatExeption(int NroE ) {
        this.NroE = NroE;
        switch(NroE){
            case 100:{
                this.msj = " Error de Fromato de entrada.....";
                    break;
            }
            case 101:{
                 this.msj = " Datos nulos.....";
                    break;
            }
            case 102:{
                 this.msj = " Solo se admiten Letras.....";
                    break;
            }
        }
       
            
    }
    public EnterFormatExeption( ) {
        this.NroE = 100;
        this.msj = " Error de Fromato de entrada.....";
            
    }

    public int getNroE() {
        return NroE;
    }

    public void setNroE(int NroE) {
        this.NroE = NroE;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    @Override
    public String toString() {
        return "Error numero " + NroE + " Generado por " + msj ;
    }
    
    
   
}
