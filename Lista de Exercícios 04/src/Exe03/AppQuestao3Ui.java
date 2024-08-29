/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe03;

/**
 *
 * @author felboos
 */

import javax.swing.JOptionPane;

public class AppQuestao3Ui {
    public static void main(String[] args) {
        
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do retangulo"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o altura do retangulo"));
        
        Retangulo ret = new Retangulo(comprimento, altura);
        
        JOptionPane.showMessageDialog(null, "Area do retangulo: " + ret.calcularArea());
        JOptionPane.showMessageDialog(null, "Comprimento do retangulo: " + ret.calcularPerimetro());
        
    }
}
