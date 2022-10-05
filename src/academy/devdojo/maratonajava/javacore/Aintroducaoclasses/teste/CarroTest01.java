package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominino.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Sport";
        carro1.nome = "Fusca";
        carro1.ano = 1969;

        carro2.modelo="Fiat";
        carro2.nome = "Palio";
        carro2.ano = 2022;

        carro1 = carro2;

        System.out.println("Carro 1 ");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2 ");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
