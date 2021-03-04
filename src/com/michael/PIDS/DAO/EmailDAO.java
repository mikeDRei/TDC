package com.michael.PIDS.DAO;

import com.michael.PIDS.model.Clientes;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class EmailDAO {

    public static Properties loadPropertiesFile() throws Exception {
        Properties prop = new Properties();
        File f = new File("email.properties");
        InputStream in = new FileInputStream(f.getAbsolutePath());
        prop.load(in);
        in.close();
        return prop;
    }

    public void sendEmail(Clientes cliente) throws Exception {
        Properties prop = loadPropertiesFile();
        System.out.println(prop.getProperty("EMAIL.login"));
        String email = prop.getProperty("EMAIL.login");
        String password = prop.getProperty("EMAIL.password");
        String containerEmail = "Ola " + cliente.getNome() + "! seu cadastro foi finalizado. \n ";
        containerEmail += "Para acessar o TDC online acesse o link: http://growthcode.online/justi/public/ \n";
        containerEmail += "Utilize a senha: "+cliente.getSenha()+" para o primeiro acesso";
        SimpleEmail simpleEmail = new SimpleEmail();
        simpleEmail.setHostName("smtp.gmail.com");
        simpleEmail.setSmtpPort(465);
        simpleEmail.setAuthenticator(new DefaultAuthenticator(email, password));
        simpleEmail.setSSLOnConnect(true);

        try {
            simpleEmail.setFrom(cliente.getEmail());
            simpleEmail.setSubject("Cadastro Efetuado com sucesso!");
            simpleEmail.setMsg(containerEmail);

            simpleEmail.addTo(cliente.getEmail());
            simpleEmail.send();
            System.out.println("Email enviado com sucesso!");
        } catch (Exception e) {
            System.out.println("Email não enviado erro: " + e);
        }
    }
}
