package academy.devdojo.maratonajava.introducao;

public class A06EstruturasDeRepeticoes01 {
    public static void main(String[] args) {
        int cont = 1;
        while(cont<10){
            System.out.println(++cont);
            //cont++;
        }

        do{
            System.out.println("Do-While"+ ++cont);
        }while (cont<10);

        for(int i=0; i<10;i++){
            System.out.println("For" +i);
        }
    }
}
