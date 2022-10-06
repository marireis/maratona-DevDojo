package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String studio;

    public Anime(String nome, String tipo, int episodios, String genero){//construtor - sem retorno, qualquer tipo de retorno vira método
        //serve para serguir algumas regras, caso não tenha construtor, java cria

        this();//precisa ser a primeira linha do construtor
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        System.out.println("dentro do construtor");
    }

    public Anime(String nome, String tipo, int episodios, String genero, String studio){//construtor - sem retorno, qualquer tipo de retorno vira método
        //serve para serguir algumas regras, caso não tenha construtor, java cria

        this(nome, tipo, episodios,genero);
        this.studio = studio;
        System.out.println("dentro do construtor2");
    }
    public Anime(){

    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
