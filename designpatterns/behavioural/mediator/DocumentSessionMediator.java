package designpatterns.behavioural.mediator;

public interface DocumentSessionMediator {
    void broadcastChange(String change, User sender);
    void join(User user);
}
