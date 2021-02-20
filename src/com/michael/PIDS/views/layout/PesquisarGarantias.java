package com.michael.PIDS.views.layout;

import com.michael.PIDS.DAO.ClienteDAO;
import com.michael.PIDS.DAO.FuncionarioDAO;
import com.michael.PIDS.DAO.GarantiaDAO;
import com.michael.PIDS.DAO.LoginDAO;
import com.michael.PIDS.model.Clientes;
import com.michael.PIDS.model.Funcionarios;
import com.michael.PIDS.model.Garantias;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

public class PesquisarGarantias extends javax.swing.JFrame {

    Funcionarios funcionario = new Funcionarios();
    FuncionarioDAO daofuncionario = new FuncionarioDAO();
    LoginDAO daologin = new LoginDAO();
    Login login = new Login();
    Garantias garantias = new Garantias();
    GarantiaDAO daogarantias = new GarantiaDAO();
    Clientes cliente = new Clientes();
    ClienteDAO clienteDAo = new ClienteDAO();
    String IdGarantia;
    private String loginNome;

    public PesquisarGarantias() {
        initComponents();
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
        jtTabelaGarantia = new javax.swing.JTable();
        lblPesquisar = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        btPesquisarPorId = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jtNomeCliente = new javax.swing.JTextField();
        btPesquisarPorNomeCliente = new javax.swing.JButton();
        lblIdCliente = new javax.swing.JLabel();
        jtIdCliente = new javax.swing.JTextField();
        btPesquisarPorIdCliente = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        PesquisarPorData = new javax.swing.JButton();
        jtdataFinal = new javax.swing.JFormattedTextField();
        jtdataInicial = new javax.swing.JFormattedTextField();
        lblData1 = new javax.swing.JLabel();
        lblData2 = new javax.swing.JLabel();
        jBGerarCet = new javax.swing.JButton();
        jBCarregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jpainelcabeçalho.setBackground(new java.awt.Color(255, 255, 255));
        jpainelcabeçalho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblempresa.setText("Empresa:");

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("Lista de Garantias");

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

        jtTabelaGarantia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtTabelaGarantia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data Inicial", "Data de Vencimento", "Cliente", "Maquina", "Nºserie da maquina", "Nota Fiscal", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTabelaGarantia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTabelaGarantiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabelaGarantia);

        lblPesquisar.setText("Pesquisar");

        jtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdActionPerformed(evt);
            }
        });

        btPesquisarPorId.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarPorId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarPorIdActionPerformed(evt);
            }
        });

        lblId.setText("Id:");

        lblNome.setText("Nome do Cliente:");

        jtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeClienteActionPerformed(evt);
            }
        });

        btPesquisarPorNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarPorNomeCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisarPorNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarPorNomeClienteActionPerformed(evt);
            }
        });

        lblIdCliente.setText("Id do cliente:");

        jtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdClienteActionPerformed(evt);
            }
        });

        btPesquisarPorIdCliente.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisarPorIdCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisarPorIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarPorIdClienteActionPerformed(evt);
            }
        });

        lblData.setText("data:");

        PesquisarPorData.setBackground(new java.awt.Color(255, 255, 255));
        PesquisarPorData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        PesquisarPorData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarPorDataActionPerformed(evt);
            }
        });

        try {
            jtdataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtdataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblData1.setText("Inicial");

        lblData2.setText("Final");

        jBGerarCet.setBackground(new java.awt.Color(255, 255, 255));
        jBGerarCet.setText("Gerar CET");
        jBGerarCet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerarCetActionPerformed(evt);
            }
        });

        jBCarregar.setBackground(new java.awt.Color(255, 255, 255));
        jBCarregar.setText("Carregar Tabela");
        jBCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpainelcabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisarPorNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIdCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisarPorIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblData)
                        .addGap(18, 18, 18)
                        .addComponent(jtdataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtdataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PesquisarPorData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblData1)
                        .addGap(58, 58, 58)
                        .addComponent(lblData2)
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPesquisar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jBGerarCet)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jBCarregar)
                    .addContainerGap(774, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpainelcabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblData2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addComponent(btPesquisarPorNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdCliente))
                        .addComponent(btPesquisarPorIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPesquisarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblData)
                            .addComponent(jtdataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtdataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PesquisarPorData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jBGerarCet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(617, Short.MAX_VALUE)
                    .addComponent(jBCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(68, 68, 68)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtTabelaGarantiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaGarantiaMouseClicked
        IdGarantia = "" + jtTabelaGarantia.getValueAt(
                jtTabelaGarantia.getSelectedRow(), 0);

        System.out.println(loginNome);
    }//GEN-LAST:event_jtTabelaGarantiaMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void btPesquisarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarPorIdActionPerformed
        this.PesquisarPorId(Integer.parseInt(jtId.getText()));
    }//GEN-LAST:event_btPesquisarPorIdActionPerformed

    private void jtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdActionPerformed

    private void jtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeClienteActionPerformed

    private void btPesquisarPorNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarPorNomeClienteActionPerformed
        // TODO add your handling code here:
        List<Clientes> clientes = clienteDAo.consultarClientePorNome(jtNomeCliente.getText());
        for (Clientes c : clientes) {
            int id = c.getId();
            this.PesquisarPorCliente(id);
        }


    }//GEN-LAST:event_btPesquisarPorNomeClienteActionPerformed

    private void jtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdClienteActionPerformed

    }//GEN-LAST:event_jtIdClienteActionPerformed

    private void btPesquisarPorIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarPorIdClienteActionPerformed

        int id = Integer.parseInt(jtIdCliente.getText());
        this.PesquisarPorCliente(id);
    }//GEN-LAST:event_btPesquisarPorIdClienteActionPerformed

    private void PesquisarPorDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarPorDataActionPerformed

        // TODO add your handling code here:
        SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date dataInicial = formatador.parse(jtdataInicial.getText().replaceAll("/", "-"));
            Date dataFinal = formatador.parse(jtdataFinal.getText().replaceAll("/", "-"));

            this.PesquisarPorData(dataInicial, dataFinal);
        } catch (ParseException ex) {
            Logger.getLogger(PesquisarGarantias.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_PesquisarPorDataActionPerformed

    private void jBGerarCetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerarCetActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(IdGarantia);
        this.RelatorioGarantia(id);
    }//GEN-LAST:event_jBGerarCetActionPerformed

    private void jBCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCarregarActionPerformed
       
        this.CarregarTabela();
    }//GEN-LAST:event_jBCarregarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarGarantias().setVisible(true);

            }
        });
    }

    public void CarregarTabela() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaGarantia.getModel();
        table.setNumRows(0);

        daogarantias.consultarTodasGarantias().forEach((garantias) -> {

            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            //data atual para comparar a data de vencimento da garantia
            Date dataHoje = new Date();

            String dataInicial = formatador.format(garantias.getDataInicial());
            System.out.println(garantias.getDataInicial());
            String dataFinal = formatador.format(garantias.getDataFinalGarantia());
            String nomeCliente;
            int idcliente = Integer.parseInt(garantias.getClienteId().toString());
            cliente = clienteDAo.consultarClientePorId(idcliente);
            nomeCliente = cliente.getNome();

            if (garantias.getDataFinalGarantia().before(dataHoje)) {
                System.out.println("entrou");
                garantias = daogarantias.GarantiaVencida(garantias);
            }

            table.addRow(new Object[]{
                garantias.getId(),
                dataInicial,
                dataFinal,
                nomeCliente,
                garantias.getMaquina().getDescricao(),
                garantias.getSerialMaquina(),
                garantias.getNotaFiscal(),
                garantias.getStatus()

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

    public void PesquisarPorData(Date datainicial, Date datafinal) {
        DefaultTableModel table = (DefaultTableModel) jtTabelaGarantia.getModel();
        table.setNumRows(0);

        daogarantias.consultarGarantiaPorData(datainicial, datafinal).forEach((garantias) -> {

            SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
            String dataInicial = formatador.format(garantias.getDataInicial());
            String dataFinal = formatador.format(garantias.getDataFinalGarantia());

            String nomeCliente;
            int idcliente = Integer.parseInt(garantias.getClienteId().toString());
            cliente = clienteDAo.consultarClientePorId(idcliente);
            nomeCliente = cliente.getNome();

            table.addRow(new Object[]{
                garantias.getId(),
                dataInicial,
                dataFinal,
                nomeCliente,
                garantias.getMaquina().getDescricao(),
                garantias.getSerialMaquina(),
                garantias.getNotaFiscal(),
                garantias.getStatus()

            });
        });

    }

    public void PesquisarPorCliente(int idClient) {
        DefaultTableModel table = (DefaultTableModel) jtTabelaGarantia.getModel();
        table.setNumRows(0);

        daogarantias.consultarGarantiaPorCliente(idClient).forEach((garantias) -> {

            SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
            String dataInicial = formatador.format(garantias.getDataInicial());
            String dataFinal = formatador.format(garantias.getDataFinalGarantia());

            String nomeCliente;
            int idcliente = Integer.parseInt(garantias.getClienteId().toString());
            cliente = clienteDAo.consultarClientePorId(idcliente);
            nomeCliente = cliente.getNome();

            table.addRow(new Object[]{
                garantias.getId(),
                dataInicial,
                dataFinal,
                nomeCliente,
                garantias.getMaquina().getDescricao(),
                garantias.getSerialMaquina(),
                garantias.getNotaFiscal(),
                garantias.getStatus()

            });
        });

    }

    public void PesquisarPorId(Integer id) {
        DefaultTableModel table = (DefaultTableModel) jtTabelaGarantia.getModel();
        table.setNumRows(0);

        garantias = daogarantias.consultarGarantiaPorId(id);

        SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
        String dataInicial = formatador.format(garantias.getDataInicial());
        String dataFinal = formatador.format(garantias.getDataFinalGarantia());

        String nomeCliente;
        int idcliente = Integer.parseInt(garantias.getClienteId().toString());
        cliente = clienteDAo.consultarClientePorId(idcliente);
        nomeCliente = cliente.getNome();

        table.addRow(new Object[]{
            garantias.getId(),
            dataInicial,
            dataFinal,
            nomeCliente,
            garantias.getMaquina().getDescricao(),
            garantias.getSerialMaquina(),
            garantias.getNotaFiscal(),
            garantias.getStatus()

        });

    }

    public void RelatorioGarantia(int idGarantia) {
        garantias = daogarantias.consultarGarantiaPorId(idGarantia);
        int idCliente = garantias.getClienteId();
        cliente = clienteDAo.consultarClientePorId(idCliente);
        Document doc = new Document();
        String arquivoPDF = "Garantia.pdf";

        SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
        String dataInicial = formatador.format(garantias.getDataInicial());
        String dataFinal = formatador.format(garantias.getDataFinalGarantia());

        try {
            PdfWriter.getInstance(doc, new FileOutputStream(arquivoPDF));
            doc.open();
            Paragraph p = new Paragraph("Comprovante de garantia");
            p.setAlignment(1);
            doc.add(p);
            p = new Paragraph("");
            doc.add(p);
            p = new Paragraph("");
            doc.add(p);
            p = new Paragraph("Comprovante de garantia do cliente: "
                    + cliente.getNome() + " Referente a maquina: " + garantias.getMaquina().getDescricao()
                    + " Numero de serie: " + garantias.getMaquina().getSerie() + " nota fiscal: " + garantias.getNotaFiscal()
                    + " Registrada na data " + dataInicial
            );
            doc.add(p);
            p = new Paragraph("");
            doc.add(p);
            p = new Paragraph("A garantia é valida ate a data: " + dataFinal);
            doc.add(p);
            p = new Paragraph("");
            doc.add(p);
            p = new Paragraph("Assinatura do cliente__________________________");
            doc.add(p);
            p = new Paragraph("");
            doc.add(p);
            p = new Paragraph("Assinatura do Vendedor__________________________");
            doc.add(p);
            doc.close();
            Desktop.getDesktop().open(new File(arquivoPDF));

        } catch (Exception e) {

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PesquisarPorData;
    private javax.swing.JButton btPesquisarPorId;
    private javax.swing.JButton btPesquisarPorIdCliente;
    private javax.swing.JButton btPesquisarPorNomeCliente;
    private javax.swing.JButton jBCarregar;
    private javax.swing.JButton jBGerarCet;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpainelcabeçalho;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtIdCliente;
    private javax.swing.JTextField jtNomeCliente;
    private javax.swing.JTable jtTabelaGarantia;
    private javax.swing.JFormattedTextField jtdataFinal;
    private javax.swing.JFormattedTextField jtdataInicial;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblData2;
    private javax.swing.JLabel lblFunc;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblfuncionario;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblsetfuncao;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}
