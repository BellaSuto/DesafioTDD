package org.example.models;
import java.util.ArrayList;

public class LojaService {

    private Loja loja;
    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
    public boolean listaLivros(){
        if(this.getLoja().getLivros().size()!=0){
            System.out.println("--------------------------------------------------------------------");
            System.out.println("A loja "+this.getLoja().getNome()+" possui estes livros a venda:");
            for(Livro livro : this.getLoja().getLivros()) {
                System.out.println("Título: "+livro.getPreco()+", preço: "+livro.getPreco()+", quantidade: "+livro.getQtd()+" em estoque.");
                return true;
            }
        }else
            System.out.println("A loja não tem livros no seu estoque.");
        return false;
    }
    public boolean listaVideoGames(){
        if(this.getLoja().getVideoGames().size()!=0){
            System.out.println("--------------------------------------------------------------------");
            System.out.println("A loja "+this.getLoja().getNome()+" possui estes livros a venda:");
            for(VideoGame videogame : this.getLoja().getVideoGames()) {
                System.out.println("Video-Game: "+videogame.getModelo() +", preço: "+videogame.getPreco()+", quantidade: "+videogame.getQtd()+" em estoque.");
                return true;
            }
        }else
            System.out.println("A loja não tem video games no seu estoque.");
        return false;
    }
    public double calcularPatrimonio(){
        double soma=0;
        int i;
        for(i=0;i<this.getLoja().getLivros().size();i++){
            soma = soma + (this.getLoja().getLivros().get(i).getPreco()*this.getLoja().getLivros().get(i).getQtd());
        }
        for(i=0;i<this.getLoja().getVideoGames().size();i++){
            soma = soma + (this.getLoja().getVideoGames().get(i).getPreco()*this.getLoja().getVideoGames().get(i).getQtd());
        }
        if(this.getLoja().getLivros().size() == 0 && this.getLoja().getVideoGames().size() ==0){
            System.out.println("A loja não possui itens!");
        }
        return soma;
    }
}
