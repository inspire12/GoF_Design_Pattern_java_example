/*
* 객체의 State를 저장하고 있다.
*
* */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
    public String getState(){
        return state;
    }
}
