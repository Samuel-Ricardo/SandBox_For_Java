/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class Date_Teste {
    
    public static void main(String[] args) throws ParseException {
        
        
        
        SimpleDateFormat tempoFormatado = new SimpleDateFormat("mm:ss");
        
        String tA= "01:30";
        
        Date tempo = null;
        
       
            tempo = tempoFormatado.parse(tA);
       
        
        System.out.println(tempoFormatado.format(tempo));
        
    }
    
}
