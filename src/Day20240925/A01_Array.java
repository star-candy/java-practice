package Day20240925;
//배열 : 동일 타입의 값들이 연속적임 메모리 공간에 저장되어 있는 구조
//타 타입 값들 저장 불가 구조
//new 통한 heap에 동적 할당 : 0으로 자동 초기화
public class A01_Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //선언부에 크기 명시하지 말것 int[10] arr x

        int[] arr1 = {1,2,3,4,5}; //직접 초기화 시 new 자동 부여, 명시 금지

        for(int i = 0; i < arr.length; i++){  //arr.length로 전체 elem 갯수 파악 가능
            System.out.println(arr[i]);
        }
    }
}
