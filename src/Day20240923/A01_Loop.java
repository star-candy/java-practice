package Day20240923;

import java.util.Scanner;

class A01_Loop {
    public static void main(String[] args) {
        int i;
        for(i = 0; i < 100; i++){
            System.out.println(i);
        }

        System.out.println("i: " + i); //i == 99 후 i++ 된 뒤 100상태에서 조건식 검사함
        //따라서 최종적으로 i는 100이 될 것


        for(;;){break;} // 무한 반복
        while(true) {break;} //무한 반복 - break로 종료
    }
}
