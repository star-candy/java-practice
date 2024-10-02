package Day20241002;
//상속 : 변수 상속(설계상 안함), 메소드 상속, 생성자(상속안됨)
public class A01_inherited {
    public static void main(String[] args) {
        YYY y = new YYY();
        System.out.println(y.a); //가능
    }
}
class XXX { //final class시 상속 불가
    protected int a = 100;
    public void method() {
        System.out.println("XXX method");
    }
    final public void notOverride() { //final로 선언된 메서드는 오버라이딩 불가
        System.out.println("notOverride");
    }
}
class YYY extends XXX {
    @Override
    public void method() {
        System.out.println("YYY method");
    }
    //public void notOverride() {} final로 선언된 메서드는 오버라이딩 불가
}


