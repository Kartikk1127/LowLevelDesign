package designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        BurgerMeal burgerMeal = new BurgerMeal.BurgerBuilder("wheat","veg").build();
    }
}
