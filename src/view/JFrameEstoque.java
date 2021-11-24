package view;
/**
 *
 * @author Yuri Mattiuz
 */
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Estoque;
import java.time.Instant;
import model.Produto;

public class JFrameEstoque extends javax.swing.JDialog {

    public JFrameEstoque() {
        initComponents();
        this.setModal(true);
        statusInicial(true);
        jLabelEstado.setText("Início");
        atualizaTabela();
        atualizaControles();
    }  
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryEstoque = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Estoque e order by e.estDataEntSai desc");
        listEstoque = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryEstoque.getResultList());
        queryProdutoSelecionado = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Produto p order by p.idProduto");
        listProdutoSelecionado = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryProdutoSelecionado.getResultList());
        jPanelBarraEstado = new javax.swing.JPanel();
        jLabelLabelEstado = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jPanelBarraMensagem = new javax.swing.JPanel();
        jLabelLabelMensagem = new javax.swing.JLabel();
        jLabelMensagem = new javax.swing.JLabel();
        jPanelSuperior = new javax.swing.JPanel();
        jTextFieldCodProduto = new javax.swing.JTextField();
        jTextFieldProduto = new javax.swing.JTextField();
        jLabelQuantEntrada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMotivoEntrada = new javax.swing.JTextArea();
        jButtonBuscarProduto = new javax.swing.JButton();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jFormattedTextFieldDataEntrada = new javax.swing.JFormattedTextField();
        jLabelLabelEstoqueAtual = new javax.swing.JLabel();
        jButtonAtualizar = new javax.swing.JButton();
        jLabelEstoqueAtual = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPaneTabela = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jPanelPesquisa = new javax.swing.JPanel();
        jLabelPesquisa = new javax.swing.JLabel();
        jComboBoxPesquisaStatus = new javax.swing.JComboBox<>();
        jTextFieldCampoPesquisa = new javax.swing.JTextField();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox<>();
        jButtonPesquisaOK = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");
        setMinimumSize(new java.awt.Dimension(700, 495));
        setResizable(false);

        jPanelBarraEstado.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelBarraEstado.setMaximumSize(new java.awt.Dimension(269, 19));
        jPanelBarraEstado.setMinimumSize(new java.awt.Dimension(269, 19));

        jLabelLabelEstado.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLabelEstado.setText("Estado:");

        jLabelEstado.setFont(new java.awt.Font("sansserif", 1, 11)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEstado.setText("---");

        javax.swing.GroupLayout jPanelBarraEstadoLayout = new javax.swing.GroupLayout(jPanelBarraEstado);
        jPanelBarraEstado.setLayout(jPanelBarraEstadoLayout);
        jPanelBarraEstadoLayout.setHorizontalGroup(
            jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBarraEstadoLayout.setVerticalGroup(
            jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelBarraMensagem.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraMensagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelBarraMensagem.setMaximumSize(new java.awt.Dimension(417, 19));
        jPanelBarraMensagem.setMinimumSize(new java.awt.Dimension(417, 19));
        jPanelBarraMensagem.setPreferredSize(new java.awt.Dimension(417, 19));

        jLabelLabelMensagem.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabelLabelMensagem.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLabelMensagem.setText("Mensagem:");

        jLabelMensagem.setFont(new java.awt.Font("sansserif", 1, 11)); // NOI18N
        jLabelMensagem.setForeground(new java.awt.Color(102, 102, 102));
        jLabelMensagem.setText("---");

        javax.swing.GroupLayout jPanelBarraMensagemLayout = new javax.swing.GroupLayout(jPanelBarraMensagem);
        jPanelBarraMensagem.setLayout(jPanelBarraMensagemLayout);
        jPanelBarraMensagemLayout.setHorizontalGroup(
            jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBarraMensagemLayout.setVerticalGroup(
            jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
            .addComponent(jLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelSuperior.setBackground(new java.awt.Color(41, 43, 211));
        jPanelSuperior.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelSuperior.setMaximumSize(new java.awt.Dimension(530, 200));
        jPanelSuperior.setMinimumSize(new java.awt.Dimension(530, 200));
        jPanelSuperior.setPreferredSize(new java.awt.Dimension(530, 200));

        jTextFieldCodProduto.setEditable(false);
        jTextFieldCodProduto.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldCodProduto.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jTextFieldCodProduto.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCodProduto.setToolTipText("");
        jTextFieldCodProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextFieldCodProduto.setEnabled(false);
        jTextFieldCodProduto.setMaximumSize(new java.awt.Dimension(12, 30));
        jTextFieldCodProduto.setSelectedTextColor(new java.awt.Color(41, 43, 211));
        jTextFieldCodProduto.setSelectionColor(new java.awt.Color(41, 43, 211));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.produto.proCodigo}"), jTextFieldCodProduto, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldCodProduto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldCodProdutoCaretUpdate(evt);
            }
        });

        jTextFieldProduto.setEditable(false);
        jTextFieldProduto.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldProduto.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextFieldProduto.setSelectedTextColor(new java.awt.Color(41, 43, 211));
        jTextFieldProduto.setSelectionColor(new java.awt.Color(41, 43, 211));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.produto.proDescricao}"), jTextFieldProduto, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldProduto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldProdutoCaretUpdate(evt);
            }
        });

        jLabelQuantEntrada.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelQuantEntrada.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuantEntrada.setText("Atualizar para:");

        jTextAreaMotivoEntrada.setBackground(new java.awt.Color(41, 43, 211));
        jTextAreaMotivoEntrada.setColumns(18);
        jTextAreaMotivoEntrada.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaMotivoEntrada.setRows(3);
        jTextAreaMotivoEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Motivo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.estMotivoEntSai}"), jTextAreaMotivoEntrada, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTextAreaMotivoEntrada);

        jButtonBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-localizar.png"))); // NOI18N
        jButtonBuscarProduto.setBorder(null);
        jButtonBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProdutoActionPerformed(evt);
            }
        });

        jTextFieldQuantidade.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldQuantidade.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jTextFieldQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.estQuantEntSai}"), jTextFieldQuantidade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldQuantidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldQuantidadeFocusLost(evt);
            }
        });
        jTextFieldQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQuantidadeKeyTyped(evt);
            }
        });

        jFormattedTextFieldDataEntrada.setEditable(false);
        jFormattedTextFieldDataEntrada.setBackground(new java.awt.Color(41, 43, 211));
        jFormattedTextFieldDataEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jFormattedTextFieldDataEntrada.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextFieldDataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextFieldDataEntrada.setSelectedTextColor(new java.awt.Color(41, 43, 211));
        jFormattedTextFieldDataEntrada.setSelectionColor(new java.awt.Color(41, 43, 211));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.estDataEntSai}"), jFormattedTextFieldDataEntrada, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabelLabelEstoqueAtual.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelLabelEstoqueAtual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelEstoqueAtual.setText("Estoque Atual");

        jButtonAtualizar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-atualizar.png"))); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setEnabled(false);
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jLabelEstoqueAtual.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabelEstoqueAtual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstoqueAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstoqueAtual.setText("--");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabelEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelLabelEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                                    .addComponent(jLabelQuantEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                                .addComponent(jButtonBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jFormattedTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jButtonBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addComponent(jLabelLabelEstoqueAtual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabelQuantEntrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(41, 43, 211));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(127, 22));
        jPanel1.setMinimumSize(new java.awt.Dimension(127, 22));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTRADA DE PRODUTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableDados.setFocusable(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listEstoque, jTableDados);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEstoque}"));
        columnBinding.setColumnName("Cód");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto}"));
        columnBinding.setColumnName("Produto");
        columnBinding.setColumnClass(model.Produto.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estQuantEntSai}"));
        columnBinding.setColumnName("Alterado para");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estDataEntSai}"));
        columnBinding.setColumnName("Data ent/sai");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableDadosMouseReleased(evt);
            }
        });
        jScrollPaneTabela.setViewportView(jTableDados);
        if (jTableDados.getColumnModel().getColumnCount() > 0) {
            jTableDados.getColumnModel().getColumn(0).setResizable(false);
            jTableDados.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTableDados.getColumnModel().getColumn(1).setResizable(false);
            jTableDados.getColumnModel().getColumn(1).setPreferredWidth(280);
            jTableDados.getColumnModel().getColumn(2).setResizable(false);
            jTableDados.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTableDados.getColumnModel().getColumn(3).setResizable(false);
            jTableDados.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        jPanelPesquisa.setBackground(new java.awt.Color(41, 43, 211));
        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelPesquisa.setMaximumSize(new java.awt.Dimension(526, 43));
        jPanelPesquisa.setMinimumSize(new java.awt.Dimension(526, 43));
        jPanelPesquisa.setPreferredSize(new java.awt.Dimension(526, 43));
        jPanelPesquisa.setLayout(new java.awt.GridBagLayout());

        jLabelPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPesquisa.setText("PESQUISAR ENTRADAS");
        jLabelPesquisa.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanelPesquisa.add(jLabelPesquisa, gridBagConstraints);

        jComboBoxPesquisaStatus.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jComboBoxPesquisaStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        jComboBoxPesquisaStatus.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 6, 0, 0);
        jPanelPesquisa.add(jComboBoxPesquisaStatus, gridBagConstraints);

        jTextFieldCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 146;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelPesquisa.add(jTextFieldCampoPesquisa, gridBagConstraints);

        jComboBoxTipoPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Produto" }));
        jComboBoxTipoPesquisa.setSelectedIndex(1);
        jComboBoxTipoPesquisa.setFocusable(false);
        jComboBoxTipoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoPesquisaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 5, 0);
        jPanelPesquisa.add(jComboBoxTipoPesquisa, gridBagConstraints);

        jButtonPesquisaOK.setText("OK");
        jButtonPesquisaOK.setFocusable(false);
        jButtonPesquisaOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaOKActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 5, 11);
        jPanelPesquisa.add(jButtonPesquisaOK, gridBagConstraints);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(41, 43, 211));
        jPanel6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.setMaximumSize(new java.awt.Dimension(127, 22));
        jPanel6.setMinimumSize(new java.awt.Dimension(127, 22));

        jLabel4.setBackground(new java.awt.Color(41, 43, 211));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PESQUISA DE ENTRADAS DE PRODUTOS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(41, 43, 211));

        jButtonNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-novo.png"))); // NOI18N
        jButtonNovo.setToolTipText("Adicionar um novo Serviço");
        jButtonNovo.setBorderPainted(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonNovo.setFocusPainted(false);
        jButtonNovo.setFocusable(false);
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovo.setMaximumSize(new java.awt.Dimension(82, 37));
        jButtonNovo.setMinimumSize(new java.awt.Dimension(82, 37));
        jButtonNovo.setPreferredSize(new java.awt.Dimension(82, 37));
        jButtonNovo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-novo-over2.png"))); // NOI18N
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-salvar.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Gravar o novo serviço no banco de dados");
        jButtonSalvar.setBorderPainted(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setFocusPainted(false);
        jButtonSalvar.setFocusable(false);
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvar.setMaximumSize(new java.awt.Dimension(98, 37));
        jButtonSalvar.setMinimumSize(new java.awt.Dimension(98, 37));
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(98, 37));
        jButtonSalvar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-salvar-over2.png"))); // NOI18N
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-cancelar.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar a operação atual");
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.setFocusable(false);
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(119, 37));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(119, 37));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(119, 37));
        jButtonCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-cancelar-over2.png"))); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAlterar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-alterar.png"))); // NOI18N
        jButtonAlterar.setToolTipText("Alterar dados do cadastro do serviço");
        jButtonAlterar.setBorderPainted(false);
        jButtonAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.setFocusPainted(false);
        jButtonAlterar.setFocusable(false);
        jButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAlterar.setMaximumSize(new java.awt.Dimension(108, 37));
        jButtonAlterar.setMinimumSize(new java.awt.Dimension(108, 37));
        jButtonAlterar.setPreferredSize(new java.awt.Dimension(108, 37));
        jButtonAlterar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-alterar-over2.png"))); // NOI18N
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-excluir.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir o cadastro do serviço");
        jButtonExcluir.setBorderPainted(false);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.setFocusPainted(false);
        jButtonExcluir.setFocusable(false);
        jButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExcluir.setMaximumSize(new java.awt.Dimension(97, 37));
        jButtonExcluir.setMinimumSize(new java.awt.Dimension(97, 37));
        jButtonExcluir.setPreferredSize(new java.awt.Dimension(97, 37));
        jButtonExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-excluir-over2.png"))); // NOI18N
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonImprimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonImprimir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-imprimir.png"))); // NOI18N
        jButtonImprimir.setToolTipText("Imprimir relatórios de serviços cadastrados");
        jButtonImprimir.setBorderPainted(false);
        jButtonImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonImprimir.setEnabled(false);
        jButtonImprimir.setFocusPainted(false);
        jButtonImprimir.setFocusable(false);
        jButtonImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonImprimir.setMaximumSize(new java.awt.Dimension(110, 37));
        jButtonImprimir.setMinimumSize(new java.awt.Dimension(110, 37));
        jButtonImprimir.setPreferredSize(new java.awt.Dimension(110, 37));
        jButtonImprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-imprimir-over2.png"))); // NOI18N

        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-sair.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair da tela de Cadastro de Serviços");
        jButtonSair.setBorderPainted(false);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setMaximumSize(new java.awt.Dimension(80, 37));
        jButtonSair.setMinimumSize(new java.awt.Dimension(80, 37));
        jButtonSair.setPreferredSize(new java.awt.Dimension(78, 37));
        jButtonSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-sair-over2.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelSuperior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(758, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTableDados.clearSelection();
        limparCampos();
        statusInicial(false);
        controlePesquisa(false);
        jLabelEstado.setText("Inserção");
        jLabelMensagem.setText("Alterando Estoque...");
        jTextFieldProduto.requestFocus();
        listEstoque.add(new Estoque());
        int linha = listEstoque.size() - 1;
        jTableDados.setRowSelectionInterval(linha, linha);
        atualizaControles();
        jTextFieldCampoPesquisa.setEnabled(false);
        jTableDados.setEnabled(false);
        java.util.Date hoje = Date.from(Instant.now());
        jFormattedTextFieldDataEntrada.setValue(hoje);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private int validaCampos(){
        if(jTextFieldCodProduto.getText().equals("") || jFormattedTextFieldDataEntrada.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios em azul");
            jTextFieldCodProduto.requestFocus();
            jFormattedTextFieldDataEntrada.setBackground(Color.CYAN);
            jTextFieldCodProduto.setBackground(Color.CYAN);
            if(!jTextFieldCodProduto.getText().equals(""))
                jTextFieldCodProduto.setBackground(Color.WHITE);
            if(!jFormattedTextFieldDataEntrada.getText().equals(""))
                jFormattedTextFieldDataEntrada.setBackground(Color.WHITE);
            return 0;
        }
        return 1;
    }
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void Cancelar(){
        jTableDados.clearSelection();
        limparCampos();
        statusInicial(true);
        jLabelEstado.setText("Início");
        jLabelMensagem.setText("---");
        jTableDados.clearSelection();
        atualizaTabela();
        controlePesquisa(true);
        atualizaControles();
        jTableDados.setEnabled(true);
        jTextFieldCampoPesquisa.setEnabled(true);
    }
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(!jTextFieldCodProduto.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
            int cancelar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar? Os dados não salvos serão perdidos!");
            if (cancelar == 0) { //sim
                Cancelar();
            }
        } else {
            Cancelar();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma entrada/saída de produto!");
        } else {
            jTextFieldCampoPesquisa.setEnabled(false);
            jTableDados.setEnabled(false);
            jTextFieldCodProduto.requestFocus();
            jLabelEstado.setText("Alteração");
            jLabelMensagem.setText("Alterando dados da entrada/saída do produto...");
            statusInicial(false);
            controlePesquisa(false);
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione uma entrada/saída de produto!");
        } else {
            int confirmaExclusao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este registro? Essa operação não poderá ser desfeita!");
            if (confirmaExclusao == 0){ //sim
                int linhaSelecionada = jTableDados.getSelectedRow();
                Estoque est = listEstoque.get(linhaSelecionada);
                try {
                    entityManager.getTransaction().begin();
                    est = entityManager.merge(est);
                    entityManager.remove(est);
                    entityManager.getTransaction().commit();
                    jLabelMensagem.setText("Registro excluído com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro, o registro não foi excluído!\nErro: " + e);
                    jLabelMensagem.setText("Ocorreu um erro, o registro não foi excluído!");
                    if(!entityManager.getTransaction().isActive())
                        entityManager.getTransaction().begin();
                    entityManager.getTransaction().rollback();
                }
            }
            jTableDados.clearSelection();
            limparCampos();
            atualizaTabela();
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        if(!jTextFieldCodProduto.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
            int confirmaSaida = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar o programa? Os dados não salvos serão perdidos!");
            if (confirmaSaida == 0) //sim
                dispose();
        }else
            dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldCampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyReleased
        controlePesquisa(true);
        atualizaTabela();
        atualizaControles();
    }//GEN-LAST:event_jTextFieldCampoPesquisaKeyReleased

    private void jButtonPesquisaOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaOKActionPerformed
        atualizaTabela();
        atualizaControles();
    }//GEN-LAST:event_jButtonPesquisaOKActionPerformed

    private void jTableDadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosMouseReleased
        if((jTableDados.getSelectedRow() > -1) &&
                ((!jLabelEstado.getText().equals("Alteração") && (!jLabelEstado.getText().equals("Inserção"))))){
            jButtonExcluir.setEnabled(true);
        }
        if(!jTableDados.isEnabled())
            JOptionPane.showMessageDialog(null, "Você deve CANCELAR ou SALVAR a operação atual!");
    }//GEN-LAST:event_jTableDadosMouseReleased

    private void jTextFieldCampoPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaKeyTyped
        if(jComboBoxTipoPesquisa.getSelectedItem().equals("Código")){
            String caracteres="0987654321";
            if(!caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextFieldCampoPesquisaKeyTyped

    private void jComboBoxTipoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoPesquisaActionPerformed
        if(jComboBoxTipoPesquisa.getSelectedIndex() == 0){
            jTextFieldCampoPesquisa.setText("");
        }
        atualizaTabela();
    }//GEN-LAST:event_jComboBoxTipoPesquisaActionPerformed

    private void jButtonBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarProdutoActionPerformed
        JFrameBuscaProduto buscaProduto = new JFrameBuscaProduto();
        buscaProduto.setLocationRelativeTo(this);
        buscaProduto.setVisible(true);
        jTextFieldCodProduto.setText(buscaProduto.getCodProduto());
        jTextFieldProduto.setText(buscaProduto.getProduto());
        jTextFieldQuantidade.setText(String.valueOf(jLabelEstoqueAtual.getText()));
        if(!jTextFieldCodProduto.getText().equals("")){
            jButtonAtualizar.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonBuscarProdutoActionPerformed

    private void buscarProduto(){
        String ejbql = "from Produto p where p.proCodigo = '" + jTextFieldCodProduto.getText() + "'";
        queryProdutoSelecionado = entityManager.createQuery(ejbql);
        listProdutoSelecionado.clear();
        listProdutoSelecionado.addAll(queryProdutoSelecionado.getResultList());
        jLabelEstoqueAtual.setText(String.valueOf(listProdutoSelecionado.get(0).getProEstoqueAtual()));
    }
    
    private void jTextFieldCodProdutoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldCodProdutoCaretUpdate
        if(!jTextFieldCodProduto.getText().equals("")){
            buscarProduto();
        }
    }//GEN-LAST:event_jTextFieldCodProdutoCaretUpdate

    private void jTextFieldProdutoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldProdutoCaretUpdate
        //jLabelFoto.setIcon(new ImageIcon(String.valueOf(listProdutoSelecionado.get(0).getProFoto())));
        //jLabelFoto.setPreferredSize(new Dimension(130, 130));
        
    }//GEN-LAST:event_jTextFieldProdutoCaretUpdate

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        int valida = validaCampos();
        if(valida == 1){
            int linhaSelecionada = jTableDados.getSelectedRow();
            Estoque est = listEstoque.get(linhaSelecionada);
            
            est.adicionarProduto((Produto)listProdutoSelecionado.get(0));
            try {
               entityManager.getTransaction().begin();
               entityManager.persist(est);
               entityManager.getTransaction().commit();
                if (jLabelEstado.getText().equals("Alteração")) {
                    jLabelMensagem.setText("Dados alterados com sucesso!");
                } else {
                    jLabelMensagem.setText("Novo estoque cadastrado com sucesso!");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, o estoque não foi alterado!\nErro: " + e);
                jLabelMensagem.setText("Ocorreu um erro, o estoque não foi alterado!");
                if(!entityManager.getTransaction().isActive())
                    entityManager.getTransaction().begin();
                entityManager.getTransaction().rollback();
            }
            //altera o estoque
            Produto pro = new Produto(listProdutoSelecionado.get(0).getIdProduto(),
                                      listProdutoSelecionado.get(0).getProCodigo(),                                          
                                      listProdutoSelecionado.get(0).getProDescricao(),
                                      listProdutoSelecionado.get(0).getProPrecoVenda(),
                                      listProdutoSelecionado.get(0).getProEstoqueInicial(),
                                      listProdutoSelecionado.get(0).getProEstoqueAtual() -
                                              listProdutoSelecionado.get(0).getProEstoqueAtual() +
                                              Integer.parseInt(String.valueOf(jTextFieldQuantidade.getText())),
                                      listProdutoSelecionado.get(0).getProEstoqueMinimo(),
                                      listProdutoSelecionado.get(0).getProFoto(),
                                      listProdutoSelecionado.get(0).getCategoria(),
                                      listProdutoSelecionado.get(0).getMarcaProduto(),
                                      listProdutoSelecionado.get(0).getGrupo());        
            try {
                entityManager.getTransaction().begin();
                pro = entityManager.merge(pro);
                entityManager.persist(pro);
                entityManager.getTransaction().commit();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar o estoque");
            }
            jTableDados.setEnabled(true);
            jTextFieldCampoPesquisa.setEnabled(true);
            jLabelEstado.setText("Início");
            limparCampos();
            atualizaTabela();
            statusInicial(true);
            controlePesquisa(true);
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jTextFieldQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeKeyTyped
        String caracteres2="0123456789";
        if(!caracteres2.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldQuantidadeKeyTyped

    private void jTextFieldQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeFocusLost
        if(jTextFieldQuantidade.getText().equals(""))
            jTextFieldQuantidade.setText(jLabelEstoqueAtual.getText());
    }//GEN-LAST:event_jTextFieldQuantidadeFocusLost

    private void jTextFieldQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeFocusGained
        if(jTextFieldQuantidade.getText().equals("0.00") ||
                jTextFieldQuantidade.getText().equals("0") ||
                jTextFieldQuantidade.getText().equals(jLabelEstoqueAtual.getText()))
            jTextFieldQuantidade.setText("");
    }//GEN-LAST:event_jTextFieldQuantidadeFocusGained
    
    
    private void statusInicial(boolean status){
        jTextFieldCodProduto.setEnabled(!status);
        jTextFieldProduto.setEnabled(!status);
        jFormattedTextFieldDataEntrada.setEnabled(!status);
        jTextFieldQuantidade.setEnabled(!status);
        jTextAreaMotivoEntrada.setEnabled(!status);
        jButtonBuscarProduto.setEnabled(!status);
    }
    
    
    private void limparCampos(){
        jTextFieldCodProduto.setText("");
        jTextFieldProduto.setText("");
        jFormattedTextFieldDataEntrada.setText("");
        jTextFieldQuantidade.setText("");
        jTextAreaMotivoEntrada.setText("");
        jLabelEstoqueAtual.setText("--");
        jTextFieldCodProduto.setBackground(Color.WHITE);
        jFormattedTextFieldDataEntrada.setBackground(Color.WHITE);
    }
    
    private void controlePesquisa(boolean status){
        jButtonPesquisaOK.setEnabled(status);
        jComboBoxPesquisaStatus.setEnabled(status);
        jComboBoxTipoPesquisa.setEnabled(status);
        jButtonExcluir.setEnabled(status);
    }
    
    /**
    
     */
    private void atualizaTabela(){
        entityManager.clear();
        String ejbql = "from Estoque e ";
        String campoPesquisa = "";
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Produto")){
            campoPesquisa = "e.produto.proDescricao";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql += "where upper(" + campoPesquisa + ") like '%" + filtro.toUpperCase() + "%'";
            }
        }
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Código")){
            campoPesquisa = "e.idEstoque";
            if(!jTextFieldCampoPesquisa.getText().equals("")){
                int filtro = Integer.parseInt(jTextFieldCampoPesquisa.getText());
                if(filtro > -1){
                    ejbql += "where " + campoPesquisa + " = " + filtro;
                }
            }
        }
        ejbql += " order by " + campoPesquisa + " desc";
        queryEstoque = entityManager.createQuery(ejbql);
        listEstoque.clear();
        listEstoque.addAll(queryEstoque.getResultList());
        int linha = listEstoque.size() - 1;
        if(listEstoque.size() > 0){
            jTableDados.scrollRectToVisible(jTableDados.getCellRect(linha, linha, true));
        }else{
            controlePesquisa(false);
            jButtonNovo.setEnabled(true);
            jButtonImprimir.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jLabelMensagem.setText("Dados solicitados não foram localizados!");
        }
        if(listEstoque.size() == 1){
            jTableDados.setRowSelectionInterval(linha, linha);
            atualizaControles();
        }else
            limparCampos();
    }
    
    private void atualizaControles(){
        if(jLabelEstado.getText().equals("Início")){
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonAtualizar.setEnabled(false);
        }else if(jLabelEstado.getText().equals("Alteração") || 
                (jLabelEstado.getText().equals("Inserção"))){
            jButtonNovo.setEnabled(false);
            jButtonCancelar.setEnabled(true);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonBuscarProduto;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisaOK;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxPesquisaStatus;
    private javax.swing.JComboBox<String> jComboBoxTipoPesquisa;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataEntrada;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstoqueAtual;
    private javax.swing.JLabel jLabelLabelEstado;
    private javax.swing.JLabel jLabelLabelEstoqueAtual;
    private javax.swing.JLabel jLabelLabelMensagem;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JLabel jLabelQuantEntrada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelBarraEstado;
    private javax.swing.JPanel jPanelBarraMensagem;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextArea jTextAreaMotivoEntrada;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
    private javax.swing.JTextField jTextFieldCodProduto;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldQuantidade;
    private java.util.List<Estoque> listEstoque;
    private java.util.List<Produto> listProdutoSelecionado;
    private javax.persistence.Query queryEstoque;
    private javax.persistence.Query queryProdutoSelecionado;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
