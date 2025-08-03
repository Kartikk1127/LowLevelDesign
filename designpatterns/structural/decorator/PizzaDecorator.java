package designpatterns.structural.decorator;

// Decorator abstract class
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza; //HAS-A relationship

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
