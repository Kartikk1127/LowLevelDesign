package designpatterns.structural.bridge;

public class UltraHDQuality implements VideoQuality{
    @Override
    public void load(String title) {
        System.out.println("Streaming " + title + " in 4k Ultra HD Quality");
    }
}
