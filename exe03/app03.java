/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe03;

/**
 *
 * @author felboos
 */

import java.util.Scanner;

public class app03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        
        for (int i = 1; i <= 3; i++){
            System.out.println(i + "/3) Digite a sua altura: ");
            pessoa.altura = teclado.nextDouble();
            
            System.out.println("Digite o seu peso: ");
            pessoa.peso = teclado.nextDouble();
            
            System.out.println("Seu IMC eh: " + pessoa.calcularIMC());
        }
        
        teclado.close();
    }
}
