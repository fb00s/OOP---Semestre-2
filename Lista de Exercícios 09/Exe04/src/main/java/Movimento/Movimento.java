/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Movimento;

/**
 *
 * @author felip
 */

import java.time.LocalDate;
import java.time.LocalTime;

public class Movimento {
    private double valor;
    private TipoMovimento tipoMovimento;
    private LocalDate data;
    private LocalTime hora;
    
    public Movimento(double valor, TipoMovimento tipo){
        this.valor = valor;
        this.tipoMovimento = tipo;
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
    }
    
    public LocalDate getData(){
        return data;
    }
    
    public LocalTime getHora(){
        return hora;
    }
    
    public double getValor(){
        return valor;
    }
    
    public TipoMovimento getTipoMovimento(){
        return tipoMovimento;
    }
}

