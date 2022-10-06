package academy.devdojo.maratonajava.javacore.Jmodificadofinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Fria");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();

    }
}
