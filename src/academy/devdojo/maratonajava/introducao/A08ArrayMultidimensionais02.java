package academy.devdojo.maratonajava.introducao;

public class A08ArrayMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {1,2,3};

        arrayInt[0] = new int[2];//o arrayInt 0 aponta para outro array de 2 posiçoes
        arrayInt[1] = new int[]{1,2,3};//aponta para o array de 3 posições
        arrayInt[2] = new int[]{4,5,6,7,8};//para 5 posições

        int arrayInt2[][] = {{0,0},{1,2,3},{4,5,6,7,8}};
        for(int[] arrayBase: arrayInt){
            System.out.println("\n --- ");
            for(int num: arrayBase){
                System.out.println(num + " ");
            }

        }
        for(int[] arrayBase: arrayInt2){
            System.out.println("\n +++++ ");
            for(int num: arrayBase){
                System.out.println(num + " ");
            }

        }
    }
}
