/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ProcessController;
import javax.swing.JOptionPane;
import models.User;

/**
 *
 * @author shaka
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTtarjeta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPclave = new javax.swing.JPasswordField();
        jBValidar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBconsulta = new javax.swing.JButton();
        jBdeposito = new javax.swing.JButton();
        jBretiro = new javax.swing.JButton();
        jBcambioclave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTvalor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cajero Automático");

        jLabel2.setText("Tarjeta");
        jPanel1.add(jLabel2);

        jTtarjeta.setColumns(10);
        jPanel1.add(jTtarjeta);

        jLabel3.setText("Clave");
        jPanel1.add(jLabel3);

        jPclave.setColumns(10);
        jPclave.setToolTipText("");
        jPanel1.add(jPclave);

        jBValidar.setText("Validar");
        jBValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBValidarActionPerformed(evt);
            }
        });
        jPanel1.add(jBValidar);

        jBconsulta.setText("Consulta de Saldo");
        jBconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultaActionPerformed(evt);
            }
        });
        jPanel2.add(jBconsulta);

        jBdeposito.setText("Depósito");
        jBdeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdepositoActionPerformed(evt);
            }
        });
        jPanel2.add(jBdeposito);

        jBretiro.setText("Retiro");
        jBretiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBretiroActionPerformed(evt);
            }
        });
        jPanel2.add(jBretiro);

        jBcambioclave.setText("Cambiar Clave");
        jBcambioclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcambioclaveActionPerformed(evt);
            }
        });
        jPanel2.add(jBcambioclave);

        jLabel1.setText("Valor:");
        jPanel3.add(jLabel1);

        jTvalor.setColumns(10);
        jPanel3.add(jTvalor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBValidarActionPerformed
        ProcessController pa = new ProcessController();
        User usuario = new User();
        
        usuario.setTarjeta(jTtarjeta.getText());
        usuario.setClave(jPclave.getText());
        
        System.out.println(usuario.getTarjeta());
        System.out.println(usuario.getClave());
        
        if (pa.validarUsuario(usuario)) {
            JOptionPane.showMessageDialog(jBValidar, "Usuario valido");
        } else {
            JOptionPane.showMessageDialog(jBValidar, "Usuario invalido");
        }
    }//GEN-LAST:event_jBValidarActionPerformed

    private void jBconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultaActionPerformed
        if (jTtarjeta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el numero de la tarjeta");
        }
        else {
            if (jPclave.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Ingrese la clave");
            }
            else {
            ProcessController pa = new ProcessController();
            User usuario = new User();
        
            usuario.setTarjeta(jTtarjeta.getText());
            usuario.setClave(jPclave.getText());    
                
            pa.consultarSaldo(usuario);
            }
        }
    }//GEN-LAST:event_jBconsultaActionPerformed

    private void jBdepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdepositoActionPerformed
        if (jTvalor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el monto del deposito");
        }
        else {
            ProcessController pa = new ProcessController();
            User usuario = new User();
        
            usuario.setTarjeta(jTtarjeta.getText());
            usuario.setClave(jPclave.getText());
                        
            pa.deposito(usuario,jTvalor.getText());
        }
    }//GEN-LAST:event_jBdepositoActionPerformed

    private void jBretiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBretiroActionPerformed
        if (jTvalor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el monto del retiro");
        }
        else {
            ProcessController pa = new ProcessController();
            User usuario = new User();
        
            usuario.setTarjeta(jTtarjeta.getText());
            usuario.setClave(jPclave.getText());
                        
            pa.retiro(usuario,jTvalor.getText());
        }
    }//GEN-LAST:event_jBretiroActionPerformed

    private void jBcambioclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcambioclaveActionPerformed
        if (jTvalor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese la nueva clave");
        }
        else {
            ProcessController pa = new ProcessController();
            User usuario = new User();
        
            usuario.setTarjeta(jTtarjeta.getText());
            usuario.setClave(jPclave.getText());
                        
            pa.cambiarClave(usuario,jTvalor.getText());
        }
    }//GEN-LAST:event_jBcambioclaveActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBValidar;
    private javax.swing.JButton jBcambioclave;
    private javax.swing.JButton jBconsulta;
    private javax.swing.JButton jBdeposito;
    private javax.swing.JButton jBretiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPclave;
    private javax.swing.JTextField jTtarjeta;
    private javax.swing.JTextField jTvalor;
    // End of variables declaration//GEN-END:variables
}
