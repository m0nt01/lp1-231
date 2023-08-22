package semana18;
public class VerdadeiroFalso extends Questao {
    private boolean resposta;

    public VerdadeiroFalso(int numero, String enunciado, boolean resposta) {
        super(numero, enunciado);
        this.resposta = resposta;
    }

    public boolean getResposta() {
        return resposta;
    }

    public boolean verificarResposta(Object respostaAluno) {
        if (respostaAluno instanceof Boolean) {
            return (boolean) respostaAluno == resposta;
        }
        return false;
    }
}