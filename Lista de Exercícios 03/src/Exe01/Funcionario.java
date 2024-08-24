/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

/**
 *
 * @author felip
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }
    
    public void setNome(String nome){
        if (nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome invalido!");
        }
        
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setSalario(double salario){
        if (salario <= 0){
            throw new IllegalArgumentException("Valor invalido");
        }
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public double calcularIrpf(){
        double FAIXA_1_LIMITE_SUP = 1903.98;
        double FAIXA_2_LIMITE_SUP = 2826.05;
        double FAIXA_3_LIMITE_SUP = 3751.05;
        double FAIXA_4_LIMITE_SUP = 4664.68;
        
        double FAIXA_2_ALIQUOTA = 0.075;
        double FAIXA_3_ALIQUOTA = 0.15;
        double FAIXA_4_ALIQUOTA = 0.225;
        double FAIXA_5_ALIQUOTA = 0.275;
        
        double total = 0;
        
        if (salario <= FAIXA_1_LIMITE_SUP){ // Faixa 1
            return total;
        }
        
        if (salario < FAIXA_2_LIMITE_SUP){ // Faixa 2
            total += (salario - FAIXA_1_LIMITE_SUP) * FAIXA_2_ALIQUOTA;
            return total;
        }
        
        total += (FAIXA_2_LIMITE_SUP - FAIXA_1_LIMITE_SUP) * FAIXA_2_ALIQUOTA;
        
        if (salario < FAIXA_3_LIMITE_SUP){ // Faixa 3
            total += (salario - FAIXA_2_LIMITE_SUP) * FAIXA_3_ALIQUOTA;
            return total;
        }
        
        total += (FAIXA_3_LIMITE_SUP - FAIXA_2_LIMITE_SUP) * FAIXA_3_ALIQUOTA;
        
        if (salario < FAIXA_4_LIMITE_SUP){ // Faixa 4
            total += (salario - FAIXA_3_LIMITE_SUP) * FAIXA_4_ALIQUOTA;
            return total;
        }
        
        total += (FAIXA_4_LIMITE_SUP - FAIXA_3_LIMITE_SUP) * FAIXA_4_ALIQUOTA;
        total += (salario - FAIXA_4_LIMITE_SUP) * FAIXA_5_ALIQUOTA;
        
        return total;
    }
}
