package Day20240909;

import java.util.Scanner;

public class A05_LogicEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        //4로 나눠 떨어지고 100으로는 나눠 떨어지지 않을때
        //400으로 나눠 떨어질 경우 윤년
        if(year % 4 == 0 && !(year % 100 == 0) || (year % 400 == 0)) {
            System.out.println("윤년");

        }else {
            System.out.println("평년");
        }
    }
}
