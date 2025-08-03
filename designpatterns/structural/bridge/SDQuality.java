package designpatterns.structural.bridge;

public class SDQuality implements VideoQuality{
    @Override
    public void load(String title) {
        System.out.println("Streaming " + title + " in SD Quality");
    }
}
