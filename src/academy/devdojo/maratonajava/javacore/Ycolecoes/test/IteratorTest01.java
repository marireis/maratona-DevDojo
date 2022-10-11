package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);// = arrayList, o linkedList é melhor para remover
        mangas.add(new Manga(5L,"Teste 1 ",19.90,0));
        mangas.add(new Manga(1L,"Teste 2 ",9.5,5));
        mangas.add(new Manga(4L,"Teste 3 ",3.2,0));
        mangas.add(new Manga(3L,"Teste 4 ",11.20,2));
        mangas.add(new Manga(2L,"Teste 5 ",2.99,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantidade() ==0){
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade()==0);//java 8 - resumo do codigo de cima
        System.out.println(mangas);
    }
}
