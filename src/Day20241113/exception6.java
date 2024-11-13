package Day20241113;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception6 {
    public static void main(String[] args) throws NumberFormatException, FileNotFoundException { //2개 한번에 회피 가능
        int num = Integer.parseInt("111"); //숫자 잘못 읽을 가능성
        FileReader fr = new FileReader("C:\\sample\\write.txt"); //파일 없을 가능성 (2개 처리)
    }
}
