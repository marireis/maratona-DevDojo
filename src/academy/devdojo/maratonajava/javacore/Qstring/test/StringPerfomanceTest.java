package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+ (fim-inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(300000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder "+ (fim-inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(300000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer "+ (fim-inicio) + "ms");
    }
    private static void concatString(int tamanho){
        String texto = "";
        for(int i=0; i<tamanho; i++){
            texto +=i;
        }
    }

    private static void concatStringBuilder(int tamanho){//sincronia, qnd concatena mt string
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i=0; i<tamanho; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){//mts usurarios em acesso ao msm tempo- multi tred
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i=0; i<tamanho; i++){
            sb.append(i);
        }
    }
}
