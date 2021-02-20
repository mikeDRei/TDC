package com.michael.PIDS.views.layout;

import com.michael.PIDS.DAO.FuncionarioDAO;
import com.michael.PIDS.model.Funcionarios;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    Funcionarios funcionario = new Funcionarios();
    FuncionarioDAO daofuncionario = new FuncionarioDAO();
    Login login = new Login();

    public Home() {
        initComponents();
        funcionario = usuariologado(login.usuariologado);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCliente = new javax.swing.JMenu();
        jMenuItemCadastroCliente = new javax.swing.JMenuItem();
        jMenuItemListaClientes = new javax.swing.JMenuItem();
        jMenuMaquinas = new javax.swing.JMenu();
        jMenuItemCadastroMaquinas = new javax.swing.JMenuItem();
        jMenuItemListarMaquinas = new javax.swing.JMenuItem();
        jMenuGarantias = new javax.swing.JMenu();
        jMenuItemListarGarantias = new javax.swing.JMenuItem();
        jMenuFuncionarios = new javax.swing.JMenu();
        jMenuItemCadastroFuncionarios = new javax.swing.JMenuItem();
        jMenuItemListarFuncionarios = new javax.swing.JMenuItem();
        jMenuManuais = new javax.swing.JMenu();
        jmenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/home.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(255, 102, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuCliente.setBackground(new java.awt.Color(204, 102, 0));
        jMenuCliente.setText("Clientes");

        jMenuItemCadastroCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/perfil.png"))); // NOI18N
        jMenuItemCadastroCliente.setText("Cadastrar clientes");
        jMenuItemCadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemCadastroClienteMouseClicked(evt);
            }
        });
        jMenuItemCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemCadastroCliente);

        jMenuItemListaClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItemListaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lista.png"))); // NOI18N
        jMenuItemListaClientes.setText("Listar clientes");
        jMenuItemListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaClientesActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemListaClientes);

        jMenuBar1.add(jMenuCliente);

        jMenuMaquinas.setText("Maquinas");

        jMenuItemCadastroMaquinas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItemCadastroMaquinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/maquina.png"))); // NOI18N
        jMenuItemCadastroMaquinas.setText("Cadastrar maquina");
        jMenuItemCadastroMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroMaquinasActionPerformed(evt);
            }
        });
        jMenuMaquinas.add(jMenuItemCadastroMaquinas);

        jMenuItemListarMaquinas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItemListarMaquinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lista.png"))); // NOI18N
        jMenuItemListarMaquinas.setText("Listar maquinas");
        jMenuItemListarMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarMaquinasActionPerformed(evt);
            }
        });
        jMenuMaquinas.add(jMenuItemListarMaquinas);

        jMenuBar1.add(jMenuMaquinas);

        jMenuGarantias.setText("Garantias");

        jMenuItemListarGarantias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItemListarGarantias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lista.png"))); // NOI18N
        jMenuItemListarGarantias.setText("Listar garantias");
        jMenuItemListarGarantias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarGarantiasActionPerformed(evt);
            }
        });
        jMenuGarantias.add(jMenuItemListarGarantias);

        jMenuBar1.add(jMenuGarantias);

        jMenuFuncionarios.setText("Funcionarios");

        jMenuItemCadastroFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItemCadastroFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/func.png"))); // NOI18N
        jMenuItemCadastroFuncionarios.setText("Cadastrar funcionarios");
        jMenuItemCadastroFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFuncionariosActionPerformed(evt);
            }
        });
        jMenuFuncionarios.add(jMenuItemCadastroFuncionarios);

        jMenuItemListarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jMenuItemListarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/lista.png"))); // NOI18N
        jMenuItemListarFuncionarios.setText("Listar funcionarios");
        jMenuItemListarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarFuncionariosActionPerformed(evt);
            }
        });
        jMenuFuncionarios.add(jMenuItemListarFuncionarios);

        jMenuBar1.add(jMenuFuncionarios);

        jMenuManuais.setText("Manuais");
        jMenuManuais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuManuaisMouseClicked(evt);
            }
        });
        jMenuManuais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuManuaisActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuManuais);

        jmenuSair.setText("Sair");
        jmenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmenuSair);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroMaquinasActionPerformed
        // TODO add your handling code here:
        CadastroMaquina cadastromaq = new CadastroMaquina();
        cadastromaq.setResizable(false);
        cadastromaq.setSize(1000, 700);
        cadastromaq.setLocationRelativeTo(null);
        cadastromaq.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroMaquinasActionPerformed

    private void jMenuItemCadastroFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFuncionariosActionPerformed
        // TODO add your handling code here:
        if (funcionario.getAtivoInativo() == 2 || funcionario.getPermissao() == 2) {
            JOptionPane.showMessageDialog(null, "Sem permissão para acessar essa area");

        } else {
            CadastroFuncionario cadastrofunc = new CadastroFuncionario();
            cadastrofunc.setResizable(false);
            cadastrofunc.setSize(1000, 700);
            cadastrofunc.setLocationRelativeTo(null);
            cadastrofunc.setVisible(true);
        }

    }//GEN-LAST:event_jMenuItemCadastroFuncionariosActionPerformed

    private void jMenuItemListarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarFuncionariosActionPerformed
        // TODO add your handling code here:
        if (funcionario.getAtivoInativo() == 2 || funcionario.getPermissao() == 2) {
            JOptionPane.showMessageDialog(null, "Sem permissão para acessar essa area");

        } else {
            PesquisarFuncionario pesquifunc = new PesquisarFuncionario();
            pesquifunc.setResizable(false);
            pesquifunc.setSize(1000, 700);
            pesquifunc.setLocationRelativeTo(null);
            pesquifunc.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemListarFuncionariosActionPerformed

    private void jmenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmenuSairMouseClicked

        this.setVisible(false);
        Login login = new Login();
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.setVisible(true);

    }//GEN-LAST:event_jmenuSairMouseClicked

    private void jMenuItemCadastroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClienteMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItemCadastroClienteMouseClicked

    private void jMenuItemCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClienteActionPerformed

        CadastroCliente cadastrocliente = new CadastroCliente();
        cadastrocliente.setResizable(false);
        cadastrocliente.setSize(2000, 700);
        cadastrocliente.setLocationRelativeTo(null);
        cadastrocliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroClienteActionPerformed

    private void jMenuItemListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaClientesActionPerformed
        // TODO add your handling code here:
        PesquisarCliente pesquicli = new PesquisarCliente();
        pesquicli.setResizable(false);
        pesquicli.setSize(1000, 700);
        pesquicli.setLocationRelativeTo(null);
        pesquicli.setVisible(true);
    }//GEN-LAST:event_jMenuItemListaClientesActionPerformed

    private void jMenuItemListarMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarMaquinasActionPerformed
        // TODO add your handling code here:
        PesquisarMaquina pesquiMaq = new PesquisarMaquina();
        pesquiMaq.setResizable(false);
        pesquiMaq.setSize(1000, 700);
        pesquiMaq.setLocationRelativeTo(null);
        pesquiMaq.setVisible(true);
    }//GEN-LAST:event_jMenuItemListarMaquinasActionPerformed

    private void jMenuItemListarGarantiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarGarantiasActionPerformed
        // TODO add your handling code here:
        PesquisarGarantias pesquiGarantias = new PesquisarGarantias();
        pesquiGarantias.setResizable(false);
        pesquiGarantias.setSize(1000, 700);
        pesquiGarantias.setLocationRelativeTo(null);
        pesquiGarantias.setVisible(true);
    }//GEN-LAST:event_jMenuItemListarGarantiasActionPerformed

    private void jMenuManuaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuManuaisActionPerformed
        // TODO add your handling code here:

      
    }//GEN-LAST:event_jMenuManuaisActionPerformed

    private void jMenuManuaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuManuaisMouseClicked
        // TODO add your handling code here:
          File pdf = new File("manual.pdf");
        try {
            Desktop.getDesktop().open(pdf);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no Desktop: " + ex);
        }
    }//GEN-LAST:event_jMenuManuaisMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    public Funcionarios usuariologado(String usuariologado) {
        funcionario = daofuncionario.findLogin(usuariologado);

        return funcionario;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenu jMenuFuncionarios;
    private javax.swing.JMenu jMenuGarantias;
    private javax.swing.JMenuItem jMenuItemCadastroCliente;
    private javax.swing.JMenuItem jMenuItemCadastroFuncionarios;
    private javax.swing.JMenuItem jMenuItemCadastroMaquinas;
    private javax.swing.JMenuItem jMenuItemListaClientes;
    private javax.swing.JMenuItem jMenuItemListarFuncionarios;
    private javax.swing.JMenuItem jMenuItemListarGarantias;
    private javax.swing.JMenuItem jMenuItemListarMaquinas;
    private javax.swing.JMenu jMenuManuais;
    private javax.swing.JMenu jMenuMaquinas;
    private javax.swing.JMenu jmenuSair;
    // End of variables declaration//GEN-END:variables
}
