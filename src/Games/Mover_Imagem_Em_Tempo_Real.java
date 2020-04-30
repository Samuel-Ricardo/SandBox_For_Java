/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Games;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Samuel
 */
public class Mover_Imagem_Em_Tempo_Real extends JFrame {

    public JLabel jojo = new JLabel();
    boolean mousePressionado = false;

    public Mover_Imagem_Em_Tempo_Real() {
        new Mover().start();
        iniciarJanela();
        //"Source Packages/images/"

        ImageIcon jojo1 = new ImageIcon(getClass().getResource("jojo.jpg"));
        ImageIcon jojo2 = new ImageIcon(getClass().getResource("2jojo.jpg"));

        int x = (int) (Math.random() * 500);
        int y = (int) (Math.random() * 400);

        jojo.setBounds(x, y, 250, 150);
        System.out.println(x + "  " + y);

        jojo1.setImage(jojo1.getImage().getScaledInstance(jojo.getWidth(), jojo.getHeight(), 1));
        jojo2.setImage(jojo2.getImage().getScaledInstance(jojo.getWidth(), jojo.getHeight(), 1));

        jojo.setBounds(x, y, 250, 150);
        jojo.setVisible(true);
        add(jojo);
        jojo.setIcon(jojo1);

        jojo.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

                mousePressionado = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                mousePressionado = false;
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                // int selected = Integer.parseInt(getKeyListeners().toString());
                System.out.println(e.getKeyCode());
                System.out.println(KeyEvent.VK_UP);

                if (e.getKeyCode() == KeyEvent.VK_UP) {

                    jojo.setIcon(jojo2);

                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

                jojo.setIcon(jojo1);

            }
        });
    }

    public class Mover extends Thread {

        public void run() {

            while (true) {
                try {
                    sleep(10);
                } catch (InterruptedException ex) {
                }

                if (mousePressionado) {
                    Point jojoLocal = getMousePosition();

                    jojo.setBounds(jojoLocal.x - 125, jojoLocal.y - 75, 250, 150);
                }
            }
        }

    }

    private void iniciarJanela() {

        setTitle("JOJO");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {

        new Mover_Imagem_Em_Tempo_Real();

    }

}
