/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe02;

/**
 *
 * @author felip
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Funcionario vetorFuncionarios[] = new Funcionario[5];
        
        for (int i = 0; i < 5; i++){  
            System.out.println("Funcionario " + (i + 1) + " de 5");
            System.out.println("Digite o seu nome: ");
            String nome = teclado.next();
            
            System.out.println("Digite o seu salario: ");
            double salario = teclado.nextDouble();
            
            System.out.println("-------------------------");
            
            Funcionario funcionario = new Funcionario(nome, salario);
            
            vetorFuncionarios[i] = funcionario;
            
        }
        
        teclado.close();
        
        for (int i = 0; i <= vetorFuncionarios.length - 1; i++){
            Funcionario funcionario = vetorFuncionarios[i];
            
            System.out.println("Nome: " + funcionario.getNome() + "\nSalario: " + 
                    funcionario.getSalario() + "\nIRPF: R$ " + funcionario.calcularIrpf());
        }
    }
}
