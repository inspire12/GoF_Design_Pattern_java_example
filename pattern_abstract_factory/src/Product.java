public abstract class Product {
    public abstract String getName();
    public abstract int getPrice();

    @Override
    public String toString() {
        return String.format("Product : %s, Price : %s", getName(), getPrice());
    }
}
