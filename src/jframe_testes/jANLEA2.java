/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe_testes;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Samuel
 */
public class jANLEA2 extends JFrame{
 
  public jANLEA2 (){
    
      addKeyListener(new KeyAdapter() {
      
          public void keyPressed(KeyEvent e){//captura algum evento do teclado
              
                JTextField tec = new JTextField();
                char teclado = e.getKeyChar();
                String tecla =  ""+teclado;
                tec.setText(tecla);
                tec.setBounds(400, 300, 20, 20);
                add(tec);
                tec.setVisible(true);
                
                System.out.println(teclado +"  "+tecla);
                
                JLabel teclou = new JLabel("EU SEI OQ VC DIGITOU");
                add(teclou);
                teclou.setVisible(true);
            }
      
      });
      
      
      setTitle("DIGITAAAAAAAAAAA");
      setSize(300,200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setResizable(false);
      setVisible(true);
}
    
    
    public static void  main(String args[]){
        new jANLEA2();
        
    }   
}
