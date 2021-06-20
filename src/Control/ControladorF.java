/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.EnterFormatExeption;

/**
 *
 * @author dan5-
 */
public class ControladorF implements ActionListener, Runnable {

    frmP2 frmE;
    frmConsulCLiReg frmCCR;
    frmConsulHosp frmCCH;
    frmHabitacion frmHa;
    frmRegCli frmRC;
    frmRegHosp frmRH;
    Reporte objR;
    Fecha objf;
    Hora objh;
    Conexion objc;
    ConexionBD objcbd;
    ClienteDAO objcldao;
    Thread hilo;
    ArrayList<Persona> listaClie;

    public ControladorF(frmP2 frmE, Thread hilo, frmConsulCLiReg frmCCR, frmConsulHosp frmCCH, frmRegCli frmRC, frmRegHosp frmRH, Reporte objR, Fecha objf, Hora objh, Conexion objc, ConexionBD objcbd, ClienteDAO objcldao) {
        this.frmE = frmE;
        this.frmCCR = frmCCR;
        this.frmCCH = frmCCH;
        this.frmRC = frmRC;
        this.frmRH = frmRH;
        this.objR = objR;
        this.objf = objf;
        this.objh = objh;
        this.objc = objc;
        this.objcbd = objcbd;
        this.hilo = hilo;
        this.objcldao = objcldao;
    }

    public ControladorF() throws IOException {
         this.listaClie = new ArrayList<Persona>();
        this.frmE = new frmP2();
        this.frmCCR = new frmConsulCLiReg();
        this.frmHa = new frmHabitacion();
        this.frmCCH = new frmConsulHosp();
        this.frmRC = new frmRegCli();
        this.frmRH = new frmRegHosp();
        this.objR = new Reporte();
        this.objf = new Fecha();
        this.objh = new Hora();
        this.objc = new Conexion();
        this.objcbd = new ConexionBD();
        this.objcldao = new ClienteDAO();
        this.hilo = new Thread(this);
        this.frmE.getEscritorio().add(frmCCH);
        this.frmE.getEscritorio().add(frmCCR);
        this.frmE.getEscritorio().add(frmRC);
        this.frmE.getEscritorio().add(frmRH);
        this.frmE.getEscritorio().add(frmHa);
        this.frmE.getMnuRegCli().addActionListener(this);
        this.frmE.getMnuRegHos().addActionListener(this);
        this.frmE.getMnuConCli().addActionListener(this);
        this.frmE.getMnuHabitaciones().addActionListener(this);
        this.frmE.getMnuConHosp().addActionListener(this);
        this.frmE.getMnuSalir().addActionListener(this);
        this.frmE.getMnuAyuda().addActionListener(this);
        this.frmRC.getBtnRegCli().addActionListener(this);
        this.frmRC.getBtnPdfRegCli().addActionListener(this);
        this.frmRC.getBtnPdfRegCli().setEnabled(false);
        this.frmRH.getBtnRegistrar().addActionListener(this);
        this.frmRH.getBtnPdfRegHosp().addActionListener(this);
        this.frmRH.getBtnPdfRegHosp().setEnabled(false);
        this.frmCCH.getBtnDescargarHosp().addActionListener(this);
        this.frmCCH.getBtnEliminar().addActionListener(this);
        this.frmCCH.getBtnModificar().addActionListener(this);
        this.frmCCR.getBtnDescargaPdfCli().addActionListener(this);
        this.frmCCR.getBtnEliminar().addActionListener(this);
        this.frmCCR.getBtnModificar().addActionListener(this);
    }

    public void iniciar() {
        frmE.setTitle("Hotel Descanzo Feliz");
        frmE.setVisible(true);
        hilo.start();
        this.frmRH.getSpnCDias().setValue(1);
        this.frmRH.getSpnCPer().setValue(1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frmRH.getLblFecha().setText(objf.toString());
        frmRH.getLblRef().setText("5" + (int) (1 + Math.random() * 9999));
        if (e.getSource().equals(frmE.getMnuRegHos())) {

            frmRH.setVisible(true);
        }
        if (e.getSource().equals(frmE.getMnuRegCli())) {

            frmRC.setVisible(true);
        }
        if (e.getSource().equals(frmE.getMnuSalir())) {
            int resp = JOptionPane.showConfirmDialog(frmE,
                    "Desea sali?", "salir",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                System.exit(1);
            }

        }
        if (e.getSource().equals(frmE.getMnuAyuda())) {
            JOptionPane.showMessageDialog(frmE, "Programa hecho por:\n"
                    + " Daniel camilo Rosriguez vargas\n"
                    + " Codigo 20162578120");
        }
        if(e.getSource().equals(frmE.getMnuHabitaciones())) {
        frmHa.setVisible(true);
        }
        if(e.getSource().equals(frmE.getMnuConCli())){
        frmCCR.setVisible(true);
        }
        if(e.getSource().equals(frmE.getMnuConHosp())){
        frmCCH.setVisible(true);
        }
        
        if (e.getSource().equals(frmRC.getBtnRegCli())) {
            try {
                Conexion con = new Conexion();
                Persona cli = new Persona(
                        
                        
                        frmRC.getTxtID().getText(),
                        frmRC.getTxtNom().getText(),
                        frmRC.getTxtTel().getText()
                );
                listaClie.add(cli);
                con.EscribeDatos(cli.datosFormat());
                objcldao.setoCli(cli);//encapsula el objeto cliente y hace las acciones sobre la bd
                JOptionPane.showMessageDialog(frmRC, objcldao.insertar());
                JOptionPane.showMessageDialog(frmRC, "Datos Registrados" + cli.toString());
                frmRC.getBtnPdfRegCli().setEnabled(true);
            } catch (NumberFormatException ex) {
                String dato[] = ex.getMessage().split(":");
                JOptionPane.showMessageDialog(frmE, "Error : Se ingreso "
                        + "texto en dato numerico: " + dato[1]);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frmE, "Error : al intentar usar archivo.... ");
                        
            }

        }
        
        
    }

    @Override
    public void run() {
        while (true) {
            frmE.getLblHora().setText(objh.toString());
            frmE.getLblFecha().setText(objf.toString());
            objh.incSS();
            try {
                hilo.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControladorF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
