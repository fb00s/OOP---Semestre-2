/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

/**
 *
 * @author Felipe Boos
 */
public class Triangulo extends Figura{
    private int lado1;
    private int lado2;
    private int lado3;
    
    public Triangulo(int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public double calcularArea(){
        double a = lado1;
        double b = lado2;
        double c = lado3;
        double p = (a + b + c) / 2;
        double areaAoQuadrado = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(areaAoQuadrado);
    }
}
