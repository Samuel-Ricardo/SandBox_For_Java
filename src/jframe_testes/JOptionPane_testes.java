/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe_testes;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class JOptionPane_testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      
        JOptionPane.showMessageDialog(null,"olá mundo");
      
        String jojo = JOptionPane.showInputDialog("jojofag?", "sim");
      
        System.out.println(jojo);
        
        int resp = JOptionPane.showConfirmDialog(null, "Voce é JoJoFag?");
        System.out.println(resp);
        
      
       
    }
    
}
