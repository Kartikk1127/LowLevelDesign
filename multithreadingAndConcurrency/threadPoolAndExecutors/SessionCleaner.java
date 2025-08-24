package multithreadingAndConcurrency.threadPoolAndExecutors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SessionCleaner {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        Runnable task = () -> System.out.println("Cleaning up expired sessions...");
        service.scheduleAtFixedRate(task,0,5, TimeUnit.SECONDS);
    }
}
