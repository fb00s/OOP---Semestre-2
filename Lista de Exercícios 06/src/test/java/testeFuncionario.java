/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Exe01.Enum.FaixaIrpf;
import Exe01.Funcionario.Funcionario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Felipe Boos
 */
public class testeFuncionario {
    
    public testeFuncionario() {
    }
    
    @Test
    public void teste1VerificaPrimeiraFaixa850(){
        Funcionario instance = new Funcionario("a", 850);
        FaixaIrpf expected = FaixaIrpf.PRIMEIRA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste2CalculoIrpf850(){
        Funcionario instance = new Funcionario("a", 850);
        double expected = 0;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste3VerificaPrimeiraFaixa1903p98(){
        Funcionario instance = new Funcionario("a", 1903.98);
        FaixaIrpf expected = FaixaIrpf.PRIMEIRA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste4CalculoIrpf1903p98(){
        Funcionario instance = new Funcionario("a", 1903.98);
        double expected = 0;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste5VerificaSegundaFaixa1903p99(){
        Funcionario instance = new Funcionario("a", 1903.99);
        FaixaIrpf expected = FaixaIrpf.SEGUNDA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste6CalculoIrpf1903p99(){
        Funcionario instance = new Funcionario("a", 1903.99);
        double expected = 0;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste7VerificaSegundaFaixa2000(){
        Funcionario instance = new Funcionario("a", 2000);
        FaixaIrpf expected = FaixaIrpf.SEGUNDA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste8CalculoIrpf2000(){
        Funcionario instance = new Funcionario("a", 2000);
        double expected = 7.2;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste9VerificaSegundaFaixa2826p65(){
        Funcionario instance = new Funcionario("a", 2826.65);
        FaixaIrpf expected = FaixaIrpf.SEGUNDA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste10CalculoIrpf2826p65(){
        Funcionario instance = new Funcionario("a", 2826.65);
        double expected = 69.2;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste11VerificaTerceiraFaixa2826p66(){
        Funcionario instance = new Funcionario("a", 2826.66);
        FaixaIrpf expected = FaixaIrpf.TERCEIRA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste12CalculoIrpf2826p66(){
        Funcionario instance = new Funcionario("a", 2826.66);
        double expected = 69.2;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste13VerificaTerceiraFaixa3000(){
        Funcionario instance = new Funcionario("a", 3000);
        FaixaIrpf expected = FaixaIrpf.TERCEIRA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste14CalculoIrpf3000(){
        Funcionario instance = new Funcionario("a", 3000);
        double expected = 95.2;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste15VerificaTerceiraFaixa3751p05(){
        Funcionario instance = new Funcionario("a", 3751.05);
        FaixaIrpf expected = FaixaIrpf.TERCEIRA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste16CalculoIrpf3751p05(){
        Funcionario instance = new Funcionario("a", 3751.05);
        double expected = 207.86;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste17VerificaQuartaFaixa3751p06(){
        Funcionario instance = new Funcionario("a", 3751.06);
        FaixaIrpf expected = FaixaIrpf.QUARTA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste18CalculoIrpf3751p06(){
        Funcionario instance = new Funcionario("a", 3751.06);
        double expected = 207.86;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste19VerificaQuartaFaixa4000(){
        Funcionario instance = new Funcionario("a", 4000);
        FaixaIrpf expected = FaixaIrpf.QUARTA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste20CalculoIrpf4000(){
        Funcionario instance = new Funcionario("a", 4000);
        double expected = 263.87;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste21VerificaQuartaFaixa4664p68(){
        Funcionario instance = new Funcionario("a", 4664.68);
        FaixaIrpf expected = FaixaIrpf.QUARTA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste22CalculoIrpf4664p68(){
        Funcionario instance = new Funcionario("a", 4664.68);
        double expected = 413.42;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste23VerificaQuintaFaixa4664p69(){
        Funcionario instance = new Funcionario("a", 4664.69);
        FaixaIrpf expected = FaixaIrpf.QUINTA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste24CalculoIrpf4664p69(){
        Funcionario instance = new Funcionario("a", 4664.69);
        double expected = 413.42;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste25VerificaQuintaFaixa5000(){
        Funcionario instance = new Funcionario("a", 5000);
        FaixaIrpf expected = FaixaIrpf.QUINTA;
        FaixaIrpf faixa = instance.identificarFaixaIRPF();
        assertEquals(expected, faixa);
    }
    
    @Test
    public void teste26CalculoIrpf5000(){
        Funcionario instance = new Funcionario("a", 5000);
        double expected = 505.64;
        double calculo = instance.calcularIRPF();
        assertEquals(expected, calculo, 0.01);
    }
    
    @Test
    public void teste27RecusaSalarioNegativo(){
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            Funcionario instance = new Funcionario("a", -100);
        });
        
        assertEquals("Salario invalido", e.getMessage());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
