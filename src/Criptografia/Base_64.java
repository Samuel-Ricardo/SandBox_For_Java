/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Criptografia;

import java.util.Base64;

/**
 *
 * @author Samuel
 */
public class Base_64 {
    
    public static void main(String[] args) {
        
        String texto = "Pao de queijo";
        
        System.out.println("Texto normal: "+texto);
        
        System.out.println("");
        
        String codificado = Base64.getEncoder().encodeToString(texto.getBytes());
        
        System.out.println("Texto Codificado: "+codificado);
        
        System.out.println("");
        
        byte[] decodificadoB = Base64.getDecoder().decode(codificado);
        
        System.out.println("Texto Array de Bytes: "+decodificadoB);
        
        System.out.println("");
        
        String decodificadoS = new String(decodificadoB);
        
        System.out.println("Texto Decodificado: "+decodificadoS);
        
        System.out.println("");
        
    }
    
}
