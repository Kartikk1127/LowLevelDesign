package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Individual products
        CartItem book = new Product("Atomic Habits",499);
        CartItem phone = new Product("iphone 15",79999);
        CartItem earbuds = new Product("Airpods",15999);
        CartItem charger = new Product("20W Charger",1999);

        // combo deal
        ProductBundle iphoneCombo = new ProductBundle("iphone essentials combo");
        iphoneCombo.addItem(phone);
        iphoneCombo.addItem(earbuds);
        iphoneCombo.addItem(charger);

        // back to school kit
        ProductBundle schoolKit = new ProductBundle("Back to school kit");
        schoolKit.addItem(new Product("Notebook Pack", 249));
        schoolKit.addItem(new Product("Pen set", 99));
        schoolKit.addItem(new Product("Highlighter", 149));

        //add everything to cart
        List<CartItem> cart = new ArrayList<>();
        cart.add(book);
        cart.add(iphoneCombo);
        cart.add(schoolKit);

        //display cart
        System.out.println("Your amazon cart");
        double total = 0;
        for (CartItem item : cart) {
            item.display(" ");
            total += item.getPrice();
        }
        System.out.println("Total : INR " + total);
    }
}
