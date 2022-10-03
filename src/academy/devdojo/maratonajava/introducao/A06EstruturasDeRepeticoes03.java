package academy.devdojo.maratonajava.introducao;

public class A06EstruturasDeRepeticoes03 {
    public static void main(String[] args) {
        //imprima os primeiros 25 numeros de um dado valor

        int num = 50;
        for(int i =0; i<num; i++){
            if(i>25){
                break;
            }
            System.out.println(i);
        }
    }
}
