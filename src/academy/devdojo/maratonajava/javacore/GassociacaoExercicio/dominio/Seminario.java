package academy.devdojo.maratonajava.javacore.GassociacaoExercicio.dominio;

public class Seminario {//nao tem professor, não é bidirecional
    private String titulo;
    private Aluno[] alunos;//1 seminario pode ter 0 ou varios alunos
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }
    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }
    public void imprime(){
        System.out.println(this.titulo + " " + this.local);
        if(alunos == null){
            return;
        }
        for(Aluno aluno: alunos){
            System.out.println(aluno.getNome());
        }
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAluno() {
        return alunos;
    }

    public void setAluno(Aluno[] aluno) {
        this.alunos = aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
