/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe_testes;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Samuel
 */
public class Desenhar extends JFrame {

    int x;
    int y;

    int x2;
    int y2;
    //  ArrayList<Desenho> desenhos = new ArrayList<>();
    boolean presionado = false;

    public Desenhar() {

        iniciarJanela();
        
        new MouseLocation().start();
        new Repintar().start();
    }

    private void iniciarJanela() {

        setTitle("Paint Java");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    /*    public class Desenho {
    
    int x;
    int y;
    
    public Desenho(int x, int y) {
    this.x = x;
    this.y = y;
    }
    
    }*/
    public void paint(Graphics g) {
        // int cont = 0;

       // g.drawLine(1, 1, 1, 1);

        
        g.drawLine(x, y, x2, y2);
       
        // g.drawLine(10, 100, 100, 200);

        /* g.draw3DRect(100, 200, 80, 80, true);
        g.fill3DRect(100, 200, 80, 80, true);*/

 /*  for (Desenho des : desenhos) {
       
       System.out.println(cont);
       
       int x = desenhos.get(cont).x;
       int y = desenhos.get(cont).y;
       g.drawLine(x, y, x, y);
       
       
       
       cont++;
       }*/
    }

    public class MouseLocation extends Thread {

        public void run() {

            /*   try {
            sleep(10);
            } catch (InterruptedException ex) {
            Logger.getLogger(Paint.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            while (true) {
                Point mousePoint = getMousePosition();
             //   if (presionado = false) {

                    x = mousePoint.x;
                    y = mousePoint.y;

                    
                   

                    /*
                    Desenho des = new Desenho(mousePoint.x, mousePoint.y);
                    desenhos.add(des);
                     */
             //   }
                repaint();
           }

        }
    }

    public class Repintar extends Thread {

        public void run() {

           while (true) {
               try {
                   sleep(10);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Desenhar.class.getName()).log(Level.SEVERE, null, ex);
               }
                Point mousePoint = getMousePosition();

               
                
                 x2 = mousePoint.x;
                 y2 = mousePoint.y;

            }
        }
    }

    public static void main(String[] args) {

        new Desenhar();
    }

}
