package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();//colecao de elementos unicos - nao mantem a ordem de inserção
                        // LinkedHachSet - mantem a ordem de inserçao
        mangas.add(new Manga(5L,"Teste 1 ",19.90,0));
        mangas.add(new Manga(1L,"Teste 2 ",9.5,5));
        mangas.add(new Manga(4L,"Teste 3 ",3.2,0));
        mangas.add(new Manga(3L,"Teste 4 ",11.20,2));
        mangas.add(new Manga(2L,"Teste 5 ",2.99,0));
        mangas.add(new Manga(2L,"Teste 5 ",2.99,0));

        for (Manga manga: mangas) {
            System.out.println(manga);
        }

    }


}
