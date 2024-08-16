/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe01;

/**
 *
 * @author felboos
 */
public class app01 {
    public static void main (String[] args){
        Pessoa pessoa = new Pessoa();
        
        pessoa.altura = 1.75;
        pessoa.peso = 80;
        
        System.out.println("IMC: " + pessoa.calcularIMC());
    }
}
