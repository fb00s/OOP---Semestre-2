/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import lista07a.Finalidade;
import lista07a.Imovel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author felboos
 */
public class TesteImovel {
    
    public TesteImovel() {
    }
    
    @Test
    public void testeResidencial420(){
        Imovel instance = new Imovel();
        instance.setFinalidade(Finalidade.RESIDENCIAL);
        instance.setArea(420);
        double valorIptu = instance.calcularIptu();
        double expected = 420;
        assertEquals(valorIptu, expected);
    }
    
    @Test
    public void testeComercial500(){
        Imovel instance = new Imovel();
        instance.setFinalidade(Finalidade.COMERCIAL);
        instance.setArea(500);
        double valorIptu = instance.calcularIptu();
        double expected = 1275;
        assertEquals(valorIptu, expected);
    }
    
    @Test
    public void teste1RecusaAreaNegativa(){
        Imovel instance = new Imovel();
        instance.setFinalidade(Finalidade.COMERCIAL);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            instance.setArea(-5);
        });
        assertEquals("Area invalida", exception.getMessage()); 
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
