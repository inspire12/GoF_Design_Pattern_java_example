import java.util.ArrayList;

public class DataInfo implements Subject {

    private ArrayList<Observer> obs;
    private String st1;
    private int cnt;

    public DataInfo() {
        obs = new ArrayList<Observer>();
    }

    public void setData(String st1, int cnt){
        this.st1 = st1;
        this.cnt = cnt;
        noti();
    }

    @Override
    public void regist(Observer o) {
        obs.add(o);
    }

    @Override
    public void remove(Observer o) {
        if(obs.indexOf(o) > 0){
            obs.remove(o);
        }
    }

    @Override
    public void noti() {
        for(Observer o : obs){
            o.update(st1, cnt);
        }
    }
}
