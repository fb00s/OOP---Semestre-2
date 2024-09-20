/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista07a;

/**
 *
 * @author felboos
 */
public class Imovel {
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;
    
    public Imovel(){
        
    }
    
    public Imovel(String endereco, int area, Bairro bairro, Finalidade finalidade){
        setEndereco(endereco);
        setArea(area);
        setBairro(bairro);
        setFinalidade(finalidade);
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int getArea(){
        return area;
    }
    
    public void setArea(int area){
        if (area < 0){
            throw new IllegalArgumentException("Area invalida");
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
    
    public double calcularIptu(){
        double iptu;
        double areaDouble = (double) (area);
        
        switch (finalidade){
            case Finalidade.RESIDENCIAL -> iptu = areaDouble;
            case Finalidade.COMERCIAL -> {
                if (area <= 100){
                    iptu = 500;
                } else if (area <= 400){
                    iptu = 1000;
                } else {
                    iptu = areaDouble * 2.55;
                }
            }
            default -> {
                if (area <= 2000){
                    iptu = 2000;
                } else {
                    iptu = areaDouble * 0.55;
                }
            }
        }
            
        return iptu;
    }
    
}
