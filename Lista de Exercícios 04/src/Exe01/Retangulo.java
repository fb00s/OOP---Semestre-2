/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

/**
 *
 * @author felboos
 */
public class Retangulo {
    private int altura;
    private int comprimento;
    
    public Retangulo(){
        setAltura(0);
        setComprimento(0);
    }
    
    public void setAltura(int altura){
        if (altura <= 0){
            throw new IllegalArgumentException("Valor incorreto para altura: " + altura);
        }
        
        this.altura = altura;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public int getComprimento(){
        return comprimento;
    }
    
    public void setComprimento(int comprimento){
        if (comprimento <= 0){
            throw new IllegalArgumentException("Valor incorreto para comprimento: " + comprimento);
        }
        
        this.comprimento = comprimento;
    }
    
    public int calcularPerimetro(){
        return (altura * 2) + (comprimento * 2);
    }
    
    public int calcularArea(){
        return altura * comprimento;
    }  
    
}
