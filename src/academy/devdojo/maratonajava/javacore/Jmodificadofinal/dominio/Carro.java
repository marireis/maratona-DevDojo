package academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;//fixa o valor da constante
    public final Comprador COMPRADOR = new Comprador(" nome");//não altera a referencia COMPRADOR

    public final void imprime(){//metodo final nao pode sobreescrever
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
