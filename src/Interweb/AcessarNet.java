/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interweb;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class AcessarNet {

    public static void main(String args[]) {

        int escolhido = 2;

        switch (escolhido) {

            case 1:

                System.out.println("1 foi escolhido");

                break;

            case 2:

                System.out.println("2 foi escolhido");

                break;
        }

        Random r = new Random();

        System.out.println(r.nextInt(3));

        try {

            String busca = JOptionPane.showInputDialog("Oque buscas?");
            busca = busca.replaceAll(" ", "+");

            //https://www.flvto.biz/pt62/
            URI link = new URI("https://www.youtube.com/results?search_query=" + busca);
            Desktop.getDesktop().browse(link);

        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(AcessarNet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
