package academy.devdojo.maratonajava.javacore.GassociacaoExercicio.test;

import java.util.Scanner;

public class LeituraDoTeclado2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Previsão do Futuro");
        System.out.println("Digite sua pergunta, eu responderei SIM ou NÃO");
        String pergunta = sc.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
    }
}
