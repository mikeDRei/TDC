package com.michael.PIDS.views.layout;

import com.michael.PIDS.DAO.ClienteDAO;
import com.michael.PIDS.DAO.EmailDAO;
import com.michael.PIDS.DAO.EnderecoDAO;
import com.michael.PIDS.DAO.FuncionarioDAO;
import com.michael.PIDS.DAO.LoginDAO;
import com.michael.PIDS.ENUM.TipoCliente;
import com.michael.PIDS.model.Clientes;
import com.michael.PIDS.model.Enderecos;
import com.michael.PIDS.model.Funcionarios;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroCliente extends javax.swing.JFrame {

    Funcionarios funcionario = new Funcionarios();
    FuncionarioDAO daofuncionario = new FuncionarioDAO();
    LoginDAO daologin = new LoginDAO();
    Login login = new Login();
    Clientes clientes = new Clientes();
    ClienteDAO daocliente = new ClienteDAO();
    EnderecoDAO daoendereco = new EnderecoDAO();
    Enderecos enderecos = new Enderecos();
    private String CpfOuCnpj;

    public CadastroCliente() {
        initComponents();
        setIcon();
        funcionario = usuariologado(login.usuariologado);

        this.CarregarTabela();
        this.desabilitarCampos();
        this.desabilitarBotoes();
        //inicializadores
        btNovo.setEnabled(true);
        jtNumero.setText("0");

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
        lblid = new javax.swing.JLabel();
        idReferences = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcPessoaFisicaouJuridica = new javax.swing.JComboBox<>();
        lblCpfOuCnpj = new javax.swing.JLabel();
        jtCpfouCnj = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        lblfoneFixo = new javax.swing.JLabel();
        lbldataNascimento = new javax.swing.JLabel();
        lblCadastroEndereço = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        jtBairro = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        jtComplemento = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        jtRua = new javax.swing.JTextField();
        lblnumero = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JFormattedTextField();
        jtfoneFixo = new javax.swing.JFormattedTextField();
        jtCep = new javax.swing.JFormattedTextField();
        lblLembrete1 = new javax.swing.JLabel();
        lblIdEnd = new javax.swing.JLabel();
        idReferencesEnd = new javax.swing.JLabel();
        lbldia = new javax.swing.JLabel();
        lblmes = new javax.swing.JLabel();
        lblano = new javax.swing.JLabel();
        jtmes = new javax.swing.JFormattedTextField();
        jtano = new javax.swing.JFormattedTextField();
        lblCidade = new javax.swing.JLabel();
        jtCidade = new javax.swing.JTextField();
        jtdia = new javax.swing.JFormattedTextField();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        jtPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabelaCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setBackground(new java.awt.Color(255, 255, 255));

        jpainelcabeçalho.setBackground(new java.awt.Color(255, 255, 255));
        jpainelcabeçalho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblempresa.setText("Empresa:");

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("Cadastro de Clientes");

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

        jpainel.setBackground(new java.awt.Color(255, 255, 255));
        jpainel.setForeground(new java.awt.Color(255, 255, 255));

        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome completo(*):");

        jtNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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

        lblid.setText("Id:");

        jLabel1.setText("Entidade(*):");

        jcPessoaFisicaouJuridica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Fisica", "Pessoa Juridica" }));
        jcPessoaFisicaouJuridica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcPessoaFisicaouJuridicaFocusLost(evt);
            }
        });
        jcPessoaFisicaouJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPessoaFisicaouJuridicaActionPerformed(evt);
            }
        });

        lblCpfOuCnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblCpfOuCnpjFocusLost(evt);
            }
        });

        jtCpfouCnj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCpfouCnjFocusLost(evt);
            }
        });

        lblTelefone.setText("Telefone(*):");

        lblfoneFixo.setText("Telefone Fixo:");

        lbldataNascimento.setText("data de nascimento(*)");

        lblCadastroEndereço.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCadastroEndereço.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroEndereço.setText("Cadastro de Endereço");

        lblBairro.setText("Bairro(*):");

        lblComplemento.setText("Complemento(*):");

        lblRua.setText("Rua(*):");

        lblnumero.setText("Numero:");

        jtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNumeroActionPerformed(evt);
            }
        });

        lblCep.setText("CEP(*):");

        lblEmail.setText("Email(*):");

        try {
            jtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtfoneFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblLembrete1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblLembrete1.setForeground(new java.awt.Color(204, 0, 0));
        lblLembrete1.setText("Todos os campos com o simbolo (*) são obrigatorios");

        lblIdEnd.setText("Id Endereço:");

        lbldia.setText("dia");

        lblmes.setText("mes");

        lblano.setText("ano");

        try {
            jtmes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtano.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCidade.setText("Cidade(*):");

        try {
            jtdia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jpainelLayout = new javax.swing.GroupLayout(jpainel);
        jpainel.setLayout(jpainelLayout);
        jpainelLayout.setHorizontalGroup(
            jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadastroEndereço, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpainelLayout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(lblid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idReferences, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jpainelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lbldia)
                                .addGap(32, 32, 32)
                                .addComponent(lblmes))
                            .addGroup(jpainelLayout.createSequentialGroup()
                                .addComponent(jtdia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jtmes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpainelLayout.createSequentialGroup()
                                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpainelLayout.createSequentialGroup()
                                        .addComponent(jcPessoaFisicaouJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(lblCpfOuCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtCpfouCnj, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpainelLayout.createSequentialGroup()
                                        .addComponent(jtano, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(lblEmail)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(lblTelefone)
                                .addGap(18, 18, 18)
                                .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpainelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblano)))
                        .addGap(72, 72, 72))
                    .addGroup(jpainelLayout.createSequentialGroup()
                        .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpainelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblfoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbldataNascimento))
                            .addComponent(lblLembrete1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpainelLayout.createSequentialGroup()
                                .addComponent(lblIdEnd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idReferencesEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblBairro)
                                .addGap(18, 18, 18)
                                .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblnumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpainelLayout.setVerticalGroup(
            jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpainelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCpfOuCnpj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblid)
                            .addComponent(jLabel1)
                            .addComponent(jcPessoaFisicaouJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(idReferences, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtCpfouCnj, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldia)
                    .addComponent(lblmes)
                    .addComponent(lblano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldataNascimento)
                    .addComponent(jtfoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfoneFixo)
                    .addComponent(jtano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(jtdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(lblCadastroEndereço)
                .addGap(18, 18, 18)
                .addGroup(jpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento)
                    .addComponent(lblRua)
                    .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnumero)
                    .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep)
                    .addComponent(jtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdEnd)
                    .addComponent(idReferencesEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lblLembrete1)
                .addGap(21, 21, 21))
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

        jtTabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF/CNPJ", "Telefone", "DataCadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed

    }//GEN-LAST:event_jtNomeActionPerformed

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
        try {
            this.SalvarCliente();
        } catch (Exception ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int opçoes = JOptionPane.showConfirmDialog(null, "Realmente deseja"
                + " alterar os dados do Cliente: " + jtNome.getText(), "",
                JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);

        if (opçoes == JOptionPane.YES_OPTION) {
            this.HabilitarCampos();
            btSalvar.setEnabled(true);
            btLimpar.setEnabled(true);

        } else if (opçoes == JOptionPane.CANCEL_OPTION) {
            this.desabilitarCampos();
        }

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        this.PesquisarClientePorNomeNaTabla();


    }//GEN-LAST:event_btPesquisarActionPerformed

    private void jtTabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaClienteMouseClicked

        try {
            String nome = "" + jtTabelaCliente.getValueAt(
                    jtTabelaCliente.getSelectedRow(), 1);

            jtNome.setText(nome);
            this.desabilitarCampos();
            btAlterar.setEnabled(true);
            btSalvar.setEnabled(false);
            this.PreencherCamposParaEfetuarAlteraraçao();
        } catch (ParseException ex) {
            Logger.getLogger(CadastroCliente.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jtTabelaClienteMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNomeFocusLost


    }//GEN-LAST:event_jtNomeFocusLost

    private void jcPessoaFisicaouJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPessoaFisicaouJuridicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcPessoaFisicaouJuridicaActionPerformed

    private void jcPessoaFisicaouJuridicaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcPessoaFisicaouJuridicaFocusLost
        String PessoaFisicaouJuridica = jcPessoaFisicaouJuridica.
                getSelectedItem().toString();
        CpfOuCnpj = PessoaFisicaouJuridica;
        System.out.println(CpfOuCnpj);
        if (CpfOuCnpj.equals("Pessoa Fisica")) {
            lblCpfOuCnpj.setText("CPF(*)");

        } else if (CpfOuCnpj.equals("Pessoa Juridica")) {
            lblCpfOuCnpj.setText("CNPJ(*)");

        }


    }//GEN-LAST:event_jcPessoaFisicaouJuridicaFocusLost

    private void jtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNumeroActionPerformed

    private void lblCpfOuCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblCpfOuCnpjFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_lblCpfOuCnpjFocusLost

    private void jtCpfouCnjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCpfouCnjFocusLost
        // TODO add your handling code here:
        clientes = daocliente.consultarClientePorCpfOuCnpj2(
                jtCpfouCnj.getText());
        System.out.println(clientes.getNome());
        if (clientes.getId() != null) {
            JOptionPane.showMessageDialog(null,
                    "este CPF/CNPJ já pertecence ao cliente: "
                    + clientes.getNome() + " ");
            this.desabilitarCampos();
            jtCpfouCnj.setEnabled(true);
        } else if (clientes.getId() == null) {
            this.HabilitarCampos();
        }
    }//GEN-LAST:event_jtCpfouCnjFocusLost

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    public void limparCampos() {
        idReferences.setText("");
        jtNome.setText("");
        jtNome.setText("");
        jtBairro.setText("");
        jtCep.setText("");
        jtComplemento.setText("");
        jtfoneFixo.setText("");
        jtNumero.setText("");
        jtRua.setText("");
        jtTelefone.setText("");
        jtmes.setText("");
        jtmes.setText("");
        jtano.setText("");
        jtfoneFixo.setText("");
        jtCpfouCnj.setText("");
        jtEmail.setText("");
        jtCidade.setText("");
        jtNumero.setText("0");

    }

    public void desabilitarCampos() {
        jtNome.setEnabled(false);
        jtBairro.setEnabled(false);
        jtCep.setEnabled(false);
        jtComplemento.setEnabled(false);
        jtfoneFixo.setEnabled(false);
        jtNumero.setEnabled(false);
        jtRua.setEnabled(false);
        jtTelefone.setEnabled(false);
        jtmes.setEnabled(false);
        jtmes.setEnabled(false);
        jtano.setEnabled(false);
        jtfoneFixo.setEnabled(false);
        jtEmail.setEnabled(false);
        jtCpfouCnj.setEnabled(false);
        jcPessoaFisicaouJuridica.setEnabled(false);
        jtCidade.setEnabled(false);
        jtdia.setEnabled(false);
    }

    public void HabilitarCampos() {
        jtNome.setEnabled(true);
        jtBairro.setEnabled(true);
        jtCep.setEnabled(true);
        jtComplemento.setEnabled(true);
        jtfoneFixo.setEnabled(true);
        jtNumero.setEnabled(true);
        jtRua.setEnabled(true);
        jtTelefone.setEnabled(true);
        jtmes.setEnabled(true);
        jtmes.setEnabled(true);
        jtano.setEnabled(true);
        jtfoneFixo.setEnabled(true);
        jtEmail.setEnabled(true);
        jtCpfouCnj.setEnabled(true);
        jcPessoaFisicaouJuridica.setEnabled(true);
        jtCidade.setEnabled(true);
        jtdia.setEnabled(true);
    }

    public void desabilitarBotoes() {
        btSalvar.setEnabled(false);
        btAlterar.setEnabled(false);
        btLimpar.setEnabled(false);

    }

    public void CarregarTabela() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaCliente.getModel();
        table.setNumRows(0);
        daocliente.consultarTodosClientes().forEach((cliente) -> {
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

            String dataCadastro = formatador.format(cliente.getDatacadastro());
            table.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getCpfoucnpj(),
                cliente.getTelefone(),
                dataCadastro

            });
        });

    }

    public void PesquisarClientePorNomeNaTabla() {
        DefaultTableModel table = (DefaultTableModel) jtTabelaCliente.getModel();
        table.setNumRows(0);
        for (Clientes cliente : daocliente.
                consultarClientePorNome(jtPesquisar.getText())) {
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

            String dataCadastro = formatador.format(cliente.getDatacadastro());
            table.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getCpfoucnpj(),
                cliente.getTelefone(),
                dataCadastro

            });

        }
    }

    public void PreencherCamposParaEfetuarAlteraraçao() throws ParseException {

        for (Clientes cliente : daocliente.
                consultarClientePorNome(jtNome.getText())) {

            jtNome.setText(cliente.getNome());
            idReferences.setText(cliente.getId().toString());
            jtEmail.setText(cliente.getEmail());
            jtCpfouCnj.setText(cliente.getCpfoucnpj());
            jtTelefone.setText(cliente.getTelefone());
            jtfoneFixo.setText(cliente.getTelFixo());

            jtdia.setText(cliente.getDia().toString());
            jtmes.setText(cliente.getMes().toString());
            jtano.setText(cliente.getAno().toString());
            System.out.println(cliente.getId());
            enderecos = daoendereco.findIdCliente(cliente.getId());
            System.out.println(cliente.getId());
            jtBairro.setText(enderecos.getBairro());
            idReferencesEnd.setText(enderecos.getId().toString());
            jtNumero.setText(enderecos.getNumero().toString());
            jtCep.setText(enderecos.getCep());
            jtComplemento.setText(enderecos.getComplemento());
            jtRua.setText(enderecos.getRua());
            jtCidade.setText(enderecos.getCidade());

        }

    }

    public void SalvarCliente() throws Exception {
        EmailDAO send = new EmailDAO();
        String email = jtEmail.getText().replaceAll(" ", "");
        String nome = jtNome.getText();
        String telefone = jtTelefone.getText().replaceAll(" ", "");
        String telfixo = jtfoneFixo.getText().replaceAll(" ", "");

        String complemento = jtComplemento.getText();
        String rua = jtRua.getText();
        String cep = jtCep.getText().replaceAll(" ", "");
        String bairro = jtBairro.getText();
        String cidade = jtCidade.getText();
        String id = idReferences.getText();
        if (jtmes.getText().equals("") || jtmes.getText().equals("")
                || jtano.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha a data de nascimento");
        }

        int dia = Integer.parseInt(jtdia.getText());
        int mes = Integer.parseInt(jtmes.getText());
        int ano = Integer.parseInt(jtano.getText());

        Date data = new Date();
        System.out.println(data);
        String PessoaFisicaouJuridica
                = jcPessoaFisicaouJuridica.getSelectedItem().toString();
        CpfOuCnpj = PessoaFisicaouJuridica;

        if (CpfOuCnpj.equals("Pessoa Fisica")) {

            if (daocliente.ValidarCpf(jtCpfouCnj.getText()) == true) {
                clientes.setCpfoucnpj(jtCpfouCnj.getText().replaceAll(" ", ""));
            } else if (daocliente.ValidarCpf(jtCpfouCnj.getText()) == false) {
                JOptionPane.showMessageDialog(null, "CPF INVALIDO",
                        "Erro", JOptionPane.ERROR_MESSAGE);

            }

        } else if (CpfOuCnpj.equals("Pessoa Juridica")) {
            if (daocliente.ValidarCnpj(jtCpfouCnj.getText()) == true) {
                clientes.setCpfoucnpj(jtCpfouCnj.getText().replaceAll(" ", ""));
            } else if (daocliente.ValidarCpf(jtCpfouCnj.getText()) == false) {
                JOptionPane.showMessageDialog(null, "CNPJ INVALIDO",
                        "Erro", JOptionPane.ERROR_MESSAGE);

            }

        }

        clientes.setEmail(email);
        clientes.setFuncionarioId(funcionario);
        clientes.setAtivoinativo(1);
        clientes.setRemember_token(null);
        if (idReferences.getText().equals("")) {
            clientes.setId(null);
        } else {
            clientes.setId(Integer.parseInt(idReferences.getText()));
        }

        clientes.setNome(nome);
        clientes.setTelFixo(telfixo);
        clientes.setTelefone(telefone);
        clientes.setTipo(TipoCliente.PESSOAFISICA);
        clientes.setDia(dia);
        clientes.setMes(mes);
        clientes.setAno(ano);
        clientes.setDatacadastro(data);
        clientes.setSenha(daocliente.gerarSenha());

        enderecos.setBairro(bairro);
        enderecos.setCep(jtCep.getText().replaceAll(" ", ""));
        enderecos.setComplemento(complemento);
        enderecos.setCidade(cidade);

        if (idReferencesEnd.getText().equals("")) {
            enderecos.setId(null);
        } else {
            enderecos.setId(Integer.parseInt(idReferencesEnd.getText()));
        }

        enderecos.setNumero(Integer.parseInt(jtNumero.getText()));
        enderecos.setRua(rua);
        enderecos.setDatacadastro(data);

        if (validacao(jtNome.getText(), jtEmail.getText(), jtTelefone.getText(),
                jtCpfouCnj.getText(), jtBairro.getText(), jtComplemento.getText(),
                jtRua.getText(), jtCep.getText(), jtNumero.getText(),
                jtmes.getText(), jtmes.getText(), jtano.getText(),
                jtCidade.getText()) == false) {
            btSalvar.setEnabled(false);

        } else {
            btSalvar.setEnabled(true);
            if (clientes.getId() == null) {

                send.sendEmail(clientes);
                JOptionPane.showMessageDialog(null, "Email de confirmação para o TDC online enviado para: " + clientes.getEmail(),
                        "Sucesso", JOptionPane.WIDTH);
            }
            clientes = daocliente.saveCliente(clientes);

            JOptionPane.showMessageDialog(null, "Salvo com sucesso",
                    "Sucesso", JOptionPane.WIDTH);

        }
        enderecos.setCliente(clientes.getId());

        enderecos = daoendereco.saveEndereco(enderecos);

        if (clientes.getId() == null) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Funcionario",
                    "Erro", JOptionPane.ERROR_MESSAGE);

        } else {

            this.HabilitarCampos();
            this.limparCampos();
            this.CarregarTabela();

        }
        this.CarregarTabela();

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

    public boolean validacao(String nome, String Email,
            String Telefone, String Cpf, String Bairro, String Complemento,
            String Rua, String Cep, String numero, String dia, String mes,
            String ano, String cidade) {
        if (nome.equals("")
                || Email.equals("")
                || Telefone.equals("")
                || Cpf.equals("")
                || Bairro.equals("")
                || Complemento.equals("")
                || Rua.equals("")
                || Cep.equals("")
                || numero.equals("")
                || dia.equals("")
                || mes.equals("")
                || ano.equals("")
                || cidade.equals("")) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return false;

        } else {
            return true;
        }

    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("tdcicon.PNG")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel idReferences;
    private javax.swing.JLabel idReferencesEnd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcPessoaFisicaouJuridica;
    private javax.swing.JPanel jpainel;
    private javax.swing.JPanel jpainelcabeçalho;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JFormattedTextField jtCep;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtComplemento;
    private javax.swing.JTextField jtCpfouCnj;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtPesquisar;
    private javax.swing.JTextField jtRua;
    private javax.swing.JTable jtTabelaCliente;
    private javax.swing.JFormattedTextField jtTelefone;
    private javax.swing.JFormattedTextField jtano;
    private javax.swing.JFormattedTextField jtdia;
    private javax.swing.JFormattedTextField jtfoneFixo;
    private javax.swing.JFormattedTextField jtmes;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCadastroEndereço;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblCpfOuCnpj;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFunc;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblIdEnd;
    private javax.swing.JLabel lblLembrete1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblano;
    private javax.swing.JLabel lbldataNascimento;
    private javax.swing.JLabel lbldia;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblfoneFixo;
    private javax.swing.JLabel lblfuncionario;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblmes;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JLabel lblsetfuncao;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}
