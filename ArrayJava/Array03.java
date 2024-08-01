package ArrayJava;

import com.sun.security.jgss.GSSUtil;

public class Array03 {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5};
        for (int n = 0; n < number.length; n++){
            System.out.println(number[n]);
        }

        System.out.println("==============");

        int[] numero = new int[]{6,7,8,9,10};
        for (int n2 = 0; n2 < numero.length; n2++){
            System.out.println(numero[n2]);
        }
        System.out.println("--------------------");

        for(int n: numero){
            System.out.println(n);
        }
    }
}
