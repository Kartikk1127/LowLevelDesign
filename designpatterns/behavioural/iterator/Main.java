package designpatterns.behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        YoutubePlaylist playlist = new YoutubePlaylist();
        playlist.addVideo(new Video("LLD"));
        playlist.addVideo(new Video("System Design"));
        PlaylistIterator iterator = playlist.createIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }
}
