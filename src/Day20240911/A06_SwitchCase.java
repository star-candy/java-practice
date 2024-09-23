package Day20240911;

public class A06_SwitchCase {
    public static void main(String[] args) {
        do {
            System.out.println("1. 2. 3. 4.");
            int food = 3; //if 문자 입력 원한다면 char food = sc.next().charAt(0)
            switch (food) {
                case 1: //case 뒤 세미콜론 아님
                    System.out.println("라면");
                    break; //break 구조와 함께 구현
                case 2:
                case 6: //중첩 사용 가능
                    System.out.println("밥");
                    break;
                case 3:
                    System.out.println("물");
                    break;
                case 4:
                    System.exit(1); //프로그램 강제 종료, return과 유사
                default:
                    System.out.println("아무거나");
            }

        }while (true);
    }
}
