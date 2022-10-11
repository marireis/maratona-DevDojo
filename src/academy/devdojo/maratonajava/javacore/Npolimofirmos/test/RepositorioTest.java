package academy.devdojo.maratonajava.javacore.Npolimofirmos.test;

import academy.devdojo.maratonajava.javacore.Npolimofirmos.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Marina");

    }
}
