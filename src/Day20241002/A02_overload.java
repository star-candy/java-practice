package Day20241002;

public class A02_overload {
    //오버로드 예제 생성
    //메서드명 동일 파라미터만 차이 = 오버로딩
    //타입, 개수가 달라야함, 변수명 차이는 의미 없음
    public void add(int a, int b) {
        System.out.println("int형 덧셈 : " + (a + b));
    }
    public void add(double a, double b) {
        System.out.println("double형 덧셈 : " + (a + b));
    }
    public void add(String a, String b) {
        System.out.println("String형 덧셈 : " + (a + b));
    }
    public void add(int a, int b, int c) {
        System.out.println("int형 덧셈 : " + (a + b + c));
    }
}
