package academy.devdojo.maratonajava.javacore.GassociacaoExercicio.test;

import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String entrada = sc.nextLine();
        System.out.println(entrada);
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        System.out.println("Digite o sexo");
        char sexo = sc.next().charAt(0);
    }
}
