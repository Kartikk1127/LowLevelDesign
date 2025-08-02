package designpatterns.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new IndiaFactory(),"razorpay");
        checkoutService.completeOrder(100.0);
    }
}
