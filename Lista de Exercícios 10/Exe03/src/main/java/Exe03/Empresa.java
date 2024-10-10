/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe03;

import java.util.ArrayList;

/**
 *
 * @author Felipe Boos
 */
public class Empresa {
    private String nome;
    private ArrayList<Funcionario> funcionarios;
    
    public Empresa(String nome){
        setNome(nome);
        this.funcionarios = new ArrayList();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void incluirFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    
    public void removerFuncionario(Funcionario f){
        funcionarios.remove(f);
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    
    public double calcularCustosSalarios(){
        double totalSalarios = 0;
        
        for (Funcionario funcionario : funcionarios){
            totalSalarios += funcionario.calcularSalario();
        }
        
        return totalSalarios;
    }
}
