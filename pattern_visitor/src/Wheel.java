public class Wheel implements CarElement{
    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}

class Engine implements CarElement {
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}

class Body implements CarElement {
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}

class Car implements CarElement {
    CarElement[] elements;

    public CarElement[] getElements() {
        return elements.clone();
    }

    public Car() {
        this.elements = new CarElement[]
                {
                        new Wheel("front left"), new Wheel("front right"),
                        new Wheel("back left"), new Wheel("back right"),
                        new Body(), new Engine()
                };
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        for(CarElement element : this.getElements()){
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}