package designpatterns.behavioural.state;

public class Main {
    public static void main(String[] args) {
        OrderContext context = new OrderContext();

        System.out.println("Current State: " + context.getCurrentState());

        context.next();
        context.next();
        context.cancel();
        context.next();
        context.cancel();
    }
}
