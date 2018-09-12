/**
 * Mediator Pattern 는 의사소통의 복잡함을 줄여주는 역할을 한다.
 * 요청이 왔을 때 static으로 선언된 Mediator의 함수가 연결 역할을 해줌
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert");
    }
}
