/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manipulando_Arquivos;

import java.io.File;

/**
 *
 * @author Samuel
 */
public class CriarDiretorio {
    
    
    
    public static void main(String[] args) {
        
        File diretorio = new File(System.getProperty("user.home")+"/Desktop/Pao2");
        diretorio.mkdir();
    }
    
    
}
