package com.michael.PIDS.views.layout;

import com.michael.PIDS.DAO.FuncionarioDAO;
import com.michael.PIDS.DAO.LoginDAO;
import com.michael.PIDS.model.Funcionarios;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PesquisarFuncionario extends javax.swing.JFrame {

    Funcionarios funcionario = new Funcionarios();
    FuncionarioDAO daofuncionario = new FuncionarioDAO();
    LoginDAO daologin = new LoginDAO();
    Login login = new Login();
    private String loginNome;

    public PesquisarFuncionario() {
        initComponents();
        setIcon();
        this.CarregarTabela();
        usuariologado(login.usuariologado);
        btRecuperarSenha.setEnabled(false);
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
        lblFuncao = new javax.swing.JLabel();
        lblsetfuncao = new javax.swing.JLabel();
        lblFunc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabelaFuncionario = new javax.swing.JTable();
        lblPesquisar = new javax.swing.JLabel();
        jtPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btCadastrarFuncionario = new javax.swing.JButton();
        btDesativarFuncionario = new javax.swing.JButton();
        btRecuperarSenha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de funcionario");
        setBackground(new java.awt.Color(255, 255, 255));

        jpainelcabeçalho.setBackground(new java.awt.Color(255, 255, 255));
        jpainelcabeçalho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblempresa.setText("Empresa:");

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("Lista de Funcionarios");

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
                        .addGap(44, 44, 44)
                        .addComponent(lblFuncao)
                        .addGap(27, 27, 27)
                        .addComponent(lblsetfuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addComponent(lbltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpainelcabeçalhoLayout.setVerticalGroup(
            jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelcabeçalhoLayout.createSequentialGroup()
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpainelcabeçalhoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbllogo))
                    .addGroup(jpainelcabeçalhoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblsetfuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpainelcabeçalhoLayout.createSequentialGroup()
                                .addGroup(jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblempresa)
                                    .addComponent(lblNomeEmpresa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpainelcabeçalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblfuncionario)
                                        .addComponent(lblFuncao))
                                    .addComponent(lblFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jtTabelaFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtTabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "email", "Permissão", "login", "datacadastro", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
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

        lblPesquisar.setText("Pesquisar");

        btPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btCadastrarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        btCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/new.png"))); // NOI18N
        btCadastrarFuncionario.setText("Cadastrar Funcionario");
        btCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFuncionarioActionPerformed(evt);
            }
        });

        btDesativarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        btDesativarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/alterar.png"))); // NOI18N
        btDesativarFuncionario.setText("Desativar/Ativar Funcionario");
        btDesativarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesativarFuncionarioActionPerformed(evt);
            }
        });

        btRecuperarSenha.setBackground(new java.awt.Color(255, 255, 255));
        btRecuperarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/senha.png"))); // NOI18N
        btRecuperarSenha.setText("Recuperar Senha");
        btRecuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecuperarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpainelcabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btCadastrarFuncionario)
                        .addGap(83, 83, 83)
                        .addComponent(btDesativarFuncionario)
                        .addGap(75, 75, 75)
                        .addComponent(btRecuperarSenha)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpainelcabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(lblPesquisar))
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarFuncionario)
                    .addComponent(btDesativarFuncionario)
                    .addComponent(btRecuperarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtTabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaFuncionarioMouseClicked
        loginNome = "" + jtTabelaFuncionario.getValueAt(
                jtTabelaFuncionario.getSelectedRow(), 4);
        btRecuperarSenha.setEnabled(true);
    }//GEN-LAST:event_jtTabelaFuncionarioMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        this.PesquisarFuncionarioPorNomeNaTabla();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFuncionarioActionPerformed
        CadastroFuncionario cadastrofunc = new CadastroFuncionario();
        cadastrofunc.setResizable(false);
        cadastrofunc.setSize(1000, 700);
        cadastrofunc.setLocationRelativeTo(null);
        cadastrofunc.setVisible(true);
    }//GEN-LAST:event_btCadastrarFuncionarioActionPerformed

    private void btDesativarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesativarFuncionarioActionPerformed

        funcionario = daofuncionario.findLogin(loginNome);

        if (funcionario.getAtivoInativo() == 1) {
            int opçoes = JOptionPane.showConfirmDialog(null, "Realmente deseja"
                    + " Desativar o funcionario: " + funcionario.getNome(), "",
                    JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
            if (opçoes == JOptionPane.YES_OPTION) {
                if (funcionario.getId() == null) {
                    JOptionPane.showMessageDialog(null, "Houve um erro ao tentar desativar o funcionario");

                } else {
                    funcionario.setAtivoInativo(2);
                    funcionario = daofuncionario.saveFuncionario(funcionario);
                    this.CarregarTabela();

                }

            }
        } else {
            int opt = JOptionPane.showConfirmDialog(null, "funcionario já esta inativo"
                    + " deseja reativa-lo ?: ", "Reativar funcionario",
                    JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
            if (opt == JOptionPane.YES_OPTION) {
                funcionario.setAtivoInativo(1);
                funcionario = daofuncionario.saveFuncionario(funcionario);
                this.CarregarTabela();
            }
        }
    }//GEN-LAST:event_btDesativarFuncionarioActionPerformed

    private void btRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecuperarSenhaActionPerformed
        // TODO add your handling code here:
      funcionario = daofuncionario.findLogin(loginNome);
      funcionario.setSenha("42767516990368493138776584305024125808");
      funcionario = daofuncionario.saveFuncionario(funcionario);
      JOptionPane.showMessageDialog(null,"Senha alterada com sucesso");
       
    }//GEN-LAST:event_btRecuperarSenhaActionPerformed

    public static void main(String args[]) {
        new PesquisarFuncionario();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarFuncionario().setVisible(true);

            }
        });
    }

    public void CarregarTabela() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaFuncionario.getModel();
        table.setNumRows(0);

        daofuncionario.consultarTodosFuncionarios().forEach((funcionarios) -> {
            String ativoinativo = "";
            String permissao = "";

            if (funcionarios.getAtivoInativo() == 1) {
                ativoinativo = "ativo";
            } else {
                ativoinativo = "inativo";

            }
            if (funcionarios.getPermissao() == 1) {
                permissao = "Administrador";
            } else {
                permissao = "Auxiliar Administrativo";
            }
             SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            String dataCadastro = formatador.format(funcionarios.getDatacadastro());
            
            table.addRow(new Object[]{
                funcionarios.getId(),
                funcionarios.getNome(),
                funcionarios.getEmail(),
                permissao,
                funcionarios.getLoginName(),
                dataCadastro,
                ativoinativo

            });
        });

    }

    public void PesquisarFuncionarioPorNomeNaTabla() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaFuncionario.getModel();
        table.setNumRows(0);
        for (Funcionarios funcionarios : daofuncionario.
                consultarFuncionarioPorNome(jtPesquisar.getText())) {
            table.addRow(new Object[]{
                funcionarios.getId(),
                funcionarios.getNome(),
                funcionarios.getLoginName(),
                funcionarios.getPermissao(),
                funcionarios.getDatacadastro()

            });

        }
    }

    public void usuariologado(String usuariologado) {
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

    }
 private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("tdcicon.PNG")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarFuncionario;
    private javax.swing.JButton btDesativarFuncionario;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRecuperarSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpainelcabeçalho;
    private javax.swing.JTextField jtPesquisar;
    private javax.swing.JTable jtTabelaFuncionario;
    private javax.swing.JLabel lblFunc;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblfuncionario;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblsetfuncao;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}
