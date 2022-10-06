package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominino;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        if(salarios == null){
            return;
        }
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios != null) {
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        mediaSalario();
    }

    public void mediaSalario(){
        if(salarios == null){
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\n" + media);
    }
}
