package view;
/**
 *
 * @author Yuri Mattiuz
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Fornecedor;

public class JFrameEmpresa extends javax.swing.JDialog {

    public JFrameEmpresa() {
        initComponents();
        this.setModal(true);
        statusInicial(true);
        jLabelEstado.setText("Início");
        atualizaControles();
        File file = new File("empresa.txt");
        if(file.exists()){
            lerDados();
            jButtonAlterar.setEnabled(true);
            jButtonNovo.setEnabled(false);
        }else
            jButtonNovo.setEnabled(true);
    }  
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryFornecedor = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Fornecedor f order by f.forNomeFantasia");
        listFornecedor = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryFornecedor.getResultList());
        jLabelCodigo = new javax.swing.JLabel();
        jLabelLabelCodigo = new javax.swing.JLabel();
        jPanelSuperior = new javax.swing.JPanel();
        jTextFieldNomeFantasia = new javax.swing.JTextField();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jFormattedTextFieldCNPJ = new javax.swing.JFormattedTextField();
        jTextFieldInscricaoEstadual = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldContato = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jComboBoxUF = new javax.swing.JComboBox<>();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelBarraEstado = new javax.swing.JPanel();
        jLabelLabelEstado = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jPanelBarraMensagem = new javax.swing.JPanel();
        jLabelLabelMensagem = new javax.swing.JLabel();
        jLabelMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajustes");
        setResizable(false);

        jLabelCodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabelLabelCodigo.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabelLabelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLabelCodigo.setText("Código:");

        jPanelSuperior.setBackground(new java.awt.Color(41, 43, 211));
        jPanelSuperior.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldNomeFantasia.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldNomeFantasia.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jTextFieldNomeFantasia.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeFantasia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextFieldNomeFantasia.setMaximumSize(new java.awt.Dimension(12, 30));

        jTextFieldRazaoSocial.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldRazaoSocial.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jTextFieldRazaoSocial.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldRazaoSocial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Razão Social", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jTextFieldRazaoSocial.setMaximumSize(new java.awt.Dimension(12, 30));

        jFormattedTextFieldCNPJ.setBackground(new java.awt.Color(41, 43, 211));
        jFormattedTextFieldCNPJ.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CNPJ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jFormattedTextFieldCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jFormattedTextFieldCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTextFieldInscricaoEstadual.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldInscricaoEstadual.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldInscricaoEstadual.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inscrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextFieldEmail.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextFieldContato.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldContato.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldContato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextFieldCidade.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldCidade.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jTextFieldCidade.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jComboBoxUF.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jComboBoxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PB", "PI", "PE", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        jComboBoxUF.setSelectedIndex(24);

        jTextFieldEndereco.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextFieldBairro.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldBairro.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jTextFieldBairro.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBairro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bairro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jFormattedTextFieldTelefone.setBackground(new java.awt.Color(41, 43, 211));
        jFormattedTextFieldTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jFormattedTextFieldTelefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-novo.png"))); // NOI18N
        jButtonNovo.setToolTipText("Adicionar uma Empresa");
        jButtonNovo.setBorderPainted(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNovo.setEnabled(false);
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
        jButtonSalvar.setToolTipText("Gravar a empresa no arquivo");
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

        jButtonAlterar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-alterar.png"))); // NOI18N
        jButtonAlterar.setToolTipText("Alterar dados do cadastro da Empresa");
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

        jButtonImprimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonImprimir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-imprimir.png"))); // NOI18N
        jButtonImprimir.setToolTipText("Imprimir dados cadastrais da Empresa");
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

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-excluir.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir o cadastro da Empresa");
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

        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-sair.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair da tela de Cadastro da Empresa");
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

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldInscricaoEstadual)
                                    .addComponent(jFormattedTextFieldCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)))
                            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSuperiorLayout.createSequentialGroup()
                                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48)
                                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldContato))))
                        .addGap(20, 20, 20))))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldContato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBarraEstado.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelBarraEstado.setMaximumSize(new java.awt.Dimension(310, 19));

        jLabelLabelEstado.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelLabelEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLabelEstado.setText("Estado:");

        jLabelEstado.setBackground(new java.awt.Color(255, 255, 255));
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
                .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
        );
        jPanelBarraEstadoLayout.setVerticalGroup(
            jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelEstado))
        );

        jPanelBarraMensagem.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraMensagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelBarraMensagem.setMaximumSize(new java.awt.Dimension(375, 19));
        jPanelBarraMensagem.setPreferredSize(new java.awt.Dimension(375, 19));

        jLabelLabelMensagem.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
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
                .addComponent(jLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBarraMensagemLayout.setVerticalGroup(
            jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelLabelMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelMensagem))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(343, 343, 343)
                    .addComponent(jLabelLabelCodigo)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelCodigo)
                    .addContainerGap(358, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBarraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelBarraMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(17, 17, 17))
                        .addComponent(jLabelLabelCodigo))
                    .addGap(215, 215, 215)))
        );

        setSize(new java.awt.Dimension(751, 390));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lerDados(){
        try {
            BufferedReader ler = new BufferedReader(new FileReader("empresa.txt"));
            jTextFieldNomeFantasia.setText(ler.readLine());
            jTextFieldRazaoSocial.setText(ler.readLine());
            jFormattedTextFieldCNPJ.setText(ler.readLine());
            jTextFieldInscricaoEstadual.setText(ler.readLine());
            jTextFieldCidade.setText(ler.readLine());
            jTextFieldBairro.setText(ler.readLine());
            jTextFieldEndereco.setText(ler.readLine());
            jTextFieldEmail.setText(ler.readLine());
            jTextFieldContato.setText(ler.readLine());
            jFormattedTextFieldTelefone.setText(ler.readLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFrameEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFrameEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jButtonNovo.setEnabled(false);
        statusInicial(false);
        controlePesquisa(false);
        jLabelEstado.setText("Inserção");
        jLabelMensagem.setText("Cadastrando Cliente...");
        jTextFieldNomeFantasia.requestFocus();
        listFornecedor.add(new Fornecedor());
        atualizaControles();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    
    /**
     * 
     * @param evt 
     */
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("empresa.txt"));
            writer.println(jTextFieldNomeFantasia.getText());
            writer.println(jTextFieldRazaoSocial.getText());
            writer.println(jFormattedTextFieldCNPJ.getText());
            writer.println(jTextFieldInscricaoEstadual.getText());
            writer.println(jTextFieldCidade.getText());
            writer.println(jTextFieldBairro.getText());
            writer.println(jTextFieldEndereco.getText());
            writer.println(jTextFieldEmail.getText());
            writer.println(jTextFieldContato.getText());
            writer.println(jFormattedTextFieldTelefone.getText());
            writer.flush();
            writer.close();
            JOptionPane.showMessageDialog(null, "Empresa cadastrada!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro, a empresa não foi cadastrada" + "\nErro:" + ex);
        }
        statusInicial(true);
        jLabelEstado.setText("Início");
        atualizaControles();          
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void Cancelar(){
        statusInicial(true);
        jLabelEstado.setText("Início");
        jLabelMensagem.setText("---");
        controlePesquisa(true);
        atualizaControles();
        File file = new File("empresa.txt");
        if(file.exists()){
            lerDados();
            jButtonAlterar.setEnabled(true);
            jButtonNovo.setEnabled(false);
        }else
            jButtonNovo.setEnabled(true);
    }
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(!jTextFieldNomeFantasia.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
            int cancelar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar? Os dados não salvos serão perdidos!");
            if (cancelar == 0) { //sim
                Cancelar();
            }
        } else {
            Cancelar();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        jTextFieldNomeFantasia.requestFocus();
        jLabelEstado.setText("Alteração");
        jLabelMensagem.setText("Alterando dados do fornecedor...");
        statusInicial(false);
        controlePesquisa(false);
        atualizaControles();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        if(!jTextFieldNomeFantasia.getText().equals("") && (!jLabelEstado.getText().equals("Início"))){
            int confirmaSaida = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar o programa? Os dados não salvos serão perdidos!");
            if (confirmaSaida == 0) //sim
                dispose();
        }else
            dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed
    
    /**
     * 
     */ 
    private void statusInicial(boolean status){
        jTextFieldNomeFantasia.setEnabled(!status);
        jTextFieldRazaoSocial.setEnabled(!status);
        jTextFieldEmail.setEnabled(!status);
        jTextFieldContato.setEnabled(!status);
        jTextFieldEndereco.setEnabled(!status);
        jTextFieldBairro.setEnabled(!status);
        jTextFieldCidade.setEnabled(!status);
        jTextFieldInscricaoEstadual.setEnabled(!status);
        jFormattedTextFieldCNPJ.setEnabled(!status);
        jFormattedTextFieldTelefone.setEnabled(!status);
        jComboBoxUF.setEnabled(!status);
        jLabelCodigo.setEnabled(!status);
    }
    
    private void controlePesquisa(boolean status){
        jButtonAlterar.setEnabled(status);
    }
    
    private void atualizaControles(){
        if(jLabelEstado.getText().equals("Início")){
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonAlterar.setEnabled(true);
        }else if(jLabelEstado.getText().equals("Alteração") || 
                (jLabelEstado.getText().equals("Inserção"))){
            jButtonSalvar.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtonAlterar.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxUF;
    private javax.swing.JFormattedTextField jFormattedTextFieldCNPJ;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelLabelCodigo;
    private javax.swing.JLabel jLabelLabelEstado;
    private javax.swing.JLabel jLabelLabelMensagem;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JPanel jPanelBarraEstado;
    private javax.swing.JPanel jPanelBarraMensagem;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldContato;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldInscricaoEstadual;
    private javax.swing.JTextField jTextFieldNomeFantasia;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private java.util.List<Fornecedor> listFornecedor;
    private javax.persistence.Query queryFornecedor;
    // End of variables declaration//GEN-END:variables
}
