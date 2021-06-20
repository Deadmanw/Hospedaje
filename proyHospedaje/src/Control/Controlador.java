/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.*;
import Vista.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Controlador implements ActionListener{
 
    frmPrincipal objV;
    Conexion con;  

    public Controlador(frmPrincipal objV, Conexion con) {
        this.objV = objV;
        this.con = con;
    }
    
    public Controlador() throws IOException {
        this.con = new Conexion();
        this.objV= new frmPrincipal();
        this.objV.getBtnRegistrar().addActionListener(this);
        this.objV.getCmbHosp().addActionListener(this);
        this.objV.getCmbHosp().addActionListener(this);
        this.objV.getTxtDias().addActionListener(this);
        this.objV.getTxtId().addActionListener(this);
        this.objV.getTxtNom().addActionListener(this);
        this.objV.getTxtPer().addActionListener(this);
        this.objV.getTxtTel().addActionListener(this);
        
    } 
    public void iniciar(){
      objV.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(objV.getBtnRegistrar())) {
            try {
                Conexion con = new Conexion();
                Persona cli = new Persona(
                        objV.getTxtId().getText(),
                        objV.getTxtNom().getText(),
                        objV.get
                        /*Double.parseDouble(frmC.getTxtSalario().getText()),
                        frmC.getChbProp().isSelected(),
                        frmC.getTxtId().getText(),
                        frmC.getTxtNom().getText(),
                        frmC.getTxtTel().getText()*/
                );
                listaClie.add(cli);
                con.EscribeDatos("clientes",cli.datosFormat());
                JOptionPane.showMessageDialog(frmC, "Datos Registrados" + cli.toString());
                frmC.getBtnPdf().setEnabled(true);
            } catch (NumberFormatException ex) {
                String dato[] = ex.getMessage().split(":");
                JOptionPane.showMessageDialog(frmP, "Error : Se ingreso "
                        + "texto en dato numerico: " + dato[1]);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frmP, "Error : al intentar usar archivo.... ");
                        
            } catch (EnterFormatExeption ex) {
                JOptionPane.showMessageDialog(frmP, ex.toString());
            }

        }
    }
    
    
    
}
