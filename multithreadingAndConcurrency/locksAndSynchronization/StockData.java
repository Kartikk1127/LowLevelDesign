package multithreadingAndConcurrency.locksAndSynchronization;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class StockData {
    private double price = 100.0;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    // this lock when acquired blocks all users from reading/writing anything. Means when admin updates the stock prices, no readers can trade.
    public void updatePrice(double newPrice) {
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " updating price to " + newPrice);
            price = newPrice;
        } finally {
             lock.writeLock().unlock();
        }
    }

    // this lock when acquired, write operations cannot be performed but won't block the reader threads.
    public void readPrice() {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " read price: " + price);
        } finally {
            lock.readLock().unlock();
        }
    }
}
