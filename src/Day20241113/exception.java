package Day20241113;

//예외처리 : 프로그램 실행 중에 발생하는 예외를 처리하는 것
//0 나누기, 배열 인덱스 접근 오류, db 연동, 파일 없는 경우, 네트워크 연결 오류, 서버 정지 등 상황에서 예외 throw
//throw 예외 잡아서 catch에서 처리한다.
public class exception {
    public static void main(String[] args) {
        //index 접근 예외처리
        int[] ary = {1, 2, 3, 4, 5, 6};
        
        try {
            for (int i = 0; i <= 6; i++) { //6접근 불가
                System.out.println(ary[i]); //index 접근 에러 - 컴파일 타임 검사 x, 런타임 에러
            }
        } catch (ArrayIndexOutOfBoundsException e) { //1~ 6 내용 출력, 6 index 접근 시 catch됨
            //catch 내용 귀찮으면 최상위 예외 Exception 사용가능
            System.out.println("배열 인덱스 접근 오류");
        }

    }

}
