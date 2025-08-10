package designpatterns.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        RideMatchingService service = new RideMatchingService(new AirportQueueStrategy());
        service.matchRider("nsp");
    }
}
