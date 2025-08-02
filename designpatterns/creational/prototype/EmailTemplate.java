package designpatterns.creational.prototype;

public interface EmailTemplate extends Cloneable{
    EmailTemplate clone();
    void setContent(String content);
    void send(String to );

    String getContent();
}
