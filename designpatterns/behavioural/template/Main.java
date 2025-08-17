package designpatterns.behavioural.template;

public class Main {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailNotification();
        emailSender.send("john@example.com","Welcome to TUF+! ");

        NotificationSender smsSender = new SMSNotification();
        smsSender.send("1234567890","Your otp is 1234.");
    }
}
