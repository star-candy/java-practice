package Day20241021;

public class HandPhone extends Phone {
    private int price;
    public HandPhone(int price, String color) {
        super(price, color); //상위 클래스의 생성자를 부르는 것 상속 되는것이 아니다
        this.price = price;
        System.out.println(this.price + "분홍");
    }

    public static void main(String[] args) {
        new HandPhone(1000000, "black");
    }
}
