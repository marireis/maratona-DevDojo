package academy.devdojo.maratonajava.introducao;

public class A08ArrayMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dias = new int[3][3];
        dias [0][0] = 31;
        dias[0][1] = 20;
        dias[0][2] = 10;

        dias[1][0] = 2;
        dias[1][1] = 3;
        dias[1][2] = 4;
        for(int i = 0; i<dias.length; i++){
            for(int j = 0; j< dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-----------------");
        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }

    }
}
