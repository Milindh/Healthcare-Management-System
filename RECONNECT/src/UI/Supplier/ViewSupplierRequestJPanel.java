/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Supplier;

import Code.WorkQueue.SupplierWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * JPanel class for viewing and updating supplier work requests.
 * Allows users to select a date of delivery and update the status of the request.
 *
 * @author Milindh R Kashyap
 */
public class ViewSupplierRequestJPanel extends javax.swing.JPanel {

    JPanel panel;
    SupplierWorkRequest swq;

    /**
     * Creates new form ManageWorkRequestPanel_Supplier
     * @param panel
     * @param swq
     */
    public ViewSupplierRequestJPanel(JPanel panel, SupplierWorkRequest swq) {
        initComponents();
        this.panel = panel;
        this.swq = swq;
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
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("PROCESSING SUPPLIER REQUEST");

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDate.setText("Select Date of Delivery:");

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Update Status");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SupplierImage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1458, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(lblDate)
                        .addGap(18, 18, 18)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(btnUpdate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(325, 325, 325))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        swq.setStatus("Finished");
        JOptionPane.showMessageDialog(null, "Successfully updated the request!");        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        panel.remove(this);
        Component[] compArray = panel.getComponents();
        Component component = compArray[compArray.length - 1];
        SupplierWorkAreaJPanel sysadminWrkPnl = (SupplierWorkAreaJPanel) component;
        CardLayout crdLO = (CardLayout) panel.getLayout();
        crdLO.previous(panel); // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
