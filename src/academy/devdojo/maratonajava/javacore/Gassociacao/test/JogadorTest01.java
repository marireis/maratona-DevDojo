package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Cafú");
        Jogador jogador3 = new Jogador("Ronaldo");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};//array de jogadores 3 posiçoes
        for(Jogador jogador: jogadores){
            jogador.imprime();

        }
    }
}
