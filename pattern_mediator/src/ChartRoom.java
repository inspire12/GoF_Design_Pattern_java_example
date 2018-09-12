import java.util.Date;

/**
 * mediator
 * mediator 객체에서 알아서 필요한 객체에 전달하는 프로세스를 만들어놓고 요청이 오면 처리, 사용자는 내부를 모름
 */
public class ChartRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + "[" + user.getName() + "] " + message );
    }
}
