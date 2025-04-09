package Home.BTVN.w06.Ex3.Paint2D;

public class Triangle2D implements IShape {
    private Point2D o;
    private double a, b, c;

    public Triangle2D (Point2D o, double a, double b, double c) {
        super();
        this.o = o;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point2D getO() {
        return o;
    }

    public void setO (Point2D o) {
        this.o = o;
    }

    public double getA () {
        return a;
    }

    public void setA (double a) {
        this.a = a;
    }

    public double getB () {
        return b;
    }

    public void setB (double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return STR."Triangle2D [O = \{o}, a = \{a}, b = \{b}, c = \{c}]";
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double halfP = perimeter() / 2;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    @Override
    public double distance() {
        return this.o.distance();
    }

    @Override
    public void move(double dx, double dy) {

    }

    @Override
    public void rotate(double alpha) {
        return;
    }

    @Override
    public void zoom(double ratio) {
        this.a *= ratio;
        this.b *= ratio;
        this.c *= ratio;
    }

    @Override
    public IShape getCenter() {
        return null;
    }

    @Override
    public IShape getBoundary() {
        return null;
    }
}
