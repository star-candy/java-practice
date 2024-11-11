package Day20241111;
import java.io.*;
import java.util.Scanner;

public class fileWriterTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //키보드 입력 스트림 -> 버퍼 -> 파일에 저장
        FileWriter fout = null;
        try {
            //해당 파일이 이미 존재한다면 기존 파일 내용 덮어씀 fileWriter(문자 스트림)
            fout = new FileWriter("C:\\sample\\write.txt"); //파일 없으면 생성됨 or fileOutputStream (바이너리) -> fileWriter(문자)로 래핑하여 사용 가능
            while(true) {
                String line = scan.nextLine(); //문자열 1개 입력
                if(line.length() == 0) break; //입력 없이 엔터시 길이 0 -> 종료

                //write 통해 쓰기 가능
                fout.write(line, 0, line.length()); //입력 문자열, 시작점(like cfo) - 0으로 해야 시작점에서 쓰기 가능, 입력될 길이 ----abc 입력시 길이는 3임
                fout.write("\r\n", 0, 2); //한 줄 skip,  
            }
            fout.close(); //스트림 사용 후 닫아야 함

        } catch (IOException e) {
            System.out.println("예외 발생");
        }
        scan.close(); //scanner도 끝나면 닫아야 함 주의
    }
}
