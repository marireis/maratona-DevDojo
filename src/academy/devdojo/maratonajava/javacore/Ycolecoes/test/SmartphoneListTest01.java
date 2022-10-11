package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "IPHONE");
        Smartphone s2 = new Smartphone("2ABC2", "SAMSUNG");
        Smartphone s3 = new Smartphone("3ABC3", "LG");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);

        //smartphones.clear();//deleta quem esta dentro do arraylist
        for (Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("2ABC2", "SAMSUNG");
        //verifica se existe dentro da lista
        System.out.println(smartphones.contains(s4));
        //pega o indice do objeto , -1 se nao encontrar
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
