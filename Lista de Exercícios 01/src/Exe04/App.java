/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe04;

/**
 *
 * @author felip
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        Pessoa vetorPessoas[] = new Pessoa[3];
        
        for (int i = 0; i < 3; i++){
            Pessoa pessoa = new Pessoa();
            
            System.out.println("Pessoa " + (i + 1) + " de 3");
            System.out.println("Digite o seu nome: ");
            pessoa.nome = teclado.next();
            
            System.out.println("Digite o seu peso: ");
            pessoa.peso = teclado.nextDouble();
            
            System.out.println("Digite a sua altura: ");
            pessoa.altura = teclado.nextDouble();
            
            vetorPessoas[i] = pessoa;
            
            System.out.println("-------------------------");
        }
        
        teclado.close();
        
        for (int i = 3; i > 0; i--){
            
            Pessoa pessoa = vetorPessoas[i - 1];
            
            System.out.println("Nome: " + pessoa.nome + "\nPeso: " + pessoa.peso +
                    "kg\nAltura: " + pessoa.altura + "m\nIMC: " + pessoa.calcularImc());
            System.out.println("-------------------------");
        }
    }
}
