package Day20240930;
class 로보트 {
    public String rName;
    public int rSize;
    public 로보트 () { //default constructor
        rName = "로보트";
        rSize = 12;
        System.out.println("로보트명" + rName + "사이즈" + rSize);
    }
    public 로보트 (String name, int size){ //parameterized constructor
        rName = name;
        rSize = size;
        System.out.println("로보트명" + rName + "사이즈" + rSize);
    }
}

public class A02_Class {
    public static void main(String[] args) {
        new 로보트();
        new 로보트("로보트11", 12);
    }
}
