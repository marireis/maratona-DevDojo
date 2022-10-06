package academy.devdojo.maratonajava.javacore.Hherenca.dominio;

public class Funcionario extends Pessoa{//herança - funcionario vai ter todos os atributos e metodos que uma pessoa tem
    private double salario;

    static {
        System.out.println("Dentro do bloco estatico de funcionario");
    }
    {
        System.out.println("dentro do bloco nao estatico 1 func");
    }
    {
        System.out.println("dentro do bloco nao estatico 2 func");
    }
    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime(){
        super.imprime();//usa o objeto imprime de pessoa e depois imprime o salario
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        //todas as classes filhas da classe Pessoa tem acesso a ela como se fosse publica por conta do protected
        System.out.println("EU" + this.getNome()+ " recebi o salario de " + this.salario);
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
