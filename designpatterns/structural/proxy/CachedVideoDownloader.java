package designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

// the proxy layer
public class CachedVideoDownloader implements VideoDownloader{

    private RealVideoDownloader realVideoDownloader;
    private Map<String,String> cache;

    public CachedVideoDownloader() {
        this.realVideoDownloader = new RealVideoDownloader();
        this.cache = new HashMap<>();
    }

    @Override
    public String downloadVideo(String videoUrl) {
        if (cache.containsKey(videoUrl)) {
            System.out.println("Returning the cached video for: " + videoUrl);
            return cache.get(videoUrl);
        }
        System.out.println("Cache miss. Downloading...");
        String video = realVideoDownloader.downloadVideo(videoUrl);
        cache.put(videoUrl,video);
        return video;
    }
}
