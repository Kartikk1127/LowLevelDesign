package multithreadingAndConcurrency.creatingAndManagingThreads.concurrent.runnable;

public class EmailThreadRunnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Email sent using Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
