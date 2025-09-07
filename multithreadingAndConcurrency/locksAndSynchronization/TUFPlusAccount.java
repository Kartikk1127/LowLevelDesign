package multithreadingAndConcurrency.locksAndSynchronization;

import java.util.concurrent.Semaphore;

public class TUFPlusAccount {
    private final Semaphore deviceSlots;
    public TUFPlusAccount (int maxDevices) {
        this.deviceSlots = new Semaphore(maxDevices);
    }

    public boolean login(String user) throws InterruptedException {
        System.out.println(user + " trying to login");

        if (deviceSlots.tryAcquire()) {
            System.out.println(user + " successfully logged in");
            return true;
        } else {
            System.out.println("too many devices");
            return false;
        }
    }

    public void logout(String user) {
        System.out.println(user + " logging out");
        deviceSlots.release();
    }
}
