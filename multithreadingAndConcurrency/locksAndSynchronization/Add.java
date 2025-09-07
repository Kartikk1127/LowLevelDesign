package multithreadingAndConcurrency.locksAndSynchronization;

public class Add extends Thread{

    @Override
    public void run () {
        System.out.println("Current Thread" + Thread.currentThread().getName());
    }
}
