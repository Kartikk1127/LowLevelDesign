package multithreadingAndConcurrency.creatingAndManagingThreads.concurrent.runnable;

import java.util.concurrent.Callable;

public class ETACalculator implements Callable<String> {
    private final String location;

    public ETACalculator(String location) {
        this.location = location;
    }
    @Override
    public String call() throws Exception {
        System.out.println("ETA calculated using Thread: " + Thread.currentThread().getName());
        Thread.sleep(3000);
        return "ETA to " + location + ": 20 minutes";
    }
}
