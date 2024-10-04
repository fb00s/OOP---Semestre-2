/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista10;

/**
 *
 * @author felboos
 */
public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;
    
    public double calcularArea(){
        double p = (lado1 + lado2 + lado3) / 2;
        
        double areaAoQuadrado = p * (p - lado1) * (p - lado2) * (p - lado3);
        double area = Math.sqrt(areaAoQuadrado);
        return area;
    }
}
