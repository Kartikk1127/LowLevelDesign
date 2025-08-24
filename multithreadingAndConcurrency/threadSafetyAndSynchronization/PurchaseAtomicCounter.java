package multithreadingAndConcurrency.threadSafetyAndSynchronization;

import java.util.concurrent.atomic.AtomicInteger;

public class PurchaseAtomicCounter {
    private AtomicInteger likes = new AtomicInteger(0);

    public void incrementLikes() {
        int prev, next;
        do {
            prev = likes.get();
            next = prev + 1;
        } while (!likes.compareAndSet(prev,next));
    }

    public int getCount() {
        return likes.get();
    }
}
