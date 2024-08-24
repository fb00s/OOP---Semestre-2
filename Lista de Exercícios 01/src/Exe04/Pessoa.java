/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe04;


/**
 *
 * @author felip
 */
public class Pessoa {
    String nome;
    double altura;
    double peso;
    
    public double calcularImc(){
        return peso / (altura * altura);
    }
}
