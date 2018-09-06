public class TestObserver {
    public static void main(String[] args) {

        DataInfo di = new DataInfo();
        OpDataView odv = new OpDataView(di); // 등록
        di.setData("hi", 2);
        di.setData("ka", 4);
    }
}
