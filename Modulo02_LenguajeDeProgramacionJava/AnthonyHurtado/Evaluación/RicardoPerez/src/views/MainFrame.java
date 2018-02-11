/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.OperationController;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.User;
import structures.MyExceptions;

/**
 *
 * @author ricardoperez
 */
public class MainFrame extends javax.swing.JFrame {

    User biguser;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        lblwelcome.setVisible(false);
        btndeposit.setVisible(false);
        btnwithdraw.setVisible(false);
        btnchangePassword.setVisible(false);
        txtnewpassword.setVisible(false);
        txtamount.setVisible(false);
        lblnewpassword.setVisible(false);
        lblwd.setVisible(false);
        lblbalancetext.setVisible(false);

        this.biguser = new User();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblcard = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtcard = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        lblwelcome = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        lblbalancetext = new javax.swing.JLabel();
        lblbalancevalue = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnwithdraw = new javax.swing.JButton();
        btndeposit = new javax.swing.JButton();
        btnchangePassword = new javax.swing.JButton();
        txtamount = new javax.swing.JTextField();
        lblwd = new javax.swing.JLabel();
        lblnewpassword = new javax.swing.JLabel();
        txtnewpassword = new javax.swing.JTextField();
        btnspanish = new javax.swing.JButton();
        btnenglish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("views/Bundle"); // NOI18N
        lblcard.setText(bundle.getString("MainFrame.lblcard.text")); // NOI18N

        lblpassword.setText(bundle.getString("MainFrame.lblpassword.text")); // NOI18N

        txtcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcardActionPerformed(evt);
            }
        });
        txtcard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcardKeyTyped(evt);
            }
        });

        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordKeyTyped(evt);
            }
        });

        btnlogin.setText(bundle.getString("MainFrame.btnlogin.text")); // NOI18N
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        lblwelcome.setText(bundle.getString("MainFrame.lblwelcome.text")); // NOI18N

        lblbalancetext.setText(bundle.getString("MainFrame.lblbalancetext.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblcard)
                        .addGap(18, 18, 18)
                        .addComponent(txtcard, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblpassword))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblbalancetext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblbalancevalue, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcard)
                    .addComponent(lblpassword)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblwelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(lblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbalancevalue, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblbalancetext)
                        .addContainerGap())))
        );

        btnwithdraw.setText(bundle.getString("MainFrame.btnwithdraw.text")); // NOI18N
        btnwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwithdrawActionPerformed(evt);
            }
        });

        btndeposit.setText(bundle.getString("MainFrame.btndeposit.text")); // NOI18N
        btndeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndepositActionPerformed(evt);
            }
        });

        btnchangePassword.setText(bundle.getString("MainFrame.btnchangePassword.text")); // NOI18N
        btnchangePassword.setToolTipText(bundle.getString("MainFrame.btnchangePassword.toolTipText")); // NOI18N
        btnchangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btndeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnchangePassword)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnwithdraw)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btndeposit)
                        .addComponent(btnchangePassword)))
                .addGap(12, 12, 12))
        );

        txtamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtamountKeyTyped(evt);
            }
        });

        lblwd.setText(bundle.getString("MainFrame.lblwd.text")); // NOI18N

        lblnewpassword.setText(bundle.getString("MainFrame.lblnewpassword.text")); // NOI18N

        txtnewpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnewpasswordKeyTyped(evt);
            }
        });

        btnspanish.setText(bundle.getString("MainFrame.btnspanish.text")); // NOI18N
        btnspanish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnspanishActionPerformed(evt);
            }
        });

        btnenglish.setText(bundle.getString("MainFrame.btnenglish.text")); // NOI18N
        btnenglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenglishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(lblwd))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnewpassword)
                            .addComponent(txtnewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnspanish, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnenglish, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnspanish)
                    .addComponent(btnenglish))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblwd)
                    .addComponent(lblnewpassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcardActionPerformed


    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed

        User actualuser = new User();
        actualuser.setCard(txtcard.getText());
        actualuser.setPassword(txtpassword.getText());

        try {
            OperationController operation = new OperationController();
            actualuser = operation.Login(actualuser);
            lblwelcome.setVisible(true);
            btndeposit.setVisible(true);
            btnwithdraw.setVisible(true);
            btnchangePassword.setVisible(true);
            txtnewpassword.setVisible(true);
            txtamount.setVisible(true);
            lblnewpassword.setVisible(true);
            lblwd.setVisible(true);
            lblusername.setVisible(true);
            lblbalancevalue.setVisible(true);
            this.biguser = actualuser;
            lblusername.setText(this.biguser.getName().toUpperCase());
            lblbalancevalue.setText(Float.toString(this.biguser.getBalance()));
            lblbalancetext.setVisible(true);

        } catch (MyExceptions ex) {
            lblwelcome.setText("Error");
            lblwelcome.setVisible(false);
            btndeposit.setVisible(false);
            btnwithdraw.setVisible(false);
            btnchangePassword.setVisible(false);
            txtnewpassword.setVisible(false);
            txtamount.setVisible(false);
            lblnewpassword.setVisible(false);
            lblwd.setVisible(false);
            this.biguser.setBalance(0);
            this.biguser.setCard("");
            this.biguser.setName("");
            this.biguser.setPassword("");
            this.biguser.setId(0);
            lblusername.setVisible(false);
            lblbalancevalue.setVisible(false);
            lblbalancetext.setVisible(false);

            JOptionPane.showMessageDialog(btnlogin, "Error " + ex.getCode() + " " + ex.getMessage());
        }

    }//GEN-LAST:event_btnloginActionPerformed

    private void txtcardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcardKeyTyped
        int top = 5;

        if (txtcard.getText().length() >= top) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Max 5 character");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtcardKeyTyped

    private void txtpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyTyped
        int top = 5;

        if (txtpassword.getText().length() >= top) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Max 5 character");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordKeyTyped

    private void txtnewpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewpasswordKeyTyped
        int top = 5;

        if (txtnewpassword.getText().length() >= top) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Max 5 character");

        }            // TODO add your handling code here:
    }//GEN-LAST:event_txtnewpasswordKeyTyped

    private void txtamountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtamountKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
        }

    }//GEN-LAST:event_txtamountKeyTyped

    private void btnchangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchangePasswordActionPerformed

        if (!(txtnewpassword.getText().equals(""))) {
            try {
                OperationController operation = new OperationController();
                if (operation.ChangePassword(this.biguser, txtnewpassword.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "Password Changed");
                    this.biguser.setPassword(txtnewpassword.getText());
                    txtpassword.setText(txtnewpassword.getText());
                    txtnewpassword.setText("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error");
                }
            } catch (MyExceptions ex) {
                JOptionPane.showMessageDialog(rootPane, "Error: " + ex.getCode() + " " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error: The password can't be null");
        }
    }//GEN-LAST:event_btnchangePasswordActionPerformed

    private void btnwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwithdrawActionPerformed
        // TODO add your handling code here:
        if (!txtamount.getText().equals("")) {
            float amount = Float.parseFloat(txtamount.getText());
            if (amount <= this.biguser.getBalance()) {
                try {
                    OperationController operation = new OperationController();
                    if (operation.Withdraw(this.biguser, amount)) {
                        this.biguser.setBalance(this.biguser.getBalance() - amount);
                        lblbalancevalue.setText(Float.toString(this.biguser.getBalance()));
                        JOptionPane.showMessageDialog(rootPane, "Successful Withdrawal");
                        txtamount.setText("");

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error: The withdrawal could not be made");
                    }
                } catch (MyExceptions ex) {
                    JOptionPane.showMessageDialog(rootPane, "Error: " + ex.getCode() + " " + ex.getMessage());
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Error: The withdrawal is greater than your balance");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error: The withdrawal can't be null");

        }
    }//GEN-LAST:event_btnwithdrawActionPerformed

    private void btndepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndepositActionPerformed
        // TODO add your handling code here:
        if (!txtamount.getText().equals("")) {
            float amount = Float.parseFloat(txtamount.getText());
            try {
                OperationController operation = new OperationController();
                if (operation.Deposit(this.biguser, amount)) {
                    this.biguser.setBalance(this.biguser.getBalance() + amount);
                    lblbalancevalue.setText(Float.toString(this.biguser.getBalance()));
                    JOptionPane.showMessageDialog(rootPane, "Successful Deposit");
                    txtamount.setText("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error: the withdrawal could not be made");
                }
            } catch (MyExceptions ex) {
                JOptionPane.showMessageDialog(rootPane, "Error: " + ex.getCode() + " " + ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Error: The deposit can't be null");

        }
    }//GEN-LAST:event_btndepositActionPerformed

    private void btnspanishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnspanishActionPerformed
        Locale loc = new Locale("es", "ES");
        Locale.setDefault(loc);

        ResourceBundle rb = ResourceBundle.getBundle("views/Bundle", loc);

        ChangeLanguage(rb);         // TODO add your handling code here:
    }//GEN-LAST:event_btnspanishActionPerformed

    private void btnenglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenglishActionPerformed
        Locale loc = new Locale("en", "US");
        Locale.setDefault(loc);
        ResourceBundle rb = ResourceBundle.getBundle("views/Bundle_en_US", loc);

        ChangeLanguage(rb);        // TODO add your handling code here:
    }//GEN-LAST:event_btnenglishActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public void ChangeLanguage(ResourceBundle rb) {

        lblwelcome.setText(rb.getString("MainFrame.lblwelcome.text"));
        lblnewpassword.setText(rb.getString("MainFrame.lblnewpassword.text"));
        lblcard.setText(rb.getString("MainFrame.lblcard.text"));
        lblpassword.setText(rb.getString("MainFrame.lblpassword.text"));
        btnspanish.setText(rb.getString("MainFrame.btnspanish.text"));
        btnenglish.setText(rb.getString("MainFrame.btnenglish.text"));
        btnlogin.setText(rb.getString("MainFrame.btnlogin.text"));
        lblwelcome.setText(rb.getString("MainFrame.lblwelcome.text"));
        lblbalancetext.setText(rb.getString("MainFrame.lblbalancetext.text"));
        btndeposit.setText(rb.getString("MainFrame.btndeposit.text"));
        btnwithdraw.setText(rb.getString("MainFrame.btnwithdraw.text"));
        lblwd.setText(rb.getString("MainFrame.lblwd.text"));
                btnchangePassword.setText(rb.getString("MainFrame.btnchangePassword.text"));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchangePassword;
    private javax.swing.JButton btndeposit;
    private javax.swing.JButton btnenglish;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnspanish;
    private javax.swing.JButton btnwithdraw;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblbalancetext;
    private javax.swing.JLabel lblbalancevalue;
    private javax.swing.JLabel lblcard;
    private javax.swing.JLabel lblnewpassword;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel lblwd;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtcard;
    private javax.swing.JTextField txtnewpassword;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables
}
