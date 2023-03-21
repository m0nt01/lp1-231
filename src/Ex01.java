import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         
        System.out.println("Digite o Comprimento: ");
        double comprimentoDoaquario;
         comprimentoDoaquario = sc.nextFloat();
        System.out.println("Digite a Altura: ");
        double alturaDoaquario;
        alturaDoaquario = sc.nextFloat();
        System.out.println("Digite a Largura: ");
        double larguraDoaquario;
        larguraDoaquario = sc.nextFloat();

        double volumeDoaquario;
        volumeDoaquario = ((comprimentoDoaquario * alturaDoaquario * larguraDoaquario)/1000);
        System.out.println("O volume do Aquário é: " + volumeDoaquario);

         System.out.println("----------Termostato----------");
      
            System.out.println("Qual a temperatura ambiente atual?: ");
          double temperaturaAmbiente;
        temperaturaAmbiente = sc.nextFloat();

            System.out.println("Qual a temperatura desejada para aplicar ao Aquário?: ");
          double temperaturaDoaquario;
        temperaturaDoaquario = sc.nextFloat();
        
        double potenciaDoaquario;
        potenciaDoaquario = ( volumeDoaquario * 0.05 * (temperaturaDoaquario - temperaturaAmbiente));
        System.out.println("A potência aplicada no termostato será de: " + potenciaDoaquario + "°");

        
        
            System.out.println("Vamos para a filtragem...");

            

        
        System.out.println("----------Filtragem----------");


         
            System.out.println("A filtragem do Aquário tem alguns paramêtros...");
            double minimoFiltrado, maximoFiltrado;
            minimoFiltrado = (volumeDoaquario * 2);
            maximoFiltrado = (volumeDoaquario * 3);
            System.out.println("Onde o minimo de para a filtragem é: " + minimoFiltrado + "L e o máximo é: " + maximoFiltrado + "L");
         
        
            System.out.println("Obrigado por cuidar do seu Aquário :)");
         
         











        






    }
}