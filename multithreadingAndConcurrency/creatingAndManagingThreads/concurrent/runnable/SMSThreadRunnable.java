package multithreadingAndConcurrency.creatingAndManagingThreads.concurrent.runnable;

public class SMSThreadRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println("SMS sent using Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
