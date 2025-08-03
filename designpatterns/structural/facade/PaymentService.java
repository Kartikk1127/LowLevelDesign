package designpatterns.structural.facade;

public class PaymentService {
    public void makePayment(String accountId, double amount) {
        System.out.println("Payment done: Account Id: " + accountId + " Amount: " + amount);
    }
}
