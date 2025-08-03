package designpatterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        CheckoutService service = new CheckoutService(new PayUGateway());
        service.checkout("12",190);
    }
}
