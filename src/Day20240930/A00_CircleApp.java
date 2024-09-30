package Day20240930;

// 클래스 변수의 접근 권한 지정 : 캡슐화
// 클래스에서 접근 허용된 메소드 재사용 : 상속
// 동일한 이름의 메소드 재사용 (타입 다름): 오버로딩 - 다형성
// 상속된 메소드를 다시 재정의 : 오버라이딩 - 다형성
// 객체 생성 되면 가장 먼저 실행 - 생성자
// 생성자 오버로딩 가능
// 생성자는 상속이 안됨 -> 생성자 연쇄반응 사용(super)
//class 상속은 1 대 1 원칙 (but n대1이 가능 - interface), 1 class가 여러개 super class 상속은 불가
//추상클래스 추상메서드(인터페이스), -> 내부 코드 없음 객체 개념 정의
class Shape {

    private double area;
    public double getArea() {
        double area = 0;
        return area;

    }
}
class Circle extends Shape {
    @Override
    public double getArea() {
        return 5*5*3.14;
    }
}

class Rectangle extends Shape {

}
public class A00_CircleApp {//public class는 하나의 파일에 하나만 존재해야 함
    public static void main(String[] args) {
        Circle c1 = new Circle();
        //c1.radius = 5;
        c1.getArea();

        Circle c2 = new Circle();
        //c2.radius = 10;
        c2.getArea();
    }
}
