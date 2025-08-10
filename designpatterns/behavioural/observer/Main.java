package designpatterns.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel tuf = new YoutubeChannel("TUF");
        tuf.subscribe(new MobileAppSubscriber("raj"));
        tuf.subscribe(new EmailSubscriber("rahul"));
        tuf.uploadVideo("observer-pattern");
    }
}
