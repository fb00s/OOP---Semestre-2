/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Exe01.Aluno.Funcionario;
import Exe01.Enum.FaixaIrpf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author felboos
 */
public class TesteFuncionario {
    
    public TesteFuncionario() {
    }
    
    @Test
    private void teste1VerificaPrimeiraFaixa(){
        Funcionario instance = new Funcionario("Pica seca", 850);
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        FaixaIrpf expected = FaixaIrpf.PRIMEIRA;
        assertEquals(faixa, expected);
    }
}
