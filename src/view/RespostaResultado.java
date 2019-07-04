package view;

public class RespostaResultado extends javax.swing.JFrame {

    public RespostaResultado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Porcentagem = new javax.swing.JLabel();
        acertoserro = new javax.swing.JLabel();
        GerenciarPerguntas = new javax.swing.JButton();
        QuizNovamente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Parabéns, você concluiu o Quiz e seu aproveitamento foi de:  ");

        Porcentagem.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        Porcentagem.setText("%");

        acertoserro.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        acertoserro.setText("Você acertou X e errou Y");

        GerenciarPerguntas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        GerenciarPerguntas.setText("Gerenciar Perguntas");
        GerenciarPerguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarPerguntasActionPerformed(evt);
            }
        });

        QuizNovamente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        QuizNovamente.setText("Fazer quiz novamente");
        QuizNovamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizNovamenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(GerenciarPerguntas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QuizNovamente)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Porcentagem)
                    .addComponent(acertoserro))
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Porcentagem)
                .addGap(18, 18, 18)
                .addComponent(acertoserro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GerenciarPerguntas)
                    .addComponent(QuizNovamente))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GerenciarPerguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarPerguntasActionPerformed
        mostrarListagem();
    }//GEN-LAST:event_GerenciarPerguntasActionPerformed

    private void QuizNovamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizNovamenteActionPerformed
        mostrarQuiz();
    }//GEN-LAST:event_QuizNovamenteActionPerformed

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
            java.util.logging.Logger.getLogger(RespostaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RespostaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RespostaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RespostaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RespostaResultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GerenciarPerguntas;
    public static javax.swing.JLabel Porcentagem;
    private javax.swing.JButton QuizNovamente;
    public static javax.swing.JLabel acertoserro;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private void mostrarListagem() {
        PerguntaListagem p = new PerguntaListagem();
        p.setTitle("Listagem de Perguntas");
        p.setLocationRelativeTo(null);
        this.setVisible(false);
        p.setVisible(true);
    }

    private void mostrarQuiz() {
        RespostaExibicao q = new RespostaExibicao();
        q.setTitle("Quiz - Perguntas");
        q.setLocationRelativeTo(null);
        this.setVisible(false);
        q.setVisible(true);
    }

}
