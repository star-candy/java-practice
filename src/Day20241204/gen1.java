package Day20241204;

class Box <T>{ //제네릭 클래스
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class gen1 {
    public static void main(String[] args) {
        //Box b= new Box(); //raw type 사용
        //b.getItem(); //Object로 반환 - 형변환 필요

        Box<String> box = new Box<>(); //제네릭 클래스 타입 명시 필요
        box.setItem("홍길동");
        System.out.println(box.getItem());

        Box<Integer> box2 = new Box<>();
        box2.setItem(100);
        System.out.println(box2.getItem());
    }
}
