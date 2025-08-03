package designpatterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        for (int i = 0; i < 10000; i ++) {
            forest.plantTree(i,i,"Oak","Green","Rough");
        }

        forest.draw();
    }
}
