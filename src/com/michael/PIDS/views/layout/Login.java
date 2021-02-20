package com.michael.PIDS.views.layout;

import com.michael.PIDS.DAO.FuncionarioDAO;
import com.michael.PIDS.DAO.LoginDAO;
import com.michael.PIDS.model.Funcionarios;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Funcionarios funcionario = new Funcionarios();
    FuncionarioDAO daofuncionario = new FuncionarioDAO();
    LoginDAO daologin = new LoginDAO();
    static String usuariologado;

    public Login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        jlWelcome = new javax.swing.JLabel();
        jtLogin = new javax.swing.JTextField();
        jtSenha = new javax.swing.JPasswordField();
        jbLogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("LOGIN:");
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, 30));

        lblSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("SENHA:");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 30));

        jlWelcome.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlWelcome.setText("Bem vindo! Ao Technical Delivery Control");
        getContentPane().add(jlWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 590, 40));
        getContentPane().add(jtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 30));
        getContentPane().add(jtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 190, 30));

        jbLogar.setBackground(new java.awt.Color(255, 255, 255));
        jbLogar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jbLogar.setText("LOGAR");
        jbLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLogarActionPerformed(evt);
            }
        });
        getContentPane().add(jbLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 273, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/icons/TDC2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 100, -1));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/michael/PIDS/views/images/fundo.jpg"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLogarActionPerformed

        try {
            String login = jtLogin.getText();
            String senha = jtSenha.getText();
            daologin.CriptografarSenha(senha);

            funcionario.setLoginName(login);
            funcionario.setSenha(senha);
            funcionario = daologin.login(login, senha);
            if (funcionario.getId() == null) {
                if (login.equals("")) {
                    JOptionPane.showMessageDialog(null, "Campo login em branco",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
                if (senha.equals("")) {
                    JOptionPane.showMessageDialog(null, "Campo senha em branco",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, ""
                            + "Login ou senha Invalidos",
                            "Usuario desconhecido", JOptionPane.ERROR_MESSAGE);

                }

            } else {
                if (funcionario.getAtivoInativo() == 2) {
                    JOptionPane.showMessageDialog(null, "Funcionario inativo!",
                            "Erro", JOptionPane.ERROR_MESSAGE);

                } else {
                    usuariologado = jtLogin.getText();
                    System.out.println(usuariologado);
                    Home home = new Home();
                    home.setResizable(false);
                    home.setLocationRelativeTo(null);
                    home.setSize(1220, 725);
                    home.setVisible(true);
                    this.setVisible(false);
                }

            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbLogarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbLogar;
    private javax.swing.JLabel jlWelcome;
    private javax.swing.JTextField jtLogin;
    private javax.swing.JPasswordField jtSenha;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    // End of variables declaration//GEN-END:variables
}
