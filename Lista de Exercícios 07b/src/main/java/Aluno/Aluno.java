/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aluno;

/**
 *
 * @author Felipe Boos
 */
public class Aluno {
    private String nomeAluno;
    private int numMatricula;
    
    public Aluno(String nome, int numMatricula){
        setNomeAluno(nome);
        setNumMatricula(numMatricula);
    }
    
    private String getNomeAluno(){
        return nomeAluno;
    }
    
    private void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }
    
    private int getNumMatricula(){
        return numMatricula;
    }
    
    private void setNumMatricula(int numMatricula){
        this.numMatricula = numMatricula;
    }
}
