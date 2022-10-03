package academy.devdojo.maratonajava.introducao;
/*Criar variaveis para os campos descritos abaixo entre <> e
* imprima a seguinte mensagem:
*
* Eu <nome>, morando no endereço <endereço>,
* confirmo que recebi o salario de <salary>, na data <data>*/

import java.util.Date;

public class A03Exercicio {
    public static void main(String[] args) {
        String nome = "Joao";
        String endereco = "Rua 7 de setembro";
        double salary = 2500.00;
        String dataRecebimentoSalary = "20/12/2021";
        String relatorio = "Eu " + nome + " morando no endereço "+ endereco + " confirmo que recebi o salario de "+ salary + " na data " + dataRecebimentoSalary;
        System.out.println(relatorio);
    }
}
