package Day20241021;

class Shape {
    private int w, h;
    public Shape() {
        System.out.println("Shape()1 w,: "+ w);
        System.out.println("Shape()1 h,: "+ h); //기본 초기화 0 출력될 것
    }

    public Shape(int w, int h) {
        this.w = w;
        this.h = h;
        System.out.println("Shape()2 w,: "+ w);
        System.out.println("Shape()2 h,: "+ h);
    }
}

class Box extends Shape {
    private int w, h;
    public Box (int w, int h) {
        super(w, h); //생성자는 상속 안됨, 따라서 super로 부모 생성자 호출, super는 최상단
        this.w = w;
        this.h = -100000;
        System.out.println("Box() w,: "+ this.w);
        System.out.println("Box() h,: "+ this.h); //this 없으면 인자로 제공된 h 출력 될 것
    }
}

public class A01_SubSuperClass {
    public static void main(String args[]) {
        new Box(999, 888);
    }
}

/*
class Box {
    public Box() {
        System.out.println("box 기본 생성자 가로:100, 세로 : 100");
    }
    public Box(int width) {
        //int number , this 상단 위치시 에러 //this 키워드 사용시 생성자 가장 앞에 위치할 것
        System.out.println("box 가로: " + width + " 세로 : 100");
    }

    public Box(int width, int height) {
        this(width);
        System.out.println("box 가로: " + width + " 세로 : " + height);
    }
}



public class A01_SubSuperClass {
        public static void main(String args[]) {
            new Box (50, 25); //this 생성자부터 실행
        }
}
*/