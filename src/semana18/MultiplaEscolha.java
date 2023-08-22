package semana18;

public class MultiplaEscolha extends Questao {
    private int[] respostas;
    private String[] opcoes;

    public MultiplaEscolha(int numero, String enunciado, String[] opcoes, int[] respostas) {
        super(numero, enunciado);
        this.opcoes = opcoes;
        this.respostas = respostas;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public int[] getRespostas() {
        return respostas;
    }

    public boolean verificarResposta(Object respostaAluno) {
        if (respostaAluno instanceof int[]) {
            int[] respostasAluno = (int[]) respostaAluno;
            if (respostasAluno.length != respostas.length) {
                return false;
            }
            for (int i = 0; i < respostas.length; i++) {
                if (respostasAluno[i] != respostas[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}