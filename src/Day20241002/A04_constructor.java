package Day20241002;
// 생성자 : 클래스 이름과 동일. but 매개 변수 존재 가능, 리턴 유형 없음 (void 아님)

//생성자 상속 불가(but 생성자 연쇄반응 정리 과제)
//생성자 연쇄반응 정의
//코드를 통해 생성자 연쇄반응 발생하는 결과 출력
public class A04_constructor {
    public A04_constructor() {
        System.out.println("생성자 호출");
    }

    public static void main(String[] args) {
        //생성자 호출
        //클래스명 참조변수 = new 생성자();
        A04_constructor a = new A04_constructor();
    }

}

