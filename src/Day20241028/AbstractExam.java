package Day20241028;



abstract class Animal { //추상메서드 가진 클래스 = 추상 클래스 인스턴스화 되지 않는다, 한개 이상의 추상 메서드를 보유한다, 추상 관계는 상속에서만 일어난다.
    //추상메서드는 구현되지 않는다. 중괄호 x
   abstract public void eat(); // 추상 메소드, 상속받는 하위 클래스는 무조건 오버라이딩 해야 함
    public void sleep() {System.out.println("잔다");} //일반 메서드는 재정의 필요 없음
    
} 
class Wolf extends Animal {
    @Override
    public void eat() {System.out.println("늑대는 고기를 먹는다");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {System.out.println("개는 사료를 먹는다");
    }
}
public class AbstractExam {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성 불가
        Dog d = new Dog();
        d.eat();
    }
}
