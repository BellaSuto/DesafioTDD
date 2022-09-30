import org.example.models.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LojaTest {
    private LojaService lojaService;
    private ListaBuilder listaBuilder;
    @Before
    public void setup(){
        listaBuilder = new ListaBuilder();
        Loja loja = new Loja("Americanas", "12345678", listaBuilder.geraListaLivro(), listaBuilder.geraListaVideoGame());
        lojaService = new LojaService();
        lojaService.setLoja(loja);
    }
    @Test
    public void deveCalcularPatrimonio(){
        assertEquals(941800.0, lojaService.calcularPatrimonio(), 0.00001);
    }
    @Test
    public void deveListarLivrosLojaComLivros(){
        assertEquals(true, lojaService.listaLivros());
    }
    @Test
    public void deveListarLivrosLojaSemLivros(){
        lojaService.getLoja().getLivros().clear();
        assertEquals(false, lojaService.listaLivros());
    }
    @Test
    public void deveListarVideoGamesLojaComVideoGames(){
        assertEquals(true, lojaService.listaVideoGames());
    }
    @Test
    public void deveListarVideoGamesLojaSemVideoGames(){
        lojaService.getLoja().getVideoGames().clear();
        assertEquals(false, lojaService.listaVideoGames());
    }
    @Test
    public void deveCalcularPatrimonioSemLivros(){
        lojaService.getLoja().getLivros().clear();
        assertEquals(937000.0, lojaService.calcularPatrimonio(), 0.00001);
    }
    @Test
    public void deveCalcularPatrimonioSemVideoGames(){
        lojaService.getLoja().getVideoGames().clear();
        assertEquals(4800.0, lojaService.calcularPatrimonio(), 0.00001);
    }
    @Test
    public void deveCalcularPatrimonioSemItens(){
        lojaService.getLoja().getVideoGames().clear();
        lojaService.getLoja().getLivros().clear();
        assertEquals(0.0, lojaService.calcularPatrimonio(), 0.00001);
    }
}
