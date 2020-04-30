/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import java.util.InputMismatchException;
import java.util.Scanner;




/**
 *
 * @author Samuel
 */
public class TryCatch_Teste {
    
    public static void main (String[] args){
    
     Scanner tec = new Scanner (System.in);
      
     try{
         
     int n = tec.nextInt();
     System.out.println(30/n);
     
     }catch(InputMismatchException err) {
         System.out.println(err+" (aceita apenas valores inteiros)");
     }catch(ArithmeticException er){
         System.out.println(er+" (nao divisivel por 0)");
     }
     
      
      
    }
}
