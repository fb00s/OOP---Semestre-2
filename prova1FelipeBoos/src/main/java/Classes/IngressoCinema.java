/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * Nome: Felipe Boos
 */
public class IngressoCinema {
    private DiaSemana diaDaSemana;
    private boolean estudante;

    public DiaSemana getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(DiaSemana diaDaSemana) {
        if (diaDaSemana == null){
            throw new IllegalArgumentException("Dia da semana nao pode ser vazio");
        }
        
        this.diaDaSemana = diaDaSemana;
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }
    
    public IngressoCinema(DiaSemana diaSemana, boolean estudante){ // Construtor do objeto
        setDiaDaSemana(diaSemana); // Define a variavel semana
        setEstudante(estudante); // Define a variavel estudante
    }
    
    public float precoIngresso(){ // Retorna o preço do ingresso
        float valor = 15;
        
        if (diaDaSemana == DiaSemana.TERCA || diaDaSemana == DiaSemana.QUARTA || diaDaSemana == DiaSemana.QUINTA){
            valor /= 2; // Aplica um desconto de 50 %
        } 
        
        if (diaDaSemana == DiaSemana.SABADO || diaDaSemana == DiaSemana.DOMINGO){
            float acrescimo = (float) (valor * 0.4); // Define o acrescimo como 40% do valor
            valor += acrescimo;
        }
        
        if (diaDaSemana == DiaSemana.SEGUNDA || diaDaSemana == DiaSemana.SEXTA ||diaDaSemana == DiaSemana.SABADO ||diaDaSemana == DiaSemana.DOMINGO){
            if (estudante){
                float desconto = (float) (valor * 0.3); // Define o desconto como 30%
                valor -= desconto;
            }
        }
        
        return valor;
    }
}
