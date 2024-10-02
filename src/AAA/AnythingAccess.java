package AAA;

public class AnythingAccess {
    public static void main(String[] args) {
      
        DefaultAccess df = new DefaultAccess();
        df.size = 10000;
        //df.name = "로보트"; //private이므로 접근 불가
        df.grade = 4.5; //protected이므로 동일 패키지 접근 가능
    }
}
