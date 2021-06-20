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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class Controlador implements ActionListener {

    frmPrincipal objV;
    Conexion con;
    Reporte objR;

    public Controlador(frmPrincipal objV, Conexion con, Reporte objR) {
        this.objV = objV;
        this.con = con;
        this.objR = objR;
    }

    public Controlador() throws IOException {
        this.con = new Conexion();
        this.objR = new Reporte();
        this.objV = new frmPrincipal();
        this.objV.getBtnRegistrar().addActionListener(this);
        this.objV.getCmbHosp().addActionListener(this);
        this.objV.getCmbHosp().addActionListener(this);
        this.objV.getTxtDias().addActionListener(this);
        this.objV.getTxtId().addActionListener(this);
        this.objV.getTxtNom().addActionListener(this);
        this.objV.getTxtPer().addActionListener(this);
        this.objV.getTxtTel().addActionListener(this);

    }

    public void iniciar() {
        objV.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        enviarArchTabla(objV.getTblHospedajes());
        objV.getLblRef().setText("5" + (int) (1 + Math.random() * 9999));

        if (e.getSource().equals(objV.getBtnRegistrar())) {
            try{
            Persona p = new Persona();
            p.setId(objV.getTxtId().getText());
            p.setNom(objV.getTxtNom().getText());
            p.setTel(objV.getTxtTel().getText());

            int op;
            op = objV.getCmbHosp().getSelectedIndex()-1;

            switch (op) {

                case 1: {

                    HEstandar he = new HEstandar();
                    he.setHuesped(p);
                    he.getFl().setAa(10);
                    he.setcDias(Integer.parseInt(objV.getTxtDias().getText()));
                    he.setcPersonas(Integer.parseInt(objV.getTxtPer().getText()));
                    objR.getListaH().add(he);
                    
                        con.EscribeDatos(he.datosH());
                    

                    break;
                }
                case 2: {

                    HTodol ht = new HTodol();
                    ht.setHuesped(p);
                    ht.getFl().setAa(11);
                    ht.setcDias(Integer.parseInt(objV.getTxtDias().getText()));
                    ht.setcPersonas(Integer.parseInt(objV.getTxtPer().getText()));
                   objR.getListaH().add(ht);
                   con.EscribeDatos(ht.datosH());
                   break;
                    
                }

            }

            // String datost=" ";
            // datost=con.leerDatos();
            //     enviarArchTabla(datost,objV.getTblHospedajes());
        }   catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void enviarArchTabla(JTable table) {
        try {

            String s[] = con.leerDatos().split("\n");
            DefaultTableModel plantilla = (DefaultTableModel) table.getModel();
            for (int i = 1; i < s.length; i++) {
                Object datos[] = s[i].split(";");
                plantilla.addRow(datos);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(objV, "Error : al intentar usar archivo.... ");
        }

    }

}
