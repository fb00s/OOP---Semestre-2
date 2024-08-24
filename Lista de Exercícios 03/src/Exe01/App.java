/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

/**
 *
 * @author felip
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();
        
        System.out.println("Insira o seu salario: ");
        double salario = teclado.nextDouble();
        
        Funcionario funcionario = new Funcionario(nome, salario);
        
        System.out.println("O imposto a pagar eh: " + funcionario.calcularIrpf());
    }
}
