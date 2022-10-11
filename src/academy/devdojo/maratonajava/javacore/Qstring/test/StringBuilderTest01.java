package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Marina Reis";
        nome.concat(" DevDojo ");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Mari");
        sb.append(" Barros").append(" Alencar");
        sb.substring(0,2);
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
