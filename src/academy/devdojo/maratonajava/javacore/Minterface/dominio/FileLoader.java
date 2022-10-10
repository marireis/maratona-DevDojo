package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
    System.out.println("carregando dados de um arquivo ...");
    }
    @Override
    public void remove(){
        System.out.println("Deletando dados de um arquivo...");
    }
    @Override
    public void checkPermission() {
        System.out.println("Check permissões de um arquivo ..");
    }
}
