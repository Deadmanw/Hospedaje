/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONIAFAMILY
 */
public class ClienteDAO {
    HEstandar h;
    HTodol ht;
    Persona oCli;

    public ClienteDAO(HEstandar h, HTodol ht,Persona oCli) {
        this.h = h;
        this.ht = ht;
        this.oCli=oCli;
    }
    public ClienteDAO() {
        this.h = new HEstandar();
        this.ht = new HTodol();
        this.oCli= new Persona();
    }

    public HEstandar getH() {
        return h;
    }

    public void setH(HEstandar h) {
        this.h = h;
    }

    public HTodol getHt() {
        return ht;
    }

    public void setHt(HTodol ht) {
        this.ht = ht;
    }

    public Persona getoCli() {
        return oCli;
    }

    public void setoCli(Persona oCli) {
        this.oCli = oCli;
    }

    
    
    
    public DefaultTableModel consulta(){// con esto todo queda combertido a una tabla "deafultablemode"
        DefaultTableModel plantilla = new DefaultTableModel();
        ConexionBD objCon= new ConexionBD();
        try {
            objCon.conectar();
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet datos= consulta.executeQuery("select * from clientes"); //conjunto de datos que me devuelve una hoja de calculo con cada uno de los campos
            //de los datos que necesitamos y hace la consulta de de la tabla clientes y retorna una tabla parecida a una hoja de calculo con sus registros
            ResultSetMetaData campos= datos.getMetaData();
            for (int i = 1; i <= campos.getColumnCount(); i++){// cuantas columnas tiene para agregarselas a la platilla
              plantilla.addColumn(campos.getColumnName(i));           
            }
           while (datos.next()){
            Object[] fila = new Object[campos.getColumnCount()];
            for (int i = 0; i < campos.getColumnCount(); i++){
              fila[i]=datos.getObject(i+1);
             }
             plantilla.addRow(fila);
            }// todos los datos estaran dentro de la platnilla
            datos.close();
            objCon.getConexion().close();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
      return plantilla;
    }
   public String insertar(){
        String mensaje=""; 
        try {
            ConexionBD conexion=new ConexionBD();
            PreparedStatement consulta = null;
            conexion.conectar();
            String comando= "insert into persona values(?,?,?)";
            consulta=conexion.getConexion().prepareStatement(comando);
            consulta.setString(1,oCli.getId());
            consulta.setObject(2,oCli.getNom());
            consulta.setObject(3,oCli.getTel());
            consulta.execute();
            mensaje="Registro BD exitoso...";
            consulta.close();
            conexion.getConexion().close();
        } catch (SQLException ex) {
           mensaje="Error al intentar insertar en BD...\n"+ex;
        }
      return mensaje;  
    }

}
