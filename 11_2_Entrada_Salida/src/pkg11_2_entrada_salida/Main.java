/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_2_entrada_salida;

import javax.swing.JOptionPane;
/**
 *
 * @author ingya
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String firstnumber = JOptionPane.showInputDialog("Introduzca el primer numero");
        String secondnumber = JOptionPane.showInputDialog("Introduzca el segundo numero");
        
        int num1 = Integer.parseInt( firstnumber );
        int num2 = Integer.parseInt( secondnumber);
        
        int suma = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "El resultado es " + suma, "Suma de dos numeros enteros", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
