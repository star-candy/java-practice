package Day20240909;

import java.util.Scanner;

public class A02_ScannerEx {
    public static void main(String[] args) { //자바에서 char 변수가 2byte 사용함 따라서 return시 문자열로 인식 필요
        Scanner sc = new Scanner(System.in);
//////////////////////////////////////////////////// 문자 받는 2가지 형식
        System.out.print("영문자 1개:");
        //자바에서 char 변수가 2byte a, \n, 단어로 받고 0번째 값 반환해 null 제외한 char 값만 return 함
        char ch = sc.next().charAt(0); //next로 단어로 받은 뒤 charAt 통해 0번째 값 반환하여 char 단어 받아옴
        System.out.println(ch);

        sc.nextLine(); //버퍼 제거

        System.out.print("문자 1");
        String aa = sc.nextLine();
        char dd = aa.charAt(0);
        System.out.println(dd);
         ////////////////////////////////////

        System.out.print("단어 입력 :");
        String s1 = sc.next(); //띄어쓰기 미포함 단어 문자 입력시 사용
        System.out.println(s1); //hello word시 hello만 출력됨

        System.out.print("문장 입력:");
        //nextLine으로 인해 버퍼에 줄바꿈 문장 남아 입력 x 문제
        sc.nextLine(); //버퍼에 남은 문자 제거
        String s2 = sc.nextLine(); //띄어쓰기 포함 문장을 받음
        System.out.println(s2);




    }
}
