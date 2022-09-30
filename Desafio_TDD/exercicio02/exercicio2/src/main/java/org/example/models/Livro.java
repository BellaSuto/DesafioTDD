package org.example.models;

import org.example.interfaces.Imposto;

public class Livro extends Produto implements Imposto{
    private String autor;
    private String tipo;
    private int qtdPag;
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTema(String tema) {
        this.tipo = tipo;
    }
    public int getQtdPag() {
        return qtdPag;
    }
    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }
    public Livro() {

    }
    public Livro(String nome, double preco, int qtd, String autor, String tipo, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tipo = tipo;
        this.qtdPag = qtdPag;
    }
    @Override
    public double calculaImposto() {
        double imposto=0;
        String tipo = this.tipo.toLowerCase();
        if (!tipo.equals("educativo")) {
            imposto = (this.getPreco() * 0.1);
            System.out.println("R$ "+imposto+" de impostos sobre o livro " + this.getNome());
            return imposto;
        } else {
            System.out.println("Livro educativo não possui imposto: " + this.getNome());
            return 0;
        }
    }
}
