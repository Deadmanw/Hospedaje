/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package Control;

import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


 *
 * 
 
public class ControladorPro implements ActionListener {

    frmP2 frmP;
    frmConsulHosp frmLC;
    frmRegCli frmC;
    
    Reporte objR;
    ClienteDAO cliDAO;

    public ControladorPro(frmP2 frfrmConsulHospnsul frmconcli, frmRegCli frmRC, Reporte objR) {
        this.frmP = frmP;
        this.frmLC = frmconcli;
        this.frmC = frmRC;
        this.objR = objR;
    }

    public ControladorPro() {
        this.frmP = new frmP2();
        this.frmLfrmConsulHosprmConsul();
        this.frmC = new frmRegCli();
        this.objR = new Reporte();
        frmC.getBtnReg().addActionListener(this);
        frmP.getEscritorio().add(frmC);
        frmP.getEscritorio().add(frmLC);
        frmP.getMnuRegCli().addActionListener(this);
        frmP.getMnuRecaudo().addActionListener(this);
        frmP.getMnuCli().addActionListener(this);
        frmP.getMnuSalir().addActionListener(this);
        frmC.getBtnReg().addActionListener(this);
        frmC.getBtnPdf().addActionListener(this);
        frmC.getBtnPdf().setEnabled(false);

    }

    public void iniciar() {
        frmP.setTitle("Hotel Descanzo Feliz");
        frmP.setVisible(true);
        this.frmC.getButtonGroup1().add(frmC.getRbnEstandar());
        this.frmC.getButtonGroup1().add(frmC.getRbnTodoI());
        this.frmC.getRbnEstandar().setSelected(true);
        this.frmC.getSpnPers().setValue(1);
        this.frmC.getSpnDias().setValue(1);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.frmC.getLblfac().setText("6-" + (int) (1 + Math.random() * 9999));
        if (ae.getSource().equals(frmP.getMnuRegCli())) {

            frmC.setVisible(true);
        }
        if (ae.getSource().equals(frmP.getMnuCli())) {

            //enviarListaTabla(listaClie, frmCCli.getTblClientes());
            //enviarArchTabla("clientes", frmCCli.getTblClientes());
            frmLC.getTblHospedajes().setModel(cliDAO.consulta());
            frmLC.setVisible(true);
        }
        if (ae.getSource().equals(frmP.getMnuSalir())) {
            int resp = JOptionPane.showConfirmDialog(frmP,
                    "Desea sali?", "salir",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                System.exit(1);
            }

        }
        if (ae.getSource().equals(frmC.getBtnReg())) {
            try {
                Conexion con = new Conexion();
                Persona p = new Persona(
                        frmC.getTxtId().getText(),
                        frmC.getTxtNom().getText(),
                        frmC.getTxtTel().getText());

                if (frmC.getRbnEstandar().isSelected()) {
                    Hospedaje h = new HEstandar();
                    h.setRef(String.valueOf(frmC.getLblfac().getText()));
                    h.setHuesped(p);
                    h.setcDias((int) frmC.getSpnDias().getValue());
                    h.setcPersonas((int) frmC.getSpnPers().getValue());
                    h.valorHospedaje();
                    objR.getListaH().add(h);
                    con.EscribeDatos(h.datosH());
                    //cliDAO.setH((HEstandar) h);//encapsula el objeto cliente y hace las acciones sobre la bd
                    //JOptionPane.showMessageDialog(frmC, cliDAO.insertar());
                    JOptionPane.showMessageDialog(frmC, "Datos Registrados" + h.toString());
                    frmC.getBtnPdf().setEnabled(true);
                } else {
                    Hospedaje ht = new HTodol();
                    ht.setRef(String.valueOf(frmC.getLblfac().getText()));
                    ht.setHuesped(p);
                    ht.setcDias((int) frmC.getSpnDias().getValue());
                    ht.setcPersonas((int) frmC.getSpnPers().getValue());
                    
                    objR.getListaH().add(ht);
                    con.EscribeDatos(ht.datosH());
                    //cliDAO.setHt((HTodol) ht);//encapsula el objeto cliente y hace las acciones sobre la bd
                    //JOptionPane.showMessageDialog(frmC, cliDAO.insertar());
                    JOptionPane.showMessageDialog(frmC, "Datos Registrados" + ht.toString());
                    frmC.getBtnPdf().setEnabled(true);
                }

            } catch (IOException ex) {
                String dato[] = ex.getMessage().split(":");
                JOptionPane.showMessageDialog(frmP, "Error : Se ingreso "
                        + "texto en dato numerico: " + dato[1]);
            }

        }

    }

      public void enviarListaTabla(ArrayList<Cliente> lista, JTable table) {

        DefaultTableModel plantilla = (DefaultTableModel) table.getModel();
        for (int i = 0; i < lista.size(); i++) {
            plantilla.addRow(lista.get(i).datos());
        }

    }
    public void enviarArchTabla(JTable table) {
        try {
            Conexion con = new Conexion();
            String clientes[] = con.leerDatos().split("\n");
            DefaultTableModel plantilla = (DefaultTableModel) table.getModel();
            for (int i = 1; i < clientes.length; i++) {
                Object datos[] = clientes[i].split(";");
                plantilla.addRow(datos);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frmP, "Error : al intentar usar archivo.... ");
        }

    }

}
*/