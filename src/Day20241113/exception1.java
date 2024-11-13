package Day20241113;

public class exception1 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc"); //파싱 불가 문자 사용시
            System.out.println(num + 10);
        } catch (NumberFormatException e) { //귀찮으면 Exception e
            System.out.println("숫자 변환 오류");
        }

    }
}
