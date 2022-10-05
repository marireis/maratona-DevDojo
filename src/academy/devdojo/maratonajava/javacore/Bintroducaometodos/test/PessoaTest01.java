package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominino.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("katia");
        pessoa.setIdade(-9);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }


}
