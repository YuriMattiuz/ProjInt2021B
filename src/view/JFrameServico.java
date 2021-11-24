package view;
/**
 *
 * @author Yuri Mattiuz
 */
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Servico;

public class JFrameServico extends javax.swing.JDialog {

    public JFrameServico() {
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
        queryServico = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Servico s order by s.serDescricao");
        listServico = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryServico.getResultList());
        jPanel3 = new javax.swing.JPanel();
        jScrollPaneTabela = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jPanelPesquisa = new javax.swing.JPanel();
        jLabelPesquisa = new javax.swing.JLabel();
        jComboBoxPesquisaStatus = new javax.swing.JComboBox<>();
        jTextFieldCampoPesquisa = new javax.swing.JTextField();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox<>();
        jButtonPesquisaOK = new javax.swing.JButton();
        jPanelBarraEstado = new javax.swing.JPanel();
        jLabelLabelEstado = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jPanelBarraMensagem = new javax.swing.JPanel();
        jLabelLabelMensagem = new javax.swing.JLabel();
        jLabelMensagem = new javax.swing.JLabel();
        jPanelSuperior = new javax.swing.JPanel();
        jLabelLabelCodigo = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelCodServico = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Serviços");
        setMaximumSize(new java.awt.Dimension(698, 427));
        setMinimumSize(new java.awt.Dimension(698, 427));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMaximumSize(new java.awt.Dimension(526, 140));
        jPanel3.setMinimumSize(new java.awt.Dimension(526, 140));
        jPanel3.setPreferredSize(new java.awt.Dimension(526, 140));

