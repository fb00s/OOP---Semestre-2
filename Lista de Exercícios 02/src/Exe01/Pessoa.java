/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;


/**
 *
 * @author felip
 */
public class Pessoa {
    private String nome;
    private double altura;
    private double peso;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double calcularImc(){
        return this.peso / (altura * altura);
    }
}
