package Day20240923;

public class A03_Loop {
    public static void main(String[] args) {

        char ch = 'A';
        do{
            System.out.print(ch);
            ch = (char) (ch + 1); //정수 to char로 명시적 형변환
        } while(ch <= 'Z'); //대문자까지 무한 반복
        System.out.println();

        int qw = 65; //char은 내부적으로 아스키 코드 적용
        do{
            System.out.print((char)qw);
            qw = qw + 1; //정수 to char로 명시적 형변환
        } while(qw <= 90); //대문자까지 무한 반복 90 == Z 아스키 값
        System.out.println();

        for(int i = 65; i <=90; i++) {
            System.out.print((char)i);
        }
    }
}
