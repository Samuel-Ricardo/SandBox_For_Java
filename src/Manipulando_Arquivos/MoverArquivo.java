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
public class MoverArquivo {
    
    public static void main(String[] args) {
        
        JFileChooser arquivoP = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Audios", "mp3");
        
        arquivoP.setDialogTitle("Arquivo");
        arquivoP.setFileFilter(filtro);
        
        int retorno = arquivoP.showOpenDialog(null);
        
        if(retorno == arquivoP.APPROVE_OPTION){
            
             File arquivo = arquivoP.getSelectedFile();
             
             System.out.println(arquivo.getPath());
             
             File destino = new File(System.getProperty("user.home")+"/desktop/Musicas_Mp3");
            
             boolean sucesso = arquivo.renameTo(new File (destino, arquivo.getName()));
             
             if (sucesso){
                 
                 System.out.println("Arquivo (" + arquivo.getAbsolutePath() + ") Movido para pasta (" + destino.getAbsolutePath() + ") Com sucesso");
                 
             }else{
                 
              System.out.println("Falha ao mover o arquivo " + arquivo.getAbsolutePath() + " para pasta" + destino.getAbsolutePath());
             
             }
        }
       
        
    }
    
}
