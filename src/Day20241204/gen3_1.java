package Day20241204;

public class gen3_1 {
    public static void printNum(int[] n){
        for(int i : n){
            System.out.println(i);
        }
    }
    public static void printStr(String[] s){
        for (String i : s){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"one", "two", "three", "four", "five"};

        printNum(intArray); //제네릭 x시 개별 메서드 필요 문제
        printStr(strArray);
    }
}
