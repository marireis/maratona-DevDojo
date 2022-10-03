package academy.devdojo.maratonajava.introducao;

public class A04Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int resto = num2 % num1;
        System.out.println(num2 - num1);
        System.out.println(num2 + num1);
        System.out.println(num2 * num1);
        System.out.println(num2 / num1);
        System.out.println("Valor "+ num2 + num1);
        System.out.println("Valor "+ num2 + " Valor "+ num1);
        System.out.println(resto);

        //Operadores Lógicos < > <= >= != == && ||

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);

        int idade = 35;
        float salario = 3612;

        boolean isDentroDaLei = idade > 30 && salario >= 4612;
        boolean isForaDaLei = idade > 30 || salario >= 4612;
        System.out.println(isDentroDaLei);
        System.out.println(isForaDaLei);

        int contador =0;
        contador +=1;
        System.out.println(contador);
        int cont = 1;
        int cont2 = 1;
        System.out.println(cont);
        System.out.println(cont++);
        System.out.println(++cont2);


    }
}
