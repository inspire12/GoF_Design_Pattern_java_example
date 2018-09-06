public class ChocolateTopping extends Topping{
    public ChocolateTopping(Cookie cookie) {
        super(cookie);
    }

    @Override
    public String getName() {
        return "초코맛 " + cookie.getName() ;
    }
}
