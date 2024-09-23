/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Exe01.Bairro;
import Exe01.Finalidade;
import Exe01.Imovel;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Felipe Boos
 */
public class testeImovel {
    
    public testeImovel() {
    }

    @Test
    public void teste1RecusaAreaNegativa(){
        Bairro bairro = new Bairro("Progresso", 1);
        
        Exception e = assertThrows(IllegalArgumentException.class, () ->{
            Imovel instance = new Imovel(-5, bairro, Finalidade.RESIDENCIAL);
        }); 
        
        assertEquals(e.getMessage(), "Area invalida");
    }
    
    @Test
    public void teste2RecusarImovelSemArea(){
        Bairro bairro = new Bairro("Centro", 1);
        Imovel instance = new Imovel();
        instance.setBairro(bairro);
        instance.setFinalidade(Finalidade.RESIDENCIAL);
        
        Exception e = assertThrows(IllegalArgumentException.class, () ->{
            instance.calcularIptu();
        });
        
        assertEquals(e.getMessage(), "A area precisa ser definida");
    }
    
    @Test
    public void teste3RecusarImovelSemFinalidade(){
        Bairro bairro = new Bairro("Centro", 1);
        Imovel instance = new Imovel();
        instance.setBairro(bairro);
        instance.setArea(250);
        
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            instance.calcularIptu();
        });
        
        assertEquals(e.getMessage(), "A finalidade precisa ser definida");
    }
    
    @Test
    public void teste4RecusarImovelSemBairro(){
        Imovel instance = new Imovel();
        instance.setFinalidade(Finalidade.RESIDENCIAL);
        instance.setArea(400);
        
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
           instance.calcularIptu();
        });
        
        assertEquals(e.getMessage(), "O bairro precisa ser definido");
    }
    
    @Test
    public void teste5CalcularIptuImoveisResidencias400m(){
        Bairro bairro = new Bairro("Progresso", 1);
        Imovel instance = new Imovel(400, bairro, Finalidade.RESIDENCIAL);
        double iptu = instance.calcularIptu();
        double expected = 400;
        
        assertEquals(iptu, expected);
    }
    
    @Test
    public void teste6CalcularIptuImoveisComerciaisAte100m(){
        Bairro bairro = new Bairro("Progresso", 1);
        Imovel instance = new Imovel(80, bairro, Finalidade.COMERCIAL);
        double iptu = instance.calcularIptu();
        double expected = 500;
        
        assertEquals(iptu, expected);
    }
    
    @Test
    public void teste7ImpostoComerciaisEntre100e400m(){
        Bairro bairro = new Bairro("Progresso", 1);
        Imovel instance = new Imovel(250, bairro, Finalidade.COMERCIAL);
        double iptu = instance.calcularIptu();
        double expected = 1000;
        
        assertEquals(iptu, expected);
    }
    
    @Test
    public void teste8ImpostoComerciaisAcima400m(){
        Bairro bairro = new Bairro("Progresso", 1);
        Imovel instance = new Imovel(500, bairro, Finalidade.COMERCIAL);
        double iptu = instance.calcularIptu();
        double expected = 1275;
        
        assertEquals(iptu, expected);
    }
    
    @Test
    public void teste9ImpostoIndustriaisAte2000m(){
        Bairro bairro = new Bairro("Progresso", 1);
        Imovel instance = new Imovel(2000, bairro, Finalidade.INDUSTRIAL);
        double iptu = instance.calcularIptu();
        double expected = 1000;
        
        assertEquals(iptu, expected);
    }
    
    @Test
    public void teste10ImpostoIndustriaisAcima2000m(){
        Bairro bairro = new Bairro("Progresso", 1);
        Imovel instance = new Imovel(3000, bairro, Finalidade.INDUSTRIAL);
        double iptu = instance.calcularIptu();
        double expected = 1650;
        
        assertEquals(iptu, expected);
    }
    
    @Test
    public void teste11ImpostoCoeficiente2pt5(){
        Bairro bairro = new Bairro("Centro", 2.5);
        Imovel instance = new Imovel(500, bairro, Finalidade.RESIDENCIAL);
        double iptu = instance.calcularIptu();
        double expected = 1250;
        
        assertEquals(iptu, expected, 0.0001);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
