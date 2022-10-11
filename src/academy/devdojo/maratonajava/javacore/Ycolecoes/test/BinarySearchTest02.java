package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Teste 1 ",19.90));
        mangas.add(new Manga(1L,"Teste 2 ",9.5));
        mangas.add(new Manga(4L,"Teste 3 ",3.2));
        mangas.add(new Manga(3L,"Teste 4 ",11.20));
        mangas.add(new Manga(2L,"Teste 5 ",2.99));

       // Collections.sort(mangas);
        mangas.sort((mangaByIdComparator));//procurando por id
        for (Manga manga: mangas){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Teste 5", 2.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
