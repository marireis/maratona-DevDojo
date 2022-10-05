package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominino.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Katia";
        professor.idade = 55;
        professor.sexo = 'F';
        System.out.println("Nome " + professor.nome + " idade " + professor.idade + " sexo " + professor.sexo);
    }
}
