package academy.devdojo.maratonajava.introducao;

public class A06EstruturasDeRepeticoes05 {
    public static void main(String[] args) {
        double valorTotal = 40000;

        for (int i = (int) valorTotal; i >= 1; i--) {
            double valorParcela = valorTotal / i;
            if(valorParcela<1000){
                continue;
            }
            System.out.println("Parcela de: " + i + "R$ " + valorParcela);
        }
    }
}
