package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;
//classe abstrata que estende para desenvolvedor e gerente
public abstract class Funcionario extends Pessoa {//o que nao é concreto
    protected String nome;//herança
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
    public abstract void calculaBonus();//metodo abstrado nao tem corpo

    @Override
    public void imprime() {
        System.out.println("imprime 2");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
