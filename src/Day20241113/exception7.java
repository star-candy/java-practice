package Day20241113;

class MyException extends Exception { //직접 예외 만든다
    public MyException() {
        System.out.println("내가 만든 예외");
    }
}
public class exception7 {
    public static void main(String[] args) throws MyException { //throws 필요
        int num1 = 19;
        if(num1 != 10) {
            throw new MyException(); //예외 발생시키기, 발생시 exception으로 들어간다.
        }
        System.out.println(num1); //위에서 throw시 도달 x
    }
}
