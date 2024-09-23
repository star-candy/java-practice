package Day20240909;

public class A03_Casting {
    public static void main(String[] args) {
        //자동 형변환 예시
        double area = 5*5*3.14; //정수 곱 실수 시 더 큰 타입인 실수에 따름 -> 실수 타입으로
        //강제 형 변환
        double val = 2.5;
        //int k = val; type dismatch error 발생
        int k = (int)val; //강제 형변환 가능
    }
}
