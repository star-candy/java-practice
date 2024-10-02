package Day20241002;
//접근지정자 : public, protected, default(기본), private

class Access01 {
    public int number;
    private int grade; //본인 class만 접근 가능 상속시에도 사용 불가
    
    
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) { //public 메서드로서 접근 가능
        this.grade = grade;
    }
}

class Test {
    public Test() {
        Access01 a1 = new Access01(); //같은 패키지 내에서는 접근 가능
        a1.number = 10; //public 지정자로서 외부 접근 가능
        a1.setGrade(10);
        System.out.println(a1.getGrade());
    }
}
public class A01_Access {
    public static void main(String[] args) {
      Test test = new Test();
    }
}
