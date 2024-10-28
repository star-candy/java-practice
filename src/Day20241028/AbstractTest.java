package Day20241028;

abstract class 중간고사 {
    public void 문제1() {System.out.println("문제1 정답");}
    public void 문제2() {System.out.println("문제2 정답");}
    public void 문제3() {System.out.println("문제3 정답");}
    abstract void 문제4();
}
class S1 extends 중간고사 {
    @Override
    void 문제4() {System.out.println("문제4 정답");}
}

public class AbstractTest {
    public static void main(String[] args) {

    }
}
