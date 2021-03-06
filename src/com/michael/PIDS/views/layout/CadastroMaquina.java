package com.michael.PIDS.views.layout;

import com.michael.PIDS.DAO.ClienteDAO;
import com.michael.PIDS.DAO.FuncionarioDAO;
import com.michael.PIDS.DAO.GarantiaDAO;
import com.michael.PIDS.DAO.LoginDAO;
import com.michael.PIDS.DAO.MaquinaDAO;
import com.michael.PIDS.model.Clientes;
import com.michael.PIDS.model.Funcionarios;
import com.michael.PIDS.model.Garantias;
import com.michael.PIDS.model.Maquinarios;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroMaquina extends javax.swing.JFrame {

    Funcionarios funcionario = new Funcionarios();
    FuncionarioDAO daofuncionario = new FuncionarioDAO();
    LoginDAO daologin = new LoginDAO();
    Login login = new Login();
    Maquinarios maquinas = new Maquinarios();
    MaquinaDAO daomaquinas = new MaquinaDAO();
    Clientes clientes = new Clientes();
    ClienteDAO daoclientes = new ClienteDAO();
    Garantias garantias = new Garantias();
    GarantiaDAO daogarantias = new GarantiaDAO();
    PesquisarCliente pesqCliente = new PesquisarCliente();

    public CadastroMaquina() {
        initComponents();
        setIcon();
        this.usuariologado(login.usuariologado);
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
        jtDescricao = new javax.swing.JTextField();
        lblSerie = new javax.swing.JLabel();
        jtSerie = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        jtModelo = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        idReferences = new javax.swing.JLabel();
        lblLembrete1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jtIdCliente = new javax.swing.JTextField();
        btPesquisarCliente = new javax.swing.JButton();
        jtNomeCliente = new javax.swing.JTextField();
        jtTipo = new javax.swing.JComboBox<>();
        lblLembrete2 = new javax.swing.JLabel();
        lblLembrete3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtNotaFiscal = new javax.swing.JFormattedTextField();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        jtPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabelaMaquina = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de maquina");
        setBackground(new java.awt.Color(255, 255, 255));

        jpainelcabeçalho.setBackground(new java.awt.Color(255, 255, 255));
        jpainelcabeçalho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblempresa.setText("Empresa:");

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("Cadastro de Maquinas");

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
        lblNome.setText("Descrição(*):");

        jtDescricao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtDescricao.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtDescricaoComponentAdded(evt);
            }
        });
        jtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDescricaoFocusLost(evt);
            }
        });
        jtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescricaoActionPerformed(evt);
            }
        });

        lblSerie.setText("Serie(*):");

        jtSerie.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtSerie.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtSerieFocusLost(evt);
            }
        });

        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo(*):");

        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente.setText("Cliente(*):");

        lblModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModelo.setText("Modelo(*):");

        jtModelo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtModeloActionPerformed(evt);
            }
        });

        lblid.setText("Id:");

        lblLembrete1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblLembrete1.setForeground(new java.awt.Color(204, 0, 0));
        lblLembrete1.setText("Todos os campos com o simbolo (*) são obrigatorios");

        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("id:");

        jtIdCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIdClienteFocusLost(evt);
            }
        });
        jtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdClienteActionPerformed(evt);
            }
        });

        btPesquisarCliente.setBackground(new java.awt.Color(255, 153, 0));
        btPesquisarCliente.setForeground(new java.awt.Color(255, 153, 0));
        btPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lupa.png"))); // NOI18N
        btPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarClienteActionPerformed(evt);
            }
        });

        jtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maquina", "Maquinario", "Ferramentas", "EPI", "Veiculos", "Tratores", "Produtos Agricolas" }));
        jtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTipoActionPerformed(evt);
            }
        });

        lblLembrete2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblLembrete2.setForeground(new java.awt.Color(204, 0, 0));
        lblLembrete2.setText("Para escolher um ID referente a um cliente cadastrado, clique na lupa  laranja");

        lblLembrete3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblLembrete3.setForeground(new java.awt.Color(204, 0, 0));
        lblLembrete3.setText("Para excluir uma maquina cadastrada, selecione na tabela e clique em excluir");

        jLabel1.setText("Nota Fiscal(*):");

        jtNotaFiscal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jpainelLayout = new javax.swing.GroupLayout(jpainel);
        jpainel.setLayout(jpainelLayout);
        jpainelLayout.setHorizontalGroup(
            jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpainelLayout.createSequentialGroup()
                            .addComponent(lblid)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(idReferences, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(18, 18, 18)
                        .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addComponent(lblSerie)
                        .addGap(18, 18, 18)
                        .addComponent(jtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(lblModelo)
                        .addGap(18, 18, 18)
                        .addComponent(jtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jpainelLayout.createSequentialGroup()
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addComponent(lblLembrete1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLembrete2))
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addComponent(lblLembrete3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpainelLayout.setVerticalGroup(
            jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idReferences, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome)
                        .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSerie)
                        .addComponent(jtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblid)
                        .addComponent(lblModelo)
                        .addComponent(jtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addComponent(lblId)
                        .addGap(16, 16, 16)
                        .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTipo)
                                .addComponent(lblCliente)
                                .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jtNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btPesquisarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLembrete1)
                    .addComponent(lblLembrete2))
                .addGap(4, 4, 4)
                .addComponent(lblLembrete3)
                .addContainerGap())
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

        jtTabelaMaquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descricao", "Serie", "Modelo", "Tipo", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/excluir.png"))); // NOI18N
        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpainelcabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNovo)
                .addGap(31, 31, 31)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(btAlterar)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPesquisar)
                .addGap(18, 18, 18)
                .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btNovo)
                        .addComponent(btLimpar)
                        .addComponent(btSalvar)
                        .addComponent(btAlterar)
                        .addComponent(lblPesquisar))
                    .addComponent(btPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescricaoActionPerformed

    }//GEN-LAST:event_jtDescricaoActionPerformed

    private void jtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtModeloActionPerformed

    }//GEN-LAST:event_jtModeloActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        this.HabilitarCampos();
        this.HabilitarBotoes();
        this.limparCampos();

    }//GEN-LAST:event_btNovoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        this.SalvarMaquina();

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        this.AlterarMaquina();

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed

    }//GEN-LAST:event_btPesquisarActionPerformed

    private void jtTabelaMaquinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaMaquinaMouseClicked

        String idMaquina = "" + jtTabelaMaquina.getValueAt(
                jtTabelaMaquina.getSelectedRow(), 0);

        idReferences.setText(idMaquina);
        this.desabilitarCampos();
        btAlterar.setEnabled(true);
        btSalvar.setEnabled(false);
        this.PreencherCamposParaEfetuarAlteraraçao(Integer.parseInt(idMaquina));

    }//GEN-LAST:event_jtTabelaMaquinaMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jtDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDescricaoFocusLost


    }//GEN-LAST:event_jtDescricaoFocusLost

    private void jtSerieFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtSerieFocusLost
        String serie = jtSerie.getText().replaceAll(" ", "");
        maquinas = daomaquinas.consultarMaquinarioPorSerie(serie);

        if (maquinas.getId() != null) {
            JOptionPane.showMessageDialog(null, "O numero de serie:"
                    + " " + maquinas.getSerie() + " Já existe cadastro no sistema");
            this.desabilitarCampos();
            jtSerie.setEnabled(true);

        } else if (maquinas.getId() == null) {
            this.HabilitarCampos();

        }


    }//GEN-LAST:event_jtSerieFocusLost

    private void jtDescricaoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtDescricaoComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescricaoComponentAdded

    private void btPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarClienteActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Clique no nome do cliente na tabela "
                + "para selecioná-lo, apos isso feche a tela de pesquisa de cliente!");
        PesquisarCliente pesquicli = new PesquisarCliente();
        pesquicli.setResizable(false);
        pesquicli.setSize(1000, 700);
        pesquicli.setLocationRelativeTo(null);
        pesquicli.setVisible(true);
        jtIdCliente.setEnabled(true);
    }//GEN-LAST:event_btPesquisarClienteActionPerformed

    private void jtIdClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdClienteFocusLost
        // TODO add your handling code here:
        String preenchimento = pesqCliente.IDCliente.toString();

        jtIdCliente.setText(preenchimento);
        Integer id = Integer.parseInt(jtIdCliente.getText());
        clientes = daoclientes.consultarClientePorId(id);

        try {
            if (clientes.getId() == null) {
                JOptionPane.showMessageDialog(null, "Informe um ID valido");
                this.desabilitarCampos();
                jtIdCliente.setEnabled(true);

            } else {
                jtNomeCliente.setText(clientes.getNome());
                jtIdCliente.setEnabled(false);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe um ID valido");
            this.desabilitarCampos();
            jtIdCliente.setEnabled(true);

        }
    }//GEN-LAST:event_jtIdClienteFocusLost

    private void jtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int idmaquina = Integer.parseInt(idReferences.getText());
        int opçoes = JOptionPane.showConfirmDialog(null, "Realmente deseja"
                + " Excluir esses dados ? ", "",
                JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);

        if (opçoes == JOptionPane.YES_OPTION) {
            maquinas = daomaquinas.consultarMaquinarioPorId(idmaquina);
            String serie = maquinas.getSerie();
            garantias = daogarantias.consultarGarantiaPorSerieMaquina(serie);
            if (garantias.getId() != null) {
                daogarantias.removerGarantia(garantias.getId());
                daomaquinas.removerMaquina(idmaquina);
                this.CarregarTabela();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Erro na exclusão");
            }

        } else if (opçoes == JOptionPane.CANCEL_OPTION) {
            this.desabilitarCampos();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdClienteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMaquina().setVisible(true);
            }
        });
    }

    public void limparCampos() {
        idReferences.setText("");
        jtDescricao.setText("");
        jtModelo.setText("");
        jtSerie.setText("");
        jtIdCliente.setText("");
        jtNomeCliente.setText("");
        jtNotaFiscal.setText("");

    }

    public void desabilitarCampos() {
        idReferences.setEnabled(false);
        jtDescricao.setEnabled(false);
        jtModelo.setEnabled(false);
        jtSerie.setEnabled(false);
        jtTipo.setEnabled(false);
        jtIdCliente.setEnabled(false);
        jtNomeCliente.setEnabled(false);
        jtNotaFiscal.setEnabled(false);

    }

    public void desabilitarBotoes() {
        btSalvar.setEnabled(false);
        btAlterar.setEnabled(false);
        btLimpar.setEnabled(false);
        btPesquisarCliente.setEnabled(false);
    }

    public void HabilitarBotoes() {
        btSalvar.setEnabled(true);
        btAlterar.setEnabled(true);
        btLimpar.setEnabled(true);
        btPesquisarCliente.setEnabled(true);
    }

    public void HabilitarCampos() {
        idReferences.setEnabled(true);
        jtDescricao.setEnabled(true);
        jtModelo.setEnabled(true);
        jtSerie.setEnabled(true);
        jtTipo.setEnabled(true);
        jtIdCliente.setEnabled(true);
        jtNotaFiscal.setEnabled(true);

    }

    public void CarregarTabela() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaMaquina.getModel();
        table.setNumRows(0);
        daomaquinas.consultarTodasAsMaquinas().forEach((maquinas) -> {
           

            table.addRow(new Object[]{
                maquinas.getId(),
                maquinas.getDescricao(),
                maquinas.getSerie(),
                maquinas.getModelo(),
                maquinas.getTipo(),
                maquinas.getNomeCliente()

            });
        });

    }

    public void SalvarMaquina() {
        try {
            Date data = new Date();

            String id = idReferences.getText();
            String descricao = jtDescricao.getText();
            String serie = jtSerie.getText().replaceAll(" ", "");
            String tipo = jtTipo.getSelectedItem().toString();
            String modelo = jtModelo.getText();
            String idCliente = jtIdCliente.getText().replaceAll(" ", "");
            String nomeCliente = jtNomeCliente.getText();

            if (idReferences.getText().equals("")) {
                maquinas.setId(null);
            } else {
                System.out.println("id:" + id);
                maquinas.setId(Integer.parseInt(id));
            }
            maquinas.setDatacadastro(data);
            maquinas.setDescricao(descricao);
            maquinas.setFuncionario(funcionario);
            maquinas.setModelo(modelo);
            maquinas.setNomeCliente(nomeCliente);
            maquinas.setSerie(serie);
            maquinas.setTipo(tipo);
            maquinas.setClienteId(Integer.parseInt(idCliente));

            if (validacaoDosCampos() == true) {
                if (maquinas.getId() == null) {

                    maquinas = daomaquinas.saveMaquina(maquinas);
                    this.SalvarGarantia(funcionario, maquinas, Integer.parseInt(idCliente),descricao);
                } else {
                    maquinas = daomaquinas.saveMaquina(maquinas);
                }

            } else if (validacaoDosCampos() == false) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");

            }

            this.CarregarTabela();
            if (maquinas.getId() == null) {
                JOptionPane.showMessageDialog(null, "Erro ao Salvar Maquina",
                        "Erro", JOptionPane.ERROR_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Salvo com sucesso",
                        "Sucesso", JOptionPane.WIDTH);
                this.desabilitarBotoes();
                this.limparCampos();
            }

        } catch (Exception e) {

        }

    }

    public void AlterarMaquina() {
        int opçoes = JOptionPane.showConfirmDialog(null, "Realmente deseja"
                + " alterar os dados do maquinario? ", "",
                JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);

        if (opçoes == JOptionPane.YES_OPTION) {
            this.HabilitarCampos();
            btSalvar.setEnabled(true);
            btLimpar.setEnabled(true);
            jtIdCliente.setEnabled(false);
            btPesquisarCliente.setEnabled(false);

        } else if (opçoes == JOptionPane.CANCEL_OPTION) {
            this.desabilitarCampos();

        }

    }

    public void SalvarGarantia(Funcionarios funcionarios, Maquinarios maquinas, int idCliente,String descricao) {

        Date dataInicial = new Date();
        Date dataFinal = daogarantias.somaDias(dataInicial, 365);
        String serie = maquinas.getSerie();
        garantias.setId(null);
        garantias.setDataInicial(dataInicial);
        garantias.setDataFinalGarantia(dataFinal);
        garantias.setFuncionarioId(funcionario);
        garantias.setMaquina(maquinas);
        garantias.setClienteId(idCliente);
        garantias.setNotaFiscal(Integer.parseInt(jtNotaFiscal.getText()));
        garantias.setStatus("Válida");
        garantias.setSerialMaquina(serie);
        garantias.setDescricaoMaquina(descricao);
        garantias = daogarantias.saveGarantia(garantias);

        if (garantias.getId() != null) {
            System.out.println("garantia salva com sucesso");
        } else {
            System.out.println("Erro ao salvar garantia");
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

    public boolean validacaoDosCampos() {
        if (jtDescricao.getText().equals("") || jtIdCliente.getText().equals("")
                || jtModelo.getText().equals("") || jtNomeCliente.getText().equals("")
                || jtSerie.getText().equals("") || jtIdCliente.getText().equals("")
                || jtNomeCliente.getText().equals("") || jtNotaFiscal.getText().equals("")) {

            return false;
        } else {
            return true;
        }
    }

    public void PreencherCamposParaEfetuarAlteraraçao(Integer id) {
        maquinas = daomaquinas.consultarMaquinarioPorId(id);
        jtDescricao.setText(maquinas.getDescricao());
        jtIdCliente.setText(maquinas.getClienteId().toString());
        jtModelo.setText(maquinas.getModelo().toString());
        jtNomeCliente.setText(maquinas.getNomeCliente());
        jtSerie.setText(maquinas.getSerie());

    }
 private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("tdcicon.PNG")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btPesquisarCliente;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel idReferences;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpainel;
    private javax.swing.JPanel jpainelcabeçalho;
    private javax.swing.JTextField jtDescricao;
    private javax.swing.JTextField jtIdCliente;
    private javax.swing.JTextField jtModelo;
    private javax.swing.JTextField jtNomeCliente;
    private javax.swing.JFormattedTextField jtNotaFiscal;
    private javax.swing.JTextField jtPesquisar;
    private javax.swing.JTextField jtSerie;
    private javax.swing.JTable jtTabelaMaquina;
    private javax.swing.JComboBox<String> jtTipo;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFunc;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLembrete1;
    private javax.swing.JLabel lblLembrete2;
    private javax.swing.JLabel lblLembrete3;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblfuncionario;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblsetfuncao;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}
