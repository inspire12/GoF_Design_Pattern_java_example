/**
 * 구현부
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("cricket init");
    }

    @Override
    void startPlay() {
        System.out.println("cricket start");
    }

    @Override
    void endPlay() {
        System.out.println("cricket end");
    }
}
