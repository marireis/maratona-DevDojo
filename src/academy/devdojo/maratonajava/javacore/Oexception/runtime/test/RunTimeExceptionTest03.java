package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao2();
    }

    private static String abreConexao() {
        try{
            System.out.println("Abrindo arquivo");
           // throw new RuntimeException();
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {//bloco que sempre é executado
            System.out.println("Fechando o recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        }finally {//bloco que sempre é executado
            System.out.println("Fechando o recurso liberado pelo SO");
        }
    }
}
