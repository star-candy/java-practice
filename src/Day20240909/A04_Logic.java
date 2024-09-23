package Day20240909;

public class A04_Logic {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        System.out.println(a > b);
        System.out.println(b == c); //a<b<c연속 사용 불가
        System.out.println((a < b) && (b < c));
        System.out.println(3 & 2); //0011 and 0010
        System.out.println(3 | 2); //0011 or 0010 2진수 비트연산으로 -> return시 10진수
        System.out.println( 3 << 1); //비트연산시 msb는 유지할것
    }
}
