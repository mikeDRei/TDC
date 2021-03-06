package com.michael.PIDS.views.layout;

import com.michael.PIDS.DAO.ClienteDAO;
import com.michael.PIDS.DAO.EnderecoDAO;
import com.michael.PIDS.DAO.FuncionarioDAO;
import com.michael.PIDS.DAO.LoginDAO;
import com.michael.PIDS.model.Clientes;
import com.michael.PIDS.model.Enderecos;
import com.michael.PIDS.model.Funcionarios;
import java.awt.Toolkit;
import java.util.Date;
import javax.swing.JOptionPane;

public class PesquisarEndereco extends javax.swing.JFrame {

    Funcionarios funcionario = new Funcionarios();
    FuncionarioDAO daofuncionario = new FuncionarioDAO();
    LoginDAO daologin = new LoginDAO();
    Login login = new Login();
    PesquisarCliente pesqcliente = new PesquisarCliente();
    EnderecoDAO daoend = new EnderecoDAO();
    Enderecos end = new Enderecos();
    Clientes clientes = new Clientes();
    ClienteDAO clienteDAO = new ClienteDAO();
    private int idcliente;

    public PesquisarEndereco() {
        initComponents();
        setIcon();
        usuariologado(login.usuariologado);
        idcliente = Integer.parseInt(pesqcliente.IDCliente);
        this.setEnderecos(idcliente);
        this.desabilitarCampos();
        clientes = clienteDAO.consultarClientePorId(idcliente);
        jtCliente.setText(clientes.getNome());
        btSalvar.setEnabled(false);

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
        lblRua = new javax.swing.JLabel();
        jtRua = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        jtComplemento = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        jtCep = new javax.swing.JTextField();
        idReferences = new javax.swing.JLabel();
        btCadastrarNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btListarCLientes = new javax.swing.JButton();
        jtBairro = new javax.swing.JTextField();
        jtNumero = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        jtCidade = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        jtCliente = new javax.swing.JTextField();
        btAlterar1 = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        jtId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de endereços");
        setBackground(new java.awt.Color(255, 255, 255));

        jpainelcabeçalho.setBackground(new java.awt.Color(255, 255, 255));
        jpainelcabeçalho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblempresa.setText("Empresa:");

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("Endereço do Cliente");

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

        lblRua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRua.setText("Rua:");

        jtRua.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtRua.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtRuaComponentAdded(evt);
            }
        });
        jtRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtRuaFocusLost(evt);
            }
        });
        jtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRuaActionPerformed(evt);
            }
        });

        lblComplemento.setText("Complemento:");

        jtComplemento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtComplemento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtComplementoFocusLost(evt);
            }
        });
        jtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtComplementoActionPerformed(evt);
            }
        });

        lblNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumero.setText("numero:");

        lblBairro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBairro.setText("Bairro:");

        lblCep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCep.setText("CEP:");

        jtCep.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCepActionPerformed(evt);
            }
        });

        btCadastrarNovo.setBackground(new java.awt.Color(255, 255, 255));
        btCadastrarNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/new.png"))); // NOI18N
        btCadastrarNovo.setText("Cadastrar novo endereco");
        btCadastrarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarNovoActionPerformed(evt);
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

        btListarCLientes.setBackground(new java.awt.Color(255, 255, 255));
        btListarCLientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/alterar.png"))); // NOI18N
        btListarCLientes.setText("Listar Clientes");
        btListarCLientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarCLientesActionPerformed(evt);
            }
        });

        jtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNumeroActionPerformed(evt);
            }
        });

        lblCidade.setText("Cidade:");

        lblCliente.setText("Cliente:");

        btAlterar1.setBackground(new java.awt.Color(255, 255, 255));
        btAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/alterar.png"))); // NOI18N
        btAlterar1.setText("Alterar");
        btAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterar1ActionPerformed(evt);
            }
        });

        lblId.setText("id:");

        jtId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpainelLayout = new javax.swing.GroupLayout(jpainel);
        jpainel.setLayout(jpainelLayout);
        jpainelLayout.setHorizontalGroup(
            jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lblId)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumero))
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpainelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(idReferences, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRua)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblComplemento)
                        .addGap(18, 18, 18)
                        .addComponent(jtComplemento)
                        .addGap(18, 18, 18)
                        .addComponent(lblCep)
                        .addGap(18, 18, 18)
                        .addComponent(jtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpainelLayout.createSequentialGroup()
                                .addGap(0, 47, Short.MAX_VALUE)
                                .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpainelLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAlterar1)))
                        .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpainelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblCidade)
                                .addGap(18, 18, 18)
                                .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lblCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpainelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btListarCLientes)))
                        .addGap(58, 58, 58))))
            .addGroup(jpainelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btCadastrarNovo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpainelLayout.setVerticalGroup(
            jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRua)
                        .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblComplemento)
                        .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCep)
                        .addComponent(jtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idReferences, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(lblBairro)
                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente)
                    .addComponent(jtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarNovo)
                    .addComponent(btSalvar)
                    .addComponent(btAlterar1)
                    .addComponent(btListarCLientes))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpainelcabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpainelcabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRuaActionPerformed

    }//GEN-LAST:event_jtRuaActionPerformed

    private void jtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCepActionPerformed

    }//GEN-LAST:event_jtCepActionPerformed

    private void btCadastrarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarNovoActionPerformed
        CadastroFuncionario cadastrofunc = new CadastroFuncionario();
        cadastrofunc.setResizable(false);
        cadastrofunc.setSize(1000, 700);
        cadastrofunc.setLocationRelativeTo(null);
        cadastrofunc.setVisible(true);

    }//GEN-LAST:event_btCadastrarNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        this.SalvarEndereco();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btListarCLientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarCLientesActionPerformed
        PesquisarCliente pesquicli = new PesquisarCliente();
        pesquicli.setResizable(false);
        pesquicli.setLocationRelativeTo(null);
        pesquicli.setSize(1000, 700);
        pesquicli.setVisible(true);

    }//GEN-LAST:event_btListarCLientesActionPerformed

    private void jtRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtRuaFocusLost


    }//GEN-LAST:event_jtRuaFocusLost

    private void jtComplementoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtComplementoFocusLost


    }//GEN-LAST:event_jtComplementoFocusLost

    private void jtRuaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtRuaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtRuaComponentAdded

    private void jtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtComplementoActionPerformed

    private void jtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNumeroActionPerformed

    private void btAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterar1ActionPerformed
        // TODO add your handling code here:
        int opçoes = JOptionPane.showConfirmDialog(null, "Realmente deseja"
                + " alterar o endereço do Cliente: " + jtCliente.getText(), "",
                JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);

        if (opçoes == JOptionPane.YES_OPTION) {
            this.HabilitarCampos();
            btSalvar.setEnabled(true);

        } else if (opçoes == JOptionPane.CANCEL_OPTION) {

            btSalvar.setEnabled(false);

            this.desabilitarCampos();

        }
    }//GEN-LAST:event_btAlterar1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarEndereco().setVisible(true);
            }
        });
    }

    public void desabilitarCampos() {
        jtRua.setEnabled(false);
        jtCep.setEnabled(false);
        jtComplemento.setEnabled(false);
        jtNumero.setEnabled(false);
        jtCidade.setEnabled(false);
        jtBairro.setEnabled(false);
        jtCliente.setEnabled(false);

    }

    public void HabilitarCampos() {
        jtRua.setEnabled(true);
        jtCep.setEnabled(true);
        jtComplemento.setEnabled(true);
        jtNumero.setEnabled(true);
        jtCidade.setEnabled(true);
        jtBairro.setEnabled(true);
        jtCliente.setEnabled(true);

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

    public Enderecos setEnderecos(int idCliente) {
        Enderecos end = new Enderecos();
        end = daoend.findIdCliente(idcliente);
        jtId.setText(end.getId().toString());
        jtBairro.setText(end.getBairro());
        jtCep.setText(end.getCep());
        jtNumero.setText(end.getNumero().toString());
        jtRua.setText(end.getRua());
        jtComplemento.setText(end.getComplemento());
        jtCidade.setText(end.getCidade());
        jtCliente.setText(clientes.getNome());

        return end;

    }

    public void SalvarEndereco() {
        try {
            if (jtBairro.getText().equals("") || jtCep.getText().equals("")
                    || jtComplemento.getText().equals("")
                    || jtNumero.getText().equals("") || jtRua.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos de"
                        + " forma correta");

            } else {
                Date data = new Date();
                end.setId(Integer.parseInt(jtId.getText()));
                end.setBairro(jtBairro.getText());
                end.setCep(jtCep.getText());
                end.setCliente(Integer.parseInt(pesqcliente.IDCliente));
                end.setComplemento(jtComplemento.getText());
                end.setDatacadastro(data);
                end.setNumero(Integer.parseInt(jtNumero.getText()));
                end.setCidade(jtCidade.getText());
                end.setRua(jtRua.getText());

                end = daoend.saveEndereco(end);

                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                this.desabilitarCampos();
                btSalvar.setEnabled(false);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel salvar o Endereço");
        }

    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("tdcicon.PNG")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar1;
    private javax.swing.JButton btCadastrarNovo;
    private javax.swing.JButton btListarCLientes;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel idReferences;
    private javax.swing.JPanel jpainel;
    private javax.swing.JPanel jpainelcabeçalho;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JTextField jtCep;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtCliente;
    private javax.swing.JTextField jtComplemento;
    private javax.swing.JLabel jtId;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtRua;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblFunc;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblfuncionario;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblsetfuncao;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}
