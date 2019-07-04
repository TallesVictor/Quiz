package view;

import controller.PerguntaController;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Pergunta;

public class PerguntaListagem extends javax.swing.JFrame {
    PerguntaController controller;
    /**
     * Creates new form PerguntaListagem
     */
    public PerguntaListagem() {
        initComponents();
        this.setResizable(false);
        controller = new PerguntaController();
        ArrayList listaPerguntas = controller.buscarPerguntas();
        mostrarPerguntas(listaPerguntas);
    }
    
    private void mostrarPerguntas(ArrayList<Pergunta> listaUsuarios) {
        String col[] = {"id", "Pergunta", "Opcao Correta"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        for (Pergunta p : listaUsuarios) {
            Object[] data = {
                p.getId(), 
                p.getPergunta(), 
                p.getOpcaoCorreta()};
            tableModel.addRow(data);
        }        
        tabelaPerguntas = new JTable(tableModel);
        panelPerguntas.setViewportView(tabelaPerguntas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelPerguntas = new javax.swing.JScrollPane();
        tabelaPerguntas = new javax.swing.JTable();
        botaoCadastrarPergunta = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        campoIdPesquisa = new javax.swing.JTextField();
        filtroPergunta = new javax.swing.JTextField();
        botaoFiltrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        filtroResposta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        filtroOpcaoCorreta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        filtroId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Listagem de Perguntas");

        tabelaPerguntas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        panelPerguntas.setViewportView(tabelaPerguntas);

        botaoCadastrarPergunta.setText("Cadastrar Nova Pergunta");
        botaoCadastrarPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarPerguntaActionPerformed(evt);
            }
        });

        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoFiltrar.setText("Filtrar");
        botaoFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFiltrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Pergunta");

        jLabel3.setText("Resposta");

        jLabel4.setText("Opção Correta");

        filtroOpcaoCorreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroOpcaoCorretaActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        jLabel6.setText("Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPerguntas)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoCadastrarPergunta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 58, Short.MAX_VALUE))
                                    .addComponent(filtroId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(filtroPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(filtroResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filtroOpcaoCorreta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoFiltrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filtroResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filtroOpcaoCorreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filtroPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filtroId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPerguntas, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarPergunta)
                    .addComponent(botaoEditar)
                    .addComponent(campoIdPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarPerguntaActionPerformed
        this.setVisible(false);
        mostrarFormulario();
    }//GEN-LAST:event_botaoCadastrarPerguntaActionPerformed

    private void filtroOpcaoCorretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroOpcaoCorretaActionPerformed
        
    }//GEN-LAST:event_filtroOpcaoCorretaActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        String sid = campoIdPesquisa.getText();
        Integer id;
        if (!"".equals(sid)) {
            try {
                id = Integer.parseInt(sid);
                Pergunta p = controller.buscarPorId(id);
                mostrarFormulario(p);
            } catch (Exception e) {
                
            }
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFiltrarActionPerformed
        String id = filtroId.getText();
        String pergunta = filtroPergunta.getText();
        String resposta = filtroResposta.getText();
        String opcao = filtroOpcaoCorreta.getText();
        ArrayList listaPerguntas = controller.filtrarPerguntas(id, pergunta, resposta, opcao);
        mostrarPerguntas(listaPerguntas);
    }//GEN-LAST:event_botaoFiltrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarPergunta;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoFiltrar;
    private javax.swing.JTextField campoIdPesquisa;
    private javax.swing.JTextField filtroId;
    private javax.swing.JTextField filtroOpcaoCorreta;
    private javax.swing.JTextField filtroPergunta;
    private javax.swing.JTextField filtroResposta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane panelPerguntas;
    private javax.swing.JTable tabelaPerguntas;
    // End of variables declaration//GEN-END:variables

    private void mostrarFormulario() {
        mostrarFormulario(null);
    }

    private void mostrarFormulario(Pergunta pergunta) {
        PerguntaCadastro p = new PerguntaCadastro(pergunta);
        p.setTitle("Cadastrar Pergunta");
        p.setLocationRelativeTo(null);
        this.setVisible(false);
        p.setVisible(true);
    }
}
