package com.michael.PIDS.views.layout;

import com.michael.PIDS.DAO.FuncionarioDAO;
import com.michael.PIDS.DAO.LoginDAO;
import com.michael.PIDS.model.Funcionarios;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroFuncionario extends javax.swing.JFrame {

    Funcionarios funcionario = new Funcionarios();
    FuncionarioDAO daofuncionario = new FuncionarioDAO();
    LoginDAO daologin = new LoginDAO();
    Login login = new Login();

    public CadastroFuncionario() {
        initComponents();

        usuariologado(login.usuariologado);
        this.CarregarTabela();
        this.desabilitarCampos();
        this.desabilitarBotoes();
        btNovo.setEnabled(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpainelcabeçalho = new javax.swing.JPanel();
        lblempresa = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblfuncionario = new javax.swing.JLabel();
        lbllogo = new javax.swing.JLabel();
        lblNomeEmpresa = new javax.swing.JLabel();
        lblFunc = new javax.swing.JLabel();
        lblFuncao = new javax.swing.JLabel();
        lblsetfuncao = new javax.swing.JLabel();
        jpainel = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        jtLogin = new javax.swing.JTextField();
        lblPermissao = new javax.swing.JLabel();
        jcPermissao = new javax.swing.JComboBox<>();
        lblSenha = new javax.swing.JLabel();
        jtSenha = new javax.swing.JPasswordField();
        lblEmail = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        idReferences = new javax.swing.JLabel();
        lblLembrete1 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        jtPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabelaFuncionario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jpainelcabeçalho.setBackground(new java.awt.Color(255, 255, 255));
        jpainelcabeçalho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblempresa.setText("Empresa:");

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("Cadastro de funcionarios");

        lblfuncionario.setText("Funcionario:");

        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/JUSTI NEW LOGO.png"))); // NOI18N

        lblNomeEmpresa.setText("Comercial Justi");

        lblFuncao.setText("Função:");

        javax.swing.GroupLayout jpainelcabeçalhoLayout = new javax.swing.GroupLayout(jpainelcabeçalho);
        jpainelcabeçalho.setLayout(jpainelcabeçalhoLayout);
        jpainelcabeçalhoLayout.setHorizontalGroup(
            jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelcabeçalhoLayout.createSequentialGroup()
                .addGroup(jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpainelcabeçalhoLayout.createSequentialGroup()
                        .addComponent(lblempresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeEmpresa))
                    .addGroup(jpainelcabeçalhoLayout.createSequentialGroup()
                        .addComponent(lblfuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFuncao)
                        .addGap(18, 18, 18)
                        .addComponent(lblsetfuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addComponent(lbltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpainelcabeçalhoLayout.setVerticalGroup(
            jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelcabeçalhoLayout.createSequentialGroup()
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpainelcabeçalhoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbllogo)
                        .addContainerGap())
                    .addGroup(jpainelcabeçalhoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblempresa)
                            .addComponent(lblNomeEmpresa))
                        .addGroup(jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpainelcabeçalhoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblfuncionario)
                                    .addComponent(lblFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpainelcabeçalhoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFuncao)
                                    .addComponent(lblsetfuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))))))
        );

        jpainel.setBackground(new java.awt.Color(255, 255, 255));
        jpainel.setForeground(new java.awt.Color(255, 255, 255));

        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome completo(*):");

        jtNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtNome.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtNomeComponentAdded(evt);
            }
        });
        jtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNomeFocusLost(evt);
            }
        });
        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        lblLogin.setText("Login(*):");

        jtLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtLoginFocusLost(evt);
            }
        });

        lblPermissao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPermissao.setText("Permissão(*):");

        jcPermissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Auxiliar Administrativo", " " }));
        jcPermissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPermissaoActionPerformed(evt);
            }
        });

        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha(*):");

        jtSenha.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email(*):");

        jtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });

        lblid.setText("Id:");

        lblLembrete1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblLembrete1.setForeground(new java.awt.Color(204, 0, 0));
        lblLembrete1.setText("Todos os campos com o simbolo (*) são obrigatorios");

        javax.swing.GroupLayout jpainelLayout = new javax.swing.GroupLayout(jpainel);
        jpainel.setLayout(jpainelLayout);
        jpainelLayout.setHorizontalGroup(
            jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addComponent(lblid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idReferences, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(lblLogin)
                        .addGap(32, 32, 32)
                        .addComponent(jtLogin)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addComponent(lblPermissao)
                        .addGap(28, 28, 28)
                        .addComponent(jcPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jpainelLayout.createSequentialGroup()
                .addComponent(lblLembrete1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpainelLayout.setVerticalGroup(
            jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idReferences, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLogin)
                        .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblid)
                        .addComponent(lblEmail)
                        .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPermissao)
                    .addComponent(jcPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha)
                    .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblLembrete1)
                .addGap(20, 20, 20))
        );

        btNovo.setBackground(new java.awt.Color(255, 255, 255));
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/new.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/save.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/excluir.png"))); // NOI18N
        btLimpar.setText("Limpar Campos");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/alterar.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        lblPesquisar.setText("Pesquisar");

        btPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jtTabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "LoginName", "Permissão", "DataCadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTabelaFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabelaFuncionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpainelcabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btNovo)
                .addGap(36, 36, 36)
                .addComponent(btSalvar)
                .addGap(50, 50, 50)
                .addComponent(btLimpar)
                .addGap(49, 49, 49)
                .addComponent(btAlterar)
                .addGap(42, 42, 42)
                .addComponent(lblPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpainelcabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btNovo)
                        .addComponent(btLimpar)
                        .addComponent(btSalvar)
                        .addComponent(btAlterar)
                        .addComponent(lblPesquisar))
                    .addComponent(btPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed

    }//GEN-LAST:event_jtNomeActionPerformed

    private void jcPermissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPermissaoActionPerformed

    }//GEN-LAST:event_jcPermissaoActionPerformed

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed

    }//GEN-LAST:event_jtEmailActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        this.HabilitarCampos();
        this.limparCampos();
        btSalvar.setEnabled(true);
        btAlterar.setEnabled(false);

    }//GEN-LAST:event_btNovoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        this.limparCampos();
        btAlterar.setEnabled(false);
        btSalvar.setEnabled(false);
        btLimpar.setEnabled(false);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        this.salvarFuncionario();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        this.AlterarFuncionario();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        this.PesquisarFuncionarioPorNomeNaTabla();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void jtTabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaFuncionarioMouseClicked

        String loginNome = "" + jtTabelaFuncionario.getValueAt(
                jtTabelaFuncionario.getSelectedRow(), 2);

        jtLogin.setText(loginNome);
        this.desabilitarCampos();
        btAlterar.setEnabled(true);
        btSalvar.setEnabled(false);
        this.PreencherCamposParaEfetuarAlteraraçao();

    }//GEN-LAST:event_jtTabelaFuncionarioMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNomeFocusLost


    }//GEN-LAST:event_jtNomeFocusLost

    private void jtLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtLoginFocusLost

        String loginNome = jtLogin.getText();
        loginNome.replaceAll(" ", "");
        funcionario = daofuncionario.findLogin(loginNome);
        if (funcionario.getId() != null) {
            JOptionPane.showMessageDialog(null, "O Login: "
                    + jtLogin.getText() + " ja foi cadastrado, "
                    + "informe um login válido");
            this.desabilitarCampos();
            jtLogin.setEnabled(true);

        } else if (funcionario.getId() == null) {
            this.HabilitarCampos();
        }
    }//GEN-LAST:event_jtLoginFocusLost

    private void jtNomeComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtNomeComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeComponentAdded

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    public void validacao(String nome, String Email,
            String Senha, String Login) {
        if (nome.equals("")
                && Email.equals("")
                && Senha.equals("")
                && Login.equals("")) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos",
                    "Erro", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void limparCampos() {
        idReferences.setText("");
        jtNome.setText("");
        jtEmail.setText("");
        jtLogin.setText("");
        jtSenha.setText("");
    }

    public void desabilitarCampos() {
        jtNome.setEnabled(false);
        jtEmail.setEnabled(false);
        jtLogin.setEnabled(false);
        jtSenha.setEnabled(false);

    }

    public void desabilitarBotoes() {
        btSalvar.setEnabled(false);
        btAlterar.setEnabled(false);
        btLimpar.setEnabled(false);

    }

    public void HabilitarCampos() {
        jtNome.setEnabled(true);
        jtEmail.setEnabled(true);
        jtLogin.setEnabled(true);
        jtSenha.setEnabled(true);

    }

    public void CarregarTabela() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaFuncionario.getModel();
        table.setNumRows(0);
        daofuncionario.consultarTodosFuncionarios().forEach((funcionarios) -> {

            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            String dataCadastro = formatador.format(funcionarios.getDatacadastro());

            String permissao = "";
            if (funcionarios.getPermissao() == 1) {
                permissao = "Administrador";
            } else {
                permissao = "Auxiliar Administrativo";
            }
            table.addRow(new Object[]{
                funcionarios.getId(),
                funcionarios.getNome(),
                funcionarios.getLoginName(),
                permissao,
                dataCadastro

            });
        });

    }

    public void PesquisarFuncionarioPorNomeNaTabla() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaFuncionario.getModel();
        table.setNumRows(0);
        for (Funcionarios funcionarios : daofuncionario.
                consultarFuncionarioPorNome(jtPesquisar.getText())) {
             SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            String dataCadastro = formatador.format(funcionarios.getDatacadastro());

            table.addRow(new Object[]{
                funcionarios.getId(),
                funcionarios.getNome(),
                funcionarios.getLoginName(),
                funcionarios.getPermissao(),
                dataCadastro

            });

        }
    }

    public void PreencherCamposParaEfetuarAlteraraçao() {
        funcionario = daofuncionario.findLogin(jtLogin.getText().toString());

        jtNome.setText(funcionario.getNome());
        idReferences.setText(funcionario.getId().toString());
        jtLogin.setText(funcionario.getLoginName());
        jtEmail.setText(funcionario.getEmail());
        jtSenha.setText(funcionario.getSenha());

    }

    public void salvarFuncionario() {

        String nome = jtNome.getText();
        String email = jtEmail.getText().replaceAll(" ", "");
        String Login = jtLogin.getText().replaceAll(" ", "");
        String senha = jtSenha.getText().replaceAll(" ", "");
        String permissao = jcPermissao.getSelectedItem().toString();
        Date data = new Date();
        String senha2 = jtSenha.getText();
        funcionario.setSenha(senha2);

        if (idReferences.getText().equals("")) {

            try {

                funcionario.setId(null);
                daologin.CriptografarSenha(jtSenha.getText()).toString();
                funcionario.setSenha(daologin.CriptografarSenha(
                        jtSenha.getText()).toString());
                System.out.println(senha2);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(CadastroFuncionario.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        } else {
            funcionario.setId(Integer.parseInt(idReferences.getText()));
        }
        funcionario.setNome(nome);

        funcionario.setEmail(email);
        funcionario.setLoginName(Login);
        funcionario.setAtivoInativo(1);

        funcionario.setDatacadastro(data);
        if (permissao.equals("Administrador")) {
            funcionario.setPermissao(1);
        }
        if (permissao.equals("Auxiliar Administrativo")) {
            funcionario.setPermissao(2);
        }
        validacao(nome, email, senha, Login);
        funcionario = daofuncionario.saveFuncionario(funcionario);

        if (funcionario.getId() == null) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Funcionario",
                    "Erro", JOptionPane.ERROR_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Salvo com sucesso",
                    "Sucesso", JOptionPane.WIDTH);
            this.HabilitarCampos();
            this.limparCampos();
            this.CarregarTabela();

        }

    }

    public void AlterarFuncionario() {
        int opçoes = JOptionPane.showConfirmDialog(null, "Realmente deseja"
                + " alterar os dados do funcionario: " + jtNome.getText(), "",
                JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);

        if (opçoes == JOptionPane.YES_OPTION) {
            this.HabilitarCampos();
            btSalvar.setEnabled(true);
            btLimpar.setEnabled(true);
            jtSenha.setEnabled(false);
        } else if (opçoes == JOptionPane.CANCEL_OPTION) {
            this.desabilitarCampos();
        }

    }

    public Funcionarios usuariologado(String usuariologado) {
        funcionario = daofuncionario.findLogin(usuariologado);
        String permissao = null;

        lblFunc.setText(funcionario.getNome());
        if (funcionario.getPermissao() == 1) {
            permissao = "Administrador";
        }
        if (funcionario.getPermissao() == 2) {
            permissao = "AUX Administrativo";
        }
        lblsetfuncao.setText(permissao);
        return funcionario;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel idReferences;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcPermissao;
    private javax.swing.JPanel jpainel;
    private javax.swing.JPanel jpainelcabeçalho;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtLogin;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPesquisar;
    private javax.swing.JPasswordField jtSenha;
    private javax.swing.JTable jtTabelaFuncionario;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFunc;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblLembrete1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblPermissao;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblfuncionario;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblsetfuncao;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}
