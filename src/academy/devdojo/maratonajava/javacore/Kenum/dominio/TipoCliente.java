package academy.devdojo.maratonajava.javacore.Kenum.dominio;
//ENUMERACAO
public enum TipoCliente {//faz com que o usuario escolha uma das opções
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    private int valor;//se refere a numeracao, tem que vim depois delas

    private String nomeRelatorio;
    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
    //metodo que retorna baseado no atributo que desejar
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {//somente para pegar; setter muda o valor, não pode
        return valor;
    }
}
