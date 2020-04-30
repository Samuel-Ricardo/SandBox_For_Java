/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe_testes;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Samuel
 */

public class Janela extends JFrame implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "vc é JOJOFAG");
    }

    
    JButton jb = new JButton("clique seu jojofag -,-");
    JLabel leg = new JLabel("APERTE QUALQUER TECLA SEU FAGJOJO");
    JTextField tec = new JTextField();
    
    public Janela(){
        
        jb.addActionListener(this);
        
        Font fonte = new Font("Arial", Font.BOLD | Font.ITALIC, 24);
        
    
        
     leg.setFont(fonte);
     add(leg);
     leg.setVisible(true);
     
        addKeyListener( new KeyAdapter() {
        
            public void keyPressed(KeyEvent e){
                
                char teclado = e.getKeyChar();
                String tecla =  ""+teclado;
                tec.setText(tecla);
                tec.setBounds(400, 300, 20, 20);
                add(tec);
                tec.setVisible(true);
                
                JLabel teclou = new JLabel("EU SEI OQ VC DIGITOU");
                add(teclou);
                teclou.setVisible(true);
            }
        
        });
     
      setLayout(null);   
     jb.setBounds(250, 250, 340, 60);
     jb.setFont(fonte);
     add(jb);
     
    setTitle("Janela JOJOFAG");
    setSize(800,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible (true);
    
    }
    
    public static void main (String[] args){
    
    new Janela();
    JOptionPane.showMessageDialog(null, "Helo Word");
    }

        
}
