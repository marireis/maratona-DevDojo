package academy.devdojo.maratonajava.introducao;

public class A07Array03 {
    public static void main(String[] args) {
        int [] num = new int[10];
        int [] numeros = {1,2,3,4,5};
        int [] numeros2 = new int[]{1,2,3,4,5};

       /* for(int i=0; i< numeros.length; i++){
            System.out.println("1. "+num[i]);
            System.out.println("2."+numeros[i]);
            System.out.println("3. "+numeros2[i]);
        }*/
        for(int i: numeros2){
            System.out.println(numeros);
        }
    }
}
