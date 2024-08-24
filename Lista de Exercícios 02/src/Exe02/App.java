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
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        ContaBancaria vetorContas[] = new ContaBancaria[2];
        
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        
        System.out.println("Conta 1:\nDigite o numero da conta: ");
        conta1.setNumero(teclado.next());
        
        System.out.println("Digite o nome do titular: ");
        conta1.setTitular(teclado.next());
        
        System.out.println("Conta 2:\nDigite o numero da conta: ");
        conta2.setNumero(teclado.next());
        
        System.out.println("Digite o nome do titular: ");
        conta2.setTitular(teclado.next());
        System.out.println("----------------------------");
        
        vetorContas[0] = conta1;
        vetorContas[1] = conta2;
        
        conta1.depositar(1000);
        conta1.depositar(700);
        
        conta2.depositar(5000);
        
        conta2.sacar(3000);
        
        conta2.transferir(conta1, 1800);
        
        for (int i = 0; i < 2; i++){
            ContaBancaria conta = vetorContas[i];
            
            System.out.println("Conta " + (i + 1) + ":\nNumero da conta: " + conta.getNumero() +
                    "\nTitular: " + conta.getTitular() + "\nSaldo: R$ " + conta.getSaldo());
            System.out.println("------------------------------------");
        }
    }
    
}
