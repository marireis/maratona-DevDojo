package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 2");
        endereco.setCep("64003-530");
        Pessoa pessoa = new Pessoa("Fran");
        pessoa.setCpf("001.213.222-05");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario("Guga");
        System.out.println("-----------------------");

        funcionario.setCpf("001.255.662-56");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);
        funcionario.imprime();
    }
}
