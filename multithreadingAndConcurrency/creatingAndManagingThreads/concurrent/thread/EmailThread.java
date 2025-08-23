package multithreadingAndConcurrency.creatingAndManagingThreads.concurrent.thread;

public class EmailThread extends Thread{
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Email sent using Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

