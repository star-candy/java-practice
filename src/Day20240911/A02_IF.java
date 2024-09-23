package Day20240911;

import java.util.Scanner;

public class A02_IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input <= 0 || input > 100) {
            input = 0;
        }
        System.out.println(input);
    }
}
