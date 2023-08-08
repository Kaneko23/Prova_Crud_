/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_crud;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author kaue_brito
 */
public class Produto {

    private String nome;
    private Double valor;
    private int qtd;
    private int qtdRes;

    public Produto(String nome, Double valor, Integer qtd, Integer qtdRes) {
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
        this.qtdRes = qtdRes;
    }
    public String getNome(){
        return this.nome;
    }
    public Double getVal(){
        return this.valor;
    }
    
    public int getQtd(){
        return this.qtd;
    }
    public int getQtdRes(){
        return this.qtdRes;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setVal(Double valor){
        this.valor = valor;
    }
   
    
    public void setQtdProduto(int qtd){
        this.qtd = qtd;
    }
    
    public void setQtdResProduto(int qtdRes){
        this.qtdRes = qtdRes;
    }
    
    
    public void entradaProduto() {
       
    }

    public void saidaProduto() {

    }

    public String toString() {
        return "nome: " + this.nome+" Valor: "+this.valor+" qtd: "+this.qtd +" qtdRes: "+this.qtdRes;

    }

}
