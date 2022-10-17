package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        //(-(ponto de inserção)-1) -- se nao existir o elemento
        //index 0,1,2,3
        //values 0,2,3,4
        Collections.sort(numeros);//para ordenar os numeros
        System.out.println(Collections.binarySearch(numeros,0));
        System.out.println(Collections.binarySearch(numeros,4));
    }
}
