package Semana03;

import java.util.Scanner;

public class Introducao{

    public static void main (String[] args) {
        // Comentário de linha

        /*
         * 
         git config --global user.email "Seu E-mail"* Comentários de múltiplas linhas
         */

         // Tipos Primitivos

         //Inteiros
         //byte, short, int, long

         byte n1 = 100; // 1 byte  -128 a 127
         short n2 = 3000; //  2 bytes  -32768 a 32767
         int n3 = 4000000; // 4 bytes - 2 bilhoes
         long n4 = 32323232323232l; // 8 bytes
          
         // Ponto Flutuante
         // floate, double
         float nota1 = 9.5f; // 4 bytes
         float nota2 = 9.5f; // 8 bytes

         // Char
         char letra = 'A';
         boolean ligado = true;
         boolean teste = false; 

         // String
         String palavra = "Olá Mundo";
         System.out.println (palavra);
         System.out.println (palavra.toLowerCase());
         System.out.println (palavra.toUpperCase());

         //Variáveis e constantes 
         // 1- TIPO nome = valor;
         // 2 -tipo nome;
         // nome = valor;

         // 1-
            short idade = 30;

         // 2-
            short idade2;
            idade2 = 30;

        //Java 10 - Inferência de tipos 
        var sobrenome = "Santos";
        var idade 3 = 25;

        //Constantes
        final double TESTE = 30.4;
        
        // Entrada e saída de dados
        // Instancia um objeto scanner para receber dados do usuário 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entra com o seu nome");
        String nomeInformado = sc.nextLine();

        System.out.println("Entre com a sua idade");
        short idadeInformada = sc.nextShort();

        System.out.println(nomeInformado + " " + idadeInformada);
        // Fecha o objeto Scanner liberando os recursos alocados     
        sc.close();

        
    
}