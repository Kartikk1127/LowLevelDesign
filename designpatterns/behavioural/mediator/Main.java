package designpatterns.behavioural.mediator;

public class Main {
    public static void main(String[] args) {
        CollaborativeDocument doc = new CollaborativeDocument();

        User alice = new User("alice",doc);
        User bob = new User("bob",doc);
        User charlie = new User("Charlie",doc);
        doc.join(alice);
        doc.join(bob);
        doc.join(charlie);

        alice.makeChange("Added project title");
        bob.makeChange("Corrected something");
    }
}
