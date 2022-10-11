package academy.devdojo.maratonajava.javacore.Npolimofirmos.test;

import academy.devdojo.maratonajava.javacore.Npolimofirmos.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("pc", 5000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------");
        Produto produto2 = new Tomate("tomatee", 5);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
    }
}
