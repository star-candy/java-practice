package Day20241021;

class Moon{
    String fname;
    public Moon(String name) {
        this.fname = name;
        System.out.println("moon : " + this.fname);
    }
}

class SeokJae extends Moon{
    String mname, ename;
    public SeokJae(String f, String m, String e) {
        super(f);
        mname = m;
        ename = e;
        System.out.println("Mname :" + m + " Ename :" + e);
    }
}

public class A02_subSuperClass2 {
    public static void main(String[] args) {
        new SeokJae("문", "석", "재");
    }
}
