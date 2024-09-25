/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turma;

/**
 *
 * @author Felipe Boos
 */

import Aluno.Aluno;
import Professor.Professor;
import java.util.List;

public final class Turma {
    private String disciplina;
    private Turno turno;
    private List<Aluno> alunos;
    private Professor professor;
    
    public Turma(String disciplina, Turno turno, Professor professor){
        setDisciplina(disciplina);
        setTurno(turno);
        setProfessor(professor);
    }
    
    public String getDisciplina(){
        return disciplina;
    }
    
    public void setDisciplina(String disciplina){
        if (disciplina.strip().isEmpty()){
            throw new IllegalArgumentException("A disciplina nao pode ser nula");
        }
        this.disciplina = disciplina;
    }
    
    public Turno getTurno(){
        return turno;
    }
    
    public void setTurno(Turno turno){
        if (turno == null){
            throw new IllegalArgumentException("O turno nao pode ser nulo");
        }
        this.turno = turno;
    }
    
    public List<Aluno> listarAlunos(){
        return alunos;
    }
    
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public Professor getProfessor(){
        return professor;
    }
    
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    
    
    
}
