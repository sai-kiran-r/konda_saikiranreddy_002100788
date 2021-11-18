/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kiranreddy
 */
public class CreateUser extends javax.swing.JPanel {

    /**
     * Creates new form CreateUser
     */
    JPanel userProcessContainer;
    EcoSystem system;
    
    public CreateUser(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        usernamelbl = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        passwordlbl = new javax.swing.JLabel();
        confirmPasswordlbl = new javax.swing.JLabel();
        rolelbl = new javax.swing.JLabel();
        resturantNamelbl = new javax.swing.JLabel();
        resturantNameTxt = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        comboRole = new javax.swing.JComboBox();
        passwordTxt = new javax.swing.JPasswordField();
        confirmPasswordTxt = new javax.swing.JPasswordField();
        addresslbl = new javax.swing.JLabel();
        phoneNumberlbl = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        phoneNumberTxt = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New User");

        namelbl.setText("Name :");

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        usernamelbl.setText("Username :");

        passwordlbl.setText("Password :");

        confirmPasswordlbl.setText("Confirm Password :");

        rolelbl.setText("Role :");

        resturantNamelbl.setText("Restaurant Name :");

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        comboRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Restaurant Admin", "Customer", "Delivery Man" }));

        addresslbl.setText("Address :");

        phoneNumberlbl.setText("Phone Number :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namelbl)
                            .addComponent(usernamelbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordlbl)
                            .addComponent(confirmPasswordlbl)
                            .addComponent(addresslbl)
                            .addComponent(resturantNamelbl)
                            .addComponent(phoneNumberlbl)
                            .addComponent(rolelbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resturantNameTxt)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(phoneNumberTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(confirmPasswordTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(passwordTxt, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(comboRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelbl)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamelbl)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlbl)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordlbl)
                    .addComponent(confirmPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresslbl)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberlbl)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resturantNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resturantNamelbl))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rolelbl)
                    .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(submitBtn)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof SystemAdminWorkAreaJPanel){
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                systemAdminWorkAreaJPanel.populateTree();
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        UserAccountDirectory usersList = this.system.getUserAccountDirectory();
        String role = (String) comboRole.getSelectedItem();
        Employee employee = new Employee();
        employee.setName(nameTxt.getText());
        boolean userDoNotExists = true;
        ArrayList<UserAccount> users = usersList.getUserAccountList();
        for(UserAccount ua : users)
        {
            if(ua.getUsername().equals(userNameTxt.getText()))
                userDoNotExists = false;
        }
        if(passwordTxt.getText().equals(confirmPasswordTxt.getText()))
        {
            if(role.equals("Customer")){
                usersList.createUserAccount(userNameTxt.getText(),passwordTxt.getText(), employee, new CustomerRole());
                UserAccount ua = usersList.getUserAccount(userNameTxt.getText());
                Customer customer = new Customer(ua);
                customer.setAddress(addressTxt.getText());
                customer.setPhoneNumber(Integer.parseInt(phoneNumberTxt.getText()));
                System.out.println(customer.getName());
                System.out.println(system.getCustomerDirectory());
                system.getCustomerDirectory().addCustomer(customer);
                JOptionPane.showMessageDialog(this, "Added the customer successfully");
                this.clearText();
            }
            else if(role.equals("Delivery Man")){
                usersList.createUserAccount(userNameTxt.getText(),passwordTxt.getText(), employee, new CustomerRole());
                UserAccount ua = usersList.getUserAccount(userNameTxt.getText());
                DeliveryMan deliveryAgent = new DeliveryMan(ua);
                deliveryAgent.setAddress(addressTxt.getText());
                deliveryAgent.setPhoneNumber(Integer.parseInt(phoneNumberTxt.getText())); 
                deliveryAgent.setStatus("Available");
                system.getDeliveryManDirectory().addDeliveryAgent(deliveryAgent);
                JOptionPane.showMessageDialog(this, "Added the DeliveryMan successfully");
                this.clearText();
            }
            else if(role.equals("Restaurant Admin")){
                usersList.createUserAccount(userNameTxt.getText(),
                            passwordTxt.getText(), employee, new AdminRole());
                UserAccount ua = usersList.getUserAccount(userNameTxt.getText());
                Restaurant restaurantData = new Restaurant(resturantNameTxt.getText(),
                        addressTxt.getText(), nameTxt.getText(),
                        Integer.parseInt(phoneNumberTxt.getText()), ua);
                system.getRestaurantDirectory().addRestaurant(restaurantData);
                JOptionPane.showMessageDialog(this, "Added the Restaurant and Admin Successfully");
                this.clearText();
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JLabel addresslbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox comboRole;
    private javax.swing.JPasswordField confirmPasswordTxt;
    private javax.swing.JLabel confirmPasswordlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel namelbl;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JLabel phoneNumberlbl;
    private javax.swing.JTextField resturantNameTxt;
    private javax.swing.JLabel resturantNamelbl;
    private javax.swing.JLabel rolelbl;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JLabel usernamelbl;
    // End of variables declaration//GEN-END:variables

    private void clearText(){
        JTextField[] textFields = {nameTxt,passwordTxt,confirmPasswordTxt,
                    resturantNameTxt, userNameTxt, addressTxt, phoneNumberTxt};
        for(JTextField pk : textFields){
            pk.setText("");
        }
//        txtPassword.setText("");
//        txtPasswordConfirmation.setText("");
        
    }

}