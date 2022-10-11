package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
        //CHECKED(EXEÇÕES CHECADAS - FILHAS DE EXCEPTION) E UNCHECKED(EXECEÇÕES NÃO CHEACADAS -FIILHAS DE RUNTIME- ERRO NO CÓDIGO)
        //RUNTIMEEXCEPTION = é uma exceção - é um erro de desenvolvimento;
        Object object = null;
        System.out.println(object.toString());
        //ou
        int[] nums = {1,2};
        System.out.println(nums[2]);
    }
}
