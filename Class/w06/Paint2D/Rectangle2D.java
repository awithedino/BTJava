package Class.w06.Paint2D;

public class Rectangle2D implements IShapeO, IShapeT {
    private Point2D c;
    private double a, b;

    public Rectangle2D (Point2D c, double a, double b) {
        super();
        this.c = c;
        this.a = a;
        this.b = b;
    }

    public Point2D getC() {
        return c;
    }

    public void setC (Point2D c) {
        this.c = c;
    }

    public double getA () {
        return a;
    }

    public void setA (double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return STR."Rectangle2D [c = \{c}, a = \{a}, y = \{b}]";
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    @Override
    public double distance() {
        return this.c.distance();
    }

    @Override
    public void move(double da, double db) {
        this.c.move(da, db);
    }

    @Override
    public void rotate(double alpha) {
        return;
    }

    @Override
    public void zoom(double ratio) {
        this.a *= ratio;
        this.b *= ratio;
    }
}
