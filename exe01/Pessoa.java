/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe01;

/**
 *
 * @author felboos
 */
public class Pessoa {
    double altura;
    double peso;
    
    public double calcularIMC(){
        return peso / (altura * altura);
    }
}
