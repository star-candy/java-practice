package Day20241209;

//접근, 판단, 인출, 잔고 확인 기능 -> 판단 후 sleep된 뒤 인출할 경우 음수 인출 가능성 있음
class BankAccount { //공유 객체

    private int balance = 50;// 통장의 잔고
    public int getBalance() {
        return this.balance;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }
}

class RyanAndMonica implements Runnable {
    BankAccount account = new BankAccount();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { //10번 인출
            makeWithdrawal(10); // 10만원을 인출하는 메소드
            if (account.getBalance() < 0) {
                System.out.println("잔고가 부족합니다."); //부족시 인출 불가
            }
        }
    }


    public void makeWithdrawal(int amount) {

        // synchronized가 없으면 잔고가 -가 될 수 있어.
        // 단, synchronized가 동시 접근을 막아줘~

        if (account.getBalance() >= amount) {// 잔고가 인출하려는 금액보다 많을 때
            System.out.println(Thread.currentThread().getName() + "의 잔고확인");
            account.withdraw(amount); //요기서 동시 접근 막아줌
            System.out.println(Thread.currentThread().getName() + "가 10만원 인출");
            System.out.println("\n남아있는 잔고는 " + account.getBalance() + "입니다\n");
        } else { //
            System.out.println(Thread.currentThread().getName()
                    + "님 잔고가 부족합니다. ");
        }
    }
}

public class RyanAndMonicaConcurrency {
    public static void main(String[] args) {
        RyanAndMonica job = new RyanAndMonica();
        Thread ryan = new Thread(job);
        Thread monica = new Thread(job);

        ryan.setName("Ryan");
        monica.setName("Monica");

        ryan.start();
        monica.start();
    }
}
/*

 * 상황: 남녀가 데이트 통장을 만들어서 사용, 50만원
 * 조건: 마이너스 통장이 되지 않아야함
 * 문제: 남자가 회식 때문에 돈이 필요해서 ATM을 이용, 10만원 인출
 * 남자 스레드 시작 - ATM으로 10만원 인출하려는데 인출 단계에서 잠깐 전화를 받았어
 * 여자 스레드 시작 - 지로를 통해 남자 돈 못쓰게 하려고 50만원 인출 완료
 * 남자 스레드 - 전화를 끊고 바로 인출 확인을 눌렀어~ 10만원 인출
 * 결과: 통장에 -10만원 발생 -> 판단 후 sleep , 이후 음수 상태에서 인출이 가능할 가능성 있음

 */
