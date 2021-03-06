/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.DaoObjectImp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ClientePer;
import model.Personal;

/**
 *
 * @author wesle
 */
public class MenuClientePer extends javax.swing.JFrame {

    /**
     * Creates new form MenuClientePer
     */
    public MenuClientePer() {
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

        btnCadastrarCli = new javax.swing.JButton();
        btnOptCliente = new javax.swing.JButton();
        btnBoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrarCli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadastrarCli.setText("Cadastrar Cliente");
        btnCadastrarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCliActionPerformed(evt);
            }
        });

        btnOptCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOptCliente.setText("Listar/Atualizar/Excluir (Cliente)");
        btnOptCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptClienteActionPerformed(evt);
            }
        });

        btnBoltar.setBackground(new java.awt.Color(204, 204, 204));
        btnBoltar.setText("<--");
        btnBoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnCadastrarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnOptCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBoltar))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBoltar)
                .addGap(53, 53, 53)
                .addComponent(btnCadastrarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnOptCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOptClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptClienteActionPerformed
    DaoObjectImp dao = new DaoObjectImp();
    List<ClientePer> clientes = new ArrayList<ClientePer>();
    clientes = (List<ClientePer>) (Object) dao.getBD("ClientePer"); 
        
        if(clientes.isEmpty()){
            JOptionPane.showMessageDialog(this, "N??O EXISTE CLIENTE PARA LISTAR");
        }else{
        
        ExcAltDelClientePer cp = new ExcAltDelClientePer();
        cp.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnOptClienteActionPerformed

    private void btnCadastrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCliActionPerformed
        CadastrarClientePer cac = new CadastrarClientePer();
        cac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarCliActionPerformed

    private void btnBoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoltarActionPerformed
        Menu m = new Menu();
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_btnBoltarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuClientePer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuClientePer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuClientePer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuClientePer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuClientePer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoltar;
    private javax.swing.JButton btnCadastrarCli;
    private javax.swing.JButton btnOptCliente;
    // End of variables declaration//GEN-END:variables
}
