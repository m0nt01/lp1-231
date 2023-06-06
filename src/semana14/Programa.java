package semana14;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        //quadrado.lado = 10.0;
        quadrado.setLado(5.6);

        System.out.println(quadrado.getLado());

        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());


        Retangulo r1 = new Retangulo(10.0, 5.0);
        Retangulo r2 = new Retangulo(15.5, 3.5);
        //Retangulo.base = 5.0;
        r1.setBase(5.0);
        r1.setAltura(5.0);
        r2.setBase(10.0);
        r2.setAltura(15);
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
        System.out.println(r2.calcularArea());
        System.out.println(r2.calcularPerimetro());
    }


}
