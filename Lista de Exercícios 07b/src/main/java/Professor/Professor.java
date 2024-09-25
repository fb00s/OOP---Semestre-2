/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

/**
 *
 * @author Felipe Boos
 */
public final class Professor {
    private String nome;
    private Titulacao titulacao;
    
    public Professor(String nome, Titulacao titulacao){
        setNome(nome);
        setTitulacao(titulacao);
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
    
    public Titulacao getTitulacao(){
        return titulacao;
    }
    
    public void setTitulacao(Titulacao titulacao){
        if (titulacao == null){
            throw new IllegalArgumentException("Titulacao nao pode ser nula");
        }
        this.titulacao = titulacao;
    }
}
