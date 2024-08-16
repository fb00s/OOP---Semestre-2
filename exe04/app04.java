/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe04;

/**
 *
 * @author felboos
 */

import java.util.Scanner;

public class app04 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Pessoa vetorPessoas[] = new Pessoa[3];
        
        for (int i = 0; i < 3; i++){
            Pessoa pessoa = new Pessoa();
            System.out.println("Pessoa " + (i + 1));
            System.out.println("Digite o nome: ");
            pessoa.nome = teclado.next();
            System.out.println("Digite a altura");
            pessoa.altura = teclado.nextDouble();
            System.out.println("Digite o peso: ");
            pessoa.peso = teclado.nextDouble();
            
            vetorPessoas[i] = pessoa;
        }
        
        teclado.close();
        
        for (Pessoa pessoa: vetorPessoas){
            // Pessoa pessoa = vetorPessoas[i];
            System.out.println("Nome: " + pessoa.nome + "\nAltura: " + pessoa.altura + "\nPeso: " + pessoa.peso);
        }
    }
}
