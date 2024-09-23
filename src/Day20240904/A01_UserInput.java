package Day20240904;

import java.util.Scanner;

public class A01_UserInput {
    public static void main(String[] args) {
        System.out.print("반지름 입력 : ");
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        double area;

        area = r * r * 3.141592;

        System.out.println("반지름 : " + r);
        System.out.println("원의 넓이 : " + area);
        System.out.println(6/2.0);
    }
}
