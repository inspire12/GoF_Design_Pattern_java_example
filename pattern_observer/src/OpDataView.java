public class OpDataView implements Observer {

    private String st1;
    private int cnt;
    private Subject data;

    public OpDataView(Subject data) {
        this.data = data;
        data.regist(this);
    }

    @Override
    public void update(String st1, int cnt) {
        this.st1 = st1;
        this.cnt = cnt;
        System.out.println("asdf");
        view();
    }
    private void view(){
        System.out.println("change");
    }
}
