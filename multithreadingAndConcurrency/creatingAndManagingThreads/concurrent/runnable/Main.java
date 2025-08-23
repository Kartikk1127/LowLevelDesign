package multithreadingAndConcurrency.creatingAndManagingThreads.concurrent.runnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        SMSThreadRunnable smsThreadRunnable = new SMSThreadRunnable();
        EmailThreadRunnable emailThreadRunnable = new EmailThreadRunnable();

        ETACalculator calculator = new ETACalculator("BLR");
        FutureTask<String> etaThreadRunnable = new FutureTask<>(calculator);
        Thread smsThread = new Thread(smsThreadRunnable);
        Thread emailThread = new Thread(emailThreadRunnable);
        Thread etaThread = new Thread(etaThreadRunnable);
        System.out.println("Task started");
        smsThread.start();
        System.out.println("Task 1 ongoing");
        emailThread.start();
        System.out.println("Task 2 ongoing");
        etaThread.start();
        System.out.println("Task 3 ongoing");

        try {
            smsThread.join();
            emailThread.join();
            String eta = etaThreadRunnable.get();
            System.out.println("ETA is : " + eta);
            System.out.println("Task completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
