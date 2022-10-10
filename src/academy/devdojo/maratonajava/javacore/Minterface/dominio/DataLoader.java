package academy.devdojo.maratonajava.javacore.Minterface.dominio;
//interface - todos os metodos sao public e abstract- nao usar, ficva redundante
public interface DataLoader {//todos os atributos em uma interface são constantes
    int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Checagem de permissões");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize interface");
    }
}
//metodos abstratos tem ; no final