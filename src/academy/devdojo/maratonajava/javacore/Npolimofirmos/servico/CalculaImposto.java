package academy.devdojo.maratonajava.javacore.Npolimofirmos.servico;

import academy.devdojo.maratonajava.javacore.Npolimofirmos.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.dominio.Tomate;

public class CalculaImposto {//atraves do polimorfismo foi criado o método de calcular imposto sendo usado por 3 objetos computador , tomate e tv
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de Imposto de Produtos");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

    }
}
