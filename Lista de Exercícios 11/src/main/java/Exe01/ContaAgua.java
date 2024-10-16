/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

/**
 *
 * @author Felipe Boos
 */
public class ContaAgua implements Pagavel{
    private final int metrosCubicos;
    private final double precoMetroCubico;
    
    public ContaAgua(int metrosCubicos, double precoMetroCubico){
        this.metrosCubicos = metrosCubicos;
        this.precoMetroCubico = precoMetroCubico;
    }
    
    @Override
    public double calcularValorPagar(){
        return precoMetroCubico * metrosCubicos;
    }
}
