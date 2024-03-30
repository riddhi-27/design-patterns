
public class Demo {

    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel();

        YoutubeSubscriber ram = new YoutubeSubscriber("Ram");

        channel.subscribe(ram);

        YoutubeSubscriber harry = new YoutubeSubscriber("Harry");

        channel.subscribe(harry);

        channel.newVideoUploaded();

    }

}