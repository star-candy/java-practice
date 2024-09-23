package Day20240911;

import java.util.Scanner;

public class A01_IF {
    public static void main(String[] args) {
        /**
         * if, if~else, if~else if...else, Nested if(중첩 if)
         * */
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input % 2 == 0) System.out.println("짝수입니다");
        else System.out.println("홀수입니다");

    }
}
