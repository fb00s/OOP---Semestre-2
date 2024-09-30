/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaEspecial;

import ContaBancaria.ContaBancaria;

/**
 *
 * @author felip
 */
public class ContaEspecial extends ContaBancaria{
    private double limiteCredito;
    
    public double getLimiteCredito(){
        return limiteCredito;
    }
    
    public void setLimiteCredito(double limiteCredito){
        this.limiteCredito = limiteCredito;
    }
    
    public void sacar(double valor){
        if (valor > (this.getSaldo() + this.getLimiteCredito())){
            throw new IllegalArgumentException("O valor definido é ultrapassa o limite");
        }
        
        this.setSaldo(this.getSaldo() - valor);
    }
}
