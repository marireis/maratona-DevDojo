package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominino.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumero(0,4);
        System.out.println(result);
        System.out.println("------------");
        calculadora.imprimeDivisaoDeDoisNumeros(0,2);
    }
}
