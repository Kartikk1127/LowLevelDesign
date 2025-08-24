package multithreadingAndConcurrency.threadPoolAndExecutors;

public class Main {
    public static void main(String[] args) {
        RideMatchingService rs1 = new RideMatchingService();
        RideMatchingService rs2 = new RideMatchingService();
        rs1.matchRide("Kartikey");
        System.out.println("task1 running");
        rs2.matchRide("Suyash");
        System.out.println("task2 running");
    }
}
