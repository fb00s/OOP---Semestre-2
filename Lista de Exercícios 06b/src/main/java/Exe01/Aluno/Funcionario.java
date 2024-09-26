/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01.Aluno;

import Exe01.Enum.FaixaIrpf;

/**
 *
 * @author Felipe Boos
 */
public final class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        if (nome.strip().isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        if (salario <= 0){
            throw new IllegalArgumentException("Salario invalido");
        }
        this.salario = salario;
    }
    
    public double calcularIRPF(){
        double FAIXA_1_LIMITE_SUP = 1903.98;
        double FAIXA_2_LIMITE_SUP = 2826.05;
        double FAIXA_3_LIMITE_SUP = 3751.05;
        double FAIXA_4_LIMITE_SUP = 4664.68;
        
        double FAIXA_2_ALIQUOTA = 0.075;
        double FAIXA_3_ALIQUOTA = 0.15;
        double FAIXA_4_ALIQUOTA = 0.225;
        double FAIXA_5_ALIQUOTA = 0.275;
        
        FaixaIrpf faixa = identificarFaixaIRPF();
        
        double total = 0;
        
        double totalFaixa2 = (FAIXA_2_LIMITE_SUP - FAIXA_1_LIMITE_SUP) * FAIXA_2_ALIQUOTA;
        double totalFaixa3 = (FAIXA_3_LIMITE_SUP - FAIXA_2_LIMITE_SUP) * FAIXA_3_ALIQUOTA;
        double totalFaixa4 = (FAIXA_4_LIMITE_SUP - FAIXA_3_LIMITE_SUP) * FAIXA_4_ALIQUOTA;
        double totalFaixa5 = salario - FAIXA_4_LIMITE_SUP * FAIXA_5_ALIQUOTA;
        
        switch (faixa){
            case FaixaIrpf.PRIMEIRA -> {
            }
            case FaixaIrpf.SEGUNDA -> {
                total += totalFaixa2;
                total += (salario - FAIXA_1_LIMITE_SUP) * FAIXA_2_ALIQUOTA;
            }
            case FaixaIrpf.TERCEIRA -> {
                total += totalFaixa2 + totalFaixa3;
                total += (salario - FAIXA_2_LIMITE_SUP) * FAIXA_3_ALIQUOTA;
            }
            case FaixaIrpf.QUARTA -> {
                total += totalFaixa2 + totalFaixa3 + totalFaixa4;
                total += (salario - FAIXA_3_LIMITE_SUP) * FAIXA_4_ALIQUOTA;
            }
            default -> {
                total += totalFaixa2 + totalFaixa3 + totalFaixa4 + totalFaixa5;
                total += (salario - FAIXA_4_LIMITE_SUP) * FAIXA_5_ALIQUOTA;
            }
        }
        
        return total;
    }
    
    public FaixaIrpf identificarFaixaIRPF(){
        
        if (salario <= 1903.98){
            return FaixaIrpf.PRIMEIRA;
        }
        
        if (salario <= 2826.65){
            return FaixaIrpf.SEGUNDA;
        }
        
        if (salario <= 3751.05){
            return FaixaIrpf.TERCEIRA;
        }
        
        if (salario <= 4664.68){
            return FaixaIrpf.QUARTA;
        }
        
        return FaixaIrpf.QUINTA;
    }
    
}
