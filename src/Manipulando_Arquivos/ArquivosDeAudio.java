/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manipulando_Arquivos;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class ArquivosDeAudio extends JFrame{
    
    JButton botao = new JButton(" APERTE SE FOR JOJOFAG O SUFICENTE -,- ");
    
    public ArquivosDeAudio(){
        
        construirJanela();
       
        
    }
    
    private void construirJanela() {
     
        add(botao);
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                 playS("onda");
                
            }
        });
        
        setTitle("CLIQUE");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    
    }

    public void playS(String nomeArquivo) {
     
        try{
        URL url = getClass().getResource(nomeArquivo+".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
        }catch(Exception e){ JOptionPane.showMessageDialog(null, e); }
        
           System.out.println("PAo");
           
    }
    
    

            
            
    public static void main(String args[]){
        
        new ArquivosDeAudio();
       
    }
    
}