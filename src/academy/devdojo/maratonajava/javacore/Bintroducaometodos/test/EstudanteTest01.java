package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominino.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominino.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Fran";
        estudante01.idade = 15;
        estudante01.sexo = 'F';

        estudante02.nome = "Marcos";
        estudante02.idade = 15;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        System.out.println("_______________");
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
