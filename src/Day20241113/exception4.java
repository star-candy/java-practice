package Day20241113;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception4 {
    public static void fileAccess() throws FileNotFoundException { //파일은 무조건 예외처리 필요 but throws로 예외 처리 회피, 해당 메서드 사용하는 곳에서 처리될 것
        FileReader fr = new FileReader("C:\\sample\\write.txt"); //파일 처리 관련은 예외 처리 필수
    }
    public static void main(String[] args) {
        try {
            fileAccess(); //예외 발생 지점, 사용하는 main이 예외처리 해야한다. (회피 or 처리)
        } catch (FileNotFoundException e) {
            System.out.println("파일 없음");
            e.printStackTrace(); //에러 내용 출력
        }
        
    }
}
