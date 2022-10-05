package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominino.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Dante";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1200,1980,2360};//array

        funcionario.imprime();
        //funcionario.mediaSalario();
    }

}
