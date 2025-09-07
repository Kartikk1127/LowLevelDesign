package multithreadingAndConcurrency.locksAndSynchronization;

import java.util.concurrent.locks.ReentrantLock;

public class TicketBooking {
    private int availableSeats = 1;
    private final ReentrantLock lock = new ReentrantLock();

    // the below method works just like a synchronized keyword, it's just re-entrant lock with extra features but we haven't used one.
    public void bookTicket(String user) {
        System.out.println(user + " is trying to book...");
        lock.lock();
        try {
            System.out.println(user + " acquired lock");
            if (availableSeats > 0) {
                System.out.println(user + " successfully book the ticket.");
                availableSeats --;
            }
            else {
                System.out.println(user + " could not book the ticket. No seats left.");
            }
        } finally {
            System.out.println(user + " is releasing the lock");
            lock.unlock();
        }
    }
}
