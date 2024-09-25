package Day20240925;

public class A02_Array {
    public static void main(String[] args) { //args = {'10', '20'}시
        int a = Integer.parseInt("123"); //string to int, double... 등 가능
        double b = Double.parseDouble("123.234");
        
        
        int[] num = new int[100];
        int cnt = 1;
        for(int i = 0; i < num.length; i++) {
            num[i] = cnt++;
        }
        int total = 0;
        for(int i = 0; i < num.length; i++) {
            total += num[i];
        }
        System.out.println(total);

        for(int i = 0; i < num.length; i++) {//짝수 출력
            if(num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }

        for(int i = 0; i < num.length; i++) {//홀수 출력 continue
            if(num[i] % 2 == 0) {
                continue;
            }
            System.out.println(num[i]);
        }


        

    }
}
