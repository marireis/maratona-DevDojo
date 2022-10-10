package academy.devdojo.maratonajava.javacore.Minterface.dominio;
//implements substitui o extends porque é uma interface
public class DataBaseLoader implements DataLoader, DataRemover{//classe que carrega dados do banco de dados
    //private ou default ou protected ou public
    @Override
    public void load(){
        System.out.println("Carregando dados do banco ...");
    }
    @Override
    public void remove(){
        System.out.println("Deletando dados do banco ...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Check permissões do banco ..");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieve ");
    }
}
