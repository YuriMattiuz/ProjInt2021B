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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

public class JFrameAutenticacao extends javax.swing.JDialog {

    public JFrameAutenticacao() {
        initComponents();
        this.setModal(true);
        verificaLogin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("MotogerPU").createEntityManager();
        queryUsuario = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("from Usuario u order by u.idUsuario");
        listUsuario = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(queryUsuario.getResultList());
        jPanel1 = new javax.swing.JPanel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonEntrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanelMensagem = new javax.swing.JPanel();
        jLabelMensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(378, 315));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(41, 43, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldUsuario.setBackground(new java.awt.Color(41, 43, 211));
        jTextFieldUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Usuário", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jPasswordFieldSenha.setBackground(new java.awt.Color(41, 43, 211));
        jPasswordFieldSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordFieldSenha.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordFieldSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUsuario)
                    .addComponent(jPasswordFieldSenha))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelBotoes.setBackground(new java.awt.Color(41, 43, 211));
        jPanelBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        jButtonEntrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icper-iniciarvenda - Copia.png"))); // NOI18N
        jButtonEntrar.setToolTipText("");
        jButtonEntrar.setBorder(null);
        jButtonEntrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonEntrarFocusGained(evt);
            }
        });
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iper-sair.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBotoesLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBotoesLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelMensagem.setBackground(new java.awt.Color(41, 43, 211));
        jPanelMensagem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensagem", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabelMensagem.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelMensagem.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMensagem.setText("Bem Vindo! Entre com seu nome de Usuário e Senha");

        javax.swing.GroupLayout jPanelMensagemLayout = new javax.swing.GroupLayout(jPanelMensagem);
        jPanelMensagem.setLayout(jPanelMensagemLayout);
        jPanelMensagemLayout.setHorizontalGroup(
            jPanelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );
        jPanelMensagemLayout.setVerticalGroup(
            jPanelMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(402, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void verificaLogin(){
        String inicial = "from Usuario u";
        queryUsuario = entityManager.createQuery(inicial);
        listUsuario.clear();
        listUsuario.addAll(queryUsuario.getResultList());
        if(listUsuario.size() < 1){ 
            jTextFieldUsuario.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jLabelMensagem.setText("Não há usuários cadastrados");
        }
    }
    
    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        String inicial = "from Usuario u";
        queryUsuario = entityManager.createQuery(inicial);
        listUsuario.clear();
        listUsuario.addAll(queryUsuario.getResultList());
        if(listUsuario.size() < 1){ 
            int confirma = JOptionPane.showConfirmDialog(null, "Cadastrar Usuário? ");
            if(confirma == 0){ 
                JFramePrincipal principal = new JFramePrincipal();
                dispose();
                principal.setLocationRelativeTo(this);
                principal.setVisible(true);
                JFrameUsuario cadUsuario = new JFrameUsuario();
                cadUsuario.setLocationRelativeTo(this);
                cadUsuario.setVisible(true);
                
            }else
                System.exit(0);
        }else{ 
            String senha = new String(jPasswordFieldSenha.getPassword());
            String ejbql = "from Usuario u where u.usuLogin = '"
                    + jTextFieldUsuario.getText() + "' and u.usuSenha = '"
                    + senha + "'";
            queryUsuario = entityManager.createQuery(ejbql);
            listUsuario.clear();
            listUsuario.addAll(queryUsuario.getResultList());
            if(listUsuario.size() > 0){ 
                try {
                    PrintWriter writer = new PrintWriter(new FileWriter("logado.txt"));
                    writer.println(jTextFieldUsuario.getText());
                    writer.println(senha);                    
                    writer.flush();
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(JFrameAutenticacao.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                JFramePrincipal principal = new JFramePrincipal();
                principal.setLocationRelativeTo(this);
                principal.setVisible(true);
                dispose();
            }else{ 
                jLabelMensagem.setForeground(Color.red);
                jLabelMensagem.setText("Usuário ou Senha Inválidos!");
                jTextFieldUsuario.requestFocus();
                
            }   
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed
    
    /**
     * Permite que o jButton que recebe Focus seja acionado via tecla Enter
     * @param evt 
     */
    private void jButtonEntrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonEntrarFocusGained
        this.getRootPane().setDefaultButton(jButtonEntrar);
    }//GEN-LAST:event_jButtonEntrarFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAutenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAutenticacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelMensagem;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private java.util.List<Usuario> listUsuario;
    private javax.persistence.Query queryUsuario;
    // End of variables declaration//GEN-END:variables
}
