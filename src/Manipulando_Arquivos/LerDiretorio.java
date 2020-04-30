/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manipulando_Arquivos;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Samuel
 */
public class LerDiretorio {
    
    public static void main(String[] args) {
         //File diretorio = new File(System.getProperty("user.home")+"\\Desktop\\Pao");
      
         File file = new File(System.getProperty("user.home")+"/desktop/Pao/");
         File[] arquivos = file.listFiles();
         
                    
          int cont = 0;
         for(File arq: arquivos){
             System.out.println(arquivos[cont].getName());
             cont++;
         }
         
    }   
    
    

}