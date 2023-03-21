package semana04;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valordaCompra = scanner.nextDouble();

        double desconto = 0;
        if (valordaCompra >= 10.00 && valordaCompra <= 99.99) {
            desconto = 0.05;
        } else if (valordaCompra >= 100.00 && valordaCompra <= 499.99) {
            desconto = 0.1;
        } else if (valordaCompra >= 500.00) {
            desconto = 0.15;
        }

        double tamanhodoDesconto = valordaCompra * desconto;
        double precoDescontado = valordaCompra - tamanhodoDesconto;

        System.out.printf("Desconto aplicado: %.2f%%%n", desconto * 100);
        System.out.printf("Valor descontado: R$ %.2f%n", tamanhodoDesconto);
        System.out.printf("Valor Final: R$ %.2f%n", precoDescontado);
    }
}

