package Day20241002;

class qwer {
    public qwer () {
        System.out.println("qwer 생성자 호출");
    }
}
class asdf extends qwer{
    public asdf () {
        System.out.println("asdf 생성자 호출");
    }

}
class zxcv extends asdf {
    public zxcv () {
        System.out.println("zxcv 생성자 호출");
    }
}
public class Constr {
    public static void main(String[] args) {
        new zxcv();
    }
}

