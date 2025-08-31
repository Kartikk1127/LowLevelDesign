package multithreadingAndConcurrency.deadlockAndPrevention.deadlock;

public class TransferTask implements Runnable {
    private final BankAccount from;
    private final BankAccount to;
    private final int amount;

    public TransferTask(BankAccount from, BankAccount to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        synchronized (from) {
            // both points below happen parallelly when we do thread.start()
            //1. T1 will take lock on "from(A)" Account
            //2. T2 will take a lock on "from(B)" Account
            System.out.println(Thread.currentThread().getName() + " locked " + from.getName() );

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            synchronized (to) { //T1 will try to take lock from to(B) //T2 will try to take lock from to(A)
                System.out.println(Thread.currentThread().getName() + " locked " + to.getName());

                from.withdraw(amount);
                to.deposit(amount);
                System.out.println("Transferred " + amount + " from " + from.getName() + " to " + to.getName());
            }
        }
    }
}
