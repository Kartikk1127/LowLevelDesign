package designpatterns.structural.bridge;

public class MobilePlayer extends VideoPlayer{

    public MobilePlayer(VideoQuality videoQuality) {
        super(videoQuality);
    }

    @Override
    public void play(String title) {
        System.out.println("Mobile Platform: ");
        videoQuality.load(title);
    }
}
