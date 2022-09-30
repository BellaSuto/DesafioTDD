package org.example.models;

import java.util.ArrayList;

public class ListaBuilder {
    private ProdutoBuilder listasBuilder;
    public ListaBuilder(){
        listasBuilder = new ProdutoBuilder();
    }
    public ArrayList<Livro> geraListaLivro(){
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300));
        livros.add(new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500));
        livros.add(new Livro("Java POO", 20, 50, "GFT", "educativo", 300));
        return livros;
    }
    public ArrayList<VideoGame> geraListaVideoGame(){
        ArrayList<VideoGame> videoGames = new ArrayList<>();
        videoGames.add(new VideoGame("PS4", 1800, 100, "Sony", "Slim", false));
        videoGames.add(new VideoGame("PS4", 1000, 7, "Sony", "Slim", true));
        videoGames.add(new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false));
        return videoGames;
    }
}
