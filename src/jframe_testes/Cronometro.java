/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe_testes;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Samuel
 */
public class Cronometro extends JFrame {

    Font fonte = new Font("Arial", Font.BOLD, 100);

    JLabel numero = new JLabel("0");
    JMenuBar barra = new JMenuBar();
    JMenu menu = new JMenu("Sair");
    JMenuItem item = new JMenuItem("Exit");
    
        public Cronometro() {

        numero.setFont(fonte);
        numero.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        add(numero);
        
            setJMenuBar(barra);
            barra.add(menu);
            menu.add(item);
            item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.exit(0);
                
            }
            });
        
        
        

        setTitle("Cronometro");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        
        int n = 0;

        while (true) {

            numero.setText(n + "");

            n++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
        }
    
    
    /* public void cronometrar(){
        int n = 0;

        while (true) {

            numero.setText(n + "");

            n++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }*/


   

    public static void main(String args[]) {

        new Cronometro();
   
        
        
    }

}
