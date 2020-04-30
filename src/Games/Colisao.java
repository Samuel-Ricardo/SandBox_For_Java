/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Games;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Colisao extends JFrame {

    public JLabel jojo1 = new JLabel();
    public JLabel jojo2 = new JLabel();
    Andar and = new Andar();

    public Colisao() {

        try {
            iniciarJanela();
            
            //   LabelTempoMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Disco 1.png")));
            ImageIcon j1 = new ImageIcon(getClass().getResource("/images/jojo.jpg"));
            ImageIcon j2 = new ImageIcon(getClass().getResource("/images/2jojo.jpg"));
            
            jojo1.setBounds(1, 100, 150, 100);
            jojo2.setBounds(600, 100, 150, 100);
            
            j1.setImage(j1.getImage().getScaledInstance(jojo1.getWidth(), jojo1.getHeight(), 1));
            j2.setImage(j2.getImage().getScaledInstance(jojo2.getWidth(), jojo2.getHeight(), 1));
            
            
            jojo1.setIcon(j1);
            jojo2.setIcon(j2);
            
            add(jojo1);
            add(jojo2);
            
            jojo1.setBounds(1, 100, 150, 100);
            jojo2.setBounds(600, 100, 150, 100);
            
           
            
            
             System.out.println(jojo1.getX()+"   1/1  "+jojo1.getY());
            System.out.println(jojo2.getX()+"   2/2  "+jojo2.getY());
            
            Thread.sleep(1000);
            
            and.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(Colisao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void iniciarJanela() {

        setTitle("JOJO");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public boolean bateu(Component a, Component b) {

        int aX = a.getX();
        int aY = a.getY();
        int ladoDireitoA = aX + a.getWidth();
        int ladoEsquerdoA = aX;
        int ladoBaixoA = aY + a.getHeight();
        int ladoCimaA = aY;

        int bX = b.getX();
        int bY = b.getY();
        int ladoDireitoB = bX + b.getWidth();
        int ladoEsquerdoB = bX;
        int ladoBaixoB = bY + b.getHeight();
        int ladoCimaB = bY;

        boolean bateu = false;

        boolean cDireita = false;
        boolean cCima = false;
        boolean cBaixo = false;
        boolean cEsquerda = false;

        if (ladoDireitoA >= ladoEsquerdoB) {
            cDireita = true;
        }
        if (ladoCimaA <= ladoBaixoB) {
            cCima = true;
        }
        if (ladoBaixoA >= ladoCimaB) {
            cBaixo = true;
        }
        if (ladoEsquerdoA <= ladoDireitoB) {
            cEsquerda = true;
        }

        if (cDireita && cEsquerda && cBaixo && cCima) {
            bateu = true;
        }

        return bateu;
    }

    public class Andar extends Thread {

        public void run() {

            while (true) {

                try {

                    sleep(20);

                    jojo1.setBounds(jojo1.getX() + 3, jojo1.getY(), jojo1.getWidth(), jojo1.getHeight());
                    jojo2.setBounds(jojo2.getX() - 10, jojo2.getY(), jojo2.getWidth(), jojo2.getHeight());

                    System.out.println(jojo1.getX()+"   1/1  "+jojo1.getY());
                    System.out.println(jojo2.getX()+"   2/2  "+jojo2.getY());
                    
                    if (bateu(jojo1, jojo2)) {

                        JOptionPane.showMessageDialog(null, "Bateu");
                        
                        jojo1.setBounds(jojo1.getX(), jojo1.getY(), jojo1.getWidth(), jojo1.getHeight());
                        jojo2.setBounds(jojo2.getX(), jojo2.getY(), jojo2.getWidth(), jojo2.getHeight());

                        System.exit(0);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Colisao.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }

    public static void main(String[] args) {

        new Colisao();

    }
}
