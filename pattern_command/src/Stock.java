/**
 * 객체화된 요청
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+ name +", Quantity " + quantity + " ] boughts");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+ name +", Quantity: "+ quantity + " ] sold");
    }
}
