package view;
/**
 *
 * @author Yuri Mattiuz
 */
import javax.swing.JOptionPane;
import model.Servico;

public class JFrameBuscaServico extends javax.swing.JDialog {

    private Integer idServico = 0; 
    private String serDescricao = ""; 
    private double serValor = 0.00;
    private Integer indice = 0;

    public Integer getIndice() {
        return indice;
    }
    public void setIndice(Integer indice) {
        this.indice = indice;
    }
    
    public Integer getIdServico() {
        return idServico;
    }
    public void setIdServico(Integer idServico) {
        this.idServico = idServico;
    }
    
    public String getDescricao() {
        return serDescricao;    
    }

    public void setDescricao(String descricao) {
        this.serDescricao = descricao;    
    }

    public double getValor() {
        return serValor;
    }
    public void setValor(double valor) {
        this.serValor = valor;
    }
    
    public JFrameBuscaServico() {
        initComponents();
        this.setModal(true);
        jTextFieldCampoPesquisa.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryServico = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Servico s order by s.serDescricao");
        listServico = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryServico.getResultList());
        jPanel1 = new javax.swing.JPanel();
        jComboBoxPesquisarPor = new javax.swing.JComboBox<>();
        jTextFieldCampoPesquisa = new javax.swing.JTextField();
        jButtonPesquisarOK = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisaServico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 43, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxPesquisarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Descrição" }));
        jComboBoxPesquisarPor.setSelectedIndex(1);
        jComboBoxPesquisarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisarPorActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxPesquisarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, 33));

        jTextFieldCampoPesquisa.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldCampoPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCampoPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextFieldCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldCampoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, -1));

        jButtonPesquisarOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-localizar.png"))); // NOI18N
        jButtonPesquisarOK.setMaximumSize(new java.awt.Dimension(83, 50));
        jButtonPesquisarOK.setMinimumSize(new java.awt.Dimension(83, 50));
        jButtonPesquisarOK.setPreferredSize(new java.awt.Dimension(83, 50));
        jButtonPesquisarOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarOKActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisarOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 359, 111, 30));

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-cancelar.png"))); // NOI18N
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(83, 50));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(83, 50));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(83, 50));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 355, 114, 34));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecione o tipo de pesquisa:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite no campo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 240, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Serviço");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listServico, jTablePesquisaServico);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idServico}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${serDescricao}"));
        columnBinding.setColumnName("Descrição");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${serValor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTablePesquisaServico);
        if (jTablePesquisaServico.getColumnModel().getColumnCount() > 0) {
            jTablePesquisaServico.getColumnModel().getColumn(0).setResizable(false);
            jTablePesquisaServico.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTablePesquisaServico.getColumnModel().getColumn(1).setResizable(false);
            jTablePesquisaServico.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTablePesquisaServico.getColumnModel().getColumn(2).setResizable(false);
            jTablePesquisaServico.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyReleased
        atualizaTabela();
    }//GEN-LAST:event_jTextFieldCampoPesquisaKeyReleased

    /**
     * Seta as variáveis locais com os dados resultantes no jTable.
     * As variáveis serão solicitadas pelos métodos Get nos jFrames que chamaram este jFrame de busca
     * @param evt 
     */
    private void jButtonPesquisarOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarOKActionPerformed
        if(jTablePesquisaServico.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um produto!");
        }else{
            int linha = jTablePesquisaServico.getSelectedRow();
            this.setIndice(jTablePesquisaServico.getSelectedRow());
            this.setIdServico(Integer.parseInt(String.valueOf(jTablePesquisaServico.getValueAt(linha, 0))));
            this.setDescricao(String.valueOf(jTablePesquisaServico.getValueAt(linha, 1)));
            this.setValor((Double.parseDouble(String.valueOf(jTablePesquisaServico.getValueAt(linha, 2)))));
            dispose();
        }
    }//GEN-LAST:event_jButtonPesquisarOKActionPerformed

    /**
     * 
     * @param evt 
     */
    private void jTextFieldCampoPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyTyped
        if(jComboBoxPesquisarPor.getSelectedItem().equals("Código")){
            String caracteres="0987654321";
            if(!caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextFieldCampoPesquisaKeyTyped

    private void jComboBoxPesquisarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPesquisarPorActionPerformed
        if(jComboBoxPesquisarPor.getSelectedIndex() == 0){
            jTextFieldCampoPesquisa.setText("");
        }
    }//GEN-LAST:event_jComboBoxPesquisarPorActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    
    /**
     * 
     */
    private void atualizaTabela(){
        entityManager.clear();
        String ejbql = "from Servico s ";
        String atributo = "";
        if(jComboBoxPesquisarPor.getSelectedItem().toString().equals("Descrição")){
            atributo = "s.serDescricao";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql += "where upper(" + atributo + ")like '%" + filtro.toUpperCase() + "%'";
            }
        }
        if(jComboBoxPesquisarPor.getSelectedItem().toString().equals("Código")){
            atributo = "s.idServico";
            if(!jTextFieldCampoPesquisa.getText().equals("")){
                int filtro = Integer.parseInt(jTextFieldCampoPesquisa.getText());
                if(filtro > -1){
                    ejbql += "where " + atributo + " = " + filtro;
                }
            }
        }
        ejbql += " order by " + atributo;
        queryServico = entityManager.createQuery(ejbql);
        listServico.clear();
        listServico.addAll(queryServico.getResultList());
        int linha = listServico.size() - 1;
        if(listServico.size() > 0){
            jTablePesquisaServico.scrollRectToVisible(jTablePesquisaServico.getCellRect(linha, linha, true));
        }
        if(listServico.size() == 1){
            jTablePesquisaServico.setRowSelectionInterval(linha, linha);
            this.getRootPane().setDefaultButton(jButtonPesquisarOK);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonPesquisarOK;
    private javax.swing.JComboBox<String> jComboBoxPesquisarPor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePesquisaServico;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
    private java.util.List<Servico> listServico;
    private javax.persistence.Query queryServico;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
