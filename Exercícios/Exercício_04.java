/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author Arthur
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Data e Hora atual
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
        //Idioma do SO
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma atual do sistema é ");
        System.out.println(idioma.getDisplayLanguage().toUpperCase()+"/"+idioma.getDisplayCountry().toUpperCase());                
        //Resolução da tela
        Toolkit resol = Toolkit.getDefaultToolkit();
        int largura = resol.getScreenSize().width;
        int altura = resol.getScreenSize().height;
        System.out.println("A resolução da tela é " + largura+" x "+altura);
    }
    
}
