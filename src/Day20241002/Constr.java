package Day20241002;

class qwer {
    int qqq;
    public qwer () {
        System.out.println("qwer 생성자 호출");
    }
}
class asdf extends qwer{
    int aaa;
    public asdf () {
        super(); //상위 기본 생성자의 명시적 선언
        System.out.println("asdf 생성자 호출");
    }

}
class zxcv extends asdf {
    int zzz;
    public zxcv () {
        super();//상위 기본 생성자의 명시적 선언
        System.out.println("zxcv 생성자 호출");
    }
}
public class Constr {
    public static void main(String[] args) {
        zxcv test = new zxcv();
        System.out.println("zxcv = " + test.zzz);
        System.out.println("asdf = " + test.aaa);
        System.out.println("qwer = " + test.qqq);
    }
}

