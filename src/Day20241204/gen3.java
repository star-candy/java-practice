package Day20241204;

public class gen3 {
    public static <T> void printArray(T[] arr) { //제네릭 메서드 사용
        for (T t : arr) {
            System.out.println(t);
        }

        for(int i = 0; i < arr.length; i++) { //arr.length는 배열의 길이를 반환하는 메소드
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"one", "two", "three", "four", "five"};
        Float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

        printArray(intArray); //제네릭 사용시 하나의 메서드로 해결 가능
        printArray(strArray);
        printArray(floatArray); //타입 명시 x 사용함
    }
}
