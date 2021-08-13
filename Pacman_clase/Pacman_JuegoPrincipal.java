/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman_clase;
import Pacman_clase.Clase_pacman;
import java.awt.EventQueue;
import javax.swing.JFrame;
/**
 *
 * @author mike
 */
public class Pacman_JuegoPrincipal extends JFrame {

    public Pacman_JuegoPrincipal() {
        
        initUI();
    } 
public void initUI() {
        
        add(new Clase_pacman());
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
        setVisible(true);        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman_JuegoPrincipal ex = new Pacman_JuegoPrincipal();
                ex.setVisible(true);
   }
        });
    }
}