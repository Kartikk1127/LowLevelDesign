package designpatterns.behavioural.template;

abstract class NotificationSender {
    public final void send(String to, String rawMessage) {
        rateLimitCheck(to);
        validateRecipient(to);
        String formatted = formatMessage(rawMessage);
        preSendAuditLog(to, formatted);
        String composedMessage = composeMessage(formatted);
        sendMessage(to, composedMessage);
        postSendAnalytics(to);
    }

    private void rateLimitCheck(String to) {
        System.out.println("Checking rate limits for: " + to);
    }

    private void validateRecipient(String to) {
        System.out.println("Validating recipient: " + to);
    }

    private String formatMessage(String rawMessage) {
        return rawMessage.trim();
    }

    private void preSendAuditLog(String to, String message) {
        System.out.println("Logging before send: " + message + " to " + to);
    }

    protected abstract String composeMessage(String formattedMessage);

    protected abstract void sendMessage(String to, String message);

    protected void postSendAnalytics(String to) {
        System.out.println("Analytics updated for : " + to);
    }
}
