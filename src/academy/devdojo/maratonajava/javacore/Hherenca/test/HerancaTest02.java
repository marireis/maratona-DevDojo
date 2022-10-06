package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Funcionario;

public class HerancaTest02 {
    //0 - bloco de inicialização estático da super classe  é executado quando JVM carregar classe filha
    //1- bloco de inicialização estático da sub classe é  executado quando JVM carregar classe filha
    //2 - alocado espaco em memoria pro objeto da superclasse
    //3 - cada atributo de superclasse é criado e inicializado com valores default ou o que for passado da classe pai
    //4 - bloco de inicializacao da superclasse é executado na ordem em que aparece
    //5 - construtor é executado da superclasse
    //6 - alocado espaco em memoria pro objeto da sublasse
    //3 - cada atributo de subclasse é criado e inicializado com valores default ou o que for passado da classe pai
    //4 - bloco de inicializacao da subclasse é executado na ordem em que aparece
    //5 - construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Silva");
    }
}
