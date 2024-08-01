package ArrayJava;

public class InicializacaoArrayMulti {
    public static void main(String[] args) {
        int[][] array = {{2,3,4}, {5,6,7,8,9}, {10,11,12,13,14,15,16,17,18}};

        for (int[] number: array){
            System.out.println("\n------");
            for (int num: number){
                System.out.print(num+" ");
            }
        }
    }
}
