/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe02;

import java.util.ArrayList;


/**
 *
 * @author felboos
 */
public class Programador extends Funcionario{
   private ArrayList<String> linguagens;
   
   public Programador(String nome, double salarioBase){
       super(nome, salarioBase);
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
   
   public double calcularSalario(){
       return 0;
   }
}
