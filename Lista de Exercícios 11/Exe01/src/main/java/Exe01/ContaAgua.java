/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

/**
 *
 * @author felboos
 */
public class ContaAgua implements Pagavel{
    private int metrosCubicos;
    private double precoMetroCubico;
    
    public ContaAgua(int metrosCubicos, double precoMetroCubico){
        this.metrosCubicos = metrosCubicos;
        this.precoMetroCubico = precoMetroCubico;
    }
    
    @Override
    public double calcularValorPagar(){
        return metrosCubicos * precoMetroCubico;
    }
}
