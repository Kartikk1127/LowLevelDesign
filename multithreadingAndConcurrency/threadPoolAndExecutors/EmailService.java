package multithreadingAndConcurrency.threadPoolAndExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmailService {
    private static final ExecutorService executor = Executors.newFixedThreadPool(10);

    public void sendEmail(String recipient) {
        executor.execute(() -> {
            System.out.println("Sending email to " + recipient + " on" + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Email sent to " + recipient);
        });
    }

    public static void main(String[] args) {
        EmailService service = new EmailService();
        for (int i = 1; i <= 25; i ++) {
            service.sendEmail("user" + i);
        }
        executor.shutdown(); // if you don't shut down, the program will continue to run
    }
}