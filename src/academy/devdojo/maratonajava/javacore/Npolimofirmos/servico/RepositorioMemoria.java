package academy.devdojo.maratonajava.javacore.Npolimofirmos.servico;

import academy.devdojo.maratonajava.javacore.Npolimofirmos.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando na Memoria");

    }
}
