/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe02;

import java.util.ArrayList;

/**
 *
 * @author Felipe Boos
 */
public class Vendedor extends Funcionario{
    private double percentualComissao;
    private ArrayList<Venda> vendas;
    
    public Vendedor(String nome, double salarioBase, double percentualComissao){
        super(nome, salarioBase);
        setPercentualComissao(percentualComissao);
    }
    
    public double getPercentualComissao(){
        return percentualComissao;
    }
    
    public void setPercentualComissao(double percentualComissao){
        this.percentualComissao = percentualComissao;
    }
    
    public ArrayList<Venda> getVendas(){
        return vendas;
    }
    
    public void incluirVenda(Venda v){
        vendas.add(v);
    }
    
    @Override
    public double calcularSalario(){
        double salarioBase = this.getSalarioBase();
        double comissoes = 0;
        
        for (Venda v : vendas){
            comissoes += v.getValor() * (percentualComissao / 100);
        }
        
        return salarioBase + comissoes;
    }
}
