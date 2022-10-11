package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception{//obriga as pessoas a fazerem tratamento
    public LoginInvalidoException(){
        super("Login inválido");
    }
    public LoginInvalidoException(String message){
        super(message);
    }
}
