package BBB;
import java.util.*;
public class ProtectedTest { //메인 메서드

    public static void main(String[] args) {
        Stack<Integer> si = new Stack<>();
        si.add(1);
        si.add(2);
        si.add(1, 100);

        si.forEach(e -> System.out.print(e + " "));
    }

}
