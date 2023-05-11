package semana11;
public class AquarioTest{
    public static void main(String[] args) {
        Aquario Aq1 = new Aquario();
        Aq1.AlturaAq = 150;
        Aq1.LarguraAq = 100;
        Aq1.ComprimentoAq = 50;
        Aq1.TempAmb = 33;
        Aq1.TempAq = 25;
        System.out.println(Aq1.Volume());
        System.out.println(Aq1.Termostato());
        System.out.println(Aq1.FiltragemMin());
        System.out.println(Aq1.FiltragemMax());
    }
}