public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDist(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying "+ fileName);
    }

    private void loadFromDist(String fileName){
        System.out.println("Loading "+ fileName);
    }
}
