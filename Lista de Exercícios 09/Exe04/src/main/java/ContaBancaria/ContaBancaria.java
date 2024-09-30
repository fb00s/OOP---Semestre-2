/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaBancaria;

import Cliente.Cliente;
import Movimento.Movimento;
import Movimento.TipoMovimento;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class ContaBancaria {
    private String numero;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimento> movimentos;
    
    public ContaBancaria(){
        this.movimentos = new ArrayList<>();
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public Cliente getTitular(){
        return titular;
    }
    
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    
    public void depositar(double valor){
        setSaldo(this.saldo + valor);
        Movimento movimento = new Movimento(valor, TipoMovimento.CREDITO);
        incluirMovimento(movimento);
    }
    
    public void sacar(double valor){
//        if (valor > this.getSaldo()){
//            throw new IllegalArgumentException("Saldo insuficiente");
//        }
        
        setSaldo(this.saldo - valor);
        Movimento movimento = new Movimento(valor, TipoMovimento.DEBITO);
        incluirMovimento(movimento);
    }
    
    public void transferir(ContaBancaria contaDestino, double valor){
        sacar(valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
    }
    
    public ArrayList<Movimento> getMovimentos(){
        return movimentos;
    }
    
    protected void incluirMovimento(Movimento m){
        movimentos.add(m);
    }
}
