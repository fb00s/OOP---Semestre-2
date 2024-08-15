/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author felboos
 */
public class app {
    
    public static void main (String[] args){
        Calculadora calculadora1 = new Calculadora();
        
        calculadora1.setNum1(30);
        calculadora1.setNum2(0);
        
        System.out.println("Soma dos numeros: " + calculadora1.somar());
        System.out.println("Subtracao dos numeros: " + calculadora1.subtrair());
        System.out.println("Multiplicacao dos numeros: " + calculadora1.multiplicar());
        System.out.println("Divisao dos numeros: " + calculadora1.dividir());
        
    }
}
