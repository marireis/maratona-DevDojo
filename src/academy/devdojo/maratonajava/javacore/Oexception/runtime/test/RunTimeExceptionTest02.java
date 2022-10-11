package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try{
            divisao(1,0);
        }catch(RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }

    /**
     *
     * @param a
     * @param b nao pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b){
    /*    try{
            return a/b;
        }catch(RuntimeException e){
            e.printStackTrace();
        }
       return 0;*/
    /*
        if(b == 0){
            throw new RuntimeException("Argumento inválido");
        }
        return a/b;*/

        if(b == 0){
            throw new IllegalArgumentException("Argumento inválido"); //exceções mais especificas possiveis
        }
        return a/b;
    }
}
