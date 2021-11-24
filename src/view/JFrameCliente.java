/**
 * 
 * 
 */
package view;
/**
 *
 * @author Yuri Mattiuz
 */
import java.awt.Color;
import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Cliente;

public class JFrameCliente extends javax.swing.JDialog {

    public JFrameCliente() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryCliente = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Cliente c order by c.cliNome");
        listCliente = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryCliente.getResultList());
        buttonGroupStatus = new javax.swing.ButtonGroup();
        jButtonImprimir = new javax.swing.JButton();
        jPanelFoto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBarNavegacao = new javax.swing.JToolBar();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jPanelPesquisa = new javax.swing.JPanel();
        jLabelPesquisa = new javax.swing.JLabel();
        jComboBoxPesquisaStatus = new javax.swing.JComboBox<>();
        jTextFieldCampoPesquisa = new javax.swing.JTextField();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox<>();
        jButtonPesquisaOK = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPaneTabela = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jTabbedPaneDadosPessoais = new javax.swing.JTabbedPane();
        jPanelDados = new javax.swing.JPanel();
        jPanelSuperior = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelLabelCodigo = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jRadioButtonStatus = new javax.swing.JRadioButton();
        jPanelMeio = new javax.swing.JPanel();
        jPanelContato = new javax.swing.JPanel();
        jLabelTelefone = new javax.swing.JLabel();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jLabelCelular = new javax.swing.JLabel();
        jFormattedTextFieldCelular = new javax.swing.JFormattedTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jPanelEndereco = new javax.swing.JPanel();
        jLabelUF = new javax.swing.JLabel();
        jComboBoxUF = new javax.swing.JComboBox<>();
        jLabelCidade = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jPanelIdentificacao = new javax.swing.JPanel();
        jLabelCPF = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jTextFieldRG = new javax.swing.JTextField();
        jLabelRG = new javax.swing.JLabel();
        jFormattedTextFieldDataNasc = new javax.swing.JFormattedTextField();
        jLabelDataNasc = new javax.swing.JLabel();
        jLabelOrgaoExpedidor = new javax.swing.JLabel();
        jTextFieldOrgaoExpedidor = new javax.swing.JTextField();
        jFormattedTextFieldDataCadastro = new javax.swing.JFormattedTextField();
        jLabelDataCadastro = new javax.swing.JLabel();
        jPanelDadosComplem = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabelObservacoes = new javax.swing.JLabel();
        jScrollPaneObservacoes = new javax.swing.JScrollPane();
        jTextAreaObservacoes = new javax.swing.JTextArea();
        jPanelBarraEstado = new javax.swing.JPanel();
        jLabelLabelEstado = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jPanelBarraMensagem = new javax.swing.JPanel();
        jLabelLabelMensagem = new javax.swing.JLabel();
        jLabelMensagem = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        jButtonImprimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonImprimir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-imprimir.png"))); // NOI18N
        jButtonImprimir.setToolTipText("Imprimir relatórios de clientes cadastrados");
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

        jPanelFoto.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelFoto.setEnabled(false);
        jPanelFoto.setMaximumSize(new java.awt.Dimension(103, 131));
        jPanelFoto.setMinimumSize(new java.awt.Dimension(103, 131));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel1.setText("FOTO");
        jLabel1.setEnabled(false);

        javax.swing.GroupLayout jPanelFotoLayout = new javax.swing.GroupLayout(jPanelFoto);
        jPanelFoto.setLayout(jPanelFotoLayout);
        jPanelFotoLayout.setHorizontalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanelFotoLayout.setVerticalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBarNavegacao.setFloatable(false);
        jToolBarNavegacao.setRollover(true);
        jToolBarNavegacao.setBorderPainted(false);

        jButtonPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-primeiro.png"))); // NOI18N
        jButtonPrimeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPrimeiro.setEnabled(false);
        jButtonPrimeiro.setFocusable(false);
        jButtonPrimeiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPrimeiro.setMaximumSize(new java.awt.Dimension(50, 30));
        jButtonPrimeiro.setMinimumSize(new java.awt.Dimension(50, 30));
        jButtonPrimeiro.setPreferredSize(new java.awt.Dimension(50, 30));
        jButtonPrimeiro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-primeiro-over2.png"))); // NOI18N
        jButtonPrimeiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarNavegacao.add(jButtonPrimeiro);

        jButtonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-anterior.png"))); // NOI18N
        jButtonAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAnterior.setEnabled(false);
        jButtonAnterior.setFocusable(false);
        jButtonAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAnterior.setMaximumSize(new java.awt.Dimension(50, 30));
        jButtonAnterior.setMinimumSize(new java.awt.Dimension(50, 30));
        jButtonAnterior.setPreferredSize(new java.awt.Dimension(50, 30));
        jButtonAnterior.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-anterior-over2.png"))); // NOI18N
        jButtonAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarNavegacao.add(jButtonAnterior);

        jButtonProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-proximo.png"))); // NOI18N
        jButtonProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonProximo.setEnabled(false);
        jButtonProximo.setFocusable(false);
        jButtonProximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProximo.setMaximumSize(new java.awt.Dimension(50, 30));
        jButtonProximo.setMinimumSize(new java.awt.Dimension(50, 30));
        jButtonProximo.setPreferredSize(new java.awt.Dimension(50, 30));
        jButtonProximo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-proximo-over2.png"))); // NOI18N
        jButtonProximo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarNavegacao.add(jButtonProximo);

        jButtonUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-ultimo.png"))); // NOI18N
        jButtonUltimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUltimo.setEnabled(false);
        jButtonUltimo.setFocusable(false);
        jButtonUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUltimo.setMaximumSize(new java.awt.Dimension(50, 30));
        jButtonUltimo.setMinimumSize(new java.awt.Dimension(50, 30));
        jButtonUltimo.setPreferredSize(new java.awt.Dimension(50, 30));
        jButtonUltimo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-ultimo-over2.png"))); // NOI18N
        jButtonUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarNavegacao.add(jButtonUltimo);

        jPanelPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelPesquisa.setMaximumSize(new java.awt.Dimension(210, 94));
        jPanelPesquisa.setMinimumSize(new java.awt.Dimension(210, 94));
        jPanelPesquisa.setPreferredSize(new java.awt.Dimension(210, 94));

        jLabelPesquisa.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelPesquisa.setText("PESQUISA");

        jComboBoxPesquisaStatus.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jComboBoxPesquisaStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo", "Todos" }));
        jComboBoxPesquisaStatus.setSelectedIndex(2);
        jComboBoxPesquisaStatus.setFocusable(false);
        jComboBoxPesquisaStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisaStatusActionPerformed(evt);
            }
        });

        jTextFieldCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyTyped(evt);
            }
        });

        jComboBoxTipoPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome" }));
        jComboBoxTipoPesquisa.setSelectedIndex(1);
        jComboBoxTipoPesquisa.setFocusable(false);
        jComboBoxTipoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoPesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisaOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-localizar.png"))); // NOI18N
        jButtonPesquisaOK.setText("OK");
        jButtonPesquisaOK.setBorder(null);
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
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCampoPesquisa)
                    .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                        .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                        .addComponent(jLabelPesquisa)
                        .addGap(22, 22, 22)
                        .addComponent(jComboBoxPesquisaStatus, 0, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPesquisaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesquisa))
                .addGap(2, 2, 2)
                .addComponent(jTextFieldCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setMaximumSize(new java.awt.Dimension(697, 523));
        setMinimumSize(new java.awt.Dimension(697, 523));
        setPreferredSize(new java.awt.Dimension(697, 523));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableDados.setFocusable(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listCliente, jTableDados);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCliente}"));
        columnBinding.setColumnName("Cód.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCPF}"));
        columnBinding.setColumnName("CPF");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliTelefone}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
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
            jTableDados.getColumnModel().getColumn(0).setPreferredWidth(7);
            jTableDados.getColumnModel().getColumn(1).setResizable(false);
            jTableDados.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTableDados.getColumnModel().getColumn(2).setResizable(false);
            jTableDados.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTableDados.getColumnModel().getColumn(3).setResizable(false);
            jTableDados.getColumnModel().getColumn(3).setPreferredWidth(55);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 363, -1, 140));

        jPanelDados.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanelSuperior.setBackground(new java.awt.Color(41, 43, 211));
        jPanelSuperior.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idCliente}"), jLabelCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabelLabelCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelLabelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelCodigo.setText("Código:");

        jTextFieldNome.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jTextFieldNome.setMaximumSize(new java.awt.Dimension(12, 30));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliNome}"), jTextFieldNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabelNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("NOME*");

        jRadioButtonStatus.setBackground(new java.awt.Color(41, 43, 211));
        jRadioButtonStatus.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jRadioButtonStatus.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonStatus.setText("Ativo");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliStatus}"), jRadioButtonStatus, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jRadioButtonStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jLabelLabelCodigo)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome)
                    .addComponent(jRadioButtonStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMeio.setBackground(new java.awt.Color(41, 43, 211));
        jPanelMeio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelContato.setBackground(new java.awt.Color(41, 43, 211));
        jPanelContato.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTelefone.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefone.setText("TELEFONE");

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliTelefone}"), jFormattedTextFieldTelefone, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabelCelular.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelCelular.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCelular.setText("CELULAR");

        try {
            jFormattedTextFieldCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliCelular}"), jFormattedTextFieldCelular, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabelEmail.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-MAIL");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliEmail}"), jTextFieldEmail, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanelContatoLayout = new javax.swing.GroupLayout(jPanelContato);
        jPanelContato.setLayout(jPanelContatoLayout);
        jPanelContatoLayout.setHorizontalGroup(
            jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContatoLayout.createSequentialGroup()
                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldEmail))
                .addContainerGap())
        );
        jPanelContatoLayout.setVerticalGroup(
            jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContatoLayout.createSequentialGroup()
                .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanelEndereco.setBackground(new java.awt.Color(41, 43, 211));
        jPanelEndereco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEndereco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUF.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelUF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUF.setText("UF");
        jPanelEndereco.add(jLabelUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 2, 20, -1));

        jComboBoxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PB", "PI", "PE", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        jComboBoxUF.setSelectedIndex(24);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliUF}"), jComboBoxUF, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jPanelEndereco.add(jComboBoxUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 17, 64, -1));

        jLabelCidade.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCidade.setText("CIDADE");
        jPanelEndereco.add(jLabelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 2, -1, -1));

        jLabelBairro.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBairro.setText("BAIRRO");
        jPanelEndereco.add(jLabelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 2, 53, -1));

        jLabelEndereco.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setText("ENDEREÇO");
        jPanelEndereco.add(jLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 44, 266, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliEndereco}"), jTextFieldEndereco, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanelEndereco.add(jTextFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 59, 339, -1));

        jLabelNumero.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setText("NÚMERO");
        jPanelEndereco.add(jLabelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 44, 70, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliNumero}"), jTextFieldNumero, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanelEndereco.add(jTextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 59, 69, -1));

        jLabelComplemento.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelComplemento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComplemento.setText("COMPLEMENTO");
        jPanelEndereco.add(jLabelComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 44, 100, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliComplemento}"), jTextFieldComplemento, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanelEndereco.add(jTextFieldComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 59, 100, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliCidade}"), jTextFieldCidade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanelEndereco.add(jTextFieldCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 17, 394, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliBairro}"), jTextFieldBairro, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanelEndereco.add(jTextFieldBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 17, 50, -1));

        jPanelIdentificacao.setBackground(new java.awt.Color(41, 43, 211));
        jPanelIdentificacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCPF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPF.setText("CPF*");

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliCPF}"), jFormattedTextFieldCPF, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliRG}"), jTextFieldRG, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabelRG.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelRG.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRG.setText("RG*");

        jFormattedTextFieldDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliDataNasc}"), jFormattedTextFieldDataNasc, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabelDataNasc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelDataNasc.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataNasc.setText("DATA NASC.*");

        jLabelOrgaoExpedidor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelOrgaoExpedidor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOrgaoExpedidor.setText("ÓRGÃO EXP.");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliOrgaoExp}"), jTextFieldOrgaoExpedidor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jFormattedTextFieldDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliDataCad}"), jFormattedTextFieldDataCadastro, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jLabelDataCadastro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelDataCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataCadastro.setText("DATA CADASTRO");

        javax.swing.GroupLayout jPanelIdentificacaoLayout = new javax.swing.GroupLayout(jPanelIdentificacao);
        jPanelIdentificacao.setLayout(jPanelIdentificacaoLayout);
        jPanelIdentificacaoLayout.setHorizontalGroup(
            jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelCPF))
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRG, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addComponent(jTextFieldOrgaoExpedidor)
                        .addGap(18, 18, 18))
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addComponent(jLabelOrgaoExpedidor, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addGap(49, 49, 49)))
                .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDataNasc)
                    .addComponent(jFormattedTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormattedTextFieldDataCadastro)
                    .addComponent(jLabelDataCadastro))
                .addContainerGap())
        );
        jPanelIdentificacaoLayout.setVerticalGroup(
            jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addComponent(jLabelOrgaoExpedidor)
                        .addGap(0, 0, 0)
                        .addComponent(jTextFieldOrgaoExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addComponent(jLabelDataCadastro)
                        .addGap(1, 1, 1)
                        .addComponent(jFormattedTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCPF)
                            .addComponent(jLabelRG))
                        .addGroup(jPanelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelIdentificacaoLayout.createSequentialGroup()
                        .addComponent(jLabelDataNasc)
                        .addGap(1, 1, 1)
                        .addComponent(jFormattedTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMeioLayout = new javax.swing.GroupLayout(jPanelMeio);
        jPanelMeio.setLayout(jPanelMeioLayout);
        jPanelMeioLayout.setHorizontalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelIdentificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(144, 144, 144))
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addComponent(jPanelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMeioLayout.setVerticalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addComponent(jPanelMeio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        jTabbedPaneDadosPessoais.addTab("Pessoais", jPanelDados);

        jPanelDadosComplem.setBackground(new java.awt.Color(41, 43, 211));
        jPanelDadosComplem.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel12.setBackground(new java.awt.Color(41, 43, 211));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jLabelObservacoes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelObservacoes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObservacoes.setText("OBSERVAÇÕES:");

        jTextAreaObservacoes.setColumns(20);
        jTextAreaObservacoes.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableDados, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliObs}"), jTextAreaObservacoes, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPaneObservacoes.setViewportView(jTextAreaObservacoes);

        javax.swing.GroupLayout jPanelDadosComplemLayout = new javax.swing.GroupLayout(jPanelDadosComplem);
        jPanelDadosComplem.setLayout(jPanelDadosComplemLayout);
        jPanelDadosComplemLayout.setHorizontalGroup(
            jPanelDadosComplemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelDadosComplemLayout.createSequentialGroup()
                .addGroup(jPanelDadosComplemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosComplemLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabelObservacoes))
                    .addGroup(jPanelDadosComplemLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPaneObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosComplemLayout.setVerticalGroup(
            jPanelDadosComplemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosComplemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelObservacoes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneDadosPessoais.addTab("Complementares", jPanelDadosComplem);

        getContentPane().add(jTabbedPaneDadosPessoais, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 690, 360));

        jPanelBarraEstado.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelBarraEstado.setMaximumSize(new java.awt.Dimension(310, 19));

        jLabelLabelEstado.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelLabelEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLabelEstado.setText("Estado:");

        jLabelEstado.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
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
                .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
        );
        jPanelBarraEstadoLayout.setVerticalGroup(
            jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraEstadoLayout.createSequentialGroup()
                .addGroup(jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBarraEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 330, -1));

        jPanelBarraMensagem.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraMensagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelBarraMensagem.setMaximumSize(new java.awt.Dimension(375, 19));
        jPanelBarraMensagem.setPreferredSize(new java.awt.Dimension(375, 19));

        jLabelLabelMensagem.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelLabelMensagem.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLabelMensagem.setText("Mensagem:");

        jLabelMensagem.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
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
                .addComponent(jLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
        );
        jPanelBarraMensagemLayout.setVerticalGroup(
            jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraMensagemLayout.createSequentialGroup()
                .addGroup(jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMensagem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBarraMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 385, 32));

        jPanel1.setBackground(new java.awt.Color(41, 43, 211));

        jButtonNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-novo.png"))); // NOI18N
        jButtonNovo.setToolTipText("Adicionar um novo cliente");
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
        jButtonSalvar.setToolTipText("Gravar o novo cliente no banco de dados");
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
        jButtonAlterar.setToolTipText("Alterar dados do cadastro do cliente");
        jButtonAlterar.setBorderPainted(false);
        jButtonAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonExcluir.setToolTipText("Excluir o cadastro do cliente");
        jButtonExcluir.setBorderPainted(false);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-sair.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair da tela de Cadastro de Clientes");
        jButtonSair.setBorderPainted(false);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setMaximumSize(new java.awt.Dimension(77, 37));
        jButtonSair.setMinimumSize(new java.awt.Dimension(77, 37));
        jButtonSair.setPreferredSize(new java.awt.Dimension(77, 37));
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
                .addContainerGap()
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 740, 40));

        bindingGroup.bind();

        setSize(new java.awt.Dimension(694, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTableDados.clearSelection();
        limparCampos();        
        statusInicial(false);
        controlePesquisa(false);
        jLabelEstado.setText("Inserção");
        jLabelMensagem.setText("Cadastrando Cliente...");
        jTextFieldNome.requestFocus();
        listCliente.add(new Cliente());
        int linha = listCliente.size() - 1;
        jTableDados.setRowSelectionInterval(linha, linha); 
        atualizaControles();
        jTextFieldCampoPesquisa.setEnabled(false);
        jTableDados.setEnabled(false);
        jRadioButtonStatus.setSelected(true);
        //pegar data atual
        java.util.Date hoje = Date.from(Instant.now());
        jFormattedTextFieldDataCadastro.setValue(hoje);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    /**
     * 
     * @return 
     */
    private int validaCampos(){
        if((jTextFieldNome.getText().equals("")) || jFormattedTextFieldCPF.getText().equals("   .   .   -  ") ||
                jTextFieldRG.getText().equals("") || jFormattedTextFieldDataNasc.getText().equals("  /  /    ")){
            jTextFieldNome.setBackground(Color.CYAN);
            jFormattedTextFieldCPF.setBackground(Color.CYAN);
            jTextFieldRG.setBackground(Color.CYAN);
            jFormattedTextFieldDataNasc.setBackground(Color.CYAN);
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios em azul");
            jTextFieldNome.requestFocus();
            if(!jTextFieldNome.getText().equals(""))
                jTextFieldNome.setBackground(Color.WHITE);
            if(!jFormattedTextFieldCPF.getText().equals("   .   .   -  "))
                jFormattedTextFieldCPF.setBackground(Color.WHITE);
            if(!jTextFieldRG.getText().equals(""))
                jTextFieldRG.setBackground(Color.WHITE);
            if(!jFormattedTextFieldDataNasc.getText().equals("  /  /    "))
                jFormattedTextFieldDataNasc.setBackground(Color.WHITE);
            return 0;
        }        
        return 1;
    }
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        int valida = validaCampos();
        if(valida == 1){
            int linhaSelecionada = jTableDados.getSelectedRow();
            Cliente cli = listCliente.get(linhaSelecionada);
            try {
               entityManager.getTransaction().begin();
               entityManager.persist(cli);
               entityManager.getTransaction().commit();
                if (jLabelEstado.getText().equals("Alteração")) {
                    jLabelMensagem.setText("Dados do Cliente alterados com sucesso!");
                } else {
                    jLabelMensagem.setText("Cliente cadastrado com sucesso!");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, o cliente não foi cadastrado!\nErro: " + e);
                jLabelMensagem.setText("Ocorreu um erro, o cliente não foi cadastrado!");
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
        if(!jTextFieldNome.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
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
            JOptionPane.showMessageDialog(null, "Selecione um cliente!");
        } else {
            jTextFieldCampoPesquisa.setEnabled(false);
            jTableDados.setEnabled(false);
            jTextFieldNome.requestFocus();
            jLabelEstado.setText("Alteração");
            jLabelMensagem.setText("Alterando dados do cliente...");
            statusInicial(false);
            controlePesquisa(false);
            atualizaControles();
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(jTableDados.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Selecione um cliente!");
        } else {
            int confirmaExclusao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o cliente? Essa operação não poderá ser desfeita!");
            if (confirmaExclusao == 0){ //sim
                int linhaSelecionada = jTableDados.getSelectedRow();
                Cliente cli = listCliente.get(linhaSelecionada);
                try {
                    entityManager.getTransaction().begin();
                    entityManager.remove(cli);
                    entityManager.getTransaction().commit();
                    jLabelMensagem.setText("Cliente excluído com sucesso!");
                } catch (Exception e) {
                    if (e.getMessage().contains("chave estrangeira")){
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro, o "
                            + "cliente não foi excluído!\nErro: Cliente está associado a uma ou mais vendas");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro, o "
                            + "cliente não foi excluído!\nErro: " + e);
                    }                   
                    jLabelMensagem.setText("Ocorreu um erro, o cliente não foi "
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
        if(!jTextFieldNome.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
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

    private void jComboBoxPesquisaStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPesquisaStatusActionPerformed
        atualizaTabela();
    }//GEN-LAST:event_jComboBoxPesquisaStatusActionPerformed
    
    /**
     *
     */ 
    private void statusInicial(boolean status){
        jTextFieldNome.setEnabled(!status);
        jTextFieldEmail.setEnabled(!status);
        jTextFieldEndereco.setEnabled(!status);
        jTextFieldBairro.setEnabled(!status);
        jTextFieldCidade.setEnabled(!status);
        jTextFieldNumero.setEnabled(!status);
        jTextFieldComplemento.setEnabled(!status);
        jTextFieldRG.setEnabled(!status);
        jTextFieldOrgaoExpedidor.setEnabled(!status);
        jTextAreaObservacoes.setEnabled(!status);
        jFormattedTextFieldCPF.setEnabled(!status);
        jFormattedTextFieldDataCadastro.setEnabled(!status);
        jFormattedTextFieldDataNasc.setEnabled(!status);
        jFormattedTextFieldTelefone.setEnabled(!status);
        jFormattedTextFieldCelular.setEnabled(!status);
        jComboBoxUF.setEnabled(!status);
        jRadioButtonStatus.setEnabled(!status);
        jLabelCodigo.setEnabled(!status);
    }
    
    /**
     *
     */
    private void limparCampos(){
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jTextFieldNumero.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldRG.setText("");
        jTextFieldOrgaoExpedidor.setText("");
        jTextAreaObservacoes.setText("");
        jFormattedTextFieldCPF.setText("");
        jFormattedTextFieldCelular.setText("");
        jFormattedTextFieldDataCadastro.setText("");
        jFormattedTextFieldDataNasc.setText("");
        jFormattedTextFieldTelefone.setText("");
        jLabelCodigo.setText("---");
        jTextFieldNome.setBackground(Color.WHITE);
        jFormattedTextFieldCPF.setBackground(Color.WHITE);
        jTextFieldRG.setBackground(Color.WHITE);
        jFormattedTextFieldDataNasc.setBackground(Color.WHITE);
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
        String ejbql = "from Cliente c ";
        String status = jComboBoxPesquisaStatus.getSelectedItem().toString().equals("Ativo") ? "TRUE" : "FALSE";
        String campoPesquisa = "";
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Nome")){
            campoPesquisa = "c.cliNome";
            String filtro = jTextFieldCampoPesquisa.getText();
            if(filtro.length() > 0 && !jComboBoxPesquisaStatus.getSelectedItem().toString().equals("Todos")){
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() 
                        + "%' and c.cliStatus = " + status;
            } else {
                ejbql += "where upper(" + campoPesquisa + ")like '%" + filtro.toUpperCase() 
                        + "%'";
            }
        }
        if(jComboBoxTipoPesquisa.getSelectedItem().toString().equals("Código")){
            campoPesquisa = "c.idCliente";
            if(!jTextFieldCampoPesquisa.getText().equals("")){
                int filtro = Integer.parseInt(jTextFieldCampoPesquisa.getText());
                if(filtro > -1 && !jComboBoxPesquisaStatus.getSelectedItem().toString().equals("Todos")){
                    ejbql += "where " + campoPesquisa + " = " + filtro
                            + " and c.cliStatus = " + status ;
                } else {
                    ejbql += "where " + campoPesquisa + " = " + filtro;
                }
            }
        }
        ejbql += " order by " + campoPesquisa;
        queryCliente = entityManager.createQuery(ejbql);
        listCliente.clear();
        listCliente.addAll(queryCliente.getResultList());
        int linha = listCliente.size() - 1;
        if(listCliente.size() > 0){
            jTableDados.scrollRectToVisible(jTableDados.getCellRect(linha, linha, true));
        }else{
            controlePesquisa(false);
            jButtonNovo.setEnabled(true);
            jButtonImprimir.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jLabelMensagem.setText("Cliente não cadastrado no sistema!");
        }
        if(listCliente.size() == 1){
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
    private javax.swing.ButtonGroup buttonGroupStatus;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisaOK;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox<String> jComboBoxPesquisaStatus;
    private javax.swing.JComboBox<String> jComboBoxTipoPesquisa;
    private javax.swing.JComboBox<String> jComboBoxUF;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCadastro;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelDataCadastro;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelLabelCodigo;
    private javax.swing.JLabel jLabelLabelEstado;
    private javax.swing.JLabel jLabelLabelMensagem;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelObservacoes;
    private javax.swing.JLabel jLabelOrgaoExpedidor;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBarraEstado;
    private javax.swing.JPanel jPanelBarraMensagem;
    private javax.swing.JPanel jPanelContato;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelDadosComplem;
    private javax.swing.JPanel jPanelEndereco;
    private javax.swing.JPanel jPanelFoto;
    private javax.swing.JPanel jPanelIdentificacao;
    private javax.swing.JPanel jPanelMeio;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JRadioButton jRadioButtonStatus;
    private javax.swing.JScrollPane jScrollPaneObservacoes;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JTabbedPane jTabbedPaneDadosPessoais;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextArea jTextAreaObservacoes;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldOrgaoExpedidor;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JToolBar jToolBarNavegacao;
    private java.util.List<Cliente> listCliente;
    private javax.persistence.Query queryCliente;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
