package org.example.models;

public abstract class Produto {
    private String nome;
    private double preco;
    private int qtd;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto() {

    }
    public Produto(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }
}
