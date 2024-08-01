package ArrayJava;

public class ArrayMultidimencionais01 {
    public static void main(String[] args) {

        int[][] idadesUser = new int[3][3];
        idadesUser[0][0] = 10;
        idadesUser[0][1] = 20;
        idadesUser[0][2] = 30;

        idadesUser[1][0] = 40;
        idadesUser[1][1] = 50;
        idadesUser[1][2] = 60;

        idadesUser[2][0] = 70;
        idadesUser[2][1] = 80;
        idadesUser[2][2] = 90;

        for (int i = 0; i < idadesUser.length; i++) {
            for (int j = 0; j < idadesUser[i].length; j++) {
                System.out.println(idadesUser[i][j]);
            }
        }

    }
}
