package Day20240909;

import java.util.Scanner;

public class A01_ScannerIN {
    public static void main(String[] args) { //scanner로 받는 두 형식이 다를 경우, 다르다면 선 입력에 nextLine이 아니라면 scanner 버퍼 비워야 함
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 :");
        int num = sc.nextInt(); //next int 후 줄바꿈 문자가 버퍼에 남아있는 문제
        System.out.print("문자 :");
        sc.nextLine(); //선 입력으로 인해 버퍼로 남은 줄바꿈 문자 제거하는 버퍼
        //이후 nextLine 사용시 빈 버퍼에 사용자 입력 가능
        String word = sc.next(); //next시 문자 반환 가능
        //nextLine 외 타 함수로 scan 2회 진행시 뒷 문장 입력 씹히는 문제
        //Scanner 통한 input시 첫 input 줄바꿈 영향으로 문자 값 입력 x

        System.out.println(num);
        System.out.println(word);

//        String a = sc.nextLine(); --> 선 입력 nextLine
//        String b = sc.next(); --> 에러 x
        
        //int a = sc.nextInt(); --> 두 입력의 형식 동일
        //int b = sc.nextInt(); --> 에러 x

    }
}
