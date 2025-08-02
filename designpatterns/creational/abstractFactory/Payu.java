package designpatterns.creational.abstractFactory;

public class Payu implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing INR payment via PayU: INR " + amount);
    }
}
