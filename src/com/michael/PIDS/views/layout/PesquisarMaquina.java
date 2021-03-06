package com.michael.PIDS.views.layout;

import com.michael.PIDS.DAO.FuncionarioDAO;
import com.michael.PIDS.DAO.LoginDAO;
import com.michael.PIDS.DAO.MaquinaDAO;
import com.michael.PIDS.model.Funcionarios;
import com.michael.PIDS.model.Maquinarios;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class PesquisarMaquina extends javax.swing.JFrame {

    Funcionarios funcionario = new Funcionarios();
    FuncionarioDAO daofuncionario = new FuncionarioDAO();
    LoginDAO daologin = new LoginDAO();
    Login login = new Login();
    Maquinarios maquinas = new Maquinarios();
    MaquinaDAO daomaquinas = new MaquinaDAO();
    private String loginNome;

    public PesquisarMaquina() {
        initComponents();
        setIcon();
        this.CarregarTabela();
        usuariologado(login.usuariologado);

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
        jtTabelaMaquina = new javax.swing.JTable();
        lblPesquisar = new javax.swing.JLabel();
        jtPesquisarDescricao = new javax.swing.JTextField();
        btPesquisarDescricao = new javax.swing.JButton();
        btCadastrarMaquina = new javax.swing.JButton();
        BtCarregarTabela = new javax.swing.JButton();
        lblPesquisar1 = new javax.swing.JLabel();
        lblSerie = new javax.swing.JLabel();
        jtPesquisarSerie = new javax.swing.JTextField();
        btPesquisarSerie = new javax.swing.JButton();
        lblPesquisarTipo = new javax.swing.JLabel();
        jtPesquisarTipo = new javax.swing.JTextField();
        btPesquisarTipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar maquinas");
        setBackground(new java.awt.Color(255, 255, 255));

        jpainelcabeçalho.setBackground(new java.awt.Color(255, 255, 255));
        jpainelcabeçalho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblempresa.setText("Empresa:");

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("Lista de Maquinas");

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

        jtTabelaMaquina.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtTabelaMaquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "serie", "modelo", "Tipo", "Cliente", "dataCadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTabelaMaquina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTabelaMaquinaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabelaMaquina);

        lblPesquisar.setText("Pesquisar por:");

        btPesquisarDescricao.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarDescricao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisarDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarDescricaoActionPerformed(evt);
            }
        });

        btCadastrarMaquina.setBackground(new java.awt.Color(255, 255, 255));
        btCadastrarMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/new.png"))); // NOI18N
        btCadastrarMaquina.setText("Cadastrar Maquina");
        btCadastrarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarMaquinaActionPerformed(evt);
            }
        });

        BtCarregarTabela.setBackground(new java.awt.Color(255, 255, 255));
        BtCarregarTabela.setText("Carregar Tabela");
        BtCarregarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCarregarTabelaActionPerformed(evt);
            }
        });
        BtCarregarTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtCarregarTabelaKeyPressed(evt);
            }
        });

        lblPesquisar1.setText("Descricao:");

        lblSerie.setText("Serie:");

        btPesquisarSerie.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarSerie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarSerieActionPerformed(evt);
            }
        });

        lblPesquisarTipo.setText("Tipo:");

        btPesquisarTipo.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarTipoActionPerformed(evt);
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
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPesquisar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPesquisar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtPesquisarDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btPesquisarDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addComponent(lblSerie)
                        .addGap(18, 18, 18)
                        .addComponent(jtPesquisarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPesquisarTipo)
                        .addGap(18, 18, 18)
                        .addComponent(jtPesquisarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btCadastrarMaquina)
                        .addGap(56, 56, 56)
                        .addComponent(BtCarregarTabela)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpainelcabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPesquisar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtPesquisarDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPesquisar1)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(btPesquisarDescricao)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtPesquisarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSerie)))
                            .addComponent(btPesquisarSerie, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtPesquisarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPesquisarTipo)))
                                .addComponent(btPesquisarTipo, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarMaquina)
                    .addComponent(BtCarregarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtTabelaMaquinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaMaquinaMouseClicked


    }//GEN-LAST:event_jtTabelaMaquinaMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void btPesquisarDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarDescricaoActionPerformed
        this.PesquisarMaquinaPorDescricaoNaTabla();
    }//GEN-LAST:event_btPesquisarDescricaoActionPerformed

    private void btCadastrarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarMaquinaActionPerformed
        CadastroMaquina cadastromaq = new CadastroMaquina();
        cadastromaq.setResizable(false);
        cadastromaq.setSize(1000, 700);
        cadastromaq.setLocationRelativeTo(null);
        cadastromaq.setVisible(true);
    }//GEN-LAST:event_btCadastrarMaquinaActionPerformed

    private void btPesquisarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarSerieActionPerformed
        // TODO add your handling code here:

        if (jtPesquisarSerie.equals("")) {
            this.CarregarTabela();
        } else {
            this.PesquisarMaquinaPorSerieNaTabla();
        }
    }//GEN-LAST:event_btPesquisarSerieActionPerformed

    private void btPesquisarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarTipoActionPerformed
        // TODO add your handling code here:
        this.PesquisarMaquinaPorTipoNaTabla();
    }//GEN-LAST:event_btPesquisarTipoActionPerformed

    private void BtCarregarTabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtCarregarTabelaKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_BtCarregarTabelaKeyPressed

    private void BtCarregarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCarregarTabelaActionPerformed
        // TODO add your handling code here:
        this.CarregarTabela();
    }//GEN-LAST:event_BtCarregarTabelaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarMaquina().setVisible(true);
            }
        });
    }

    public void CarregarTabela() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaMaquina.getModel();
        table.setNumRows(0);
        daomaquinas.consultarTodasAsMaquinas().forEach((maquinas) -> {
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

            String dataCadastro = formatador.format(maquinas.getDatacadastro());
            table.addRow(new Object[]{
                maquinas.getId(),
                maquinas.getDescricao(),
                maquinas.getSerie(),
                maquinas.getModelo(),
                maquinas.getTipo(),
                maquinas.getNomeCliente(),
                dataCadastro
            });
        });

    }

    public void PesquisarMaquinaPorDescricaoNaTabla() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaMaquina.getModel();
        table.setNumRows(0);
        String descricao = jtPesquisarDescricao.getText();
        daomaquinas.consultarMaquinarioPorDescricao(descricao).forEach((maquinas) -> {
            table.addRow(new Object[]{
                maquinas.getId(),
                maquinas.getDescricao(),
                maquinas.getSerie(),
                maquinas.getModelo(),
                maquinas.getTipo(),
                maquinas.getNomeCliente(),
                maquinas.getDatacadastro()

            });

        });
    }

    public void PesquisarMaquinaPorSerieNaTabla() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaMaquina.getModel();
        table.setNumRows(0);
        String serie = jtPesquisarSerie.getText();
        maquinas = daomaquinas.consultarMaquinarioPorSerie(serie);
        table.addRow(new Object[]{
            maquinas.getId(),
            maquinas.getDescricao(),
            maquinas.getSerie(),
            maquinas.getModelo(),
            maquinas.getTipo(),
            maquinas.getNomeCliente(),
            maquinas.getDatacadastro()

        });

    }

    public void PesquisarMaquinaPorTipoNaTabla() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaMaquina.getModel();
        table.setNumRows(0);
        String tipo = jtPesquisarTipo.getText();
        daomaquinas.consultarMaquinarioPorTipo(tipo).forEach((maquinas) -> {
            table.addRow(new Object[]{
                maquinas.getId(),
                maquinas.getDescricao(),
                maquinas.getSerie(),
                maquinas.getModelo(),
                maquinas.getTipo(),
                maquinas.getNomeCliente(),
                maquinas.getDatacadastro()

            });

        });
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
    private javax.swing.JButton BtCarregarTabela;
    private javax.swing.JButton btCadastrarMaquina;
    private javax.swing.JButton btPesquisarDescricao;
    private javax.swing.JButton btPesquisarSerie;
    private javax.swing.JButton btPesquisarTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpainelcabeçalho;
    private javax.swing.JTextField jtPesquisarDescricao;
    private javax.swing.JTextField jtPesquisarSerie;
    private javax.swing.JTextField jtPesquisarTipo;
    private javax.swing.JTable jtTabelaMaquina;
    private javax.swing.JLabel lblFunc;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblPesquisar1;
    private javax.swing.JLabel lblPesquisarTipo;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblfuncionario;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblsetfuncao;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}
