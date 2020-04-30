/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manipulando_Arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Samuel
 */
public class Audio_2 {

    public class Pao extends Thread {

        @Override
        public void run() {
            try {

                InputStream input = new FileInputStream("E:/Audios/q onda é essa meu irmao.mp3");

                System.out.println(input);

                Player play = new Player(input);
                play.play();

            } catch (JavaLayerException ex) {
                JOptionPane.showMessageDialog(null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Audio_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public Audio_2() {
        Pao p = new Pao();
        p.start();
    }

    public static void main(String[] args) {
        //q onda é essa meu irmao

        System.out.println(System.getProperty("user.home")+"\\Área de Trabalho");
        
        new Audio_2();

        
        
    }
}
