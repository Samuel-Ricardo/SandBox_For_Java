/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe_testes;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Simultaneo extends JFrame{
    
    int segundos = 0;
    JLabel tempo = new JLabel(segundos+" Segundos");
    Font fonte = new Font("Arisl", Font.BOLD, 18);
    
    public Simultaneo(){
        
        janela();
       
        Cronometro cronometro = new Cronometro();
        
        cronometro.start();
        dialogo();
        cronometro.stop();
        
    }
    
    

    public void janela() {
        
        setTitle("Sua Idade");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    
    }

    public void dialogo() {
        tempo.setFont(fonte);
        tempo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
       add(BorderLayout.NORTH,tempo);
       
        String nasc = JOptionPane.showInputDialog(null, "Qual seu ano de nascimento?");
        String hj = JOptionPane.showInputDialog(null, "Qual ano atul?");
        int nascimento = Integer.parseInt(nasc);
        int hoje = Integer.parseInt(hj);
        String resp =  hoje - nascimento+"";
        
        JOptionPane.showMessageDialog(null, "Sua idade é: "+resp);
        JOptionPane.showMessageDialog(null, "O tempo gasto foi de :"+segundos+" segundos");
    
    }
    
    public class Cronometro extends Thread{
        
        public void run(){
            
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Simultaneo.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                segundos ++;
                tempo.setText(segundos+" Segundos");
            }
            
          
        }
    }
    
    public static void main(String args[]){
        
       new Simultaneo();
        
    }
    
}
