package designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new CachedVideoDownloader();
        VideoDownloader videoDownloader2 = new CachedVideoDownloader();
        videoDownloader.downloadVideo("download the video");

        videoDownloader2.downloadVideo("download the video");
    }
}
