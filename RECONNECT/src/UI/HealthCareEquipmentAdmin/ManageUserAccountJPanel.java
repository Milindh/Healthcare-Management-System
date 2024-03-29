/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HealthCareEquipmentAdmin;

import Code.Account;
import Code.Employee;
import Code.EnterPrise;
import Code.Organization.Organization;
import Code.Role.Role;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * JPanel class for managing user accounts in the healthcare equipment administration module.
 * Allows the creation of user accounts associated with specific organizations, employees, and roles.
 * Also provides functionality to populate and update user account information in a table.
 *
 * @author Milindh R Kashyap
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    private JPanel panel;
    private EnterPrise enter;

    /**
     * Creates new form ManageUserAccountJPanel.
     * Initializes the panel with a reference to the parent panel and the current enterprise.
     *
     * @param panel The parent panel where this panel is added.
     * @param enter The enterprise associated with this panel.
     */
    public ManageUserAccountJPanel(JPanel panel, EnterPrise enter) {
        initComponents();
        this.panel = panel;
        this.enter = enter;
        populateOrganizationCMBbox();
        populateTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pwdText = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        orgLbl = new javax.swing.JLabel();
        createuserBtn = new javax.swing.JButton();
        CmbboxOrganization = new javax.swing.JComboBox();
        headerLbl = new javax.swing.JLabel();
        empLbl = new javax.swing.JLabel();
        CmbboxEmployee = new javax.swing.JComboBox();
        roleLbl = new javax.swing.JLabel();
        CmbboxRole = new javax.swing.JComboBox();
        usernameLbl = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTbl = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 102));

        pwdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdTextActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        orgLbl.setText("Organization  :");

        createuserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        createuserBtn.setText("Create");
        createuserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createuserBtnActionPerformed(evt);
            }
        });

        CmbboxOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CmbboxOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbboxOrganizationActionPerformed(evt);
            }
        });

        headerLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("Manage User Account");

        empLbl.setText("Employee :");

        CmbboxEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        roleLbl.setText("Role :");

        CmbboxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        usernameLbl.setText("User Name :");

        passwordLbl.setText("Password:");

        userTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roleLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(empLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orgLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passwordLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CmbboxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CmbboxEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CmbboxOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UsernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(pwdText)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createuserBtn)
                                .addGap(109, 109, 109))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(1, 1, 1)
                .addComponent(headerLbl)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orgLbl)
                            .addComponent(CmbboxOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empLbl)
                            .addComponent(CmbboxEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CmbboxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLbl)
                            .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLbl))
                        .addGap(34, 34, 34)
                        .addComponent(createuserBtn)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pwdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdTextActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        panel.remove(this);
        CardLayout layout = (CardLayout) panel.getLayout();
        layout.previous(panel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createuserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createuserBtnActionPerformed
        String userName = UsernameTextField.getText();
        String password = pwdText.getText();
        Organization organization = (Organization) CmbboxOrganization.getSelectedItem();
        Employee employee = (Employee) CmbboxEmployee.getSelectedItem();
        Role role = (Role) CmbboxRole.getSelectedItem();

        organization.getUserAccDir().createUserAccount(userName, password, employee, role);
        populateTableData();

    }//GEN-LAST:event_createuserBtnActionPerformed

    private void CmbboxOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbboxOrganizationActionPerformed
        Organization organization = (Organization) CmbboxOrganization.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_CmbboxOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CmbboxEmployee;
    private javax.swing.JComboBox CmbboxOrganization;
    private javax.swing.JComboBox CmbboxRole;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createuserBtn;
    private javax.swing.JLabel empLbl;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orgLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField pwdText;
    private javax.swing.JLabel roleLbl;
    private javax.swing.JTable userTbl;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables

    /**
     * Populates the user account table with data from the organizations within the associated enterprise.
     */
    private void populateTableData() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel model = (DefaultTableModel) userTbl.getModel();
        model.setRowCount(0);
        for (Organization organization : enter.getOrgaDirectory().getOrganizations()) {
            for (Account acc : organization.getUserAccDir().getAccountList()) {
                Object row[] = new Object[2];
                row[0] = acc;
                row[1] = acc.getRole();
                ((DefaultTableModel) userTbl.getModel()).addRow(row);

            }
        }
    }

    /**
     * Populates the employee combo box with employees from the given organization.
     *
     * @param organization The organization for which employees are populated in the combo box.
     */
    private void populateEmployeeComboBox(Organization organization) {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        CmbboxEmployee.removeAllItems();
        for (Employee employee : organization.getEmpDir().getE_List()) {
            CmbboxEmployee.addItem(employee);
        }
    }

    /**
     * Populates the role combo box with roles from the given organization.
     *
     * @param organization The organization for which roles are populated in the combo box.
     */
    private void populateRoleComboBox(Organization organization) {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        CmbboxRole.removeAllItems();
        for (Role role : organization.getRole()) {
            CmbboxRole.addItem(role);

        }
    }

    /**
     * Populates the organization combo box with organizations from the associated enterprise.
     */
    private void populateOrganizationCMBbox() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        CmbboxOrganization.removeAllItems();
        for (Organization organization : enter.getOrgaDirectory().getOrganizations()) {
            CmbboxOrganization.addItem(organization);
        }
    }
}
