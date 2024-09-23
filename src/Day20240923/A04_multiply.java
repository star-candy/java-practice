package Day20240923;

public class A04_multiply {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %2d  ", i, j, i*j); //2칸 공간 확보 위한 2d
            }
            System.out.println();
        }
    }
}
