/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

/**
 *
 * @author felboos
 */
public class Investimento implements Pagavel{
    private double saldo;
    
    public double getSaldo(){
        return saldo;
    }
    
    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    @Override
    public double calcularValorPagar(){
        return 0;
    }
}
