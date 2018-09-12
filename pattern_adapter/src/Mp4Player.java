public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println(String.format("Playing mp4 file. Name: %s", fileName));
    }
}
