package semana18;
public class Prova {
    private Questao[] questoes;
    private int pontuacao;

    public Prova(Questao[] questoes) {
        this.questoes = questoes;
        this.pontuacao = questoes.length;
    }

    public Questao[] getQuestoes() {
        return questoes;
    }

    public int calcularPontuacao(Object[] respostasAluno) {
        if (respostasAluno.length != questoes.length) {
            return -1; // Código de erro indicando que as respostas estão incompletas
        }

        int pontuacaoAtual = 0;
        for (int i = 0; i < questoes.length; i++) {
            if (questoes[i].verificarResposta(respostasAluno[i])) {
                pontuacaoAtual++;
            }
        }
        return pontuacaoAtual;
    }
}