package multithreadingAndConcurrency.deadlockAndPrevention.lockOrdering;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Resource r1 = new Resource(101, 500);
        Resource r2 = new Resource(102, 300);

        Runnable task1 = () -> transfer(r1,r2,50);
        Runnable task2 = () -> transfer(r2,r1,30);

        new Thread(task1).start();
        new Thread(task2).start();
    }

    private static void transfer(Resource r1, Resource r2, int amount) {
        Resource[] locks = new Resource[]{r1,r2};
        Arrays.sort(locks, Comparator.comparingInt(x -> x.id));

        synchronized (locks[0]) {
            System.out.println(Thread.currentThread().getName() + " locked " + r1.id);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {

            }
            synchronized (locks[1]) {
                System.out.println(Thread.currentThread().getName() + " locked " + r2.id);
                System.out.println("Transferred " + amount + " from " + r1.id + " to " + r2.id);
            }
        }
    }

}
