/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe02;

/**
 *
 * @author felboos
 */

import java.util.Scanner;

public class app02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Digite o sua altura");
        pessoa.altura = teclado.nextDouble();
        
        System.out.println("Digite o seu peso: ");
        pessoa.peso = teclado.nextDouble();
        
        System.out.println("Seu IMC é: " + pessoa.calcularIMC());
        
        teclado.close();
    }
}
