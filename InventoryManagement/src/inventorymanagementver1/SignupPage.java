/*
 *  PRG2201 Object-Oriented Programming JAN 2021
 *  Project - Inventory Management System
 *  Name: Kathryn Lim i21020061 INTI International University Nilai
 * 
 *  [file description]
 */
package inventorymanagementver1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kathryn
 */
public class SignupPage extends javax.swing.JFrame {

    /**
     * Creates new form SignupPage
     */
    public SignupPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signupLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameInputField = new javax.swing.JTextField();
        idInputField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordInputField = new javax.swing.JPasswordField();
        userTypeLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        confirmpasswordLabel = new javax.swing.JLabel();
        confirmPasswordInputField = new javax.swing.JPasswordField();
        userTypeSelect = new javax.swing.JComboBox<>();
        loginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signupLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signupLabel.setText("Inventory Management System Employee Registration");

        nameLabel.setText("Name:");

        nameInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputFieldActionPerformed(evt);
            }
        });

        idInputField.setEditable(false);
        idInputField.setBackground(new java.awt.Color(204, 204, 204));
        idInputField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        idInputField.setName(""); // NOI18N
        idInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idInputFieldActionPerformed(evt);
            }
        });

        idLabel.setText("Employee ID:");

        passwordLabel.setText("Create Password:");

        passwordInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputFieldActionPerformed(evt);
            }
        });

        userTypeLabel.setText("User Type:");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        registerButton.setText("Signup");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        confirmpasswordLabel.setText("Confirm Password:");

        confirmPasswordInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordInputFieldActionPerformed(evt);
            }
        });

        userTypeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Sales" }));
        userTypeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeSelectActionPerformed(evt);
            }
        });

        loginLabel.setForeground(new java.awt.Color(0, 0, 255));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Login Instead");
        loginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(signupLabel)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmpasswordLabel)
                                .addGap(18, 18, 18)
                                .addComponent(confirmPasswordInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idInputField)
                                    .addComponent(nameInputField)
                                    .addComponent(passwordInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userTypeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(userTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(signupLabel)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(nameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmpasswordLabel))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTypeLabel)
                    .addComponent(userTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(loginLabel)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputFieldActionPerformed

    private void idInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idInputFieldActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearFields();
    }//GEN-LAST:event_clearButtonActionPerformed
    
    //clears all fields
    public void clearFields()
    {
        nameInputField.setText("");
        //idInputField.setText("");
        assignID();
        passwordInputField.setText("");
        confirmPasswordInputField.setText("");      
    }  
    
    //assigns unique ID to registered Users
    public void assignID(){
        int totalUsers = (UserReg.adminCount) + (UserReg.salesCount);
        int ID = 11;
        String text;
              
        if(totalUsers == 0 )
            ID = 1;
        else
            ID = ++totalUsers;
        
        text = String.format("%03d",ID);    //casts ID to three decimal digits. Pads left with zeroes. If UserCount is single digit, format will be 00x. If double digit, 0xx.

        idInputField.setText(text);
    }
    
    //register button method
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        
        if(nameInputField.equals(""))
           JOptionPane.showMessageDialog(null, "Enter a Name!");
              
        String name = nameInputField.getText();                         //gets string from name field
        int ID = Integer.parseInt(idInputField.getText());              //gets employee ID
        String pass = String.valueOf(passwordInputField.getPassword()); //gets password 
        String rePass = String.valueOf(confirmPasswordInputField.getPassword());    //gets reconfirmed password
        String uType = userTypeSelect.getSelectedItem().toString(); //gets user type value admin or sales
      
        if(name.equals(""))
           JOptionPane.showMessageDialog(null, "Enter a Name!");
        else if(idInputField.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Enter an ID!");
        else if(pass.equals(""))
            JOptionPane.showMessageDialog(null, "Enter a Password!");
        else if(rePass.equals(""))
            JOptionPane.showMessageDialog(null, "Enter your password again to confirm!");
        else if(!pass.equals(rePass)){  //if confirmation password and original password is not the same
            JOptionPane.showMessageDialog(null, "Passwords do not match. Try again!");
            //clears both password fields for security
            passwordInputField.setText("");
            confirmPasswordInputField.setText("");
        }else{
                    //put it in the objects somewhere here
        if(uType.equals("Administrator")){
            Admin admin= new Admin(name, ID, pass, 'A');
            
            UserReg.adminList[UserReg.adminCount] = admin;  //adds newly created admin object to array
            UserReg.adminCount++;        //increments admin count
            
            //displays the admin homepage
            this.dispose(); 
            UserReg.adminHp.setLocationRelativeTo(null);
            UserReg.adminHp.setVisible(true);
            UserReg.adminHp.display();
            
        }else {
            Sales sales = new Sales(name, ID, pass, 'C');
            
            UserReg.salesList[UserReg.salesCount] = sales;  //adds newly created sales object to array
            UserReg.salesCount++;       //increments sales count
            
            //displays the sales homepage
            this.dispose(); 
            UserReg.salesHp.setLocationRelativeTo(null);
            UserReg.salesHp.setVisible(true);
            UserReg.salesHp.display();
         }
        }
                         
    }//GEN-LAST:event_registerButtonActionPerformed
    
    private void userTypeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTypeSelectActionPerformed

    private void passwordInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputFieldActionPerformed

    private void confirmPasswordInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordInputFieldActionPerformed

    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseClicked
         UserReg.loginPage.setLocationRelativeTo(null);
         UserReg.loginPage.setVisible(true);
         UserReg.loginPage.clearFields();
         this.dispose();
    }//GEN-LAST:event_loginLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JPasswordField confirmPasswordInputField;
    private javax.swing.JLabel confirmpasswordLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField idInputField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField nameInputField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordInputField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JLabel userTypeLabel;
    private javax.swing.JComboBox<String> userTypeSelect;
    // End of variables declaration//GEN-END:variables
}
