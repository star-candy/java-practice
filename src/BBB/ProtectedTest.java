package BBB;

import AAA.DefaultAccess;

public class ProtectedTest { //메인 메서드

    public int a = 10;
    protected int b = 20;
    public static void main(String[] args) {
        //객체 생성
        DefaultAccess df = new DefaultAccess();
        df.size = 10000;
        //df.name = "로보트"; //private이므로 접근 불가
        //df.grade = 4.5; //protected이므로 접근 불가, 타 패키지, 상속 x
    }
}
