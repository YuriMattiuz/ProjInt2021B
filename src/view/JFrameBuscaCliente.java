package view;
/**
 *
 * @author Yuri Mattiuz
 */
import javax.swing.JOptionPane;
import model.Cliente;

public class JFrameBuscaCliente extends javax.swing.JDialog {

    private String codCliente = ""; 
    private String nomeCliente = "";

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCodCliente() {
        return codCliente;
    }
    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
    
    public JFrameBuscaCliente() {
        initComponents();
        this.setModal(true); 
        jTextFieldCampoPesquisa.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryCliente = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Cliente c order by c.idCliente");
        listCliente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryCliente.getResultList());
        jPanel1 = new javax.swing.JPanel();
        jComboBoxPesquisarPor = new javax.swing.JComboBox<>();
        jTextFieldCampoPesquisa = new javax.swing.JTextField();
        jButtonPesquisarOK = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisaCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 43, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBoxPesquisarPor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBoxPesquisarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome" }));
        jComboBoxPesquisarPor.setSelectedIndex(1);
        jComboBoxPesquisarPor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxPesquisarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisarPorActionPerformed(evt);
            }
        });

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

        jButtonCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-cancelar.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(83, 50));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(83, 50));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(83, 50));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Clientes");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite no campo:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecione o tipo de pesquisa:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jComboBoxPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonPesquisarOK, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jComboBoxPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPesquisarOK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTablePesquisaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listCliente, jTablePesquisaCliente);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCliente}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNome}"));
        columnBinding.setColumnName("Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCPF}"));
        columnBinding.setColumnName("CPF");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliDataNasc}"));
        columnBinding.setColumnName("Data Nasc.");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTablePesquisaCliente);
        if (jTablePesquisaCliente.getColumnModel().getColumnCount() > 0) {
            jTablePesquisaCliente.getColumnModel().getColumn(0).setResizable(false);
            jTablePesquisaCliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTablePesquisaCliente.getColumnModel().getColumn(1).setResizable(false);
            jTablePesquisaCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTablePesquisaCliente.getColumnModel().getColumn(2).setResizable(false);
            jTablePesquisaCliente.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTablePesquisaCliente.getColumnModel().getColumn(3).setResizable(false);
            jTablePesquisaCliente.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
        if(jTablePesquisaCliente.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um cliente!");
        }else{
            int linha = jTablePesquisaCliente.getSelectedRow();
            this.setCodCliente(String.valueOf(jTablePesquisaCliente.getValueAt(linha, 0)));
            this.setNomeCliente(String.valueOf(jTablePesquisaCliente.getValueAt(linha, 1)));
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

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    
    
    private void atualizaTabela(){
        entityManager.clear();
        String ejbql = "from Cliente c ";
        String atributo = "";
        if(jComboBoxPesquisarPor.getSelectedItem().toString().equals("Nome")){
            atributo = "c.cliNome";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql += "where upper(" + atributo + ")like '%" + filtro.toUpperCase() + "%'";
            }
        }
        if(jComboBoxPesquisarPor.getSelectedItem().toString().equals("")){
            atributo = "c.idCliente";
            if(!jTextFieldCampoPesquisa.getText().equals("")){
                int filtro = Integer.parseInt(jTextFieldCampoPesquisa.getText());
                if(filtro > -1){
                    ejbql += "where " + atributo + " = " + filtro;
                }
            }
        }
        ejbql += " order by " + atributo;
        queryCliente = entityManager.createQuery(ejbql);
        listCliente.clear();
        listCliente.addAll(queryCliente.getResultList());
        int linha = listCliente.size() - 1;
        if(listCliente.size() > 0){
            jTablePesquisaCliente.scrollRectToVisible(jTablePesquisaCliente.getCellRect(linha, linha, true));
        }
        if(listCliente.size() == 1){
            jTablePesquisaCliente.setRowSelectionInterval(linha, linha);
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
    private javax.swing.JTable jTablePesquisaCliente;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
    private java.util.List<Cliente> listCliente;
    private javax.persistence.Query queryCliente;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
