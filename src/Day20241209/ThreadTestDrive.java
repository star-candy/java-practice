package Day20241209;
class MyRunnable implements Runnable { 
    public void run() { //thread 1
        go();
    }
    public void go() {
        doMore();
    }
    public void doMore() {
        System.out.println("top on the stack");//thread 순서 보장 불가 os의해 관리됨 ->스레드 불확정성
    }
}
public class ThreadTestDrive {
    public static void main(String[] args) { //main도 스레드임
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start(); //스레드 2개
        System.out.println("back in main"); 
    }
}
