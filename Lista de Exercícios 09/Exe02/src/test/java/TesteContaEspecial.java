/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import ContaEspecial.ContaEspecial;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author felip
 */
public class TesteContaEspecial {
    
    public TesteContaEspecial() {
    }

    @Test
    public void teste1ContaEspecialSacarValorSuperiorSaldo(){
        ContaEspecial instance = new ContaEspecial();
        instance.setLimiteCredito(100);
        instance.depositar(20);
        instance.sacar(50);
        double expected = -30;
        double saldo = instance.getSaldo();
        assertEquals(expected, saldo);
    }
    
    @Test
    public void teste2ContaEspecialSacarSupSaldoInfLimite(){
        ContaEspecial instance = new ContaEspecial();
        instance.setLimiteCredito(100);
        instance.depositar(20);
        instance.sacar(120);
        double expected = -100;
        double saldo = instance.getSaldo();
        assertEquals(expected, saldo);
    }
    
    @Test
    public void teste3ContaEspecialImpedeSaqueSupSaldoELimite(){
        ContaEspecial instance = new ContaEspecial();
        instance.setLimiteCredito(100);
        instance.depositar(20);
        
        assertThrows(IllegalArgumentException.class, () ->{
            instance.sacar(120.01);
        });
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
