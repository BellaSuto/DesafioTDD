import org.example.models.VideoGame;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class VideoGameTest {
    private VideoGame videoGameUsado;
    private VideoGame videoGameNovo;
    @Before
    public void setup(){
        videoGameUsado = new VideoGame("PS4", 1000 , 3, "Pony", "Slim", true);
        videoGameNovo = new VideoGame("PS4", 1800 , 4,"Bony", "One", false);
    }
    public double imposto(VideoGame videogame){
        return videogame.calculaImposto();
    }
    @Test
    public void deveCalcularImpostoVideoGameUsado(){
        assertEquals(250.00, imposto(videoGameUsado), 0.0001);
    }
    @Test
    public void deveCalcularImpostoVideoGameNovo(){
        assertEquals(810.0, imposto(videoGameNovo), 0.0001);
    }
}
