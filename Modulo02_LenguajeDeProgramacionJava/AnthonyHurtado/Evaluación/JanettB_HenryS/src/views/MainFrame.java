/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ProcessController;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import models.User;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author hslvm
 */
public class MainFrame extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form MainFrame
     
     */
    public MainFrame() {
        initComponents();
        Date fecha = new Date();
        String hora,minutos,segundos;
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        lblFecha.setText(formatofecha.format(fecha));
        hora=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
        Thread current = Thread.currentThread();
        lblHora.setText(hora+":"+minutos+":"+segundos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCajero = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnValidar = new javax.swing.JButton();
        btnConsultaDeSaldo = new javax.swing.JButton();
        btnRetiro = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnCambioDeClave = new javax.swing.JButton();
        pwdClave = new javax.swing.JPasswordField();
        btnEspanol = new javax.swing.JButton();
        btnIngles = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCajero.setBackground(new java.awt.Color(153, 255, 204));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("views/Bundle"); // NOI18N
        lblUsuario.setText(bundle.getString("MainFrame.lblUsuario.text")); // NOI18N
        lblUsuario.setName("lblUsuario"); // NOI18N

        lblClave.setText(bundle.getString("MainFrame.lblClave.text")); // NOI18N
        lblClave.setName("lblClave"); // NOI18N

        txtUsuario.setName("txtUsuario"); // NOI18N

        btnValidar.setLabel(bundle.getString("MainFrame.btnValidar.label")); // NOI18N
        btnValidar.setName("btnValidar"); // NOI18N
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        btnConsultaDeSaldo.setLabel(bundle.getString("MainFrame.btnConsultaDeSaldo.label")); // NOI18N
        btnConsultaDeSaldo.setName("btnConsultaDeSaldo"); // NOI18N
        btnConsultaDeSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaDeSaldoActionPerformed(evt);
            }
        });

        btnRetiro.setLabel(bundle.getString("MainFrame.btnRetiro.label")); // NOI18N
        btnRetiro.setName("btnRetiro"); // NOI18N
        btnRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroActionPerformed(evt);
            }
        });

        btnDeposito.setLabel(bundle.getString("MainFrame.btnDeposito.label")); // NOI18N
        btnDeposito.setName("btnDeposito"); // NOI18N
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        lblValor.setText(bundle.getString("MainFrame.lblValor.text")); // NOI18N
        lblValor.setName("lblValor"); // NOI18N

        txtValor.setName("txtValor"); // NOI18N
        txtValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtValorMouseClicked(evt);
            }
        });
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        btnCambioDeClave.setText(bundle.getString("MainFrame.btnCambioDeClave.text")); // NOI18N
        btnCambioDeClave.setName("btnCambioDeClave"); // NOI18N
        btnCambioDeClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioDeClaveActionPerformed(evt);
            }
        });

        pwdClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwdClaveMouseClicked(evt);
            }
        });
        pwdClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdClaveActionPerformed(evt);
            }
        });

        btnEspanol.setText(bundle.getString("MainFrame.btnEspanol.text")); // NOI18N
        btnEspanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspanolActionPerformed(evt);
            }
        });

        btnIngles.setText(bundle.getString("MainFrame.btnIngles.text")); // NOI18N
        btnIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInglesActionPerformed(evt);
            }
        });

        lblFecha.setText(bundle.getString("MainFrame.lblFecha.text")); // NOI18N

        lblHora.setText(bundle.getString("MainFrame.lblHora.text")); // NOI18N

        javax.swing.GroupLayout pnlCajeroLayout = new javax.swing.GroupLayout(pnlCajero);
        pnlCajero.setLayout(pnlCajeroLayout);
        pnlCajeroLayout.setHorizontalGroup(
            pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlCajeroLayout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addGap(14, 14, 14)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnValidar))
                    .addGroup(pnlCajeroLayout.createSequentialGroup()
                        .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValor)
                            .addComponent(btnConsultaDeSaldo))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCajeroLayout.createSequentialGroup()
                                .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblClave)
                                    .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCajeroLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btnDeposito)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCambioDeClave))
                                    .addComponent(pwdClave, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlCajeroLayout.createSequentialGroup()
                        .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEspanol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(btnIngles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlCajeroLayout.setVerticalGroup(
            pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCajeroLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario)
                    .addComponent(lblClave)
                    .addComponent(btnValidar)
                    .addComponent(pwdClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultaDeSaldo)
                    .addComponent(btnRetiro)
                    .addComponent(btnDeposito)
                    .addComponent(btnCambioDeClave))
                .addGap(56, 56, 56)
                .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEspanol)
                    .addComponent(lblFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngles)
                    .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        String ruta = "./Archivo_transacciones.txt";
        String nl = System.getProperty("line.separator");
        ProcessController pc = new ProcessController();
        
        User usuario = new User();
        
        usuario.setTarjeta(txtUsuario.getText());
        usuario.setClave(pwdClave.getText());
        
        if (pc.validarUsuario(usuario)) {
            JOptionPane.showMessageDialog(btnValidar,
                        "Bienvenido al Sistema ATM de Banco de Venezuela"
                    +nl+"                     Escriba el Monto          "
                    +nl+"                                Y              "
                    +nl+"       Seleccione la Operación a Realizar      ");
            txtValor.setEditable(true);
            txtValor.requestFocus();
            txtUsuario.setEditable(false);
            pwdClave.setEditable(false);
                    // Operaciones con el archivo
            pc.crearArchivo(ruta);
            
        } else {
            JOptionPane.showMessageDialog(btnValidar, "Usuario invalido");
            txtUsuario.setText(null);
            pwdClave.setText(null);
            txtUsuario.requestFocus();
            txtValor.setEditable(false);
            
        }
    }//GEN-LAST:event_btnValidarActionPerformed

    private void btnConsultaDeSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDeSaldoActionPerformed
        ProcessController pc = new ProcessController();
        User usuario = new User();
        usuario.setTarjeta(txtUsuario.getText());
        JOptionPane.showMessageDialog(null, "Su Saldo es: "+pc.obtenerSaldo(usuario));
        txtValor.setText(null);
    }//GEN-LAST:event_btnConsultaDeSaldoActionPerformed

    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed

        String ruta = "./Archivo_transacciones.txt";
        String contenido;
        if (txtValor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe escribir en el Campor <Valor>");
        }
        else {
        ProcessController pc = new ProcessController();
        User usuario = new User();
        usuario.setTarjeta(txtUsuario.getText());
        contenido = "Retiro de la Tarjeta: "+txtUsuario.getText()+" por un monto de: "+txtValor.getText();
        pc.Retiro(usuario, txtValor.getText());
        pc.anexar(ruta, contenido);
        txtValor.setText(null);
        }
    }//GEN-LAST:event_btnRetiroActionPerformed

    private void txtValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorMouseClicked
        if (txtUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe escribir primero su Usuario");
        }
        if (txtUsuario.getText().isEmpty()){
            txtValor.setEditable(false);
        }
        else {
            txtValor.setEditable(true);
            txtValor.setText(null);
        }
        
        
    }//GEN-LAST:event_txtValorMouseClicked

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        String ruta = "./Archivo_transacciones.txt";
        String contenido;
        if (txtValor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe escribir en el Campor <Valor>");
        }
        else {
        ProcessController pc = new ProcessController();
        User usuario = new User();
        usuario.setTarjeta(txtUsuario.getText());
        pc.Deposito(usuario, txtValor.getText());
        contenido = "Deósito de la Tarjeta: "+txtUsuario.getText()+" por un monto de: "+txtValor.getText();
        pc.anexar(ruta, contenido);
        txtValor.setText(null);
                }
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed

    }//GEN-LAST:event_txtValorActionPerformed

    private void btnCambioDeClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioDeClaveActionPerformed
                if (txtValor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe escribir en el Campor <Valor>");
        }
        else {
        ProcessController pc = new ProcessController();
        User usuario = new User();
        usuario.setTarjeta(txtUsuario.getText());
        pc.CambioClave(usuario, txtValor.getText());
        txtUsuario.setText(null);
        pwdClave.setText(null);
        txtValor.setText(null);
        txtUsuario.setEditable(true);
        pwdClave.setEditable(true);
                }
    }//GEN-LAST:event_btnCambioDeClaveActionPerformed

    private void pwdClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdClaveActionPerformed
        if (txtUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe escribir primero su Usuario");
        }
    }//GEN-LAST:event_pwdClaveActionPerformed

    private void pwdClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pwdClaveMouseClicked
        if (txtUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe escribir primero su Usuario");
        }    }//GEN-LAST:event_pwdClaveMouseClicked

    private void btnEspanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspanolActionPerformed
       // Cambiando el idioma a español
       Locale loc = new Locale("es","ES");
       Locale.setDefault(loc);
       
       // Obteniendo el archivo para traducir (paquete/Archivo) el final lo determina la variable "loc"
       ResourceBundle rb = ResourceBundle.getBundle("views/Bundle", loc);
       
       // Llamando al método
       cambiarIdioma(rb);       

    }//GEN-LAST:event_btnEspanolActionPerformed

    private void btnInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInglesActionPerformed
        // Cambiando el idioma a ingles
        Locale loc = new Locale("en","US");
        Locale.setDefault(loc);
        
        // Obteniendo el archivo para traducir
        ResourceBundle rb = ResourceBundle.getBundle("views/Bundle_en_US", loc);
        
        // Llamando al método
        cambiarIdioma(rb);
    }//GEN-LAST:event_btnInglesActionPerformed

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
        public void cambiarIdioma(ResourceBundle rb)  {
        // Establezco los componentes del jFrame para cambiar el texto
        btnCambioDeClave.setText(rb.getString("MainFrame.btnCambioDeClave.text"));
        lblUsuario.setText(rb.getString("MainFrame.lblUsuario.text"));
        lblClave.setText(rb.getString("MainFrame.lblClave.text"));
        btnEspanol.setText(rb.getString("MainFrame.btnEspanol.text"));
        btnIngles.setText(rb.getString("MainFrame.btnIngles.text"));
        btnValidar.setText(rb.getString("MainFrame.btnValidar.label"));
        btnConsultaDeSaldo.setText(rb.getString("MainFrame.btnConsultaDeSaldo.label"));
        btnRetiro.setText(rb.getString("MainFrame.btnRetiro.label"));
        btnDeposito.setText(rb.getString("MainFrame.btnDeposito.label"));
        lblValor.setText(rb.getString("MainFrame.lblValor.text"));
        }   

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambioDeClave;
    private javax.swing.JButton btnConsultaDeSaldo;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnEspanol;
    private javax.swing.JButton btnIngles;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JButton btnValidar;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlCajero;
    private javax.swing.JPasswordField pwdClave;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
