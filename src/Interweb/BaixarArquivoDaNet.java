/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interweb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class BaixarArquivoDaNet {

    public static void main(String[] args) {

        final String httpFile = "https://pm1.narvii.com/6849/55c2110300696a658c350c053f1dbb97d0db0404v2_00.jpg";
        final String localFile = System.getProperty("user.home") + "/desktop/imagemMusica.png";

        /*
            
            1:
            
            try {
            
            URL url = new URL(httpFile);
            File local = new File(System.getProperty("user.home")+"/desktop/imagemMusica.png");
            
            ReadableByteChannel leitorBytes = Channels.newChannel(url.openStream());
            FileOutputStream arquivoBaixado = new FileOutputStream(localFile);
            arquivoBaixado.getChannel().transferFrom(leitorBytes, 0,Long.MAX_VALUE);
            
            arquivoBaixado.close();
            leitorBytes.close();
            
            
            
            /*   ReadableByteChannel rbc = Channels.newChannel(url.openStream());
            FileOutputStream fos = new FileOutputStream(localFile);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            fos.close();
            rbc.close();//
            
            System.out.println("baixado");
            
            } catch (MalformedURLException ex) {
            Logger.getLogger(BaixarArquivoDaNet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(BaixarArquivoDaNet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         */
        
        try {

            URL url = new URL(httpFile);
            File local = new File(System.getProperty("user.home") + "/desktop/imagemMusica2.htm");

            InputStream is = url.openStream();
            FileOutputStream fos = new FileOutputStream(local);
            
            int bytes = 0;
            int tamanho;
 
            while((bytes = is.read()) != -1){
                
                fos.write(bytes);
                tamanho = is.available();
                System.out.println((local.length()/1024)+"/"+(tamanho/1024)+ " Bytes");
                
                
            
            }
            
            fos.close();
            is.close();
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(BaixarArquivoDaNet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BaixarArquivoDaNet.class.getName()).log(Level.SEVERE, null, ex);
        }
       

    }

}
