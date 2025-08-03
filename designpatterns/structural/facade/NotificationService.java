package designpatterns.structural.facade;

public class NotificationService {
    public void sendNotification(String userEmail) {
        System.out.println("Booking confirmation sent to " + userEmail);
    }
}
