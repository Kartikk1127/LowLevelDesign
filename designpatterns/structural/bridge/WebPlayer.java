package designpatterns.structural.bridge;

public class WebPlayer extends VideoPlayer{
    public WebPlayer(VideoQuality videoQuality) {
        super(videoQuality);
    }

    @Override
    public void play(String title) {
        System.out.println("Web Platform:");
        videoQuality.load(title);
    }
}
