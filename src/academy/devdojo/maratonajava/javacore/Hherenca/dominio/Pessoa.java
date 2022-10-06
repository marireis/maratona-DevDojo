package academy.devdojo.maratonajava.javacore.Hherenca.dominio;

public class Pessoa {//classe mãe da classe funcionario
    protected String nome;//protected usa os atributos como se fosse publicos, assim funcionario pode imprimir nome
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco estatico de pessoa");
    }
    {
        System.out.println("dentro do bloco nao estatico 1");
    }
    {
        System.out.println("dentro do bloco nao estatico 2");
    }
    public Pessoa(String nome){
        System.out.println("Dentro do construtor pessoa");
        this.nome=nome;
    }
    /*public Pessoa(String nome, String cpf){//construtor na classe mae com argumento, precisa alterar na classes filhas
        this(nome);
        this.cpf = cpf;
    }*/
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
