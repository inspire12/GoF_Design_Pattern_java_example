public class MainClass {
    public static void main(String[] args) {
        BaseShape baseCircleShape= new  CircleShape(1, 2, 30, new Drawing());
        baseCircleShape.draw();

        BaseShape baseRectShape= new  RectShape(1, 2, 30, 40, new Drawing());
        baseRectShape.draw();

    }
}

interface BaseDrawing {
    public void drawCircle(double x, double y, double radius);

    public void drawRect(double x, double y, double width, double height);
}

class Drawing implements BaseDrawing {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("drawCircle %f, %f radius %f\n", x, y, radius);
    }

    @Override
    public void drawRect(double x, double y, double width, double height) {
        System.out.printf("drawRect %f,%f width %f height %f\n", x, y, width, height);
    }
}

abstract class BaseShape {
    protected BaseDrawing baseDrawing;

    protected BaseShape(BaseDrawing baseDrawing) {
        this.baseDrawing = baseDrawing;
    }

    public abstract void draw();

    public abstract void resizeByPercentage(double pct);

    public abstract void setWidth(double width);

    public abstract void setHeight(double height);
}

class CircleShape extends BaseShape {
    private double x, y, radius;

    public CircleShape(double x, double y, double radius, BaseDrawing baseDrawing) {
        super(baseDrawing);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        baseDrawing.drawCircle(x, y, radius);
    }

    @Override
    public void resizeByPercentage(double pct) {
        radius *= pct;
    }

    @Override
    public void setWidth(double width) {
     }

    @Override
    public void setHeight(double height) {
    }
}

class RectShape extends BaseShape {
    private double x, y, width, height;

    public RectShape(double x, double y, double width, double height, BaseDrawing baseDrawing) {
        super(baseDrawing);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    protected RectShape(BaseDrawing baseDrawing) {
        super(baseDrawing);
    }

    @Override
    public void draw() {

    }

    @Override
    public void resizeByPercentage(double pct) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public void setHeight(double height) {

    }
}