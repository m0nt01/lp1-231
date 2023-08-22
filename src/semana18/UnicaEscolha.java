package semana18;

public class UnicaEscolha extends Questao {
    private int resposta;

    public UnicaEscolha(int numero, String enunciado, String[] opcoes) {
        super(numero, enunciado);
        this.resposta = resposta;
    }

    public boolean verificarResposta(Object respostaAluno) {
        if (respostaAluno instanceof Integer) {
            return (int) respostaAluno == resposta;
        }
        return false;
    }
}