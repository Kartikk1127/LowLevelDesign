package designpatterns.creational.factory;

public class LogisticsFactory {
    public static Logistics getLogistics(String mode) {
        if (mode.equals("Air")) return new Air();
        return new Road();
    }
}
