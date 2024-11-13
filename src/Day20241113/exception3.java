package Day20241113;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exception3 {
    public static void main(String[] args) throws IOException /*throws FileNotFoundException*/ { //throws 사용시 try-catch 필요 없음, 상위로 에러를 던진다.
        FileReader fr = null;
        try{
            fr = new FileReader("C:\\sample\\write.txt"); //파일 처리 관련은 예외 처리 필수, 파일 사용 후 무조건 닫는다.
        } catch (FileNotFoundException e) {
            System.out.println("파일 없음");
            e.printStackTrace(); //에러 내용 출력
        } finally {
            fr.close(); //finally는 무조건 실행되는 블록, 파일 닫기 ,close는 IOException을 던진다.
        }

    }
}
