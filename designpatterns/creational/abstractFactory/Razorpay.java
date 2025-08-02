package designpatterns.creational.abstractFactory;

public class Razorpay implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing INR payment via Razorpay: INR " + amount);
    }
}
