/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe03;

/**
 *
 * @author felip
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++){
            Pessoa pessoa = new Pessoa();
            
            System.out.println("Pessoa " + (i + 1) + " de 3");
            System.out.println("Digite a altura da pessoa: ");
            pessoa.altura = teclado.nextDouble();
            
            System.out.println("Digite o peso da pessoa: ");
            pessoa.peso = teclado.nextDouble();
            
            System.out.println("O IMC da pessoa eh: " + pessoa.calcularImc());
            System.out.println("-----------------------------------------");
        }
        
        teclado.close();
    }
}
