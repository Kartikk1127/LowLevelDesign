package designpatterns.behavioural.template;

public class EmailNotification extends NotificationSender{
    @Override
    protected String composeMessage(String formattedMessage) {
        return "<html><body><p>" + formattedMessage + "</p></body></html>";
    }

    @Override
    protected void sendMessage(String to, String message) {
        System.out.println("Sending email to " + to + " with content:\n" + message);
    }
}
