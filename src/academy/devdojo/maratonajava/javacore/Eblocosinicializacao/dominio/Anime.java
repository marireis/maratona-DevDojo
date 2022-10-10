package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    //1- alocado espaço em memoria
    //2 - cada atributo de classe é criado e inicializado com valores default ou o que for passar
    //3 - bloco d eincializção é executado
    //4 - construtor é executado

    {
        //bloco de inicialização de instancia
        System.out.println("Dentro do bloco de inicializção");
        episodios =  new int[100];
        for(int i = 0; i<episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for(int episodio: this.episodios){
            System.out.println(episodio + " ");
        }
        System.out.println();
    }
    public String getNome() {
        return nome;
    }
    public int[] getEpisodios() {
        return episodios;
    }
}
