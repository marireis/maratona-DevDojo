package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Maria";//string constant pool
        String nome2 = "Maria";

        nome = nome.concat("Reis");
        System.out.println(nome == nome2);

        //1 - variavel de referencia
        //2 - objeto do tipo String
        //3 - uma string do pool de string
        String nome3 =new String("Maria"); //feio!


        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
