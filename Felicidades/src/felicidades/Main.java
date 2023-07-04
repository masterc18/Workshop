/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package felicidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Talavera
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String felicitaciones;
        
        felicitaciones= JOptionPane.showInputDialog("Que quieres decir?");
        JOptionPane.showMessageDialog(null, "Querido profesor: "+felicitaciones);
    }
    
}
