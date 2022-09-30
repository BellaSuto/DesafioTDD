package org.example.models;

public class ProdutoBuilder {
    private VideoGame videoGame;
    private Livro livro;

    public ProdutoBuilder(){
        videoGame = new VideoGame();
        livro = new Livro();
    }
    public Livro construirLivro(){
        return livro;
    }
    public VideoGame construirVideo(){
        return videoGame;
    }
    public ProdutoBuilder livroComAtributos(String nome, double preco, int qtd, String autor, String tipo, int qtdPag){
        livro.setAutor(autor);
        livro.setNome(nome);
        livro.setQtdPag(qtdPag);
        livro.setPreco(preco);
        livro.setTema(tipo);
        livro.setQtd(qtd);
        return this;
    }
    public ProdutoBuilder videoComAtributos(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado){
        videoGame.setMarca(marca);
        videoGame.setNome(nome);
        videoGame.setModelo(modelo);
        videoGame.setPreco(preco);
        videoGame.setUsado(isUsado);
        videoGame.setQtd(qtd);
        return this;
    }
}
