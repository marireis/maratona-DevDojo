package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominino.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominino.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Fran";
        estudante01.idade = 15;
        estudante01.sexo = 'F';

        estudante02.nome = "Marcos";
        estudante02.idade = 15;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
