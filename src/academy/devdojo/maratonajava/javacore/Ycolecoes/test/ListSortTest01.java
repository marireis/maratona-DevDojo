package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Teste 1 ");
        mangas.add("Teste 2 ");
        mangas.add("Teste 3 ");
        mangas.add("Teste 4 ");
        mangas.add("Teste 5 ");

        Collections.sort(mangas);//reorganiza a lista
        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.20);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);

        for (String manga: mangas){
            System.out.println(manga);
        }
        System.out.println(dinheiros);
    }
}
