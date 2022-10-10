package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{//pegar tudo da classe funcionario
    public Gerente(String nome, double salario){
        super(nome, salario);
    }
    @Override
    public void calculaBonus(){
        this.salario = this.salario + salario * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
