/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataehoraatual;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author gustavobergamo
 */
public class DataeHoraAtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
        System.out.println("O idioma do sistema é ");
        System.out.println(Locale.getDefault());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        System.out.println("A resolução da tela é " + width + height);
    }
    
}
