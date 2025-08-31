package multithreadingAndConcurrency.deadlockAndPrevention.deadlock;

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount accountA = new BankAccount("Account-A", 1000);
        BankAccount accountB = new BankAccount("Account-B", 1000);

        Thread t1 = new Thread(new TransferTask(accountA,accountB,100), "T1");
        Thread t2 = new Thread(new TransferTask(accountB,accountA,200), "T2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Task finished");
    }
}
