package solid.lsp;

class Notification {
    public void sendNotification(String medium) {
        System.out.println("Notification sent via " + medium);
    }
}

class TextNotification extends Notification {

    @Override
    public void sendNotification(String medium) {
        super.sendNotification(medium);
    }
}

public class Main {
    public static void main(String[] args) {
        Notification notification = new TextNotification();
        notification.sendNotification("Text");
    }
}