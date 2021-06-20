/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 
 */
public class Persona {
   private String id, nom, tel;

    public Persona(String id, String nom, String tel) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
    }
    public Persona() {
        this.id = "";
        this.nom = "";
        this.tel = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String datosFormat(){
    return  id+","+nom+","+tel;
    }
    @Override
    public String toString() {
        return  "id=" + id + ", nom=" + nom + ", tel=" + tel ;
    }
    
}
