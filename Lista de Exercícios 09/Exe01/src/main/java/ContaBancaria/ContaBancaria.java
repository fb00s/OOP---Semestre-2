/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaBancaria;

import Cliente.Cliente;

/**
 *
 * @author felip
 */
public class ContaBancaria {
    private String numero;
    private double saldo;
    private Cliente titular;
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public Cliente getTitular(){
        return titular;
    }
    
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        setSaldo(this.saldo + valor);
    }
    
    public void sacar(double valor){
//        if (valor > this.getSaldo()){
//            throw new IllegalArgumentException("Saldo insuficiente");
//        }
        
        setSaldo(this.saldo - valor);
    }
    
    public void transferir(ContaBancaria contaDestino, double valor){
        sacar(valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
    }
}
