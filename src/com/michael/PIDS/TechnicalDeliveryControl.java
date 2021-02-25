package com.michael.PIDS;

import com.michael.PIDS.DAO.ClienteDAO;
import com.michael.PIDS.DAO.EmailDAO;
import com.michael.PIDS.model.Clientes;
import com.michael.PIDS.model.Garantias;
import com.michael.PIDS.views.layout.Login;
import java.text.ParseException;

import java.util.ArrayList;

import java.util.List;

public class TechnicalDeliveryControl {
    
    public static void main(String[] args) throws ParseException, Exception {

        Login login = new Login();
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
//        List<Garantias> garantias = new ArrayList<>();

//        EmailDAO send = new EmailDAO();
//        Clientes cliente = new Clientes();
//        ClienteDAO daoCli = new ClienteDAO();
//        cliente = daoCli.consultarClientePorId(96);
//        send.sendEmail(cliente);
//        
    }
}
