package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Marina");
        nomes.add("João");

        nomes2.add("Karol");
        nomes2.add("Pedro");

        nomes.addAll(nomes2);
        nomes.remove(1);//remove o nome da posicao
        for (String nome: nomes){
            System.out.println(nomes2);
        }
        nomes.add("Sara");
        System.out.println("--------------");
        for(int i =0; i<nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        List <Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
