package multithreadingAndConcurrency.producerConsumerProblem;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

        Thread producer = new Thread(() -> {
            while (true) {
                try {
                    machine.makeCoffee();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while(true) {
                try {
                    machine.drinkCoffee();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
