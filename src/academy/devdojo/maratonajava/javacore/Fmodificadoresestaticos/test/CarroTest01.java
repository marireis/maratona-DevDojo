package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLim(180);
        Carro c1 = new Carro("BMW", 250);
        Carro c2 = new Carro("Mercedes", 200);
        Carro c3 = new Carro("Fusion", 190);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
