package semana11;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AquarioTest{
        @Test
        public void VolumeTest (){        
            Aquario Aq1 = new Aquario();
            Aq1.AlturaAq = 150;
            Aq1.LarguraAq = 100;
            Aq1.ComprimentoAq = 50;
            double Volume = Aq1.Volume();
            assertEquals(750, Volume);
            }

        @Test
        public void TermostatoTest (){
            Aquario Aq1 = new Aquario();
            Aq1.AlturaAq = 150;
            Aq1.LarguraAq = 100;
            Aq1.ComprimentoAq = 50;
            Aq1.TempAmb = 33;
            Aq1.TempAq = 25;
            double Termostato = Aq1.Termostato();
            assertEquals(300, Termostato);
        }
        @Test
        public void FiltragemMinTest(){
            Aquario Aq1 = new Aquario();
            Aq1.AlturaAq = 150;
            Aq1.LarguraAq = 100;
            Aq1.ComprimentoAq = 50;
            double MinFiltTest = Aq1.FiltragemMin();
            assertEquals(1500, MinFiltTest);
        
    }}