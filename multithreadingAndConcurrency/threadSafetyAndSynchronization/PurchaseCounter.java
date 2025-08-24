package multithreadingAndConcurrency.threadSafetyAndSynchronization;

public class PurchaseCounter {
    private int count = 0;

    // isn't thread safe
//    public void increment() {
//        // read, increment, write
//        count++; // not thread safe
//    }

    // thread safe
    public synchronized void increment() {
        // read, increment, write
        count++; // not thread safe
    }

    public int getCount() {
        return count;
    }
}

