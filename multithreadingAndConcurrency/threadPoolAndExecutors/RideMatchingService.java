package multithreadingAndConcurrency.threadPoolAndExecutors;

// This is a very bad pratice where you tend to manually create a new thread for every ride requested. Will lead to system crash at scale.
public class RideMatchingService {
    public void matchRide(String riderId) {
        Thread thread = new Thread(() -> {
            System.out.println("Matching rider " + riderId + " to a driver on Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Ride matched for rider : " + riderId);
        });
        thread.start();
    }
}
