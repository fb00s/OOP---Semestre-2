/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Felipe Boos
 */
public class Imovel {
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public int getArea(){
        return area;
    }
    
    public void setArea(int area){
        if (area <= 0){
            throw new IllegalArgumentException("Valor invalido para area");
        }
        
        this.area = area;
    }
    
    public Bairro getBairro(){
        return bairro;
    }
    
    public void setBairro(Bairro bairro){
        this.bairro = bairro;
    }
    
    public Finalidade getFinalidade(){
        return finalidade;
    }
    
    public void setFinalidade(Finalidade finalidade){
        this.finalidade = finalidade;
    }
    
    public double calcularIptu() throws IllegalArgumentException {
        if (bairro == null){
            throw new IllegalArgumentException
        }
    }
    
}
