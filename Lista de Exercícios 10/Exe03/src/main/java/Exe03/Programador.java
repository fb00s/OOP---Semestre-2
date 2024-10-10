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
public class Programador extends Funcionario{
    private ArrayList<String> linguagens;
    
    public Programador(String nome, double salarioBase){
        super(nome, salarioBase);
        this.linguagens = new ArrayList();
    }
    
    public void incluirLinguagem(String linguagem){
        linguagens.add(linguagem);
    }
    
    public void removerLinguagem(String linguagem){
        linguagens.remove(linguagem);
    }
    
    public ArrayList<String> getLinguagens(){
        return linguagens;
    }
    
    @Override
    public double calcularSalario(){
        double salario = this.getSalarioBase();
        
        if(linguagens.contains("Java")){
            salario += salario * 0.2;
        }
        
        return salario;
    }
}
