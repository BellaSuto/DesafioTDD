import org.junit.Before;
import org.example.models.Livro;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LivroTest {
    private Livro livroEducativo;
    private Livro livroOutroTema;
    @Before
    public void setup(){
        livroEducativo = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
        livroOutroTema = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "aventura", 45);
    }
    public double imposto(Livro livro){
        return livro.calculaImposto();
    }
    @Test
    public void deveCalcularImpostoLivroEducativo(){
        assertEquals(0.00, imposto(livroEducativo), 0.0001);
    }
    @Test
    public void deveCalcularImpostoLivroOutroTema(){
        assertEquals(6.0, imposto(livroOutroTema), 0.0001);
    }
}
