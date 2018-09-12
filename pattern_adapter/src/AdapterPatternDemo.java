public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "bey.mp3");
        audioPlayer.play("mp3", "bey.mp3");
        audioPlayer.play("vlc", "bey.vlc");
        audioPlayer.play("avi", "bey.mp3");

    }
}
