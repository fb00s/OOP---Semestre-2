/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turma;

import Aluno.Aluno;
import Professor.Professor;
import java.util.ArrayList;

/**
 *
 * @author Felipe Boos
 */
public final class Turma {
    private String disciplina;
    private Professor professor;
    private Turno turno;
    private ArrayList<Aluno> alunos;
    
    public Turma(String disciplina, Turno turno){
        this.alunos = new ArrayList<>();
        setDisciplina(disciplina);
        setTurno(turno);
    }
    
    public String getDisciplina(){
        return disciplina;
    }
    
    public void setDisciplina(String disciplina){
        if (disciplina.strip().isEmpty()){
            throw new IllegalArgumentException("Disciplina deve ser preenchida");
        }
        this.disciplina = disciplina;
    }
    
    public Professor getProfessor(){
        return professor;
    }
    
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    
    public Turno getTurno(){
        return turno;
    }
    
    public void setTurno(Turno turno){
        if (turno == null){
            throw new IllegalArgumentException("O Turno deve ser preenchido");
        }
        this.turno = turno;
    }
     
    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }
    
    public void incluirAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    
    public Aluno obterAlunoMelhorNotaEnem(){
        Aluno alunoMaiorNota = alunos.get(0);
        
        for (Aluno alunoAtualLista : alunos){
            if (alunoAtualLista.getNotaEnem() > alunoMaiorNota.getNotaEnem()){
                alunoMaiorNota = alunoAtualLista;
            }
        }
        
        return alunoMaiorNota;
    }
}
