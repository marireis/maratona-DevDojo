package academy.devdojo.maratonajava.introducao;

public class A05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 7;

        switch (dia){
            case 1:
            case 7:
                System.out.printf("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
