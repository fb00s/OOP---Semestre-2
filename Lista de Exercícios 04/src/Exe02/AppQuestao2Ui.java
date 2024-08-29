/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe02;

/**
 *
 * @author felboos
 */

import javax.swing.JOptionPane;

public class AppQuestao2Ui {
    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo();
        
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do retangulo"));
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retangulo"));
        
        

        try {
            ret.setAltura(altura);
            ret.setComprimento(comprimento);
            JOptionPane.showMessageDialog(null, "Area do retangulo: " + ret.calcularArea());
            JOptionPane.showMessageDialog(null, "Comprimento do retangulo: " + ret.calcularPerimetro());
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
 
    }
   
}
