/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manipulando_Arquivos;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Samuel
 */
public class FileChosserTest {
    
    //https://youtu.be/wxVc3-yYQ1Y
    
    public static void main(String[] args) {
        
        JFileChooser escolher = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("audios", "mp3");
        
        escolher.setDialogTitle("Pesquise");
        escolher.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        escolher.setFileFilter(filtro);
        
        int retorno = escolher.showOpenDialog(null);
        
        if (retorno == escolher.APPROVE_OPTION){
            
            File file = escolher.getSelectedFile();
            
            System.out.println(file.getPath());
            
        }
        
        
    }
    
}