        jTableDados.setFocusable(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listServico, jTableDados);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idServico}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${serDescricao}"));
        columnBinding.setColumnName("Serviço");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${serValor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
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
            jTableDados.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableDados.getColumnModel().getColumn(1).setResizable(false);
            jTableDados.getColumnModel().getColumn(1).setPreferredWidth(270);
            jTableDados.getColumnModel().getColumn(2).setResizable(false);
            jTableDados.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabela)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanelPesquisa.setBackground(new java.awt.Color(41, 43, 211));
        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelPesquisa.setMaximumSize(new java.awt.Dimension(526, 43));
        jPanelPesquisa.setMinimumSize(new java.awt.Dimension(526, 43));
        jPanelPesquisa.setPreferredSize(new java.awt.Dimension(526, 43));

        jLabelPesquisa.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPesquisa.setText("PESQUISA");
        jLabelPesquisa.setFocusable(false);

        jComboBoxPesquisaStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        jComboBoxPesquisaStatus.setFocusable(false);

        jTextFieldCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyTyped(evt);
            }
        });

        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Descrição" }));
        jComboBoxTipoPesquisa.setSelectedIndex(1);
        jComboBoxTipoPesquisa.setFocusable(false);
        jComboBoxTipoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoPesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisaOK.setText("OK");
        jButtonPesquisaOK.setFocusable(false);
        jButtonPesquisaOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisaLayout = new javax.swing.GroupLayout(jPanelPesquisa);
        jPanelPesquisa.setLayout(jPanelPesquisaLayout);
        jPanelPesquisaLayout.setHorizontalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabelPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPesquisaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisaOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPesquisa)
                    .addComponent(jComboBoxPesquisaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBarraEstadoLayout.setVerticalGroup(
            jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelEstado))
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
                .addComponent(jLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBarraMensagemLayout.setVerticalGroup(
            jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelMensagem))
        );

        jPanelSuperior.setBackground(new java.awt.Color(41, 43, 211));
        jPanelSuperior.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelSuperior.setMaximumSize(new java.awt.Dimension(530, 200));
        jPanelSuperior.setMinimumSize(new java.awt.Dimension(530, 200));
        jPanelSuperior.setPreferredSize(new java.awt.Dimension(530, 200));

        jLabelLabelCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelLabelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelCodigo.setText("Código do Serviço:");

        jTextFieldDescricao.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jTextFieldDescricao.setToolTipText("Troca de óleo, alinhamento...");
        jTextFieldDescricao.setMaximumSize(new java.awt.Dimension(12, 30));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.serDescricao}"), jTextFieldDescricao, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabelDescricao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescricao.setText("Título do Serviço:");

        jLabelCodServico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idServico}"), jLabelCodServico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabelValor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.serValor}"), jTextFieldValor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldValorFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDescricao)
                    .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelLabelCodigo)
                        .addComponent(jLabelValor, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSuperiorLayout.createSequentialGroup()
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCodServico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelLabelCodigo))
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCodServico, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(41, 43, 211));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setMaximumSize(new java.awt.Dimension(127, 22));
        jPanel4.setMinimumSize(new java.awt.Dimension(127, 22));
        jPanel4.setPreferredSize(new java.awt.Dimension(127, 22));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dados cadastrais do serviço");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 6, 3, 499);
        jPanel4.add(jLabel3, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(41, 43, 211));

        jButtonNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-novo.png"))); // NOI18N
        jButtonNovo.setToolTipText("Adicionar um novo Serviço");
        jButtonNovo.setBorderPainted(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(734, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTableDados.clearSelection();
        limparCampos();
        statusInicial(false);
        controlePesquisa(false);
        jLabelEstado.setText("Inserção");
        jLabelMensagem.setText("Cadastrando Categoria...");
        jTextFieldDescricao.requestFocus();
        listServico.add(new Servico());
        int linha = listServico.size() - 1;
        jTableDados.setRowSelectionInterval(linha, linha);
        atualizaControles();
        jTextFieldCampoPesquisa.setEnabled(false);
        jTableDados.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private int validaCampos(){
        if(jTextFieldDescricao.getText().equals("") || jTextFieldValor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios em azul");
            jTextFieldDescricao.requestFocus();
            jTextFieldValor.setBackground(Color.CYAN);
            jTextFieldDescricao.setBackground(Color.CYAN);
            if(!jTextFieldDescricao.getText().equals(""))
                jTextFieldDescricao.setBackground(Color.WHITE);
            if(!jTextFieldValor.getText().equals(""))
                jTextFieldValor.setBackground(Color.WHITE);
            return 0;
        }
        return 1;
    }
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        int valida = validaCampos();
        if(valida == 1){
            int linhaSelecionada = jTableDados.getSelectedRow();
            Servico ser = listServico.get(linhaSelecionada);
            try {
               entityManager.getTransaction().begin();
               entityManager.persist(ser);
               entityManager.getTransaction().commit();
                if (jLabelEstado.getText().equals("Alteração")) {
                    jLabelMensagem.setText("Dados do serviço alterados com sucesso!");
                } else {
                    jLabelMensagem.setText("Serviço cadastrado com sucesso!");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, o serviço não foi cadastrado!\nErro: " + e);
                jLabelMensagem.setText("Ocorreu um erro, o serviço não foi cadastrado!");
                if(!entityManager.getTransaction().isActive())
                    entityManager.getTransaction().begin();
                entityManager.getTransaction().rollback();
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
        if(!jTextFieldDescricao.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
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
            JOptionPane.showMessageDialog(null, "Selecione um serviço!");
        } else {
            jTextFieldCampoPesquisa.setEnabled(false);
            jTableDados.setEnabled(false);
            jTextFieldDescricao.requestFocus();
            jLabelEstado.setText("Alteração");
            jLabelMensagem.setText("Alterando dados do serviço...");
            statusInicial(false);
            controlePesquisa(false);
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um serviço!");
        } else {
            int confirmaExclusao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o serviço? Essa operação não poderá ser desfeita!");
            if (confirmaExclusao == 0){ //sim
                int linhaSelecionada = jTableDados.getSelectedRow();
                Servico ser = listServico.get(linhaSelecionada);
                try {
                    entityManager.getTransaction().begin();
                    entityManager.remove(ser);
                    entityManager.getTransaction().commit();
                    jLabelMensagem.setText("Serviço excluído com sucesso!");
                } catch (Exception e) {
                    if (e.getMessage().contains("chave estrangeira")){
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro, o "
                            + "serviço não foi excluído!\nErro: Serviço está associado a uma ou mais vendas");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro, o "
                            + "serviço não foi excluído!\nErro: " + e);
                    }                   
                    jLabelMensagem.setText("Ocorreu um erro, o serviço não foi "
                            + "excluído!");
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
        if(!jTextFieldDescricao.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
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

    private void jTextFieldValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorFocusGained
        if(jTextFieldValor.getText().equals("0.0"))
            jTextFieldValor.setText("");
    }//GEN-LAST:event_jTextFieldValorFocusGained

    private void jTextFieldValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorFocusLost
        if(jTextFieldValor.getText().equals(""))
            jTextFieldValor.setText("0.0");
    }//GEN-LAST:event_jTextFieldValorFocusLost

    private void jTableDadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosMouseReleased
        if((jTableDados.getSelectedRow() > -1) &&
                ((!jLabelEstado.getText().equals("Alteração") && (!jLabelEstado.getText().equals("Inserção"))))){
            jButtonAlterar.setEnabled(true);
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
    
    
    private void statusInicial(boolean status){
        jTextFieldDescricao.setEnabled(!status);
        jTextFieldValor.setEnabled(!status);
    }
    
    
    private void limparCampos(){
        jTextFieldDescricao.setText("");
        jTextFieldValor.setText("");
        jTextFieldDescricao.setBackground(Color.WHITE);
        jTextFieldValor.setBackground(Color.WHITE);
    }
    
    private void controlePesquisa(boolean status){
        jButtonPesquisaOK.setEnabled(status);
        jComboBoxPesquisaStatus.setEnabled(status);
        jComboBoxTipoPesquisa.setEnabled(status);
        jButtonAlterar.setEnabled(status);
        jButtonExcluir.setEnabled(status);
    }
    
    /**
     *
     */
    private void atualizaTabela(){
        entityManager.clear();
        String ejbql = "from Servico s ";
        String campoPesquisa = "";
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Descrição")){
            campoPesquisa = "s.serDescricao";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() + "%'";
            }
        }
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Código")){
            campoPesquisa = "s.idServico";
            if(!jTextFieldCampoPesquisa.getText().equals("")){
                int filtro = Integer.parseInt(jTextFieldCampoPesquisa.getText());
                if(filtro > -1){
                    ejbql += "where " + campoPesquisa + " = " + filtro;
                }
            }
        }
        ejbql += " order by " + campoPesquisa;
        queryServico = entityManager.createQuery(ejbql);
        listServico.clear();
        listServico.addAll(queryServico.getResultList());
        int linha = listServico.size() - 1;
        if(listServico.size() > 0){
            jTableDados.scrollRectToVisible(jTableDados.getCellRect(linha, linha, true));
        }else{
            controlePesquisa(false);
            jButtonNovo.setEnabled(true);
            jButtonImprimir.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jLabelMensagem.setText("Serviço não cadastrado no sistema!");
        }
        if(listServico.size() == 1){
            jTableDados.setRowSelectionInterval(linha, linha);
            atualizaControles();
        }else
            limparCampos();
    }
    
    private void atualizaControles(){
        if(jLabelEstado.getText().equals("Início")){
            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }else if(jLabelEstado.getText().equals("Alteração") || 
                (jLabelEstado.getText().equals("Inserção"))){
            jButtonNovo.setEnabled(false);
            jButtonSalvar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisaOK;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxPesquisaStatus;
    private javax.swing.JComboBox<String> jComboBoxTipoPesquisa;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCodServico;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelLabelCodigo;
    private javax.swing.JLabel jLabelLabelEstado;
    private javax.swing.JLabel jLabelLabelMensagem;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelBarraEstado;
    private javax.swing.JPanel jPanelBarraMensagem;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldValor;
    private java.util.List<Servico> listServico;
    private javax.persistence.Query queryServico;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
