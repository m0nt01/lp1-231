package semana12;

public class Retangulo {
    public double base;
    public double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
}}
