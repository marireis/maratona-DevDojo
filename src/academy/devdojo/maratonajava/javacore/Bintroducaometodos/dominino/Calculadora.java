package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominino;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
        System.out.println("Finalizando o teste 01");
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-2);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double divideDoisNumero(double num1, double num2){
        if(num2 == 0)
            return 0;
        return (num1/num2);
    }
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }else{
            System.out.println(num1/num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        //num1 = 99;
        //num2 = 33;
        System.out.println("DEntro do alterarDoisNumeros");
        System.out.println(num1);
        System.out.println(num2);

    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int i: numeros){
            soma+=i;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){//varArgs tem que ser o ultimo atributo caso tenham outros
        int soma =0;
        for(int i: numeros){
            soma+=i;
        }
        System.out.println(soma);
    }
}
