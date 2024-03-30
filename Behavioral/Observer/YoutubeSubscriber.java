
public class YoutubeSubscriber implements Observer {

    String name;

    YoutubeSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified() {
        System.out.println("NOTIFICATION ::::   " + this.name + " new video is uploaded.");
    }

}