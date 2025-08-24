package multithreadingAndConcurrency.threadPoolAndExecutors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Integer> future = service.submit(() -> {
            Thread.sleep(2000);
            return 42;
        });

        System.out.println("Doing other work");
        Integer result = future.get();
        System.out.println("Result: " + result);
        service.shutdown();
    }
}
