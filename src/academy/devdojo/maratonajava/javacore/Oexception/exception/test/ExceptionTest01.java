package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    //tratamento de exceção do tipo checked
    public static void main(String[] args) {
        criarNovoArquivo();

    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");//criar dentro de arquivo
        try {//tenta fazer, caso der problema pega

            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado" + isCriado);

        }catch(IOException e){// caso dê problema nessa linha, pula para a próxima, JAMAIS deixar em branco esse boloco cat
            e.printStackTrace();//imprime a exceção no console, o programa nao para de funcionar, por conta desse tratamento de exceção
        }
    }
}
