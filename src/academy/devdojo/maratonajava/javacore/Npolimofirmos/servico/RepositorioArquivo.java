package academy.devdojo.maratonajava.javacore.Npolimofirmos.servico;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.repositorio.Repositorio;


public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando em Arquivo");

    }
}
