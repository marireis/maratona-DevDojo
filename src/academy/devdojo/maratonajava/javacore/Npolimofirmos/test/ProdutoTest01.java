package academy.devdojo.maratonajava.javacore.Npolimofirmos.test;

import academy.devdojo.maratonajava.javacore.Npolimofirmos.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.dominio.Tv;
import academy.devdojo.maratonajava.javacore.Npolimofirmos.servico.CalculaImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MAC" , 8000);
        Tomate tomate = new Tomate("Redondo", 10);//objeto
        Tv tv = new Tv("LG", 5000);
        CalculaImposto.calcularImposto(computador);
        System.out.println("----------------------");
        CalculaImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculaImposto.calcularImposto(tv);
    }
}
