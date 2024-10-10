/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe03;

import java.util.ArrayList;

/**
 *
 * @author Felipe Boos
 */
public class App {
    public static void main(String[] args) {
        Vendedor luiz = new Vendedor("Luiz", 1000, 10);
        Venda venda1Luiz = new Venda(200);
        Venda venda2Luiz = new Venda(100);
        luiz.incluirVenda(venda1Luiz);
        luiz.incluirVenda(venda2Luiz);
        
        Vendedor paula = new Vendedor("Paula", 1200, 7);
        Venda venda1Paula = new Venda(500);
        Venda venda2Paula = new Venda(350);
        Venda venda3Paula = new Venda(280);
        paula.incluirVenda(venda1Paula);
        paula.incluirVenda(venda2Paula);
        paula.incluirVenda(venda3Paula);
        
        Programador julio = new Programador("Julio", 1000);
        julio.incluirLinguagem("C");
        julio.incluirLinguagem("Java");
        
        Programador ana = new Programador("Ana", 1000);
        ana.incluirLinguagem("Java");
        ana.incluirLinguagem("C#");
        ana.incluirLinguagem("C");
        ana.incluirLinguagem("Python");
        
        Programador anderson = new Programador("Anderson", 1200);
        anderson.incluirLinguagem("Python");
        
        Funcionario jose = new Funcionario("Jose", 1000);
        
        Funcionario maria = new Funcionario("Maria", 1400);
        
        Empresa empresa1 = new Empresa("Empresa");
        empresa1.incluirFuncionario(luiz);
        empresa1.incluirFuncionario(paula);
        empresa1.incluirFuncionario(julio);
        empresa1.incluirFuncionario(ana);
        empresa1.incluirFuncionario(anderson);
        empresa1.incluirFuncionario(jose);
        empresa1.incluirFuncionario(maria);
        
        System.out.println("Custo total salarios: " + empresa1.calcularCustosSalarios());
        
        System.out.println("Funcionarios: ");
        for (Funcionario f : empresa1.getFuncionarios()){
            System.out.println("----------------------------------------------------------");
            System.out.println("Nome: " + f.getNome() + "\nCusto de salario: " + f.calcularSalario());
        }
        
        System.out.println("\n\nVendedores:");
        for (Funcionario f : empresa1.getFuncionarios()){
            if (f instanceof Vendedor){
                Vendedor vendedor = (Vendedor) f;
                System.out.println("--------------------------------------------------");
                System.out.println("Nome: " + vendedor.getNome() + "\nPercentual comissao: " + vendedor.getPercentualComissao() + "%");
            }
        }
        
        System.out.println("\n\nProgramadores:");
        for (Funcionario f : empresa1.getFuncionarios()){
            if (f instanceof Programador){
                Programador programador = (Programador) f;
                System.out.println("--------------------------------------------------");
                System.out.println("Nome: " + programador.getNome() + "\nLinguagens que conhece: " + listaLinguagens(programador));
            }
        }
    }
    
    public static String listaLinguagens(Programador p){
        String strListaLinguagens = "";
        ArrayList<String> listaLinguagens = p.getLinguagens();
        int qtLinguagens = listaLinguagens.size();
        
        for (int i = 0; i < qtLinguagens; i++){
            String linguagem = listaLinguagens.get(i);
            strListaLinguagens += linguagem;
            
            if (qtLinguagens > 1){
                if (!linguagem.equals(listaLinguagens.getLast())
                        && !linguagem.equals(listaLinguagens.get(qtLinguagens - 2))){
                    strListaLinguagens += ", ";
                } else if (linguagem.equals(listaLinguagens.get(qtLinguagens - 2))){
                    strListaLinguagens += " e ";
                }
            }
        }
        
        return strListaLinguagens;
    }
}
