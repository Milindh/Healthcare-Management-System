/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Doctor;

import Code.Account;
import Code.Doctor;
import Code.EcoSystem;
import Code.EnterPrise;
import Code.Network;
import Code.Organization.Organization_Doctor;
import Code.PrescriptionList;
import Code.WorkQueue.DoctorWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 * DoctorDashboard class represents the user interface for the Doctor's work area.
 * It provides options for prescribing medicine and managing equipment.
 *
 * @author Milindh R Kashyap
 */
public class DoctorDashboardJPanel extends javax.swing.JPanel {

    private JPanel userContainer;
    private Organization_Doctor org_doc;
    private Account ua;
    private EnterPrise enter;
    private Doctor doctor;
    private PrescriptionList p_list;
    private DoctorWorkRequest dwr;
    private Network network;
    private EcoSystem ecosystem;

    /**
     * Creates new form Doctor_WorkArea
     *
     * @param userContainer The JPanel where the user interface will be displayed.
     * @param ua The user account associated with the doctor.
     * @param org_doc The organization representing the doctor.
     * @param enter The enterprise the doctor belongs to.
     * @param ecosystem The overall ecosystem.
     * @param network The network the doctor is part of.
     */
    public DoctorDashboardJPanel(JPanel userContainer,
            Account ua,
            Organization_Doctor org_doc,
            EnterPrise enter,
            EcoSystem ecosystem,
            Network network
    ) {
        initComponents();
        this.userContainer = userContainer;
        this.ua = ua;
        this.network = network;
        this.org_doc = org_doc;
        this.enter = enter;
        this.ecosystem = ecosystem;
        network();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Pres_Button = new javax.swing.JButton();
        Manage_Equipment_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Work Area");

        Pres_Button.setText("Prescribe Medicine");
        Pres_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pres_ButtonActionPerformed(evt);
            }
        });

        Manage_Equipment_Button.setText("Manage Equipment");
        Manage_Equipment_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Manage_Equipment_ButtonActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DoctorBig.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Manage_Equipment_Button)
                    .addComponent(Pres_Button))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(Pres_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Manage_Equipment_Button))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Manage_Equipment_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Manage_Equipment_ButtonActionPerformed
        // TODO add your handling code here:
        CardLayout abs = (CardLayout) userContainer.getLayout();
        userContainer.add("PrescriptionJPanel", new EquipmentRequestJPanel(userContainer, ua, org_doc, enter, ecosystem, network));
        abs.next(userContainer);
    }//GEN-LAST:event_Manage_Equipment_ButtonActionPerformed

    private void Pres_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pres_ButtonActionPerformed
        // TODO add your handling code here:
        CardLayout abs = (CardLayout) userContainer.getLayout();
        userContainer.add("PrescriptionJPanel", new PrescriptionJPanel(userContainer, p_list, ua, enter, org_doc));
        abs.next(userContainer);
    }//GEN-LAST:event_Pres_ButtonActionPerformed

    /**
     * Method to retrieve the network name.
     * Note: This method does not return or use the network name; consider revising or removing if unnecessary.
     */
    private void network() {
        network.getNetwork_Name();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Manage_Equipment_Button;
    private javax.swing.JButton Pres_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
