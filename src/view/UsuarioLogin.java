/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;

public class UsuarioLogin extends javax.swing.JFrame {

    UsuarioController controller;
    
    /**
     * Creates new form Bemvindo
     */
    public UsuarioLogin() {
        initComponents();
        controller = new UsuarioController();
    }
        private void mostrarQuiz(){
        RespostaExibicao q = new RespostaExibicao();
        q.setTitle("Quiz - Perguntas");
        q.setLocationRelativeTo(null);
        this.setVisible(false);
        q.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoBoasvinda = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        CampoSenha = new javax.swing.JTextField();
        Sair = new javax.swing.JButton();
        Entrar = new javax.swing.JButton();
        Errousuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoBoasvinda.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TextoBoasvinda.setText("Seja bem-vindo ao Quiz");

        Usuario.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Usuario.setText("Usuario");

        Senha.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Senha.setText("Senha");

        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });

        CampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaActionPerformed(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        Errousuario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Errousuario.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usuario)
                    .addComponent(Senha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(CampoSenha))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(TextoBoasvinda)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(Errousuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoBoasvinda)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha)
                    .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Errousuario, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sair)
                    .addComponent(Entrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void CampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        //capturar os campos digitados
        String usuario = CampoUsuario.getText();
        String senha = CampoSenha.getText();
        String usuarioValido = controller.validaLogin(usuario, senha);
        if ("valido".equals(usuarioValido)) {
            mostrarQuiz();
        }else{
            Errousuario.setText("Usuario ou senha incorretos");
        }
        
        
        
        
    }//GEN-LAST:event_EntrarActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoSenha;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel Errousuario;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel TextoBoasvinda;
    private javax.swing.JLabel Usuario;
    // End of variables declaration//GEN-END:variables
}
