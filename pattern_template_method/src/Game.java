public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    /**
     * 세분화
     */
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
