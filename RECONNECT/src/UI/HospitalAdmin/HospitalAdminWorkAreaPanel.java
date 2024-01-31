/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HospitalAdmin;

import Code.EnterPrise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Milindh R Kashyap
 */
public class HospitalAdminWorkAreaPanel extends javax.swing.JPanel {
    
    JPanel panel;
    EnterPrise enterprise;

    /**
     * Creates new form WorkAreaPanel_Admin
     * @param panel
     * @param e
     */
    public HospitalAdminWorkAreaPanel(JPanel panel, EnterPrise e) {
        initComponents();
        this.panel=panel;
        this.enterprise=e;
        lblVal.setText(enterprise.getOrgName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblVal = new javax.swing.JLabel();
        lblEnt = new javax.swing.JLabel();
        btnOrgMng = new javax.swing.JButton();
        btnMngEmp = new javax.swing.JButton();
        BtnMngUsr = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Hospital Work Area - Administrative Role");

        lblVal.setText("<Value>");

        lblEnt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEnt.setText("Enterprise : ");

        btnOrgMng.setBackground(new java.awt.Color(153, 153, 153));
        btnOrgMng.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnOrgMng.setText("Manage Organization");
        btnOrgMng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrgMngActionPerformed(evt);
            }
        });

        btnMngEmp.setBackground(new java.awt.Color(153, 153, 153));
        btnMngEmp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMngEmp.setText("Manage Employee");
        btnMngEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngEmpActionPerformed(evt);
            }
        });

        BtnMngUsr.setBackground(new java.awt.Color(153, 153, 153));
        BtnMngUsr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BtnMngUsr.setText("Manage User");
        BtnMngUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMngUsrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMngEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrgMng, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMngUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(lblEnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblVal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnt)
                    .addComponent(lblVal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(btnOrgMng)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMngEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnMngUsr)
                .addContainerGap(232, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrgMngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgMngActionPerformed
        HospitalOrganizationManageJPanel m = new HospitalOrganizationManageJPanel(panel, enterprise.getOrgaDirectory());
        panel.add("managePanel_Organization", m);
        CardLayout layout = (CardLayout) panel.getLayout();
        layout.next(panel);
    }//GEN-LAST:event_btnOrgMngActionPerformed

    private void btnMngEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngEmpActionPerformed
        HospitalEmployeeManageJPanel m = new HospitalEmployeeManageJPanel(panel, enterprise.getOrgaDirectory());
        panel.add("managePanel_Employee", m);
        CardLayout lyt = (CardLayout) panel.getLayout();
        lyt.next(panel);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMngEmpActionPerformed

    private void BtnMngUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMngUsrActionPerformed
        HospitalAccountManageJPanel  m = new   HospitalAccountManageJPanel(panel, enterprise) ;
        panel.add("managePanel_Account",m);
        CardLayout cly = (CardLayout) panel.getLayout();
        cly.next(panel);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMngUsrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMngUsr;
    private javax.swing.JButton btnMngEmp;
    private javax.swing.JButton btnOrgMng;
    private javax.swing.JLabel lblEnt;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblVal;
    // End of variables declaration//GEN-END:variables
}