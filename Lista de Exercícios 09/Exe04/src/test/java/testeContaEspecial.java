/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import ContaEspecial.ContaEspecial;
import Movimento.Movimento;
import Movimento.TipoMovimento;
import java.util.ArrayList;
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
public class testeContaEspecial {
    
    public testeContaEspecial() {
    }
    
    @Test
    public void teste1SacarGeraMovimentoCredDebConta(){
        ContaEspecial instance = new ContaEspecial();
        instance.depositar(1000);
        instance.sacar(250);
        ArrayList<Movimento> listaMovs = instance.getMovimentos();
        
        Movimento mov1 = instance.getMovimentos().get(0);
        TipoMovimento tipoMov1 = mov1.getTipoMovimento();
        TipoMovimento expectedTipoMov1 = TipoMovimento.CREDITO;
        double valorMov1 = mov1.getValor();
        double expectedValorMov1 = 1000;
        assertEquals(expectedTipoMov1, tipoMov1);
        assertEquals(expectedValorMov1, valorMov1);
        
        Movimento mov2 = listaMovs.get(1);
        TipoMovimento tipoMov2 = mov2.getTipoMovimento();
        TipoMovimento expectedTipoMov2 = TipoMovimento.DEBITO;
        double valorMov2 = mov2.getValor();
        double expectedValorMov2 = 250;
        assertEquals(expectedTipoMov2, tipoMov2);
        assertEquals(expectedValorMov2, valorMov2);        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
