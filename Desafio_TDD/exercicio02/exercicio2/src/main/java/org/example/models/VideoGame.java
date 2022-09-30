package org.example.models;

import org.example.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
    private String marca;
    private String modelo;
    private boolean isUsado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean isUsado) {
        this.isUsado = isUsado;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public VideoGame() {

    }
    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }
    @Override
    public double calculaImposto() {
        double imposto=0;
        if (!this.isUsado) {
            imposto = ((this.getPreco() * 0.45));
            System.out.println("Imposto sobre " + this.getNome()+": "+imposto);
        } else {
            imposto = ((this.getPreco() * 0.25));
            System.out.println("Imposto sobre " + this.getNome() + " usado: "+ imposto);
        }
        return imposto;
    }
}
