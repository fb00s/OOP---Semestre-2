/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista10;

/**
 *
 * @author felboos
 */
public class Retangulo extends Figura{
    private int largura;
    private int altura;
    
    public Retangulo(int largura, int altura){
        
    }
    
    @Override
    public double calcularArea(){
        return largura * altura;
    }
}
