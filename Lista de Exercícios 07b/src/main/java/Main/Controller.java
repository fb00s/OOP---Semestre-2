/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Felipe Boos
 */

import Turma.Turma;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final List<Turma> turmas;
    
    public Controller(){
        this.turmas = new ArrayList<>();
    }
    
    public void adicionarTurma(Turma turma){
        this.turmas.add(turma);
    }
    
    public List<Turma> getTurmas(){
        return turmas;
    }
    
    
    
}
