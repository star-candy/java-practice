package Day20241111;

import java.io.*;

public class fileReaderTest { //ascii 는 0~127까지의 문자를 표현, unicode (2byte) 한글 표현 가능 -> 키보드 모든 입력값을 숫자로 표현 가능

    public static void main(String[] args) {
        FileReader fin = null; //파일에 대한 읽기 진행

        try { //파일 없을 가능성에 대한 try-catch 필요
            fin = new FileReader("C:\\sample\\test.txt"); //fileReader(문자 스트림) 사용 or fileInputStream에 inputStreamReader(바이트스트림을 문자 스트림에 래핑) 래핑해서 사용 2중 1
            int c;
        // io 실패에 대한 예외처리 필요
            while((c = fin.read()) != -1) { //ascii or unicode로 읽어들임, 파일 비어있다면 -1 반환됨
                System.out.print(c + ":" + (char)c);  //형변환으로 문자 출력 가능
            }
            fin.close(); //파일 열었으면 닫아야
        } catch (IOException e) {
            System.out.println("파일 입출력 예외 발생");
        }
    }
}