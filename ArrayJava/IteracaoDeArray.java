package ArrayJava;

public class IteracaoDeArray {
    public static void main(String[] args) {
        int [] number = new int[4];
        number[0] = 20;
        number[1] = 30;
        number[2] = 40;
        number[3] = 50;
        for (int i = 0; i < 4; i++) {
            System.out.println(number[i]);
        }

        /*
        para evitar mudar os indices de i <; number[x]; e new int[x];
        toda vez que ouver alguma mudança nos indices do array, posso usar o langth.

        uso junto da variavel pai, que no caso é number.

        EX:
         */

        System.out.println("==============");

        for (int j = 0;j < number.length; j++){
            System.out.println(number[j]);
        }
    }
}
