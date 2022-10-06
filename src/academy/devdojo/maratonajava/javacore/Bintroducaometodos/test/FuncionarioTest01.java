package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominino.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Dante");
        funcionario.setIdade(23);
        funcionario.setSalarios( new double[]{1200,1980,2360});//array

        funcionario.imprime();
        //funcionario.mediaSalario();
    }

}
