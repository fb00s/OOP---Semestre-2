/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

/**
 *
 * @author felip
 */
public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.altura = 1.75;
        pessoa.peso = 78;
        
        System.out.println("O IMC da pessoa eh: " + pessoa.calcularImc());
    }
}
