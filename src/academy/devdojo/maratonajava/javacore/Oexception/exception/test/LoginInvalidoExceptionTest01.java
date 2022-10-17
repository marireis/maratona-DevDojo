package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usarnameDB = "Mari";
        String senhaDB = "123";
        System.out.println("Usuário: ");
        String usarnameDigitado = sc.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = sc.nextLine();
        if(!usarnameDB.equals(usarnameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválido");
        }
        System.out.println("Usuário logado com sucesso.");
    }
}
