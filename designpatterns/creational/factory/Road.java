package designpatterns.creational.factory;

public class Road implements Logistics{
    @Override
    public void send() {
        System.out.println("Sending by road");
    }
}
