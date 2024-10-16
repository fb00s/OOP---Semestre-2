/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe01;

/**
 *
 * @author Felipe Boos
 */
public class App {
    public static void main(String[] args) {
        Contas contas = new Contas();
        
        ContaAgua contaAgua = new ContaAgua(2, 3);
        
        MensalidadeEnsino mensalidadeEnsino = new MensalidadeEnsino(5,7);
        
        PrevidenciaPrivada previdenciaPrivada = new PrevidenciaPrivada();
        previdenciaPrivada.setValor(150);
        previdenciaPrivada.investir();
        
        contas.incluirConta(contaAgua);
        contas.incluirConta(mensalidadeEnsino);
        contas.incluirConta(previdenciaPrivada);
        
        double total = contas.calcularTotalContas();
        
        System.out.println("Total: R$ " + total);
        
    }
}
