package semana04;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Primeiro Número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o Segundo Número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o Terceiro Número: ");
        double num3 = scanner.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("A Média Aritimética de " + num1 + ", " + num2 + ", e " + num3 + " é " + media);
    }
}
