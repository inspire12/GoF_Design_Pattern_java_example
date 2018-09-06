public class Wheel {
    private String name;

    public Wheel(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void accept(CarElementVisitor visitor){
        visitor.visit(this);
    }
}

class Engine implements CarElement{
    public void accept(CarElementVisitor visitor){
        visitor.visit(this);
    }
}

class