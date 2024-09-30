package Day20240930;

class 로봇 {
    public String robotName;
    public void attack() {
        System.out.println("특수 공격을 한다.");
    }
    public void flying() {
        System.out.println("로보트가 엔진으로 난다.");
    }
}

class 태권브이 extends 로봇 {
    @Override
    public void attack() {
        System.out.println("태권기사 동일하게 움직임!");
        System.out.println("뒤돌려차기");
    }
}

class 마징가 extends 로봇 {
    @Override
    public void attack() { //없으면 태권브이의 attack()을 사용한다.
        System.out.println("주먹이 발사됨");
    }
}

public class A01_Class { //하나의 파일에 public은 하나만 존재한다.
    public static void main(String[] args) {
        태권브이 t1 = new 태권브이();
        t1.robotName = "태권브이";
        t1.attack();
        t1.flying();
    }
}
