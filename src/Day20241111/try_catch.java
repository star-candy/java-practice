package Day20241111;

public class try_catch {
    public static void main(String[] args) {
        int x= 10;
        int y = 0;
        try {
            int sum = x / y;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("아무튼 실행됨");
        }
        
    }
}
