package Day20240911;

import java.util.Scanner;

public class A04_IF_ELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt(); //동일 타입 연속 입력시 scanner 버퍼 비울 필요 없음

        if(n1 > n2) System.out.println("n1");
        else if(n1 < n2) System.out.println("n2");
        else System.out.println("동일");
    }
}
