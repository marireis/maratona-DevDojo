package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        //tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;
//WRAPPER -
        //polimorfismo - são objetos, referência
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;//autoboxing = quando tem o tipo primitivo e o java faz a conversão automatica para Wrapper
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW ; //unboxing - do Wrapper para o primitivo
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("True");//não muda de maiuscula e minuscula
        System.out.println(verdadeiro);
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
