package semana04;

import java.util.Scanner;

    public class ex01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite Um número: ");
            int input = scanner.nextInt();
    
            int antecessor = input - 1;
            int successor = input + 1;
    
            System.out.println("O antecessor de " + input + " é " + antecessor);
            System.out.println("O sucessor de " + input + " é " + successor);
        }
    }
     