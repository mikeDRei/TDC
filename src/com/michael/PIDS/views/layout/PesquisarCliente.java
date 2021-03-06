package com.michael.PIDS.views.layout;

import com.michael.PIDS.DAO.ClienteDAO;
import com.michael.PIDS.DAO.EnderecoDAO;
import com.michael.PIDS.DAO.FuncionarioDAO;
import com.michael.PIDS.DAO.LoginDAO;
import com.michael.PIDS.model.Clientes;
import com.michael.PIDS.model.Enderecos;
import com.michael.PIDS.model.Funcionarios;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PesquisarCliente extends javax.swing.JFrame {

    Funcionarios funcionario = new Funcionarios();
    FuncionarioDAO daofuncionario = new FuncionarioDAO();
    LoginDAO daologin = new LoginDAO();
    Login login = new Login();
    Clientes clientes = new Clientes();
    ClienteDAO daocliente = new ClienteDAO();
    EnderecoDAO daoendereco = new EnderecoDAO();
    Enderecos enderecos = new Enderecos();
    private String CpfOuCnpj;
    static String IDCliente;

    public PesquisarCliente() {
        initComponents();
        setIcon();
        funcionario = usuariologado(login.usuariologado);

        this.CarregarTabela();

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
        lblPesquisar = new javax.swing.JLabel();
        jtPesquisarNome = new javax.swing.JTextField();
        btPesquisarNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabelaCliente = new javax.swing.JTable();
        lblPesquisar1 = new javax.swing.JLabel();
        jtPesquisarId = new javax.swing.JTextField();
        btPesquisarId = new javax.swing.JButton();
        lblPesquisar2 = new javax.swing.JLabel();
        jtPesquisarEmail = new javax.swing.JTextField();
        btPesquisarEmail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btPesquisarEndereço = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtPesquisarCpf = new javax.swing.JTextField();
        btPesquisarCPF = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBAtivarInativar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBCadastrarFuncionario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBCadastrarFuncionario1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de clientes");
        setBackground(new java.awt.Color(255, 255, 255));

        jpainelcabeçalho.setBackground(new java.awt.Color(255, 255, 255));
        jpainelcabeçalho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblempresa.setText("Empresa:");

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("Lista de Clientes");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 555, Short.MAX_VALUE)
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
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

        lblPesquisar.setText(" Por nome:");

        btPesquisarNome.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarNomeActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jtTabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF/CNPJ", "Telefone", "Email", "Ativo/Inativo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabelaCliente);
        if (jtTabelaCliente.getColumnModel().getColumnCount() > 0) {
            jtTabelaCliente.getColumnModel().getColumn(4).setPreferredWidth(1);
        }

        lblPesquisar1.setText("Por id:");

        btPesquisarId.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisarId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPesquisarIdMouseClicked(evt);
            }
        });
        btPesquisarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarIdActionPerformed(evt);
            }
        });

        lblPesquisar2.setText("Por Email:");

        btPesquisarEmail.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarEmailActionPerformed(evt);
            }
        });

        jLabel1.setText("Por CPF");

        btPesquisarEndereço.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarEndereço.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisarEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarEndereçoActionPerformed(evt);
            }
        });

        jLabel2.setText("Consultar Endereços:");

        btPesquisarCPF.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarCPFActionPerformed(evt);
            }
        });

        jLabel3.setText("Ativar/Inativar:");

        jBAtivarInativar.setBackground(new java.awt.Color(255, 255, 255));
        jBAtivarInativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/alterar.png"))); // NOI18N
        jBAtivarInativar.setText("Ativar/Inativar Cliente");
        jBAtivarInativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtivarInativarActionPerformed(evt);
            }
        });

        jLabel4.setText("Cadastrar Cliente:");

        jBCadastrarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        jBCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/new.png"))); // NOI18N
        jBCadastrarFuncionario.setText("Cadastrar");
        jBCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarFuncionarioActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("(*) para consultar um endereço, selecione um cliente na tabela e clique em consultar endereços ");

        jBCadastrarFuncionario1.setBackground(new java.awt.Color(255, 255, 255));
        jBCadastrarFuncionario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/carregamento.png"))); // NOI18N
        jBCadastrarFuncionario1.setText("Carregar Tabela");
        jBCadastrarFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarFuncionario1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpainelcabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jtPesquisarId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblPesquisar1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblPesquisar2)
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisarId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jtPesquisarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jtPesquisarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 448, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCadastrarFuncionario)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(jBAtivarInativar)
                        .addGap(76, 76, 76)
                        .addComponent(jBCadastrarFuncionario1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisarEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5)))
                .addContainerGap(463, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpainelcabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPesquisar)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPesquisar2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPesquisar1)
                                .addComponent(jLabel1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtPesquisarId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtPesquisarEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btPesquisarNome))
                                    .addComponent(jtPesquisarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btPesquisarCPF)))))
                    .addComponent(btPesquisarId)
                    .addComponent(btPesquisarEmail))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(btPesquisarEndereço))
                        .addGap(6, 6, 6)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBAtivarInativar)
                        .addComponent(jBCadastrarFuncionario)
                        .addComponent(jBCadastrarFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarNomeActionPerformed
        if (jtPesquisarNome.equals("")) {
            this.CarregarTabela();
        } else {
            this.PesquisarClientePorNomeNaTabla();
        }


    }//GEN-LAST:event_btPesquisarNomeActionPerformed

    private void jtTabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaClienteMouseClicked
        IDCliente = "" + jtTabelaCliente.getValueAt(
                jtTabelaCliente.getSelectedRow(), 0);


    }//GEN-LAST:event_jtTabelaClienteMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void btPesquisarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarIdActionPerformed
        // TODO add your handling code here:
        this.CarregarTabela();
        if (jtPesquisarId.equals("")) {
            this.CarregarTabela();
        } else {
            this.PesquisarClientePorIdNaTabla();
        }

    }//GEN-LAST:event_btPesquisarIdActionPerformed

    private void btPesquisarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarEmailActionPerformed
        // TODO add your handling code here:

        if (jtPesquisarEmail.equals("")) {
            this.CarregarTabela();
        } else {
            this.PesquisarClientePorEmailNaTabla();
        }
    }//GEN-LAST:event_btPesquisarEmailActionPerformed

    private void btPesquisarEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarEndereçoActionPerformed
        // TODO add your handling code here:
        PesquisarEndereco pesquiEnd = new PesquisarEndereco();
        pesquiEnd.setResizable(false);
        pesquiEnd.setLocationRelativeTo(null);
        pesquiEnd.setSize(1000, 700);
        pesquiEnd.setVisible(true);

    }//GEN-LAST:event_btPesquisarEndereçoActionPerformed

    private void btPesquisarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarCPFActionPerformed
        // TODO add your handling code here:

        if (jtPesquisarCpf.equals("")) {
            this.CarregarTabela();
        } else {
            this.PesquisarClientePorCpf();
        }
    }//GEN-LAST:event_btPesquisarCPFActionPerformed

    private void btPesquisarIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPesquisarIdMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btPesquisarIdMouseClicked

    private void jBAtivarInativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtivarInativarActionPerformed
        // TODO add your handling code here:

        clientes = daocliente.consultarClientePorId(Integer.parseInt(IDCliente));

        if (clientes.getAtivoinativo() == 1) {
            int opçoes = JOptionPane.showConfirmDialog(null, "Realmente deseja"
                    + " Desativar o Cliente: " + clientes.getNome(), "",
                    JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
            if (opçoes == JOptionPane.YES_OPTION) {
                if (funcionario.getId() == null) {
                    JOptionPane.showMessageDialog(null, "Houve um erro ao tentar"
                            + " desativar o Cliente");

                } else {
                    clientes.setAtivoinativo(2);
                    clientes = daocliente.saveCliente(clientes);
                    this.CarregarTabela();

                }

            }
        } else {
            int opt = JOptionPane.showConfirmDialog(null, "Cliente já esta inativo"
                    + " deseja reativa-lo ?: ", "Reativar Cliente",
                    JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
            if (opt == JOptionPane.YES_OPTION) {
                clientes.setAtivoinativo(1);
                clientes = daocliente.saveCliente(clientes);
                this.CarregarTabela();
            }
        }
    }//GEN-LAST:event_jBAtivarInativarActionPerformed

    private void jBCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
        CadastroCliente cadastrocliente = new CadastroCliente();
        cadastrocliente.setResizable(false);
        cadastrocliente.setSize(2000, 700);
        cadastrocliente.setLocationRelativeTo(null);
        cadastrocliente.setVisible(true);
    }//GEN-LAST:event_jBCadastrarFuncionarioActionPerformed

    private void jBCadastrarFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarFuncionario1ActionPerformed
        // TODO add your handling code here:
        this.CarregarTabela();
    }//GEN-LAST:event_jBCadastrarFuncionario1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarCliente().setVisible(true);
            }
        });
    }

    public void CarregarTabela() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaCliente.getModel();
        table.setNumRows(0);
        daocliente.consultarTodosClientes().forEach((cliente) -> {
            String Ativoinativo = null;
            if (cliente.getAtivoinativo() == 1) {
                Ativoinativo = "Ativo";
            } else {
                Ativoinativo = "Inativo";
            }

            table.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getCpfoucnpj(),
                cliente.getTelefone(),
                cliente.getEmail(),
                Ativoinativo

            });
        });

    }

    public void PesquisarClientePorNomeNaTabla() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaCliente.getModel();
        table.setNumRows(0);
        for (Clientes cliente : daocliente.
                consultarClientePorNome(jtPesquisarNome.getText())) {
            String Ativoinativo = null;
            if (cliente.getAtivoinativo() == 1) {
                Ativoinativo = "Ativo";
            } else {
                Ativoinativo = "Inativo";
            }
            table.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getCpfoucnpj(),
                cliente.getTelefone(),
                cliente.getEmail(),
                Ativoinativo

            });

        }
    }

    public void PesquisarClientePorEmailNaTabla() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaCliente.getModel();
        table.setNumRows(0);
        for (Clientes cliente : daocliente.
                consultarClientePorEmail(jtPesquisarEmail.getText())) {
            String Ativoinativo = null;
            if (cliente.getAtivoinativo() == 1) {
                Ativoinativo = "Ativo";
            } else {
                Ativoinativo = "Inativo";
            }
            table.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getCpfoucnpj(),
                cliente.getTelefone(),
                cliente.getEmail(),
                Ativoinativo

            });

        }
    }

    public void PesquisarClientePorIdNaTabla() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaCliente.getModel();
        table.setNumRows(0);
        clientes = daocliente.
                consultarClientePorId(Integer.parseInt(jtPesquisarId.getText()));
        String Ativoinativo = null;
        if (clientes.getAtivoinativo() == 1) {
            Ativoinativo = "Ativo";
        } else {
            Ativoinativo = "Inativo";
        }
        table.addRow(new Object[]{
            clientes.getId(),
            clientes.getNome(),
            clientes.getCpfoucnpj(),
            clientes.getTelefone(),
            clientes.getEmail(),
            Ativoinativo

        });

    }

    public void PesquisarClientePorCpf() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaCliente.getModel();
        table.setNumRows(0);

        clientes = daocliente.consultarClientePorCpfOuCnpj2(jtPesquisarCpf.getText());
        String Ativoinativo = null;
        if (clientes.getAtivoinativo() == 1) {
            Ativoinativo = "Ativo";
        } else {
            Ativoinativo = "Inativo";
        }

        table.addRow(new Object[]{
            clientes.getId(),
            clientes.getNome(),
            clientes.getCpfoucnpj(),
            clientes.getTelefone(),
            clientes.getEmail(),
            Ativoinativo

        });

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

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("tdcicon.PNG")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisarCPF;
    private javax.swing.JButton btPesquisarEmail;
    private javax.swing.JButton btPesquisarEndereço;
    private javax.swing.JButton btPesquisarId;
    private javax.swing.JButton btPesquisarNome;
    private javax.swing.JButton jBAtivarInativar;
    private javax.swing.JButton jBCadastrarFuncionario;
    private javax.swing.JButton jBCadastrarFuncionario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpainelcabeçalho;
    private javax.swing.JTextField jtPesquisarCpf;
    private javax.swing.JTextField jtPesquisarEmail;
    private javax.swing.JTextField jtPesquisarId;
    private javax.swing.JTextField jtPesquisarNome;
    private javax.swing.JTable jtTabelaCliente;
    private javax.swing.JLabel lblFunc;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblPesquisar1;
    private javax.swing.JLabel lblPesquisar2;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblfuncionario;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblsetfuncao;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}
