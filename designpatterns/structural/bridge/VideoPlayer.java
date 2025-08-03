package designpatterns.structural.bridge;

abstract class VideoPlayer {
    protected VideoQuality videoQuality;

    public VideoPlayer(VideoQuality videoQuality) {
        this.videoQuality = videoQuality;
    }

    public abstract void play(String title);
}
