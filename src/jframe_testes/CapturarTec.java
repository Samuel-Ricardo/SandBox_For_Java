/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe_testes;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author Samuel
 */
public class CapturarTec extends JFrame{
    
     public CapturarTec (){
    
         addKeyListener(new KeyAdapter() {
         
             public void keyPressed(KeyEvent e){
                 
                 int codigo = e.getKeyCode();
                 int tecla = KeyEvent.VK_ENTER;
                 
                 if (codigo == tecla){
                     System.out.println("Enter apertado");
                 }
                 
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
        new CapturarTec();
        
    }   
    
    
}
