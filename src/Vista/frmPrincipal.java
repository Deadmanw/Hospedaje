/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Administrador
 */
public class frmPrincipal extends javax.swing.JFrame {


    public frmPrincipal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrar = new javax.swing.JButton();
        cmbHosp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblRecaudo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospedajes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblRef = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hostal un mundo Feliz\n");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 51, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 210, -1));

        cmbHosp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbHosp.setForeground(new java.awt.Color(51, 102, 255));
        cmbHosp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estándar", "Todo Incluido" }));
        cmbHosp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbHospItemStateChanged(evt);
            }
        });
        cmbHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHospActionPerformed(evt);
            }
        });
        getContentPane().add(cmbHosp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 156, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tipo de Hospedaje");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 28, 175, -1));

        lblRecaudo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRecaudo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblRecaudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 180, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("Total Recaudo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        tblHospedajes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblHospedajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Referencia", "Fecha", "Nombre Cliente", "Dias", "Personas", "Valor Hospedaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospedajes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 810, 90));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Identificación");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");

        txtNom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Teléfono");

        txtTel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Huésped:");

        txtPer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Personas");

        txtDias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Días");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(txtPer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(15, 15, 15)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 800, 110));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Referencia");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 20, 90, -1));

        lblRef.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRef.setForeground(new java.awt.Color(255, 0, 0));
        lblRef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 71, 30));

        lblfecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(102, 255, 102));
        lblfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 20, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Fecha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 57, -1));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHospActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_cmbHospActionPerformed

    private void cmbHospItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbHospItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHospItemStateChanged

    private void txtPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerActionPerformed

    private void txtDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    
    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public JComboBox<String> getCmbHosp() {
        return cmbHosp;
    }

    public void setCmbHosp(JComboBox<String> cmbHosp) {
        this.cmbHosp = cmbHosp;
    }

    public JLabel getLblRecaudo() {
        return lblRecaudo;
    }

    public void setLblRecaudo(JLabel lblRecaudo) {
        this.lblRecaudo = lblRecaudo;
    }

    public JLabel getLblRef() {
        return lblRef;
    }

    public void setLblRef(JLabel lblRef) {
        this.lblRef = lblRef;
    }

    public JLabel getLblfecha() {
        return lblfecha;
    }

    public void setLblfecha(JLabel lblfecha) {
        this.lblfecha = lblfecha;
    }

    public JTable getTblHospedajes() {
        return tblHospedajes;
    }

    public void setTblHospedajes(JTable tblHospedajes) {
        this.tblHospedajes = tblHospedajes;
    }

    public JTextField getTxtDias() {
        return txtDias;
    }

    public void setTxtDias(JTextField txtDias) {
        this.txtDias = txtDias;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNom() {
        return txtNom;
    }

    public void setTxtNom(JTextField txtNom) {
        this.txtNom = txtNom;
    }

    public JTextField getTxtPer() {
        return txtPer;
    }

    public void setTxtPer(JTextField txtPer) {
        this.txtPer = txtPer;
    }

    public JTextField getTxtTel() {
        return txtTel;
    }

    public void setTxtTel(JTextField txtTel) {
        this.txtTel = txtTel;
    }

    
    
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbHosp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRecaudo;
    private javax.swing.JLabel lblRef;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JTable tblHospedajes;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPer;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
