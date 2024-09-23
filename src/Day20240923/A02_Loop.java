package Day20240923;

public class A02_Loop {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i+=2) { //짝수출력
            System.out.println(i);
        }

        for(int i = 0; i <=100; i++) {
            if(i%2 != 0) { //홀수 출력
                System.out.println(i);
            }
        }
    }
}
