package Home.BTVN.w06.Ex2;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return STR."Point2D [x = \{x}, y = \{y}]";
    }

    public Point2D symmetric() {
        return new Point2D(-this.x, -this.y);
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distanceTwoPoint(Point2D other) {
        return Math.hypot(other.x - this.x, other.y - this.y);
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
}
