package multithreadingAndConcurrency.creatingAndManagingThreads.sequential;

// This is an example of sequential programming which could have been done concurrently since sending sms, email or calculating eta are independent of each other.

public class OrderService {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("Placing an order....");
        sendSMS();
        System.out.println("task 1 done");
        sendEmail();
        System.out.println("task 2 done");
        String eta = calculateETA();
        System.out.println("Order Placed. ETA: " + eta);
        System.out.println("task 3 done");
        System.out.println("Total time taken: " + (System.currentTimeMillis() - start));
    }

    private static void sendSMS() {
        try {
            Thread.sleep(2000); // simulate delay
            System.out.println("SMS sent");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void sendEmail() {
        try {
            Thread.sleep(3000); // simulate delay
            System.out.println("Email sent");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static String calculateETA() {
        try {
            Thread.sleep(5000); // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "25 minutes";
    }

}
