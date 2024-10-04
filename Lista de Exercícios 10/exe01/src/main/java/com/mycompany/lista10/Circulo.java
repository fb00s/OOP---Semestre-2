/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista10;

/**
 *
 * @author felboos
 */
public class Circulo {
    private int raio;
    
    public double calcularArea(){
        double raioAoQuadrado = raio * raio;
        double area = Math.PI * raioAoQuadrado;
        return area;
    }
}
