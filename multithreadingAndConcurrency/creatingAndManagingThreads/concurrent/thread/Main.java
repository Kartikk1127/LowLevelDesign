package multithreadingAndConcurrency.creatingAndManagingThreads.concurrent.thread;

// This is the concurrent way to handle the same task.
public class Main {
    public static void main(String[] args) {
        SMSThread smsThread = new SMSThread();
        EmailThread emailThread = new EmailThread();
        System.out.println("Task started");
        smsThread.start();
        System.out.println("Task 1 ongoing");
        emailThread.start();
        System.out.println("Task 2 ongoing");

        try {
            //if you want to perform some further operation you can also wait for the operation to finish
            smsThread.join();
            emailThread.join();
            System.out.println("Task done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
