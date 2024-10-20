package singleton;

class Duck {

    private static Duck duckobj = null;

    private Duck() {

        System.out.println("오리 생성자입니다.");

    }

    public static Duck getDuck() {

        if (duckobj == null) {

            duckobj = new Duck();

            return duckobj;

        }

        else { return duckobj;  }

    }

}

public class A04_Static {

    public static void main(String[] args) {

        Duck d = Duck.getDuck();

        Duck x = Duck.getDuck();

        System.out.println(d.hashCode());

        System.out.println(x.hashCode());

    }

}