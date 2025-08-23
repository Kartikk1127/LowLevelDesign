package multithreadingAndConcurrency.creatingAndManagingThreads.concurrent.thread;

public class SMSThread extends Thread{
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println("SMS sent using Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
