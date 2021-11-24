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
import model.Usuario;

public class JFramePrincipal extends javax.swing.JFrame {

    int testa = 0;
    
    public JFramePrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        jPanelLogoff.setVisible(false);
        File file = new File("logado.txt");
        if(file.exists()){
            lerLogin();
            lerUsuario();
            loadDashBoard();
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

		entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryUsuario = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Usuario u order by u.idUsuario");
        listUsuario = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryUsuario.getResultList());
        jPanelStatusBarPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelLabelUsuario = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelDataHora = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonSair = new javax.swing.JButton();
        jButtonLogoff = new javax.swing.JButton();
        jButtonSobre = new javax.swing.JButton();
        jButtonProdutos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonServicos = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        jButtonVeiculo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonSobre1 = new javax.swing.JButton();
        jButtonSobre2 = new javax.swing.JButton();
        jButtonSobre3 = new javax.swing.JButton();
        jButtonSobre4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonVenda = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonReceber = new javax.swing.JButton();
        jButtonOrdemServico = new javax.swing.JButton();
        jButtonSobre5 = new javax.swing.JButton();
        jButtonSobre6 = new javax.swing.JButton();
        jPanelLogoff = new javax.swing.JPanel();
        jTextFieldLogin = new javax.swing.JTextField();
        jButtonLogoffOk = new javax.swing.JButton();
        jButtonLogoffCancelar = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        btnDashboard = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jlProdutos = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jlVeiculos = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jlClientes = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jlFornecedores = new javax.swing.JLabel();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuTabelasAuxiliares = new javax.swing.JMenu();
        jMenuItemMarcaProduto = new javax.swing.JMenuItem();
        jMenuItemGrupoProduto = new javax.swing.JMenuItem();
        jMenuItemCategoriaProduto = new javax.swing.JMenuItem();
        jMenuItemMarcaMoto = new javax.swing.JMenuItem();
        jMenuItemModeloMoto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setMinimumSize(new java.awt.Dimension(1000, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanelStatusBarPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(150, 25));
        jPanel1.setMinimumSize(new java.awt.Dimension(150, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabelLabelUsuario.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabelLabelUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLabelUsuario.setText("Usuário:");

        jLabelUsuario.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuario.setText("---");

        jLabelTipo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipo.setText("---");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLabelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel2.setMaximumSize(new java.awt.Dimension(150, 25));
        jPanel2.setMinimumSize(new java.awt.Dimension(150, 25));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabelDataHora.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDataHora.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDataHora.setText("---");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataHora, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelDataHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelStatusBarPrincipalLayout = new javax.swing.GroupLayout(jPanelStatusBarPrincipal);
        jPanelStatusBarPrincipal.setLayout(jPanelStatusBarPrincipalLayout);
        jPanelStatusBarPrincipalLayout.setHorizontalGroup(
            jPanelStatusBarPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusBarPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelStatusBarPrincipalLayout.setVerticalGroup(
            jPanelStatusBarPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(41, 43, 211));

        jButtonSair.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-excluir-48.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setToolTipText("Sair do programa");
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonSair.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonSair.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonLogoff.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-atualizações-disponíveis-48.png"))); // NOI18N
        jButtonLogoff.setText("Logoff");
        jButtonLogoff.setToolTipText("Trocar o usuário do sistema");
        jButtonLogoff.setFocusable(false);
        jButtonLogoff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLogoff.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonLogoff.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonLogoff.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonLogoff.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoffActionPerformed(evt);
            }
        });

        jButtonSobre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-sinal-de-informação-quadrado-24.png"))); // NOI18N
        jButtonSobre.setText("Sobre");
        jButtonSobre.setToolTipText("Sair do programa");
        jButtonSobre.setFocusable(false);
        jButtonSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSobre.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonSobre.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonSobre.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobreActionPerformed(evt);
            }
        });

        jButtonProdutos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fornecedor-48.png"))); // NOI18N
        jButtonProdutos.setText("Produtos");
        jButtonProdutos.setToolTipText("Abrir tela de gerenciamento de produtos");
        jButtonProdutos.setFocusable(false);
        jButtonProdutos.setHideActionText(true);
        jButtonProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProdutos.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonProdutos.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonProdutos.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gerenciamento");

        jButtonServicos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/servico.png"))); // NOI18N
        jButtonServicos.setText("Serviços");
        jButtonServicos.setToolTipText("Abrir tela de gerenciamento de serviços");
        jButtonServicos.setFocusable(false);
        jButtonServicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonServicos.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonServicos.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonServicos.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonServicos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServicosActionPerformed(evt);
            }
        });

        jButtonCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-administrador-masculino-48.png"))); // NOI18N
        jButtonCliente.setText("Clientes");
        jButtonCliente.setToolTipText("Abrir tela de gerenciamento de clientes");
        jButtonCliente.setFocusable(false);
        jButtonCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCliente.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonCliente.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonCliente.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });

        jButtonVeiculo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-caminhão-selecionado-48.png"))); // NOI18N
        jButtonVeiculo.setText("Veículos");
        jButtonVeiculo.setToolTipText("Abrir tela de gerenciamento de veículos");
        jButtonVeiculo.setFocusable(false);
        jButtonVeiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVeiculo.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonVeiculo.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonVeiculo.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonVeiculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeiculoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Relatórios");

        jButtonSobre1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonSobre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-folha-de-papel-24.png"))); // NOI18N
        jButtonSobre1.setText("Gerais");
        jButtonSobre1.setToolTipText("Sair do programa");
        jButtonSobre1.setFocusable(false);
        jButtonSobre1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSobre1.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonSobre1.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonSobre1.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonSobre1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSobre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobre1ActionPerformed(evt);
            }
        });

        jButtonSobre2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonSobre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-folha-de-papel-24.png"))); // NOI18N
        jButtonSobre2.setText("Financeiro");
        jButtonSobre2.setToolTipText("Sair do programa");
        jButtonSobre2.setFocusable(false);
        jButtonSobre2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSobre2.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonSobre2.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonSobre2.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonSobre2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSobre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobre2ActionPerformed(evt);
            }
        });

        jButtonSobre3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonSobre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-configurações-3-48.png"))); // NOI18N
        jButtonSobre3.setText("Ajustes");
        jButtonSobre3.setToolTipText("Sair do programa");
        jButtonSobre3.setFocusable(false);
        jButtonSobre3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSobre3.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonSobre3.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonSobre3.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonSobre3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSobre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobre3ActionPerformed(evt);
            }
        });

        jButtonSobre4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonSobre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-sinal-de-informação-quadrado-24.png"))); // NOI18N
        jButtonSobre4.setText("Usuário");
        jButtonSobre4.setToolTipText("Sair do programa");
        jButtonSobre4.setFocusable(false);
        jButtonSobre4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSobre4.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonSobre4.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonSobre4.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonSobre4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSobre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobre4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Movimento");

        jButtonVenda.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-atualizar-o-código-de-barras-48.png"))); // NOI18N
        jButtonVenda.setText("Venda");
        jButtonVenda.setToolTipText("Venda de Produtos");
        jButtonVenda.setFocusable(false);
        jButtonVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVenda.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonVenda.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonVenda.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Financeiro");

        jButtonReceber.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-caixa-registradora-48.png"))); // NOI18N
        jButtonReceber.setText("Receber");
        jButtonReceber.setToolTipText("Efetuar recebimento de contas");
        jButtonReceber.setFocusable(false);
        jButtonReceber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonReceber.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonReceber.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonReceber.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonReceber.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceberActionPerformed(evt);
            }
        });

        jButtonOrdemServico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonOrdemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-renovar-assinatura-48.png"))); // NOI18N
        jButtonOrdemServico.setText("Orçamentos");
        jButtonOrdemServico.setToolTipText("Abrir Ordem de Serviço");
        jButtonOrdemServico.setFocusable(false);
        jButtonOrdemServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonOrdemServico.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonOrdemServico.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonOrdemServico.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonOrdemServico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdemServicoActionPerformed(evt);
            }
        });

        jButtonSobre5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonSobre5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-mover-por-carrinho-48.png"))); // NOI18N
        jButtonSobre5.setText("Estoque de Produto");
        jButtonSobre5.setToolTipText("Sair do programa");
        jButtonSobre5.setFocusable(false);
        jButtonSobre5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSobre5.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonSobre5.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonSobre5.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonSobre5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSobre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobre5ActionPerformed(evt);
            }
        });

        jButtonSobre6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonSobre6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-entrega-de-comida-48.png"))); // NOI18N
        jButtonSobre6.setText("Fornecedor");
        jButtonSobre6.setToolTipText("Sair do programa");
        jButtonSobre6.setFocusable(false);
        jButtonSobre6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSobre6.setMaximumSize(new java.awt.Dimension(100, 80));
        jButtonSobre6.setMinimumSize(new java.awt.Dimension(100, 80));
        jButtonSobre6.setPreferredSize(new java.awt.Dimension(100, 80));
        jButtonSobre6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSobre6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobre6ActionPerformed(evt);
            }
        });

        jPanelLogoff.setBackground(new java.awt.Color(41, 43, 211));
        jPanelLogoff.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelLogoff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldLogin.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldLogin.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelLogoff.add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 237, -1));

        jButtonLogoffOk.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonLogoffOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-sincronizar-24.png"))); // NOI18N
        jButtonLogoffOk.setText("Logoff");
        jButtonLogoffOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoffOkActionPerformed(evt);
            }
        });
        jPanelLogoff.add(jButtonLogoffOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 123, 110, -1));

        jButtonLogoffCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonLogoffCancelar.setText("Cancelar");
        jButtonLogoffCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoffCancelarActionPerformed(evt);
            }
        });
        jPanelLogoff.add(jButtonLogoffCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 123, 109, 33));

        jPasswordFieldSenha.setBackground(new java.awt.Color(41, 43, 211));
        jPasswordFieldSenha.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordFieldSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelLogoff.add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 66, 237, -1));

        btnDashboard.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard-icon.png"))); // NOI18N
        btnDashboard.setText("DashBoard");
        btnDashboard.setToolTipText("Acessar o dashboard");
        btnDashboard.setFocusable(false);
        btnDashboard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDashboard.setMaximumSize(new java.awt.Dimension(100, 80));
        btnDashboard.setMinimumSize(new java.awt.Dimension(100, 80));
        btnDashboard.setPreferredSize(new java.awt.Dimension(100, 80));
        btnDashboard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(0, 0, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PRODUTOS");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 20));

        jlProdutos.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jlProdutos.setForeground(new java.awt.Color(255, 255, 255));
        jlProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlProdutos.setText("0");
        jPanel8.add(jlProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        jPanel9.setBackground(new java.awt.Color(0, 0, 153));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("VEÍCULOS");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 20));

        jlVeiculos.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jlVeiculos.setForeground(new java.awt.Color(255, 255, 255));
        jlVeiculos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlVeiculos.setText("0");
        jPanel9.add(jlVeiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        jPanel10.setBackground(new java.awt.Color(0, 0, 153));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CLIENTES");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 20));

        jlClientes.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jlClientes.setForeground(new java.awt.Color(255, 255, 255));
        jlClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlClientes.setText("0");
        jPanel10.add(jlClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        jPanel11.setBackground(new java.awt.Color(0, 0, 153));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("FORNECEDORES");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 20));

        jlFornecedores.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jlFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        jlFornecedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFornecedores.setText("0");
        jPanel11.add(jlFornecedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSobre6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButtonSobre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSobre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelLogoff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel2)
                                .addGap(174, 174, 174)
                                .addComponent(jLabel4)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButtonSobre1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addComponent(jButtonSobre2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonSobre5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jButtonReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jButtonOrdemServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSobre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(jButtonSobre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jButtonProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(jButtonServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(jButtonSobre6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(7, 7, 7)
                                .addComponent(jButtonVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButtonVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButtonSobre5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSobre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSobre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenuTabelasAuxiliares.setText("Cadastros Auxiliares");

        jMenuItemMarcaProduto.setText("Marcas de Produtos");
        jMenuItemMarcaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMarcaProdutoActionPerformed(evt);
            }
        });
        jMenuTabelasAuxiliares.add(jMenuItemMarcaProduto);

        jMenuItemGrupoProduto.setText("Grupos de Produtos");
        jMenuItemGrupoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGrupoProdutoActionPerformed(evt);
            }
        });
        jMenuTabelasAuxiliares.add(jMenuItemGrupoProduto);

        jMenuItemCategoriaProduto.setText("Categorias de Produtos");
        jMenuItemCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriaProdutoActionPerformed(evt);
            }
        });
        jMenuTabelasAuxiliares.add(jMenuItemCategoriaProduto);

        jMenuItemMarcaMoto.setText("Marcas de Motos");
        jMenuItemMarcaMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMarcaMotoActionPerformed(evt);
            }
        });
        jMenuTabelasAuxiliares.add(jMenuItemMarcaMoto);

        jMenuItemModeloMoto.setText("Modelos de Motos");
        jMenuItemModeloMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModeloMotoActionPerformed(evt);
            }
        });
        jMenuTabelasAuxiliares.add(jMenuItemModeloMoto);

        jMenuBarPrincipal.add(jMenuTabelasAuxiliares);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelStatusBarPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelStatusBarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1386, 801));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lerUsuario(){
        String ejbql = "from Usuario u where u.usuLogin = '" + jLabelUsuario.getText() + "'";
        queryUsuario = entityManager.createQuery(ejbql);
        listUsuario.clear();
        listUsuario.addAll(queryUsuario.getResultList());
        if(listUsuario.size()>0)
            jLabelTipo.setText(listUsuario.get(0).getUsuPermissao());
    }
    
    private void loadDashBoard() {
        this.loadDashClientes();
        this.loadDashVeiculos();
        this.loadDashFornecedores();
        this.loadDashProdutos();
    }
    
    private void loadDashClientes() {
        String ejbql = "SELECT count(c) FROM Cliente c";
        Long totalUsuarios = (long) entityManager.createQuery(ejbql).getSingleResult();
        jlClientes.setText(totalUsuarios.toString());
    }
    
    private void loadDashVeiculos() {
        String ejbql = "SELECT count(v) FROM Veiculo v";
        Long totalUsuarios = (long) entityManager.createQuery(ejbql).getSingleResult();
        jlVeiculos.setText(totalUsuarios.toString());
    }
    
    private void loadDashFornecedores() {
        String ejbql = "SELECT count(f) FROM Fornecedor f";
        Long totalUsuarios = (long) entityManager.createQuery(ejbql).getSingleResult();
        jlFornecedores.setText(totalUsuarios.toString());
    }
    
    private void loadDashProdutos() {
        String ejbql = "SELECT count(p) FROM Produto p";
        Long totalUsuarios = (long) entityManager.createQuery(ejbql).getSingleResult();
        jlProdutos.setText(totalUsuarios.toString());
    }
    
    private void lerLogin(){
        try {
            BufferedReader ler = new BufferedReader(new FileReader("logado.txt"));
            jLabelUsuario.setText(ler.readLine());
            if(listUsuario.size()>0)
                jLabelTipo.setText(listUsuario.get(0).getUsuPermissao());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameCliente cadCliente = new JFrameCliente();
            cadCliente.setLocationRelativeTo(this);
            cadCliente.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutosActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameProduto cadProduto = new JFrameProduto();
            cadProduto.setLocationRelativeTo(this);
            cadProduto.setVisible(true);
        }else{
            logar();
        } 
    }//GEN-LAST:event_jButtonProdutosActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void logar(){
        JFrameAutenticacao autentica = new JFrameAutenticacao();
        autentica.setLocationRelativeTo(this);
        autentica.setVisible(true);
        dispose();
    }
    
    private void jMenuItemCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriaProdutoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameCategoria cadCategoria = new JFrameCategoria();
            cadCategoria.setLocationRelativeTo(this);
            cadCategoria.setVisible(true);
        }else{
            logar();
        }    
    }//GEN-LAST:event_jMenuItemCategoriaProdutoActionPerformed

    private void jMenuItemGrupoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGrupoProdutoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameGrupo cadGrupo = new JFrameGrupo();
            cadGrupo.setLocationRelativeTo(this);
            cadGrupo.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jMenuItemGrupoProdutoActionPerformed

    private void jMenuItemMarcaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMarcaProdutoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameMarcaProduto cadMarcaProduto = new JFrameMarcaProduto();
            cadMarcaProduto.setLocationRelativeTo(this);
            cadMarcaProduto.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jMenuItemMarcaProdutoActionPerformed

    private void jButtonServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServicosActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameServico cadServico = new JFrameServico();
            cadServico.setLocationRelativeTo(this);
            cadServico.setVisible(true);
        }else{
            logar();
        }
        
    }//GEN-LAST:event_jButtonServicosActionPerformed

    private void jMenuItemMarcaMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMarcaMotoActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){ 
            JFrameMarcaMoto cadMarcaMoto = new JFrameMarcaMoto();
            cadMarcaMoto.setLocationRelativeTo(this);
            cadMarcaMoto.setVisible(true);
        }else{
            logar();
        }    
    }//GEN-LAST:event_jMenuItemMarcaMotoActionPerformed

    private void jMenuItemModeloMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModeloMotoActionPerformed
        JFrameModeloMoto cadModeloMoto = new JFrameModeloMoto();
        cadModeloMoto.setLocationRelativeTo(this);
        cadModeloMoto.setVisible(true);
    }//GEN-LAST:event_jMenuItemModeloMotoActionPerformed

    private void jButtonVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeiculoActionPerformed
    if(!(jLabelUsuario.getText().equals("---"))){
            JFrameVeiculo cadVeiculo = new JFrameVeiculo();
            cadVeiculo.setLocationRelativeTo(this);
            cadVeiculo.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jButtonVeiculoActionPerformed

    private void jButtonLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoffActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            jPanelLogoff.setVisible(true);
            jTextFieldLogin.requestFocus();
        }else{
            logar();
        }
    }//GEN-LAST:event_jButtonLogoffActionPerformed

    private void jButtonLogoffOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoffOkActionPerformed
            String senha = new String(jPasswordFieldSenha.getPassword());
            String ejbql = "from Usuario u where u.usuLogin = '"
                    + jTextFieldLogin.getText() + "' and u.usuSenha = '"
                    + senha + "'";
            queryUsuario = entityManager.createQuery(ejbql);
            listUsuario.clear();
            listUsuario.addAll(queryUsuario.getResultList());
            if(listUsuario.size() > 0){
                try {
                    PrintWriter writer = new PrintWriter(new FileWriter("logado.txt"));
                    writer.println(jTextFieldLogin.getText());
                    writer.println(senha);
                    writer.flush();
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(JFrameAutenticacao.class.getName()).log(Level.SEVERE, null, ex);
                }

                File file = new File("logado.txt");
                if(file.exists()){
                    lerLogin();
                    lerUsuario();
                }
                jTextFieldLogin.setText("");
                jPasswordFieldSenha.setText("");
                jPanelLogoff.setVisible(false);
            }
    }//GEN-LAST:event_jButtonLogoffOkActionPerformed

    private void jButtonLogoffCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoffCancelarActionPerformed
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
        jPanelLogoff.setVisible(false);
    }//GEN-LAST:event_jButtonLogoffCancelarActionPerformed

    private void jButtonVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendaActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameVenda cadVenda = new JFrameVenda();
            cadVenda.setLocationRelativeTo(this);
            cadVenda.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jButtonVendaActionPerformed

    private void jButtonOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdemServicoActionPerformed
    if(!(jLabelUsuario.getText().equals("---"))){
            JFrameOrdemServico cadOrdemServico = new JFrameOrdemServico();
            cadOrdemServico.setLocationRelativeTo(this);
            cadOrdemServico.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jButtonOrdemServicoActionPerformed
    
    private void jButtonReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceberActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameReceber cadVenda = new JFrameReceber();
            cadVenda.setLocationRelativeTo(this);
            cadVenda.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jButtonReceberActionPerformed

    private void jButtonSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobreActionPerformed
        // TODO add your handling code here:
        JDialogSobre sobre = new JDialogSobre(this, true);
        sobre.setLocationRelativeTo(this);
        sobre.setVisible(true);
        
    }//GEN-LAST:event_jButtonSobreActionPerformed

    private void jButtonSobre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobre1ActionPerformed
        // TODO add your handling code here:
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameRelatoriosGerais relcli = new JFrameRelatoriosGerais();
            relcli.setLocationRelativeTo(this);
            relcli.setVisible(true);
        } else {
            logar();
        }
    }//GEN-LAST:event_jButtonSobre1ActionPerformed

    private void jButtonSobre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobre2ActionPerformed
        // TODO add your handling code here:
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameRelatorios relatorios = new JFrameRelatorios();
            relatorios.setLocationRelativeTo(this);
            relatorios.setVisible(true);
        } else {
            logar();
        }
    }//GEN-LAST:event_jButtonSobre2ActionPerformed

    private void jButtonSobre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobre3ActionPerformed
        // TODO add your handling code here:
        if(!(jLabelUsuario.getText().equals("---"))){
            if(!jLabelTipo.getText().equals("Administrador")){
                JOptionPane.showMessageDialog(null, "Acesso não autorizado.");
            }else{
                JFrameEmpresa cadEmpresa = new JFrameEmpresa();
                cadEmpresa.setLocationRelativeTo(this);
                cadEmpresa.setVisible(true);
            }
        }else{
            logar();
        }
         
    }//GEN-LAST:event_jButtonSobre3ActionPerformed

    private void jButtonSobre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobre4ActionPerformed
        // TODO add your handling code here:
        if(!(jLabelUsuario.getText().equals("---"))){
            if(!jLabelTipo.getText().equals("Administrador")){
                JOptionPane.showMessageDialog(null, "Acesso não autorizado.");
            }else{
                JFrameUsuario cadUsuario = new JFrameUsuario();
                cadUsuario.setLocationRelativeTo(this);
                cadUsuario.setVisible(true);
            }
        }else{
            logar();
        }
        
    }//GEN-LAST:event_jButtonSobre4ActionPerformed

    private void jButtonSobre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobre5ActionPerformed
        // TODO add your handling code here:
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameEstoque cadEstoque = new JFrameEstoque();
            cadEstoque.setLocationRelativeTo(this);
            cadEstoque.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_jButtonSobre5ActionPerformed

    private void jButtonSobre6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobre6ActionPerformed
        // TODO add your handling code here:
        if(!(jLabelUsuario.getText().equals("---"))){
            if(!(jLabelTipo.getText().equals("Administrador"))){
                JOptionPane.showMessageDialog(null, "Acesso não autorizado.");
            }else{
                JFrameFornecedor cadFornecedor = new JFrameFornecedor();
                cadFornecedor.setLocationRelativeTo(this);
                cadFornecedor.setVisible(true);
            }
         }else{
            logar();
        }
    }//GEN-LAST:event_jButtonSobre6ActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        if(!(jLabelUsuario.getText().equals("---"))){
            JFrameDashboard dashboard = new JFrameDashboard();
            dashboard.setLocationRelativeTo(this);
            dashboard.setVisible(true);
        }else{
            logar();
        }
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.loadDashBoard();
    }//GEN-LAST:event_formWindowActivated
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonLogoff;
    private javax.swing.JButton jButtonLogoffCancelar;
    private javax.swing.JButton jButtonLogoffOk;
    private javax.swing.JButton jButtonOrdemServico;
    private javax.swing.JButton jButtonProdutos;
    private javax.swing.JButton jButtonReceber;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonServicos;
    private javax.swing.JButton jButtonSobre;
    private javax.swing.JButton jButtonSobre1;
    private javax.swing.JButton jButtonSobre2;
    private javax.swing.JButton jButtonSobre3;
    private javax.swing.JButton jButtonSobre4;
    private javax.swing.JButton jButtonSobre5;
    private javax.swing.JButton jButtonSobre6;
    private javax.swing.JButton jButtonVeiculo;
    private javax.swing.JButton jButtonVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDataHora;
    private javax.swing.JLabel jLabelLabelUsuario;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenuItem jMenuItemCategoriaProduto;
    private javax.swing.JMenuItem jMenuItemGrupoProduto;
    private javax.swing.JMenuItem jMenuItemMarcaMoto;
    private javax.swing.JMenuItem jMenuItemMarcaProduto;
    private javax.swing.JMenuItem jMenuItemModeloMoto;
    private javax.swing.JMenu jMenuTabelasAuxiliares;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelLogoff;
    private javax.swing.JPanel jPanelStatusBarPrincipal;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JLabel jlClientes;
    private javax.swing.JLabel jlFornecedores;
    private javax.swing.JLabel jlProdutos;
    private javax.swing.JLabel jlVeiculos;
	private javax.persistence.EntityManager entityManager;
	private java.util.List<Usuario> listUsuario;
    private javax.persistence.Query queryUsuario;
    // End of variables declaration//GEN-END:variables
}
