package view;

import dao.DaoObjectImp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ClientePer;
import model.Pagamento;
import model.Personal;

public class CadastrarPagamento extends javax.swing.JFrame {

    DaoObjectImp dao = new DaoObjectImp();
    List<Personal> personais = new ArrayList<Personal>();
    List<ClientePer> clientes = new ArrayList<ClientePer>();
    List<Pagamento> pagamentos = new ArrayList<Pagamento>();

    int cont = 0;

    public CadastrarPagamento() {
        initComponents();

        mostrarNaTela();
        //  ver = 0;

        // txtId.setEnabled(false);
        // ativarCampo(false);        
    }

    public void mostrarNaTela() {
        personais = (List<Personal>) (Object) dao.getBD("Personal");
        clientes = (List<ClientePer>) (Object) dao.getBD("ClientePer");
        pagamentos = (List<Pagamento>) (Object) dao.getBD("Pagamento");

        txtCliente.setText(String.valueOf(clientes.get(cont).getNome()));
        txtMensalidade.setText(String.valueOf(clientes.get(cont).getMensalidade()));
        // txtPersonal.setText(String.valueOf(personais.get(cont).getNome()));

        for (int i = 0; i < personais.size(); i++) {
            if (personais.get(i).getNome().equals(clientes.get(cont).getPersonal().getNome())) {
                //JOptionPane.showMessageDialog(null, i);
                txtPersonal.setText(String.valueOf(personais.get(i).getNome()));
            }
        }
        // JOptionPane.showMessageDialog(null, cont);

        // cbxPersonal.removeAllItems();
        //txtCliente.addItem(String.valueOf(clientes.get(cont).getNome()));
        //txtPersonais.addItem(String.valueOf(personais.get(cont).getPersonal().getNome()));
//        for (int i = 0; i < personais.size(); i++) {
//            if (!personais.get(i).getNome().equals(clientes.get(cont).getPersonal().getNome())) {
//                cbxCliente.addItem(String.valueOf(clientes.get(i).getNome()));
//                cbxPersonais.addItem(String.valueOf(personais.get(i).getNome()));
//            }
        //}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtMensalidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnEfetuarPagamento = new javax.swing.JToggleButton();
        btnProximo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        txtPersonal = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cliente:");

        txtMensalidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensalidadeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Personal:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Mensalidade:");

        btnEfetuarPagamento.setText("Pagar Mensalidade");
        btnEfetuarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfetuarPagamentoActionPerformed(evt);
            }
        });

        btnProximo.setText(">>>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnAnterior.setText("<<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        txtPersonal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonalActionPerformed(evt);
            }
        });

        txtCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(204, 204, 204));
        btnVoltar.setText("<--");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEfetuarPagamento)
                .addGap(163, 163, 163))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnAnterior))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProximo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMensalidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProximo)
                    .addComponent(btnAnterior))
                .addGap(29, 29, 29)
                .addComponent(btnEfetuarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensalidadeActionPerformed

    private void btnEfetuarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfetuarPagamentoActionPerformed
        // personais = (List<Personal>) (Object) dao.getBD("Personal");
        //clientes = (List<ClientePer>) (Object) dao.getBD("ClientePer");
        //pagamentos = (List<Pagamento>) (Object) dao.getBD("Pagamento");

        int pos = 0;
        int idP = 0;
        int ver = 0;
        int idPaPe = 0;
        int total = 0;

        Pagamento p = new Pagamento();
        for (int i = 0; i < personais.size(); i++) {
            if (personais.get(i).getNome().equals(clientes.get(cont).getPersonal().getNome())) {
                pos = personais.get(i).getId(); //id do personal
            }
        }

        if (!pagamentos.isEmpty()) {

            for (int i = 0; i < pagamentos.size(); i++) {
                if (pos == pagamentos.get(i).getPersonalp().getId()) {
                    idP = pagamentos.get(i).getId(); //id do personal
                    ver = 1;

                }

            }

            if (ver == 1) {
                for (int i = 0; i < personais.size(); i++) {
                    if (pos == personais.get(i).getId()) {
                        idPaPe = personais.get(i).getId(); //id do personal
                        total = i;
                        break;
                    }                    
                }
                p.setId(idP);
                p.setBonus(Double.parseDouble(txtMensalidade.getText()) + pagamentos.get(idP - 1).getBonus());
                p.setPersonalp(personais.get(total));
                dao.alterar(p);
                JOptionPane.showMessageDialog(this, "PAGAMENTO REALIZADO COM SUCESSO");
                Menu m = new Menu();
                m.setVisible(true);
                this.dispose();
            } else {
                for (int i = 0; i < personais.size(); i++) {

                    if (pos == personais.get(i).getId()) {
                        idPaPe = personais.get(i).getId(); //id do personal
                        total = i;
                        break;
                    }                    
                }
                //JOptionPane.showMessageDialog(null, personais.get(4).getId());
                p.setBonus(Double.parseDouble(txtMensalidade.getText()));
                //JOptionPane.showMessageDialog(null, personais.get(total - 1));
                p.setPersonalp(personais.get(total));
                dao.salvar(p);
                JOptionPane.showMessageDialog(this, "PAGAMENTO REALIZADO COM SUCESSO");
                Menu m = new Menu();
                m.setVisible(true);
                this.dispose();
            }

        } else {
                for (int i = 0; i < personais.size(); i++) {
                    if (pos == personais.get(i).getId()) {
                        idPaPe = personais.get(i).getId(); //id do personal
                        total = i;
                        break;
                    }                    
                }
            p.setBonus(Double.parseDouble(txtMensalidade.getText()));
            p.setPersonalp(personais.get(total));
            dao.salvar(p);
            JOptionPane.showMessageDialog(this, "PAGAMENTO REALIZADO COM SUCESSO");
            Menu m = new Menu();
            m.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btnEfetuarPagamentoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        if (cont < clientes.size() - 1) {
            cont += 1;
            mostrarNaTela();
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if (cont > 0) {
            cont -= 1;
            mostrarNaTela();
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void txtPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonalActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JToggleButton btnEfetuarPagamento;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtMensalidade;
    private javax.swing.JTextField txtPersonal;
    // End of variables declaration//GEN-END:variables
}
