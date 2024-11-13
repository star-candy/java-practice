package Day20241113;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exception5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        try{
            int num = Integer.parseInt("111"); //숫자 잘못 읽을 가능성
            fr = new FileReader("C:\\sample\\write.txt"); //파일 없을 가능성 (2개 처리), 파일 썼으면 무조건 닫는다.
        } catch(NumberFormatException e) {
            System.out.println("숫자 변환 오류");
        } catch(FileNotFoundException e) {
            System.out.println("파일 없음");
        } catch(Exception e) { //예외를 한번에 처리하는 방식
            System.out.println("예외 발생"); //혼자 사용시 2개 다 잡힌다.
            e.printStackTrace();
        } finally {  //finally는 무조건 실행되는 블록, 파일 닫기 ,close는 IOException을 던진다.
            fr.close(); //여기서 사용되면 catch가 안되네, throws 할것
        }
    }
}
