package Day20241111;
import java.io.*;
public class inputStreamReaderTest {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null; //파일에 넣게 위함
        try{
            fin = new FileInputStream("C:\\sample\\han.txt");  //파일 경로관련 정보 가져옴
            in = new InputStreamReader(fin, "UTF-8"); //파일 내용 읽기 위해 fileInputStream을 inputStreamReader로 래핑
            //기본 인코딩 방식 utf-8 생략 가능

            int c;
            while((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            in.close();
            fin.close(); //연 스트림은 다 닫는다
            


        } catch (IOException e) {
            System.out.println("예외 발생");
        }
    }
}
