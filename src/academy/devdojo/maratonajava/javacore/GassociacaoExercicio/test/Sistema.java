package academy.devdojo.maratonajava.javacore.GassociacaoExercicio.test;

import academy.devdojo.maratonajava.javacore.GassociacaoExercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.GassociacaoExercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.GassociacaoExercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.GassociacaoExercicio.dominio.Seminario;

public class Sistema {

    public static void main(String[] args) {
        Local local = new Local("Rua das FLores");//começa por quem nao tem dependencia
        Aluno aluno = new Aluno("Lua", 17);
        Professor professor = new Professor("Joao", "Matematica");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Hoje e o amanhã", alunosParaSeminario, local );
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
