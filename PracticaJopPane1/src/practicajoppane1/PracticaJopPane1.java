/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicajoppane1;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Talavera
 */
public class PracticaJopPane1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, suma, resta, mult, division, residuo;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Dime un numero"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Dime otro numero"));

        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        division = num1 / num2;
        residuo = num1 % num2;

        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        JOptionPane.showMessageDialog(null, "La resta es: " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + mult);
        JOptionPane.showMessageDialog(null, "La division es: " + division);
        JOptionPane.showMessageDialog(null, "El residuo es: " + residuo);
    }

}
