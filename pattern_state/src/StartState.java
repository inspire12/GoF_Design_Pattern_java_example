public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this); // state 변경
    }
    public String toString(){
        return "Start State";
    }
}
