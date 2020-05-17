/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interweb;

import java.io.File;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Samuel
 */
public class EmailComAnexo {

    public static void main(String[] args) {

      
            Properties props = new Properties();
            
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            
            Authenticator authent;
            
            authent = new Authenticator() {
                
                protected PasswordAuthentication getPasswordAuthentication(){
                    
                    return new PasswordAuthentication("samueldebarro@gmail.com", "juanrafael");
                }
                
            };
            
            
            Session session = Session.getDefaultInstance(props,authent);
            
             session.setDebug(true);
            
       try {
                  
            Message message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress("samueldebarro@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("samuelricardooficial@gmail.com"));
            message.setSubject("Para min");
           
            MimeBodyPart mBP = new MimeBodyPart();
            
            mBP.setText("Conteudo  do texto vai aki");
            
            Multipart multi = new javax.mail.internet.MimeMultipart();
            
            multi.addBodyPart(mBP);
            
            mBP = new MimeBodyPart();
            
            DataSource source = new FileDataSource(new File(System.getProperty("user.home") + "/desktop/imagemMusica.png"));
                        
            mBP.setDataHandler(new DataHandler(source));
            mBP.setFileName("Mangericao.png");
            
            multi.addBodyPart(mBP);
            
            message.setContent(multi);
            
            Transport.send(message);
            
        } catch (AddressException ex) {
            Logger.getLogger(EmailComAnexo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(EmailComAnexo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
