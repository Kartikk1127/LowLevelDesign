package designpatterns.creational.factory;

public class Air implements Logistics{
    @Override
    public void send() {
        System.out.println("Sending by air");
    }
}
