package Day20241021;

public class Phone {
    private int price;
    private String color;
    private String company;

    public Phone(int price, String color) {
        this.price = price;
        this.color = color;
        System.out.println("가격 : " + this.price + " 색상 : " + this.color);
    }

    public Phone(int price, String color, String company) {
        this.price = price;
        this.color = color;
        this.company = company;
        System.out.println("가격 : " + this.price + " 색상 : " + this.color + " 제조사 : " + this.company);
    }
}



