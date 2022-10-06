package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLim = 250;//modificador estatico - identificador relacionado a classe carro

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime(){
        System.out.println("------------------");
        System.out.println("Nome " + this.nome);
        System.out.println("VelocidadeMax " + this.velocidadeMax);
        System.out.println("VelocidadeLim " + Carro.velocidadeLim);
    }

    public static void setVelocidadeLim(double velocidadeLim){
        Carro.velocidadeLim = velocidadeLim;
    }
    public static double getVelocidadeLim(){
        return Carro.velocidadeLim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

}
