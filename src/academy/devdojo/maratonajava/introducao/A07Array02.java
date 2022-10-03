package academy.devdojo.maratonajava.introducao;

public class A07Array02 {
    public static void main(String[] args) {
        String [] nomes = new String[3];
        nomes[0] = "Maia";
        nomes[1] = "Joao";
        nomes[2] = "Marta";

        for(int i=0; i< nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
