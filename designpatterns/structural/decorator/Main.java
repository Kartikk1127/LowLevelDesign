package designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Olives(new ExtraCheese(new MargheritaPizza()));
        System.out.println(pizza.getCost());
    }
}
