package semana18;

public class TesteProva {
    public static void main(String[] args) {
       
        Questao questaoVF = new VerdadeiroFalso(1, "Java é uma linguagem de programação.", true);
        Questao questaoUE = new UnicaEscolha(2, "Qual é o resultado de 2 + 2?", new String[]{"4", "3", "5", "6"});
        Questao questaoME = new MultiplaEscolha(3, "Quais são os números primos?", new String[]{"a) 2", "b) 4", " c) 5", " d) 6"}, new int[]{0, 2});

        
        Questao[] questoes = {questaoVF, questaoUE, questaoME};

       
        Prova prova = new Prova(questoes);

        
        Object[] respostasAluno = {true, 1, new int[]{0, 2}};

       
        int pontuacao = prova.calcularPontuacao(respostasAluno);

       
        System.out.println("Pontuação do aluno: " + pontuacao + "/" + questoes.length);

        
        for (int i = 0; i < questoes.length; i++) {
            System.out.println("Questão " + questoes[i].getNumero() + ": " + questoes[i].getEnunciado());
            System.out.println("Resposta correta: " + questoes[i].verificarResposta(respostasAluno[i]));
            System.out.println();
        }
    }
}
