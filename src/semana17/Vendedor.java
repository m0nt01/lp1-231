public class Vendedor {

    private String nome;
    private double vendas;
    private double comissao;

    public Vendedor(String nome, double vendas, double comissao) {
        this.nome = nome;
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public double obterSalario() {
        return vendas * (comissao/100);
    }
}