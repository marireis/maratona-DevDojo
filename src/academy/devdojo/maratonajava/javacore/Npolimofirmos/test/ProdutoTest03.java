package academy.devdojo.maratonajava.javacore.Npolimofirmos.test;

import academy.devdojo.maratonajava.javacore.Npolimofirmos.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.servico.CalculaImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Notebook", 5000);
        Tomate tomate = new Tomate("Tomate verde", 10);
        tomate.setDataValidade("22/02/23");
        CalculaImposto.calcularImposto(tomate);
        System.out.println("------------");
        CalculaImposto.calcularImposto(produto);
    }
}
