package academy.devdojo.maratonajava.introducao;

public class A06EstruturasDeRepeticoes04 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        //condição valor da parcela >=1000

        double valorTotal = 40000;

        for(int i =1; i<=valorTotal; i++){
            double valorParcela = valorTotal/i;
            if(valorParcela<1000) {
                break;
            }
            System.out.println("Parcela de: " +i + "R$ "+valorParcela );
        }

    }
}
