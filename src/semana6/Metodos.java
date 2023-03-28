package semana6;

public class Metodos {
    public static void main(String[] args) {
        
     System.out.println(Math.sqrt(25.0));
     imprimirPalavra("Olá Mundo");
     imprimirPalavra("testeTeste");
     
     double soma = Calculadora.somar(10.0, 2.3);
     
     
     System.out.println (Calculadora.somar(3.3, 4.1));

















    }
     //método que soma dois números e retorna o resultado

     //assinatura do método 
     //public - acesso em qualquer parte do projeto
     //static - método atrelado a classe (não precisa criar um objeto)
     //void - tipo de retorno (sem retorno)
     //imprimirPalavra - nome do método
     //String palavra - parâmetro (pode ter zero ou muitos)
     //definindo o método
     
    public static void imprimirPalavra(String palavra){
        System.out.println(palavra.toUpperCase());
   
        }
   
}
