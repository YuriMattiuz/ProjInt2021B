package view;
/**
 *
 * @author Yuri Mattiuz
 */
import javax.swing.JOptionPane;
import model.Produto;

public class JFrameBuscaProduto extends javax.swing.JDialog {

    private Integer idProduto = 0;
    private String codProduto = "";
    private String produto = "";
    private Double preco = 0.00;
    private Integer quantidade = 0;
    private Integer indice = 0;

    public Integer getIndice() {
        return indice;
    }
    public void setIndice(Integer indice) {
        this.indice = indice;
    }
    
    public Integer getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
    
    public String getProduto() {
        return produto;    }

    public void setProduto(String produto) {
        this.produto = produto;    }

    public String getCodProduto() {
        return codProduto;
    }
    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }
    public Double getPreco(){
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public Integer getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quant){
        this.quantidade = quant;
    }
    
    public JFrameBuscaProduto() {
        initComponents();
        this.setModal(true);
        jTextFieldCampoPesquisa.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryProduto = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Produto p order by p.proDescricao");
        listProduto = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryProduto.getResultList());
        jPanel1 = new javax.swing.JPanel();
        jComboBoxPesquisarPor = new javax.swing.JComboBox<>();
        jTextFieldCampoPesquisa = new javax.swing.JTextField();
        jButtonPesquisarOK = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisaProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 270));
        setMinimumSize(new java.awt.Dimension(750, 270));

        jPanel1.setBackground(new java.awt.Color(41, 43, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBoxPesquisarPor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBoxPesquisarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Descrição" }));
        jComboBoxPesquisarPor.setSelectedIndex(1);
        jComboBoxPesquisarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisarPorActionPerformed(evt);
            }
        });

        jTextFieldCampoPesquisa.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldCampoPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextFieldCampoPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCampoPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextFieldCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyTyped(evt);
            }
        });

        jButtonPesquisarOK.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonPesquisarOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-localizar.png"))); // NOI18N
        jButtonPesquisarOK.setBorder(null);
        jButtonPesquisarOK.setMaximumSize(new java.awt.Dimension(83, 50));
        jButtonPesquisarOK.setMinimumSize(new java.awt.Dimension(83, 50));
        jButtonPesquisarOK.setPreferredSize(new java.awt.Dimension(83, 50));
        jButtonPesquisarOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarOKActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-cancelar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setMaximumSize(new java.awt.Dimension(83, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(83, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(83, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Produto");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecione o tipo de pesquisa:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite no campo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonPesquisarOK, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBoxPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarOK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listProduto, jTablePesquisaProduto);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idProduto}"));
        columnBinding.setColumnName("ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${proCodigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${proDescricao}"));
        columnBinding.setColumnName("Descrição");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${proEstoqueAtual}"));
        columnBinding.setColumnName("Estoque Atual");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${proPrecoVenda}"));
        columnBinding.setColumnName("Preço");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTablePesquisaProduto);
        if (jTablePesquisaProduto.getColumnModel().getColumnCount() > 0) {
            jTablePesquisaProduto.getColumnModel().getColumn(0).setResizable(false);
            jTablePesquisaProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTablePesquisaProduto.getColumnModel().getColumn(1).setResizable(false);
            jTablePesquisaProduto.getColumnModel().getColumn(1).setPreferredWidth(10);
            jTablePesquisaProduto.getColumnModel().getColumn(2).setResizable(false);
            jTablePesquisaProduto.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTablePesquisaProduto.getColumnModel().getColumn(3).setResizable(false);
            jTablePesquisaProduto.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTablePesquisaProduto.getColumnModel().getColumn(4).setResizable(false);
            jTablePesquisaProduto.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyReleased
        atualizaTabela();
    }//GEN-LAST:event_jTextFieldCampoPesquisaKeyReleased

    private void jButtonPesquisarOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarOKActionPerformed
        if(jTablePesquisaProduto.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um produto!");
        }else{
            int linha = jTablePesquisaProduto.getSelectedRow();
            this.setIndice(jTablePesquisaProduto.getSelectedRow());
            this.setIdProduto(Integer.parseInt(String.valueOf(jTablePesquisaProduto.getValueAt(linha, 0))));
            this.setCodProduto(String.valueOf(jTablePesquisaProduto.getValueAt(linha, 1)));
            this.setProduto(String.valueOf(jTablePesquisaProduto.getValueAt(linha, 2)));
            this.setQuantidade(Integer.parseInt(String.valueOf(jTablePesquisaProduto.getValueAt(linha, 3))));
            this.setPreco((Double.parseDouble(String.valueOf(jTablePesquisaProduto.getValueAt(linha, 4)))));
            dispose();
        }
    }//GEN-LAST:event_jButtonPesquisarOKActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void atualizaTabela(){
        entityManager.clear();
        String ejbql = "from Produto p ";
        String atributo = "";
        if(jComboBoxPesquisarPor.getSelectedItem().toString().equals("Descrição")){
            atributo = "p.proDescricao";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql += "where upper(" + atributo + ")like '%" + filtro.toUpperCase() + "%'";
            }
        }
        if(jComboBoxPesquisarPor.getSelectedItem().toString().equals("Código")){
            atributo = "p.idProduto";
            if(!jTextFieldCampoPesquisa.getText().equals("")){
                int filtro = Integer.parseInt(jTextFieldCampoPesquisa.getText());
                if(filtro > -1){
                    ejbql += "where " + atributo + " = " + filtro;
                }
            }
        }
        ejbql += " order by " + atributo;
        queryProduto = entityManager.createQuery(ejbql);
        listProduto.clear();
        listProduto.addAll(queryProduto.getResultList());
        int linha = listProduto.size() - 1;
        if(listProduto.size() > 0){
            jTablePesquisaProduto.scrollRectToVisible(jTablePesquisaProduto.getCellRect(linha, linha, true));
        }
        if(listProduto.size() == 1){
            jTablePesquisaProduto.setRowSelectionInterval(linha, linha);
            this.getRootPane().setDefaultButton(jButtonPesquisarOK);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPesquisarOK;
    private javax.swing.JComboBox<String> jComboBoxPesquisarPor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePesquisaProduto;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
    private java.util.List<Produto> listProduto;
    private javax.persistence.Query queryProduto;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
