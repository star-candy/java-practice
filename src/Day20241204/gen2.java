package Day20241204;

import java.util.ArrayList;

public class gen2 {
    public static void main(String[] args) {
        /*ArrayList list  = new ArrayList(); //제네릭 명시 x 시 다양 값 저장 가능
        
        list.add("홍길동");
        list.add(100);

        System.out.println(list.get(0)); //타입 인식 어떻게? 해결 -> 제네릭
        System.out.println(list.get(1));*/
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("java");
        list.add("language");
        //list.add(100); //컴파일 에러
        System.out.println(list); //전체 출력
        
    }
}
