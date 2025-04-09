package Home.BTVN.w06.Ex3.Paint2D;

import java.awt.*;

public class Line2D implements IShape{
    private Point2D c1, c2;

    public Line2D (Point2D c1, Point2D c2) {
        super();
        this.c1 = c1;
        this.c2 = c2;
    }

    public Point2D getC1() {
        return c1;
    }

    public void setC1 (Point2D c1) {
        this.c1 = c1;
    }

    public Point2D getC2() {
        return c2;
    }

    public void setC2(Point2D c2) {
        this.c2 = c2;
    }

    @Override
    public String toString() {
        return STR."Line2D [c1 = \{c1}, c2 = \{c2}]";
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return Math.sqrt(Math.pow(c2.getX() - c1.getX(), 2) + Math.pow(c2.getY() - c1.getY(), 2));
    }

    @Override
    public double distance() {
        double dx = c2.getX() - c1.getX();
        double dy = c2.getY() - c1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public void move(double dx, double dy) {
        c1.move(dx, dy);
        c2.move(dx, dy);
    }

    @Override
    public void rotate(double alpha) {
        return;
    }

    @Override
    public void zoom(double ratio) {
            c2.setX(c1.getX() + ratio * (c2.getX() - c1.getX()));
            c2.setY(c1.getY() + ratio * (c2.getY() - c1.getY()));
    }

    @Override
    public IShape getCenter() {
        double dx = (c1.getX() + c2.getX()) / 2;
        double dy = (c1.getY() + c2.getY()) / 2;
        return new Point2D(dx, dy);
    }

    @Override
    public IShape getBoundary() {
        return this;
    }

}