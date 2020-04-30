/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manipulando_Arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Samuel
 */
public class ArquivosDeTexto {
    
    public static void main(String args[]){
    //.txt
    
    // ler arquivo .txt
    
        Path caminho = Paths.get("D:/Pao.txt");
        
        try {
            
            byte [] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            
            JOptionPane.showMessageDialog(null, leitura);
            
        } catch (IOException ex) {
            Logger.getLogger(ArquivosDeTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //modificar:
        
        String escrito = JOptionPane.showInputDialog(null, "O que deseja escrever no bloco de notas?");
        byte [] escritoByte = escrito.getBytes();
        
        try {
            
            Files.write(caminho, escritoByte);
            
       
        } catch (IOException ex) {
            Logger.getLogger(ArquivosDeTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        try {
            
            byte [] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            
            JOptionPane.showMessageDialog(null, leitura);
            
        } catch (IOException ex) {
            Logger.getLogger(ArquivosDeTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         //audio
        
         //audio
         
         
    }
}
