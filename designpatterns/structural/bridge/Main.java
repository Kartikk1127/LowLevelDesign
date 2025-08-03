package designpatterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new WebPlayer(new HDQuality());
        videoPlayer.play("title");
    }
}
