package academy.devdojo.maratonajava.introducao;

public class A05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(idade>=18){
            System.out.println("PODE VENDER BEBIDA");
        }else {
            System.out.println("PODE VENDER BEBIDA 2");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("NÃO PODE VENDER BEBIDA ");
        }
        boolean c = false;
        if(c = true){
            System.out.println("NÂO FAZER ISSO");
        }
    }
}
