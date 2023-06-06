package semana14;

public class Quadrado {
    private double lado;

    //Construtor
    public Quadrado(double lado){
        this.setLado(lado);
    }
    //Métodos
    public double calcularArea(){
        return lado * lado;
    }
    public double calcularPerimetro(){
        return 4 * lado;
    }
    // public TIPO_ATRIBUTO getNOME_DO_ATRIBUTO(){
    //     return ATRIBUTO;
    // }
    public double getLado(){
        return lado;
    }
    // public void setNOME_DO_ATRIBUTO(TIPO_ATRIBUTO NOME-DO_ATRIBUTO){
    //     this.NOME_DO_ATRIBUTO = NOME_DO_ATRIBUTO;
    // }

    public void setLado(double lado){
        if (lado <= 0.0){
          throw new RuntimeException("Lado Inválido");
        }
        this.lado = lado;
    }
}