package AAA;

class test1 {
    int a;
    int b;
    test1(int aa, int bb) {
        a = aa;
        b = bb;
    }
}
class test2 extends test1 {
    test2(int aa, int bb) {
        super(aa, bb);
    }
}

class testMain {
    public static void main(String[] args) {
        test2 t = new test2(10, 20);
    }
}