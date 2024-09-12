/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Classes.DiaSemana;
import Classes.IngressoCinema;

/**
 *
 * Nome: Felipe Boos
 */
public class IngressoCinemaTeste {
    
    public IngressoCinemaTeste() {
    }
    
    
    @Test
    public void testeIngressoCinema1(){
        IngressoCinema instance = new IngressoCinema(DiaSemana.QUARTA, false);
        float valor = instance.precoIngresso();
        float expected = (float) (7.5);
        assertEquals(valor, expected);
    }
    
    @Test 
    public void testeIngressoCinema2(){
       IngressoCinema instance = new IngressoCinema(DiaSemana.QUARTA, true);
        float valor = instance.precoIngresso();
        float expected = (float) (7.5);
        assertEquals(valor, expected); 
    }
    
    @Test
    public void testeIngressoCinema3(){
       IngressoCinema instance = new IngressoCinema(DiaSemana.SEGUNDA, true);
        float valor = instance.precoIngresso();
        float expected = (float) (10.5);
        assertEquals(valor, expected); 
    }
    
    @Test
    public void testeIngressoCinema4(){
       IngressoCinema instance = new IngressoCinema(DiaSemana.SABADO, true);
        float valor = instance.precoIngresso();
        float expected = (float) (14.7);
        assertEquals(valor, expected); 
    }
    
    @Test
    public void testeIngressoCinema5(){
       IngressoCinema instance = new IngressoCinema(DiaSemana.SABADO, false);
        float valor = instance.precoIngresso();
        float expected = (float) (21);
        assertEquals(valor, expected); 
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
