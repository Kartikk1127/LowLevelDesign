package multithreadingAndConcurrency.producerConsumerProblem;

public class CoffeeMachine {
    private boolean isCoffeeReady = false;

    public synchronized void makeCoffee() throws InterruptedException {
        //while because of spurious wake-ups
        //Java threads can sometimes wake up from wait()
        //without being notified - this is called a spurious wakeup
        while (isCoffeeReady) {
            wait();
        }
        System.out.println("Coffee is being prepared");
        Thread.sleep(1000); //simulate time to make coffee
        isCoffeeReady = true;
        System.out.println("Coffee is ready");
        notify();
    }

    public synchronized void drinkCoffee() throws InterruptedException {
        while (!isCoffeeReady) {
            wait();
        }
        System.out.println("Coffee is being consumed");
        Thread.sleep(1000);
        isCoffeeReady = false;
        System.out.println("Ready for next cup");
        notify();
    }
}
