package designpatterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        EmailTemplate welcomeEmail = EmailRegistry.getTemplate("welcome");
        welcomeEmail.setContent("type-1");

        System.out.println(welcomeEmail.getContent());

        EmailTemplate welcomeEmail2 = EmailRegistry.getTemplate("welcome");
        welcomeEmail2.setContent("type-2");

        System.out.println(welcomeEmail.getContent());
        System.out.println(welcomeEmail2.getContent());
    }
}
